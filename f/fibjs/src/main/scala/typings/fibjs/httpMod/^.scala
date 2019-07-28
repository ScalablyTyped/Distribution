package typings.fibjs.httpMod

import typings.fibjs.Class_Handler
import typings.fibjs.Class_HttpRequest
import typings.fibjs.Class_HttpResponse
import typings.fibjs.Class_Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("http", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val STATUS_CODES: js.Array[js.Any] = js.native
  val autoRedirect: Boolean = js.native
  val cookies: js.Array[js.Any] = js.native
  val enableCookie: Boolean = js.native
  val maxBodySize: Double = js.native
  val poolSize: Double = js.native
  val poolTimeout: Double = js.native
  val timeout: Double = js.native
  val userAgent: String = js.native
  def del(url: String): Class_HttpResponse = js.native
  def del(url: String, opts: js.Object): Class_HttpResponse = js.native
  def fileHandler(root: String): Class_Handler = js.native
  def fileHandler(root: String, mimes: js.Object): Class_Handler = js.native
  def fileHandler(root: String, mimes: js.Object, autoIndex: Boolean): Class_Handler = js.native
  def get(url: String): Class_HttpResponse = js.native
  def get(url: String, opts: js.Object): Class_HttpResponse = js.native
  def patch(url: String): Class_HttpResponse = js.native
  def patch(url: String, opts: js.Object): Class_HttpResponse = js.native
  def post(url: String): Class_HttpResponse = js.native
  def post(url: String, opts: js.Object): Class_HttpResponse = js.native
  def put(url: String): Class_HttpResponse = js.native
  def put(url: String, opts: js.Object): Class_HttpResponse = js.native
  def request(conn: Class_Stream, req: Class_HttpRequest): Class_HttpResponse = js.native
  def request(method: String, url: String): Class_HttpResponse = js.native
  def request(method: String, url: String, opts: js.Object): Class_HttpResponse = js.native
}

