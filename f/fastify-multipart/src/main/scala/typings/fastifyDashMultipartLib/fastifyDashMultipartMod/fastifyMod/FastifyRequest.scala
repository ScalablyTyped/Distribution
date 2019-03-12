package typings
package fastifyDashMultipartLib.fastifyDashMultipartMod.fastifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FastifyRequest[HttpRequest] extends js.Object {
  def isMultipart(): scala.Boolean
  def multipart(
    handler: fastifyDashMultipartLib.MultipartHandler,
    next: js.Function1[/* err */ stdLib.Error, scala.Unit]
  ): busboyLib.busboyNs.Busboy
}

object FastifyRequest {
  @scala.inline
  def apply[HttpRequest](
    isMultipart: () => scala.Boolean,
    multipart: (fastifyDashMultipartLib.MultipartHandler, js.Function1[/* err */ stdLib.Error, scala.Unit]) => busboyLib.busboyNs.Busboy
  ): FastifyRequest[HttpRequest] = {
    val __obj = js.Dynamic.literal(isMultipart = js.Any.fromFunction0(isMultipart), multipart = js.Any.fromFunction2(multipart))
  
    __obj.asInstanceOf[FastifyRequest[HttpRequest]]
  }
}

