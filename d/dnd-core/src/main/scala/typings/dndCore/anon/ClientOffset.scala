package typings.dndCore.anon

import typings.dndCore.interfacesMod.XYCoord
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientOffset extends js.Object {
  var clientOffset: XYCoord | Null
  var sourceClientOffset: XYCoord | Null
}

object ClientOffset {
  @scala.inline
  def apply(clientOffset: XYCoord = null, sourceClientOffset: XYCoord = null): ClientOffset = {
    val __obj = js.Dynamic.literal(clientOffset = clientOffset.asInstanceOf[js.Any], sourceClientOffset = sourceClientOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientOffset]
  }
}

