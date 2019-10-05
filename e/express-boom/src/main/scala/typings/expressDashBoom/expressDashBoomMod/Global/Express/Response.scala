package typings.expressDashBoom.expressDashBoomMod.Global.Express

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Response extends js.Object {
  var boom: Boom
}

object Response {
  @scala.inline
  def apply(boom: Boom): Response = {
    val __obj = js.Dynamic.literal(boom = boom)
  
    __obj.asInstanceOf[Response]
  }
}

