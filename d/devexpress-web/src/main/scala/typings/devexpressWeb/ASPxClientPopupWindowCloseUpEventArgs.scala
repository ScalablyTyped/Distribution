package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientPopupControlBase.CloseUp event.
  */
@JSGlobal("ASPxClientPopupWindowCloseUpEventArgs")
@js.native
class ASPxClientPopupWindowCloseUpEventArgs protected () extends ASPxClientPopupWindowEventArgs {
  /**
    * Initializes a new instance of the ASPxClientPopupWindowCloseUpEventArgs class with the specified settings.
    * @param window An ASPxClientPopupWindow object that is a popup window related to the generated event.
    * @param closeReason One of the ASPxClientPopupControlCloseReason enumeration values that specifies the reason the popup window closes.
    */
  def this(window: ASPxClientPopupWindow, closeReason: ASPxClientPopupControlCloseReason) = this()
  /**
    * Gets the value that identifies the reason the popup window closes.
    */
  var closeReason: ASPxClientPopupControlCloseReason = js.native
}

