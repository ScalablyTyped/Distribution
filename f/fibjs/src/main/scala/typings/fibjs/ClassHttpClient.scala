package typings.fibjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** module Or Internal Object */
/**
  * @brief http客户端对象
  * @detail http客户端对象模拟浏览器环境缓存cookie，并在访问url的时候携带对应的cookie，不同的http客户端对象是相互隔离的，提供http的request、get、post等方法。,用法如下：,,```JavaScript,var http = require('http');,var httpClient = new http.Client();,httpClient.request('GET', 'http://fibjs.org');,```
  */
@js.native
trait ClassHttpClient extends ClassObject {
  
  /**
    * class prop 
    *
    * 
    * @brief 自动redirect功能开关，默认开启
    * 
    * 
    * @type Boolean
    */
  var autoRedirect: Boolean = js.native
  
  /**
    * class prop 
    *
    * 
    * @brief 返回http客户端的 HttpCookie 对象列表
    * 
    * @readonly
    * @type NArray
    */
  var cookies: js.Array[_] = js.native
  
  /**
    * 
    * @brief 用 DELETE 方法请求指定的 url，并返回结果，等同于 request("DELETE", ...)
    * opts 包含请求的附加选项，支持的内容如下：
    * ```JavaScript
    * {
    * "query": {},
    * "body": SeekedStream | Buffer | String | {},
    * "json": {},
    * "headers": {}
    * }
    * ```
    * 其中 body，json 不得同时出现。缺省为 {}，不包含任何附加信息
    * @param url 指定 url，必须是包含主机的完整 url
    * @param opts 指定附加信息
    * @return 返回服务器响应
    * 
    * 
    * @async
    */
  def del(url: String): ClassHttpResponse = js.native
  def del(url: String, opts: js.Object): ClassHttpResponse = js.native
  
  /**
    * class prop 
    *
    * 
    * @brief cookie功能开关，默认开启
    * 
    * 
    * @type Boolean
    */
  var enableCookie: Boolean = js.native
  
  /**
    * 
    * @brief 用 GET 方法请求指定的 url，并返回结果，等同于 request("GET", ...)
    * opts 包含请求的附加选项，支持的内容如下：
    * ```JavaScript
    * {
    * "query": {},
    * "body": SeekedStream | Buffer | String | {},
    * "json": {},
    * "headers": {}
    * }
    * ```
    * 其中 body，json 不得同时出现。缺省为 {}，不包含任何附加信息
    * @param url 指定 url，必须是包含主机的完整 url
    * @param opts 指定附加信息
    * @return 返回服务器响应
    * 
    * 
    * @async
    */
  def get(url: String): ClassHttpResponse = js.native
  def get(url: String, opts: js.Object): ClassHttpResponse = js.native
  
  /**
    * class prop 
    *
    * 
    * @brief 查询和设置 body 最大尺寸，以 MB 为单位，缺省为 -1，不限制尺寸
    * 
    * 
    * @type Integer
    */
  var maxBodySize: Double = js.native
  
  /**
    * 
    * @brief 用 PATCH 方法请求指定的 url，并返回结果，等同于 request("PATCH", ...)
    * opts 包含请求的附加选项，支持的内容如下：
    * ```JavaScript
    * {
    * "query": {},
    * "body": SeekedStream | Buffer | String | {},
    * "json": {},
    * "headers": {}
    * }
    * ```
    * 其中 body，json 不得同时出现。缺省为 {}，不包含任何附加信息
    * @param url 指定 url，必须是包含主机的完整 url
    * @param opts 指定附加信息
    * @return 返回服务器响应
    * 
    * 
    * @async
    */
  def patch(url: String): ClassHttpResponse = js.native
  def patch(url: String, opts: js.Object): ClassHttpResponse = js.native
  
  /**
    * class prop 
    *
    * 
    * @brief 查询和设置 keep-alive 最大缓存连接数，缺省 128
    * 
    * 
    * @type Integer
    */
  var poolSize: Double = js.native
  
  /**
    * class prop 
    *
    * 
    * @brief 查询和设置 keep-alive 缓存连接超时时间，缺省 10000 ms
    * 
    * 
    * @type Integer
    */
  var poolTimeout: Double = js.native
  
  /**
    * 
    * @brief 用 POST 方法请求指定的 url，并返回结果，等同于 request("POST", ...)
    * opts 包含请求的附加选项，支持的内容如下：
    * ```JavaScript
    * {
    * "query": {},
    * "body": SeekedStream | Buffer | String | {},
    * "json": {},
    * "headers": {}
    * }
    * ```
    * 其中 body，json 不得同时出现。缺省为 {}，不包含任何附加信息
    * @param url 指定 url，必须是包含主机的完整 url
    * @param opts 指定附加信息
    * @return 返回服务器响应
    * 
    * 
    * @async
    */
  def post(url: String): ClassHttpResponse = js.native
  def post(url: String, opts: js.Object): ClassHttpResponse = js.native
  
  /**
    * 
    * @brief 用 PUT 方法请求指定的 url，并返回结果，等同于 request("PUT", ...)
    * opts 包含请求的附加选项，支持的内容如下：
    * ```JavaScript
    * {
    * "query": {},
    * "body": SeekedStream | Buffer | String | {},
    * "json": {},
    * "headers": {}
    * }
    * ```
    * 其中 body，json 不得同时出现。缺省为 {}，不包含任何附加信息
    * @param url 指定 url，必须是包含主机的完整 url
    * @param opts 指定附加信息
    * @return 返回服务器响应
    * 
    * 
    * @async
    */
  def put(url: String): ClassHttpResponse = js.native
  def put(url: String, opts: js.Object): ClassHttpResponse = js.native
  
  /**
    * 
    * @brief 发送 http 请求到指定的流对象，并返回结果
    * @param conn 指定处理请求的流对象
    * @param req 要发送的 HttpRequest 对象
    * @return 返回服务器响应
    * 
    * 
    * @async
    */
  def request(conn: ClassStream, req: ClassHttpRequest): ClassHttpResponse = js.native
  /**
    * 
    * @brief 请求指定的 url，并返回结果
    * opts 包含请求的附加选项，支持的内容如下：
    * ```JavaScript
    * {
    * "query": {},
    * "body": SeekedStream | Buffer | String | {},
    * "json": {},
    * "headers": {}
    * }
    * ```
    * 其中 body，json 不得同时出现。缺省为 {}，不包含任何附加信息
    * @param method 指定 http 请求方法：GET, POST 等
    * @param url 指定 url，必须是包含主机的完整 url
    * @param opts 指定附加信息
    * @return 返回服务器响应
    * 
    * 
    * @async
    */
  def request(method: String, url: String): ClassHttpResponse = js.native
  def request(method: String, url: String, opts: js.Object): ClassHttpResponse = js.native
  
  /**
    * class prop 
    *
    * 
    * @brief 查询和设置超时时间 单位毫秒
    * 
    * 
    * @type Integer
    */
  var timeout: Double = js.native
  
  /**
    * class prop 
    *
    * 
    * @brief 查询和设置 http 请求中的浏览器标识
    * 
    * 
    * @type String
    */
  var userAgent: String = js.native
}
