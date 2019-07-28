package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the PinnedChanged event.
  */
trait ASPxClientPopupWindowPinnedChangedEventArgs extends ASPxClientPopupWindowEventArgs {
  /**
    * Gets a value indicating whether the processed popup window has been pinned.
    * Value: true, if the window has been pinned; otherwise, false.
    */
  var pinned: Boolean
}

object ASPxClientPopupWindowPinnedChangedEventArgs {
  @scala.inline
  def apply(pinned: Boolean, window: ASPxClientPopupWindow): ASPxClientPopupWindowPinnedChangedEventArgs = {
    val __obj = js.Dynamic.literal(pinned = pinned, window = window)
  
    __obj.asInstanceOf[ASPxClientPopupWindowPinnedChangedEventArgs]
  }
}

