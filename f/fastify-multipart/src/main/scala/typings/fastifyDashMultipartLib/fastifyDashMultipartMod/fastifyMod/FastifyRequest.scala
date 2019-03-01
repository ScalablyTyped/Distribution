package typings
package fastifyDashMultipartLib.fastifyDashMultipartMod.fastifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FastifyRequest[HttpRequest] extends js.Object {
  def isMultipart(): scala.Boolean
  def multipart(
    handler: fastifyDashMultipartLib.MultipartHandler,
    next: js.Function1[/* err */ nodeLib.Error, scala.Unit]
  ): busboyLib.busboyNs.Busboy
}

object FastifyRequest {
  @scala.inline
  def apply[HttpRequest](
    isMultipart: js.Function0[scala.Boolean],
    multipart: js.Function2[
      fastifyDashMultipartLib.MultipartHandler, 
      js.Function1[/* err */ nodeLib.Error, scala.Unit], 
      busboyLib.busboyNs.Busboy
    ]
  ): FastifyRequest[HttpRequest] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isMultipart")(isMultipart)
    __obj.updateDynamic("multipart")(multipart)
    __obj.asInstanceOf[FastifyRequest[HttpRequest]]
  }
}

