package typings.fxn.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fxn", "Controller")
@js.native
abstract class Controller protected () extends js.Object {
  def this(path: String, method: String, requestHeaders: js.Object, params: js.Object, responder: js.Function) = this()
  
  var _headers: js.Object = js.native
  
  var _method: HttpMethod = js.native
  
  var _path: String = js.native
  
  var _requestHeaders: js.Object = js.native
  
  var _responder: js.Function = js.native
  
  var _securityPolicies: js.Object = js.native
  
  var _status: Double = js.native
  
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
  
  var params: js.Any = js.native
  
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
