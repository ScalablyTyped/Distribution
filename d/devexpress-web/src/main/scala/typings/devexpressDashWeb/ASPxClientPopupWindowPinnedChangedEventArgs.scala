package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientPopupControlBase.PinnedChanged event.
  */
@JSGlobal("ASPxClientPopupWindowPinnedChangedEventArgs")
@js.native
class ASPxClientPopupWindowPinnedChangedEventArgs protected () extends ASPxClientPopupWindowEventArgs {
  /**
    * Initializes a new instance of the ASPxClientPopupWindowPinnedChangedEventArgs class with the specified settings.
    * @param window An ASPxClientPopupWindow object that is a popup window related to the generated event.
    * @param pinned true if the window has been pinned; false if the window has been unpinned.
    */
  def this(window: ASPxClientPopupWindow, pinned: Boolean) = this()
  /**
    * Gets a value indicating whether the processed popup window has been pinned.
    */
  var pinned: Boolean = js.native
}

