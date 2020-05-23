package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientPopupControlBase.CloseUp event.
  */
trait ASPxClientPopupWindowCloseUpEventArgs extends ASPxClientPopupWindowEventArgs {
  /**
    * Gets the value that identifies the reason the popup window closes.
    */
  var closeReason: ASPxClientPopupControlCloseReason
}

object ASPxClientPopupWindowCloseUpEventArgs {
  @scala.inline
  def apply(closeReason: ASPxClientPopupControlCloseReason, window: ASPxClientPopupWindow): ASPxClientPopupWindowCloseUpEventArgs = {
    val __obj = js.Dynamic.literal(closeReason = closeReason.asInstanceOf[js.Any], window = window.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientPopupWindowCloseUpEventArgs]
  }
}

