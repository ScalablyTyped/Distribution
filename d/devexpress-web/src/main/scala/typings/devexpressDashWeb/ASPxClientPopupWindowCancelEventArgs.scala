package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the popup control's cancellable client events, such as the ASPxClientPopupControlBase.Closing.
  */
@JSGlobal("ASPxClientPopupWindowCancelEventArgs")
@js.native
class ASPxClientPopupWindowCancelEventArgs protected () extends ASPxClientCancelEventArgs {
  /**
    * Initializes a new instance of the ASPxClientPopupWindowCancelEventArgs class with the specified settings.
    * @param window An ASPxClientPopupWindow object that is a popup window related to the generated event.
    * @param closeReason One of the ASPxClientPopupControlCloseReason enumeration values that specifies the reason the popup window is about to close.
    */
  def this(window: ASPxClientPopupWindow, closeReason: ASPxClientPopupControlCloseReason) = this()
  /**
    * Gets the value that identifies the reason the popup window is about to close.
    */
  var closeReason: ASPxClientPopupControlCloseReason = js.native
  /**
    * Gets the popup window object related to the event.
    */
  var window: ASPxClientPopupWindow = js.native
}

