package typings.fibjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** module Or Internal Object */
/**
  * @brief 超文本传输协议模块，用以支持 http 协议处理，模块别名：https
  * @detail 
  */
object httpMod {
  
  @JSImport("http", "Client")
  @js.native
  class Client () extends ClassHttpClient
  
  @JSImport("http", "Cookie")
  @js.native
  class Cookie () extends ClassHttpCookie
  
  @JSImport("http", "Handler")
  @js.native
  class Handler () extends ClassHttpHandler
  
  @JSImport("http", "HttpsServer")
  @js.native
  class HttpsServer () extends ClassHttpsServer
  
  @JSImport("http", "Request")
  @js.native
  class Request_ () extends ClassHttpRequest
  
  @JSImport("http", "Response")
  @js.native
  class Response () extends ClassHttpResponse
  
  @JSImport("http", "STATUS_CODES")
  @js.native
  val STATUS_CODES: js.Array[js.Any] = js.native
  
  @JSImport("http", "Server")
  @js.native
  class Server () extends ClassHttpServer
  
  @JSImport("http", "autoRedirect")
  @js.native
  val autoRedirect: Boolean = js.native
  
  @JSImport("http", "cookies")
  @js.native
  val cookies: js.Array[js.Any] = js.native
  
  @JSImport("http", "del")
  @js.native
  def del(url: String): ClassHttpResponse = js.native
  @JSImport("http", "del")
  @js.native
  def del(url: String, opts: js.Object): ClassHttpResponse = js.native
  
  @JSImport("http", "enableCookie")
  @js.native
  val enableCookie: Boolean = js.native
  
  @JSImport("http", "fileHandler")
  @js.native
  def fileHandler(root: String): ClassHandler = js.native
  @JSImport("http", "fileHandler")
  @js.native
  def fileHandler(root: String, mimes: js.UndefOr[scala.Nothing], autoIndex: Boolean): ClassHandler = js.native
  @JSImport("http", "fileHandler")
  @js.native
  def fileHandler(root: String, mimes: js.Object): ClassHandler = js.native
  @JSImport("http", "fileHandler")
  @js.native
  def fileHandler(root: String, mimes: js.Object, autoIndex: Boolean): ClassHandler = js.native
  
  @JSImport("http", "get")
  @js.native
  def get(url: String): ClassHttpResponse = js.native
  @JSImport("http", "get")
  @js.native
  def get(url: String, opts: js.Object): ClassHttpResponse = js.native
  
  @JSImport("http", "maxBodySize")
  @js.native
  val maxBodySize: Double = js.native
  
  @JSImport("http", "patch")
  @js.native
  def patch(url: String): ClassHttpResponse = js.native
  @JSImport("http", "patch")
  @js.native
  def patch(url: String, opts: js.Object): ClassHttpResponse = js.native
  
  @JSImport("http", "poolSize")
  @js.native
  val poolSize: Double = js.native
  
  @JSImport("http", "poolTimeout")
  @js.native
  val poolTimeout: Double = js.native
  
  @JSImport("http", "post")
  @js.native
  def post(url: String): ClassHttpResponse = js.native
  @JSImport("http", "post")
  @js.native
  def post(url: String, opts: js.Object): ClassHttpResponse = js.native
  
  @JSImport("http", "put")
  @js.native
  def put(url: String): ClassHttpResponse = js.native
  @JSImport("http", "put")
  @js.native
  def put(url: String, opts: js.Object): ClassHttpResponse = js.native
  
  @JSImport("http", "request")
  @js.native
  def request(conn: ClassStream, req: ClassHttpRequest): ClassHttpResponse = js.native
  @JSImport("http", "request")
  @js.native
  def request(method: String, url: String): ClassHttpResponse = js.native
  @JSImport("http", "request")
  @js.native
  def request(method: String, url: String, opts: js.Object): ClassHttpResponse = js.native
  
  @JSImport("http", "timeout")
  @js.native
  val timeout: Double = js.native
  
  @JSImport("http", "userAgent")
  @js.native
  val userAgent: String = js.native
}
