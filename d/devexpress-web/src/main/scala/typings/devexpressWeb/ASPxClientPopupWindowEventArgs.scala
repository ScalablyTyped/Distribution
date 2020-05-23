package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for events concerning client manipulations on popup windows.
  */
trait ASPxClientPopupWindowEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the popup window object related to the event.
    */
  var window: ASPxClientPopupWindow
}

object ASPxClientPopupWindowEventArgs {
  @scala.inline
  def apply(window: ASPxClientPopupWindow): ASPxClientPopupWindowEventArgs = {
    val __obj = js.Dynamic.literal(window = window.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientPopupWindowEventArgs]
  }
}

