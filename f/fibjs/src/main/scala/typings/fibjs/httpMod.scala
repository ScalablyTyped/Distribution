package typings.fibjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** module Or Internal Object */
/**
  * @brief 超文本传输协议模块，用以支持 http 协议处理，模块别名：https
  * @detail 
  */
object httpMod {
  
  @JSImport("http", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("http", "Client")
  @js.native
  class Client ()
    extends StObject
       with ClassHttpClient
  
  @JSImport("http", "Cookie")
  @js.native
  class Cookie ()
    extends StObject
       with ClassHttpCookie
  
  @JSImport("http", "Handler")
  @js.native
  class Handler ()
    extends StObject
       with ClassHttpHandler
  
  @JSImport("http", "HttpsServer")
  @js.native
  class HttpsServer ()
    extends StObject
       with ClassHttpsServer
  
  @JSImport("http", "Request")
  @js.native
  class Request_ ()
    extends StObject
       with ClassHttpRequest
  
  @JSImport("http", "Response")
  @js.native
  class Response ()
    extends StObject
       with ClassHttpResponse
  
  @JSImport("http", "STATUS_CODES")
  @js.native
  val STATUS_CODES: js.Array[js.Any] = js.native
  
  @JSImport("http", "Server")
  @js.native
  class Server ()
    extends StObject
       with ClassHttpServer
  
  @JSImport("http", "autoRedirect")
  @js.native
  val autoRedirect: Boolean = js.native
  
  @JSImport("http", "cookies")
  @js.native
  val cookies: js.Array[js.Any] = js.native
  
  @scala.inline
  def del(url: String): ClassHttpResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("del")(url.asInstanceOf[js.Any]).asInstanceOf[ClassHttpResponse]
  @scala.inline
  def del(url: String, opts: js.Object): ClassHttpResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("del")(url.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ClassHttpResponse]
  
  @JSImport("http", "enableCookie")
  @js.native
  val enableCookie: Boolean = js.native
  
  @scala.inline
  def fileHandler(root: String): ClassHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("fileHandler")(root.asInstanceOf[js.Any]).asInstanceOf[ClassHandler]
  @scala.inline
  def fileHandler(root: String, mimes: js.Object): ClassHandler = (^.asInstanceOf[js.Dynamic].applyDynamic("fileHandler")(root.asInstanceOf[js.Any], mimes.asInstanceOf[js.Any])).asInstanceOf[ClassHandler]
  @scala.inline
  def fileHandler(root: String, mimes: js.Object, autoIndex: Boolean): ClassHandler = (^.asInstanceOf[js.Dynamic].applyDynamic("fileHandler")(root.asInstanceOf[js.Any], mimes.asInstanceOf[js.Any], autoIndex.asInstanceOf[js.Any])).asInstanceOf[ClassHandler]
  @scala.inline
  def fileHandler(root: String, mimes: Unit, autoIndex: Boolean): ClassHandler = (^.asInstanceOf[js.Dynamic].applyDynamic("fileHandler")(root.asInstanceOf[js.Any], mimes.asInstanceOf[js.Any], autoIndex.asInstanceOf[js.Any])).asInstanceOf[ClassHandler]
  
  @scala.inline
  def get(url: String): ClassHttpResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(url.asInstanceOf[js.Any]).asInstanceOf[ClassHttpResponse]
  @scala.inline
  def get(url: String, opts: js.Object): ClassHttpResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(url.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ClassHttpResponse]
  
  @JSImport("http", "maxBodySize")
  @js.native
  val maxBodySize: Double = js.native
  
  @scala.inline
  def patch(url: String): ClassHttpResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("patch")(url.asInstanceOf[js.Any]).asInstanceOf[ClassHttpResponse]
  @scala.inline
  def patch(url: String, opts: js.Object): ClassHttpResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("patch")(url.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ClassHttpResponse]
  
  @JSImport("http", "poolSize")
  @js.native
  val poolSize: Double = js.native
  
  @JSImport("http", "poolTimeout")
  @js.native
  val poolTimeout: Double = js.native
  
  @scala.inline
  def post(url: String): ClassHttpResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("post")(url.asInstanceOf[js.Any]).asInstanceOf[ClassHttpResponse]
  @scala.inline
  def post(url: String, opts: js.Object): ClassHttpResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("post")(url.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ClassHttpResponse]
  
  @scala.inline
  def put(url: String): ClassHttpResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("put")(url.asInstanceOf[js.Any]).asInstanceOf[ClassHttpResponse]
  @scala.inline
  def put(url: String, opts: js.Object): ClassHttpResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("put")(url.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ClassHttpResponse]
  
  @scala.inline
  def request(conn: ClassStream, req: ClassHttpRequest): ClassHttpResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(conn.asInstanceOf[js.Any], req.asInstanceOf[js.Any])).asInstanceOf[ClassHttpResponse]
  @scala.inline
  def request(method: String, url: String): ClassHttpResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(method.asInstanceOf[js.Any], url.asInstanceOf[js.Any])).asInstanceOf[ClassHttpResponse]
  @scala.inline
  def request(method: String, url: String, opts: js.Object): ClassHttpResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(method.asInstanceOf[js.Any], url.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ClassHttpResponse]
  
  @JSImport("http", "timeout")
  @js.native
  val timeout: Double = js.native
  
  @JSImport("http", "userAgent")
  @js.native
  val userAgent: String = js.native
}
