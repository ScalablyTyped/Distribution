package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientPopupControlBase.CloseUp event.
  */
@JSGlobal("ASPxClientPopupWindowCloseUpEventArgs")
@js.native
class ASPxClientPopupWindowCloseUpEventArgs protected ()
  extends typings.devexpressWeb.ASPxClientPopupWindowCloseUpEventArgs {
  /**
    * Initializes a new instance of the ASPxClientPopupWindowCloseUpEventArgs class with the specified settings.
    * @param window An ASPxClientPopupWindow object that is a popup window related to the generated event.
    * @param closeReason One of the ASPxClientPopupControlCloseReason enumeration values that specifies the reason the popup window closes.
    */
  def this(
    window: typings.devexpressWeb.ASPxClientPopupWindow,
    closeReason: typings.devexpressWeb.ASPxClientPopupControlCloseReason
  ) = this()
  /**
    * Gets the value that identifies the reason the popup window closes.
    */
  /* CompleteClass */
  override var closeReason: typings.devexpressWeb.ASPxClientPopupControlCloseReason = js.native
  /**
    * Gets the popup window object related to the event.
    */
  /* CompleteClass */
  override var window: typings.devexpressWeb.ASPxClientPopupWindow = js.native
}

