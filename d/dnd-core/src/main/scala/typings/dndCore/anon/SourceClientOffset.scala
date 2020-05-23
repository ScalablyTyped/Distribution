package typings.dndCore.anon

import typings.dndCore.interfacesMod.XYCoord
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceClientOffset extends js.Object {
  var clientOffset: XYCoord
  var sourceClientOffset: XYCoord
}

object SourceClientOffset {
  @scala.inline
  def apply(clientOffset: XYCoord, sourceClientOffset: XYCoord): SourceClientOffset = {
    val __obj = js.Dynamic.literal(clientOffset = clientOffset.asInstanceOf[js.Any], sourceClientOffset = sourceClientOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceClientOffset]
  }
}

