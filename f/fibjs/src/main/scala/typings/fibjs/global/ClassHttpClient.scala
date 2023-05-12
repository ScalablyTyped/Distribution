package typings.fibjs.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** module Or Internal Object */
/**
  * @brief http客户端对象
  * @detail http客户端对象模拟浏览器环境缓存cookie，并在访问url的时候携带对应的cookie，不同的http客户端对象是相互隔离的，提供http的request、get、post等方法。,用法如下：,,```JavaScript,var http = require('http');,var httpClient = new http.Client();,httpClient.request('GET', 'http://fibjs.org');,```
  */
@JSGlobal("Class_HttpClient")
@js.native
/**
  *
  * @brief HttpClient 构造函数，创建一个新的HttpClient对象
  *
  *
  */
open class ClassHttpClient ()
  extends StObject
     with typings.fibjs.ClassHttpClient
