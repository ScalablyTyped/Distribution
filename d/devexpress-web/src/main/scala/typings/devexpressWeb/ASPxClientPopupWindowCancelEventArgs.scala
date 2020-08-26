package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the popup control's cancellable client events, such as the ASPxClientPopupControlBase.Closing.
  */
@js.native
trait ASPxClientPopupWindowCancelEventArgs extends ASPxClientCancelEventArgs {
  /**
    * Gets the value that identifies the reason the popup window is about to close.
    */
  var closeReason: ASPxClientPopupControlCloseReason = js.native
  /**
    * Gets the popup window object related to the event.
    */
  var window: ASPxClientPopupWindow = js.native
}

object ASPxClientPopupWindowCancelEventArgs {
  @scala.inline
  def apply(cancel: Boolean, closeReason: ASPxClientPopupControlCloseReason, window: ASPxClientPopupWindow): ASPxClientPopupWindowCancelEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], closeReason = closeReason.asInstanceOf[js.Any], window = window.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientPopupWindowCancelEventArgs]
  }
  @scala.inline
  implicit class ASPxClientPopupWindowCancelEventArgsOps[Self <: ASPxClientPopupWindowCancelEventArgs] (val x: Self) extends AnyVal {
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
    def setCloseReason(value: ASPxClientPopupControlCloseReason): Self = this.set("closeReason", value.asInstanceOf[js.Any])
    @scala.inline
    def setWindow(value: ASPxClientPopupWindow): Self = this.set("window", value.asInstanceOf[js.Any])
  }
  
}

