package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

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
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], closeReason = closeReason.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], window = window.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopupWindowCancelEventArgs]
  }
}

