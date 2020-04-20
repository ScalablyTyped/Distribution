package typings.dndCore

import typings.dndCore.interfacesMod.XYCoord
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSourceClientOffset extends js.Object {
  var clientOffset: XYCoord
  var sourceClientOffset: XYCoord
}

object AnonSourceClientOffset {
  @scala.inline
  def apply(clientOffset: XYCoord, sourceClientOffset: XYCoord): AnonSourceClientOffset = {
    val __obj = js.Dynamic.literal(clientOffset = clientOffset.asInstanceOf[js.Any], sourceClientOffset = sourceClientOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSourceClientOffset]
  }
}

