package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PopupWindowCancelEventArgs extends CancelEventArgs {
  val closeReason: BootstrapPopupControlCloseReason = js.native
  val window: BootstrapPopupWindow = js.native
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
  @scala.inline
  implicit class PopupWindowCancelEventArgsOps[Self <: PopupWindowCancelEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCloseReason(value: BootstrapPopupControlCloseReason): Self = this.set("closeReason", value.asInstanceOf[js.Any])
    @scala.inline
    def setWindow(value: BootstrapPopupWindow): Self = this.set("window", value.asInstanceOf[js.Any])
  }
  
}

