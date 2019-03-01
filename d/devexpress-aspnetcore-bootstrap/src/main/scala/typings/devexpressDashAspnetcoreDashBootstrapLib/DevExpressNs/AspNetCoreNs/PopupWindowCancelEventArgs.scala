package typings
package devexpressDashAspnetcoreDashBootstrapLib.DevExpressNs.AspNetCoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopupWindowCancelEventArgs extends CancelEventArgs {
  val closeReason: BootstrapPopupControlCloseReason
  val window: BootstrapPopupWindow
}

object PopupWindowCancelEventArgs {
  @scala.inline
  def apply(
    cancel: scala.Boolean,
    closeReason: BootstrapPopupControlCloseReason,
    sender: Control,
    window: BootstrapPopupWindow
  ): PopupWindowCancelEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cancel")(cancel)
    __obj.updateDynamic("closeReason")(closeReason)
    __obj.updateDynamic("sender")(sender)
    __obj.updateDynamic("window")(window)
    __obj.asInstanceOf[PopupWindowCancelEventArgs]
  }
}

