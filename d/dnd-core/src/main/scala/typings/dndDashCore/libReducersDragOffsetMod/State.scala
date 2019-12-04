package typings.dndDashCore.libReducersDragOffsetMod

import typings.dndDashCore.libInterfacesMod.XYCoord
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
    val __obj = js.Dynamic.literal()
    if (clientOffset != null) __obj.updateDynamic("clientOffset")(clientOffset.asInstanceOf[js.Any])
    if (initialClientOffset != null) __obj.updateDynamic("initialClientOffset")(initialClientOffset.asInstanceOf[js.Any])
    if (initialSourceClientOffset != null) __obj.updateDynamic("initialSourceClientOffset")(initialSourceClientOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[State]
  }
}

