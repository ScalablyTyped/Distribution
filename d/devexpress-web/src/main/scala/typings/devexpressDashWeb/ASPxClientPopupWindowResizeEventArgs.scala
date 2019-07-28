package typings.devexpressDashWeb

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
  var resizeState: Double
}

object ASPxClientPopupWindowResizeEventArgs {
  @scala.inline
  def apply(resizeState: Double, window: ASPxClientPopupWindow): ASPxClientPopupWindowResizeEventArgs = {
    val __obj = js.Dynamic.literal(resizeState = resizeState, window = window)
  
    __obj.asInstanceOf[ASPxClientPopupWindowResizeEventArgs]
  }
}

