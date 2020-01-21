package typings.dndCore

import typings.dndCore.interfacesMod.XYCoord
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonClientOffsetSourceClientOffset extends js.Object {
  var clientOffset: XYCoord
  var sourceClientOffset: XYCoord
}

object AnonClientOffsetSourceClientOffset {
  @scala.inline
  def apply(clientOffset: XYCoord, sourceClientOffset: XYCoord): AnonClientOffsetSourceClientOffset = {
    val __obj = js.Dynamic.literal(clientOffset = clientOffset.asInstanceOf[js.Any], sourceClientOffset = sourceClientOffset.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonClientOffsetSourceClientOffset]
  }
}

