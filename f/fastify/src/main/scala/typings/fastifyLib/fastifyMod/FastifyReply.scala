package typings
package fastifyLib.fastifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response object that is used to build and send a http response
  */
@js.native
trait FastifyReply[HttpResponse] extends js.Object {
  var context: FastifyContext = js.native
  var res: HttpResponse = js.native
  var sent: scala.Boolean = js.native
  def callNotFound(): scala.Unit = js.native
  def code(statusCode: scala.Double): FastifyReply[HttpResponse] = js.native
  def getHeader(name: java.lang.String): js.UndefOr[java.lang.String] = js.native
  def hasHeader(name: java.lang.String): scala.Boolean = js.native
  def header(name: java.lang.String, value: js.Any): FastifyReply[HttpResponse] = js.native
  def headers(headers: org.scalablytyped.runtime.StringDictionary[js.Any]): FastifyReply[HttpResponse] = js.native
  def redirect(statusCode: scala.Double, url: java.lang.String): FastifyReply[HttpResponse] = js.native
  def redirect(url: java.lang.String): FastifyReply[HttpResponse] = js.native
  def send(): FastifyReply[HttpResponse] = js.native
  def send(payload: js.Any): FastifyReply[HttpResponse] = js.native
  def serialize(payload: js.Any): java.lang.String = js.native
  def serializer(fn: js.Function): FastifyReply[HttpResponse] = js.native
  def status(statusCode: scala.Double): FastifyReply[HttpResponse] = js.native
  def `type`(contentType: java.lang.String): FastifyReply[HttpResponse] = js.native
}

