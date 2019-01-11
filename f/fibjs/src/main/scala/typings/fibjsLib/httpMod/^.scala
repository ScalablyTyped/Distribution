package typings
package fibjsLib.httpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("http", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val STATUS_CODES: js.Array[js.Any] = js.native
  val autoRedirect: scala.Boolean = js.native
  val cookies: js.Array[js.Any] = js.native
  val enableCookie: scala.Boolean = js.native
  val maxBodySize: scala.Double = js.native
  val poolSize: scala.Double = js.native
  val poolTimeout: scala.Double = js.native
  val timeout: scala.Double = js.native
  val userAgent: java.lang.String = js.native
  def del(url: java.lang.String): fibjsLib.Class_HttpResponse = js.native
  def del(url: java.lang.String, opts: js.Object): fibjsLib.Class_HttpResponse = js.native
  def fileHandler(root: java.lang.String): fibjsLib.Class_Handler = js.native
  def fileHandler(root: java.lang.String, mimes: js.Object): fibjsLib.Class_Handler = js.native
  def fileHandler(root: java.lang.String, mimes: js.Object, autoIndex: scala.Boolean): fibjsLib.Class_Handler = js.native
  def get(url: java.lang.String): fibjsLib.Class_HttpResponse = js.native
  def get(url: java.lang.String, opts: js.Object): fibjsLib.Class_HttpResponse = js.native
  def patch(url: java.lang.String): fibjsLib.Class_HttpResponse = js.native
  def patch(url: java.lang.String, opts: js.Object): fibjsLib.Class_HttpResponse = js.native
  def post(url: java.lang.String): fibjsLib.Class_HttpResponse = js.native
  def post(url: java.lang.String, opts: js.Object): fibjsLib.Class_HttpResponse = js.native
  def put(url: java.lang.String): fibjsLib.Class_HttpResponse = js.native
  def put(url: java.lang.String, opts: js.Object): fibjsLib.Class_HttpResponse = js.native
  def request(conn: fibjsLib.Class_Stream, req: fibjsLib.Class_HttpRequest): fibjsLib.Class_HttpResponse = js.native
  def request(method: java.lang.String, url: java.lang.String): fibjsLib.Class_HttpResponse = js.native
  def request(method: java.lang.String, url: java.lang.String, opts: js.Object): fibjsLib.Class_HttpResponse = js.native
}

