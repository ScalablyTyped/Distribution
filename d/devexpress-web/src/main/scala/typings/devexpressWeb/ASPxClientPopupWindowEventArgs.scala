package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for events concerning client manipulations on popup windows.
  */
@JSGlobal("ASPxClientPopupWindowEventArgs")
@js.native
class ASPxClientPopupWindowEventArgs protected () extends ASPxClientEventArgs {
  /**
    * Initializes a new instance of the ASPxClientPopupWindowEventArgs class.
    * @param window A ASPxClientPopupWindow object representing the popup window related to the generated event.
    */
  def this(window: ASPxClientPopupWindow) = this()
  /**
    * Gets the popup window object related to the event.
    */
  var window: ASPxClientPopupWindow = js.native
}

