package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the popup control's cancellable client events, such as the ASPxClientPopupControlBase.Closing.
  */
@JSGlobal("ASPxClientPopupWindowCancelEventArgs")
@js.native
class ASPxClientPopupWindowCancelEventArgs protected ()
  extends typings.devexpressWeb.ASPxClientPopupWindowCancelEventArgs {
  /**
    * Initializes a new instance of the ASPxClientPopupWindowCancelEventArgs class with the specified settings.
    * @param window An ASPxClientPopupWindow object that is a popup window related to the generated event.
    * @param closeReason One of the ASPxClientPopupControlCloseReason enumeration values that specifies the reason the popup window is about to close.
    */
  def this(
    window: typings.devexpressWeb.ASPxClientPopupWindow,
    closeReason: typings.devexpressWeb.ASPxClientPopupControlCloseReason
  ) = this()
}

