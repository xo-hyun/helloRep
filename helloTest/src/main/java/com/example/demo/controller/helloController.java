package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class helloController {
	@GetMapping("/")
	public void index() {
		System.out.println("indexㅇㅇ");
	}
}
