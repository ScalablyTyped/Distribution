package typings
package fastifyDashStaticLib.fastifyDashStaticMod.fastifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FastifyReply[HttpResponse] extends js.Object {
  def sendFile(filename: java.lang.String): FastifyReply[HttpResponse]
}

object FastifyReply {
  @scala.inline
  def apply[HttpResponse](sendFile: js.Function1[java.lang.String, FastifyReply[HttpResponse]]): FastifyReply[HttpResponse] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("sendFile")(sendFile)
    __obj.asInstanceOf[FastifyReply[HttpResponse]]
  }
}

