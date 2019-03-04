package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the Resize event.
  */
trait ASPxClientPopupWindowResizeEventArgs extends ASPxClientPopupWindowEventArgs {
  /**
    * Returns the value indicating the window state after resizing.
    * Value: The integer value indicating the window resize state.
    */
  var resizeState: scala.Double
}

object ASPxClientPopupWindowResizeEventArgs {
  @scala.inline
  def apply(resizeState: scala.Double, window: ASPxClientPopupWindow): ASPxClientPopupWindowResizeEventArgs = {
    val __obj = js.Dynamic.literal(resizeState = resizeState, window = window)
  
    __obj.asInstanceOf[ASPxClientPopupWindowResizeEventArgs]
  }
}

