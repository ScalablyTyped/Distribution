package typings.dndCore.dragOffsetMod

import typings.dndCore.interfacesMod.XYCoord
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait State extends js.Object {
  var clientOffset: XYCoord | Null
  var initialClientOffset: XYCoord | Null
  var initialSourceClientOffset: XYCoord | Null
}

object State {
  @scala.inline
  def apply(
    clientOffset: XYCoord = null,
    initialClientOffset: XYCoord = null,
    initialSourceClientOffset: XYCoord = null
  ): State = {
    val __obj = js.Dynamic.literal(clientOffset = clientOffset.asInstanceOf[js.Any], initialClientOffset = initialClientOffset.asInstanceOf[js.Any], initialSourceClientOffset = initialSourceClientOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[State]
  }
}

