package typings.fxn

import org.scalablytyped.runtime.StringDictionary
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("fxn", "Application")
  @js.native
  abstract class Application protected () extends StObject {
    def this(string: String) = this()
    
    var send: js.Function = js.native
  }
  
  @JSImport("fxn", "Controller")
  @js.native
  abstract class Controller protected () extends StObject {
    def this(path: String, method: String, requestHeaders: js.Object, params: js.Object, responder: js.Function) = this()
    
    /* protected */ var _headers: js.Object = js.native
    
    /* protected */ var _method: HttpMethod = js.native
    
    /* protected */ var _path: String = js.native
    
    /* protected */ var _requestHeaders: js.Object = js.native
    
    /* protected */ var _responder: js.Function = js.native
    
    /* protected */ var _securityPolicies: js.Object = js.native
    
    /* protected */ var _status: Double = js.native
    
    def after(): Unit = js.native
    
    def allowOrigin(value: String): this.type = js.native
    
    def appendHeader(key: String, value: String): String = js.native
    
    def before(): Unit = js.native
    
    def code(code: Double): Double = js.native
    
    def convertMethod(method: HttpMethod, id: Double): String = js.native
    
    def create(): Unit = js.native
    
    def del(): Unit = js.native
    
    def destroy(): Unit = js.native
    
    def get(): Unit = js.native
    
    def getHeader(key: String, value: String): String = js.native
    
    def getStatus(): Double = js.native
    
    def index(): Unit = js.native
    
    def notImplemented(msg: String, details: js.Object): Boolean = js.native
    
    def options(): Unit = js.native
    
    /* protected */ var params: js.Any = js.native
    
    def post(): Unit = js.native
    
    def put(): Unit = js.native
    
    def redirect(location: String): Unit = js.native
    
    def render(data: String): Unit = js.native
    def render(data: js.Object): Unit = js.native
    def render(data: Buffer): Unit = js.native
    
    def run(): Unit = js.native
    
    def securityPolicy(directive: String, src: String): String = js.native
    
    def setHeader(key: String, value: String): String = js.native
    
    def setHeaders(): HttpHeaders = js.native
    
    def show(): Unit = js.native
    
    def status(value: Double): Boolean = js.native
    
    def update(): Unit = js.native
  }
  
  @JSImport("fxn", "Daemon")
  @js.native
  abstract class Daemon protected () extends StObject {
    def this(string: String) = this()
  }
  
  @JSImport("fxn", "Router")
  @js.native
  abstract class Router () extends StObject
  
  @JSImport("fxn", "Scheduler")
  @js.native
  abstract class Scheduler () extends StObject
  
  type HttpHeaders = StringDictionary[String]
  
  /* Rewritten from type alias, can be one of: 
    - typings.fxn.fxnStrings.GET
    - typings.fxn.fxnStrings.POST
    - typings.fxn.fxnStrings.PUT
    - typings.fxn.fxnStrings.DELETE
    - typings.fxn.fxnStrings.OPTIONS
  */
  trait HttpMethod extends StObject
  object HttpMethod {
    
    inline def DELETE: typings.fxn.fxnStrings.DELETE = "DELETE".asInstanceOf[typings.fxn.fxnStrings.DELETE]
    
    inline def GET: typings.fxn.fxnStrings.GET = "GET".asInstanceOf[typings.fxn.fxnStrings.GET]
    
    inline def OPTIONS: typings.fxn.fxnStrings.OPTIONS = "OPTIONS".asInstanceOf[typings.fxn.fxnStrings.OPTIONS]
    
    inline def POST: typings.fxn.fxnStrings.POST = "POST".asInstanceOf[typings.fxn.fxnStrings.POST]
    
    inline def PUT: typings.fxn.fxnStrings.PUT = "PUT".asInstanceOf[typings.fxn.fxnStrings.PUT]
  }
}
