package typings
package fxnLib.fxnMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fxn", "Controller")
@js.native
abstract class Controller protected () extends js.Object {
  def this(path: java.lang.String, method: java.lang.String, requestHeaders: js.Object, params: js.Object, responder: js.Function) = this()
  var _headers: js.Object = js.native
  var _method: HttpMethod = js.native
  var _path: java.lang.String = js.native
  var _requestHeaders: js.Object = js.native
  var _responder: js.Function = js.native
  var _securityPolicies: js.Object = js.native
  var _status: scala.Double = js.native
  var params: js.Any = js.native
  def after(): scala.Unit = js.native
  def allowOrigin(value: java.lang.String): this.type = js.native
  def appendHeader(key: java.lang.String, value: java.lang.String): java.lang.String = js.native
  def before(): scala.Unit = js.native
  def code(code: scala.Double): scala.Double = js.native
  def convertMethod(method: HttpMethod, id: scala.Double): java.lang.String = js.native
  def create(): scala.Unit = js.native
  def del(): scala.Unit = js.native
  def destroy(): scala.Unit = js.native
  def get(): scala.Unit = js.native
  def getHeader(key: java.lang.String, value: java.lang.String): java.lang.String = js.native
  def getStatus(): scala.Double = js.native
  def index(): scala.Unit = js.native
  def notImplemented(msg: java.lang.String, details: js.Object): scala.Boolean = js.native
  def options(): scala.Unit = js.native
  def post(): scala.Unit = js.native
  def put(): scala.Unit = js.native
  def redirect(location: java.lang.String): scala.Unit = js.native
  def render(data: java.lang.String): scala.Unit = js.native
  def render(data: js.Object): scala.Unit = js.native
  def render(data: nodeLib.Buffer): scala.Unit = js.native
  def run(): scala.Unit = js.native
  def securityPolicy(directive: java.lang.String, src: java.lang.String): java.lang.String = js.native
  def setHeader(key: java.lang.String, value: java.lang.String): java.lang.String = js.native
  def setHeaders(): HttpHeaders = js.native
  def show(): scala.Unit = js.native
  def status(value: scala.Double): scala.Boolean = js.native
  def update(): scala.Unit = js.native
}

