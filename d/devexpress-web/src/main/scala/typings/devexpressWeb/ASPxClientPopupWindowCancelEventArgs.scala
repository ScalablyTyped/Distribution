package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the popup control's cancellable client events, such as the ASPxClientPopupControlBase.Closing.
  */
trait ASPxClientPopupWindowCancelEventArgs extends ASPxClientCancelEventArgs {
  /**
    * Gets the value that identifies the reason the popup window is about to close.
    */
  var closeReason: ASPxClientPopupControlCloseReason
  /**
    * Gets the popup window object related to the event.
    */
  var window: ASPxClientPopupWindow
}

object ASPxClientPopupWindowCancelEventArgs {
  @scala.inline
  def apply(cancel: Boolean, closeReason: ASPxClientPopupControlCloseReason, window: ASPxClientPopupWindow): ASPxClientPopupWindowCancelEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], closeReason = closeReason.asInstanceOf[js.Any], window = window.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientPopupWindowCancelEventArgs]
  }
}

