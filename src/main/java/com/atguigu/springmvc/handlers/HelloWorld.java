package com.atguigu.springmvc.handlers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/test")
public class HelloWorld {

	
	
	@RequestMapping(value ="/list",method=RequestMethod.GET)
	public String get1(){
        System.out.println("GET");
        return "success";
    }
	
	//http://localhost:8080/springmvc/test/list/123
	@RequestMapping(value ="/list/{id}")
    public String get2(@PathVariable String id){
        System.out.println("id:"+id);
        return "success";
    }
	
	//http://localhost:8080/springmvc/test/list/123/yaoyouwei
    @RequestMapping(value ="/list/{id}/{name}")
    public String get3(@PathVariable String id,@PathVariable String name){
        System.out.println("id:"+id);
        System.out.println("name:"+name);
        return "success";
    }
	
}
