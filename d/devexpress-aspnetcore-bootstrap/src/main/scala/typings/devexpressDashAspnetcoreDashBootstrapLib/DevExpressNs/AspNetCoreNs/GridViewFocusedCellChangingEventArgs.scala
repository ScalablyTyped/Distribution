package typings
package devexpressDashAspnetcoreDashBootstrapLib.DevExpressNs.AspNetCoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridViewFocusedCellChangingEventArgs extends CancelEventArgs {
  val cellInfo: BootstrapGridViewCellInfo
}

object GridViewFocusedCellChangingEventArgs {
  @scala.inline
  def apply(cancel: scala.Boolean, cellInfo: BootstrapGridViewCellInfo, sender: Control): GridViewFocusedCellChangingEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cancel")(cancel)
    __obj.updateDynamic("cellInfo")(cellInfo)
    __obj.updateDynamic("sender")(sender)
    __obj.asInstanceOf[GridViewFocusedCellChangingEventArgs]
  }
}

