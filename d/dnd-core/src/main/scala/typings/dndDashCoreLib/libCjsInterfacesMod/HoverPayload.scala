package typings
package dndDashCoreLib.libCjsInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HoverPayload extends js.Object {
  var clientOffset: XYCoord | scala.Null
  var targetIds: js.Array[Identifier]
}

object HoverPayload {
  @scala.inline
  def apply(targetIds: js.Array[Identifier], clientOffset: XYCoord = null): HoverPayload = {
    val __obj = js.Dynamic.literal(targetIds = targetIds)
    if (clientOffset != null) __obj.updateDynamic("clientOffset")(clientOffset)
    __obj.asInstanceOf[HoverPayload]
  }
}

