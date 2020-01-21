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
    val __obj = js.Dynamic.literal()
    if (clientOffset != null) __obj.updateDynamic("clientOffset")(clientOffset.asInstanceOf[js.Any])
    if (sourceClientOffset != null) __obj.updateDynamic("sourceClientOffset")(sourceClientOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitCoordsPayload]
  }
}

