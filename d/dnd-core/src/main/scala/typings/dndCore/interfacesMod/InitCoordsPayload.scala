package typings.dndCore.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InitCoordsPayload extends js.Object {
  var clientOffset: XYCoord | Null
  var sourceClientOffset: XYCoord | Null
}

object InitCoordsPayload {
  @scala.inline
  def apply(clientOffset: XYCoord = null, sourceClientOffset: XYCoord = null): InitCoordsPayload = {
    val __obj = js.Dynamic.literal(clientOffset = clientOffset.asInstanceOf[js.Any], sourceClientOffset = sourceClientOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitCoordsPayload]
  }
}

