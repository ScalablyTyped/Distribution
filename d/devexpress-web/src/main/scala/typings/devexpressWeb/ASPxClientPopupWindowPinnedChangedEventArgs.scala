package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientPopupControlBase.PinnedChanged event.
  */
trait ASPxClientPopupWindowPinnedChangedEventArgs extends ASPxClientPopupWindowEventArgs {
  /**
    * Gets a value indicating whether the processed popup window has been pinned.
    */
  var pinned: Boolean
}

object ASPxClientPopupWindowPinnedChangedEventArgs {
  @scala.inline
  def apply(pinned: Boolean, window: ASPxClientPopupWindow): ASPxClientPopupWindowPinnedChangedEventArgs = {
    val __obj = js.Dynamic.literal(pinned = pinned.asInstanceOf[js.Any], window = window.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientPopupWindowPinnedChangedEventArgs]
  }
}

