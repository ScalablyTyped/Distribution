package typings.dndCore

import typings.dndCore.interfacesMod.XYCoord
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonClientOffset extends js.Object {
  var clientOffset: XYCoord | Null
  var sourceClientOffset: XYCoord | Null
}

object AnonClientOffset {
  @scala.inline
  def apply(clientOffset: XYCoord = null, sourceClientOffset: XYCoord = null): AnonClientOffset = {
    val __obj = js.Dynamic.literal()
    if (clientOffset != null) __obj.updateDynamic("clientOffset")(clientOffset.asInstanceOf[js.Any])
    if (sourceClientOffset != null) __obj.updateDynamic("sourceClientOffset")(sourceClientOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonClientOffset]
  }
}

