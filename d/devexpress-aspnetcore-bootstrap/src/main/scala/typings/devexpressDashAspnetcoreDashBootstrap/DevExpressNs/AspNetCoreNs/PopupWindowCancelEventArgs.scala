package typings.devexpressDashAspnetcoreDashBootstrap.DevExpressNs.AspNetCoreNs

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
    cancel: Boolean,
    closeReason: BootstrapPopupControlCloseReason,
    sender: Control,
    window: BootstrapPopupWindow
  ): PopupWindowCancelEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel, closeReason = closeReason, sender = sender, window = window)
  
    __obj.asInstanceOf[PopupWindowCancelEventArgs]
  }
}

