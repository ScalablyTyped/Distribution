package typings.dndDashCore

import typings.dndDashCore.libInterfacesMod.XYCoord
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClientOffsetSourceClientOffset extends js.Object {
  var clientOffset: XYCoord
  var sourceClientOffset: XYCoord
}

object Anon_ClientOffsetSourceClientOffset {
  @scala.inline
  def apply(clientOffset: XYCoord, sourceClientOffset: XYCoord): Anon_ClientOffsetSourceClientOffset = {
    val __obj = js.Dynamic.literal(clientOffset = clientOffset.asInstanceOf[js.Any], sourceClientOffset = sourceClientOffset.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ClientOffsetSourceClientOffset]
  }
}

