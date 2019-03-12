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
  def apply[HttpResponse](sendFile: java.lang.String => FastifyReply[HttpResponse]): FastifyReply[HttpResponse] = {
    val __obj = js.Dynamic.literal(sendFile = js.Any.fromFunction1(sendFile))
  
    __obj.asInstanceOf[FastifyReply[HttpResponse]]
  }
}

