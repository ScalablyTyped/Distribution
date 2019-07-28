package typings.devexpressDashAspnetcoreDashBootstrap.DevExpressNs.AspNetCoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridViewFocusedCellChangingEventArgs extends CancelEventArgs {
  val cellInfo: BootstrapGridViewCellInfo
}

object GridViewFocusedCellChangingEventArgs {
  @scala.inline
  def apply(cancel: Boolean, cellInfo: BootstrapGridViewCellInfo, sender: Control): GridViewFocusedCellChangingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel, cellInfo = cellInfo, sender = sender)
  
    __obj.asInstanceOf[GridViewFocusedCellChangingEventArgs]
  }
}

