package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the popup control's cancellable client events, such as the Closing.
  */
trait ASPxClientPopupWindowCancelEventArgs extends ASPxClientCancelEventArgs {
  /**
    * Gets the value that identifies the reason the popup window is about to close.
    * Value: One of the ASPxClientPopupControlCloseReason enumeration values.
    */
  var closeReason: ASPxClientPopupControlCloseReason
  /**
    * Gets the popup window object related to the event.
    * Value: An ASPxClientPopupWindow object representing the popup window that was manipulated, causing the popup control to raise the event.
    */
  var window: ASPxClientPopupWindow
}

object ASPxClientPopupWindowCancelEventArgs {
  @scala.inline
  def apply(
    cancel: scala.Boolean,
    closeReason: ASPxClientPopupControlCloseReason,
    window: ASPxClientPopupWindow
  ): ASPxClientPopupWindowCancelEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cancel")(cancel)
    __obj.updateDynamic("closeReason")(closeReason)
    __obj.updateDynamic("window")(window)
    __obj.asInstanceOf[ASPxClientPopupWindowCancelEventArgs]
  }
}

