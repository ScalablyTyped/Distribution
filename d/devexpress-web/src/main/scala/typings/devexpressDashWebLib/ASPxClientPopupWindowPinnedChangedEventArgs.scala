package typings
package devexpressDashWebLib

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
  var pinned: scala.Boolean
}

object ASPxClientPopupWindowPinnedChangedEventArgs {
  @scala.inline
  def apply(pinned: scala.Boolean, window: ASPxClientPopupWindow): ASPxClientPopupWindowPinnedChangedEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("pinned")(pinned)
    __obj.updateDynamic("window")(window)
    __obj.asInstanceOf[ASPxClientPopupWindowPinnedChangedEventArgs]
  }
}

