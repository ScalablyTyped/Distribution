package typings
package devexpressDashAspnetcoreDashBootstrapLib.DevExpressNs.AspNetCoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardViewFocusedCellChangingEventArgs extends CancelEventArgs {
  val cellInfo: BootstrapCardViewCellInfo
}

object CardViewFocusedCellChangingEventArgs {
  @scala.inline
  def apply(cancel: scala.Boolean, cellInfo: BootstrapCardViewCellInfo, sender: Control): CardViewFocusedCellChangingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel, cellInfo = cellInfo, sender = sender)
  
    __obj.asInstanceOf[CardViewFocusedCellChangingEventArgs]
  }
}

