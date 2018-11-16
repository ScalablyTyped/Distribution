package typings
package fastifyDashMultipartLib.fastifyDashMultipartMod.fastifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait FastifyRequest[HttpRequest] extends js.Object {
  def isMultipart(): scala.Boolean
  def multipart(
    handler: fastifyDashMultipartLib.fastifyDashMultipartMod.fastifyMultipartNs.MultipartHandler,
    next: js.Function1[/* err */ nodeLib.Error, scala.Unit]
  ): busboyLib.busboyNs.Busboy
}

