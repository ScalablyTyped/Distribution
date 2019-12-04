package typings.dndDashCore

import typings.dndDashCore.libInterfacesMod.XYCoord
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClientOffset extends js.Object {
  var clientOffset: XYCoord | Null
  var sourceClientOffset: XYCoord | Null
}

object Anon_ClientOffset {
  @scala.inline
  def apply(clientOffset: XYCoord = null, sourceClientOffset: XYCoord = null): Anon_ClientOffset = {
    val __obj = js.Dynamic.literal()
    if (clientOffset != null) __obj.updateDynamic("clientOffset")(clientOffset.asInstanceOf[js.Any])
    if (sourceClientOffset != null) __obj.updateDynamic("sourceClientOffset")(sourceClientOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ClientOffset]
  }
}

