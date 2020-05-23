package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientPopupControlBase.Resize event.
  */
trait ASPxClientPopupWindowResizeEventArgs extends ASPxClientPopupWindowEventArgs {
  /**
    * Returns the value indicating the window state after resizing.
    */
  var resizeState: Double
}

object ASPxClientPopupWindowResizeEventArgs {
  @scala.inline
  def apply(resizeState: Double, window: ASPxClientPopupWindow): ASPxClientPopupWindowResizeEventArgs = {
    val __obj = js.Dynamic.literal(resizeState = resizeState.asInstanceOf[js.Any], window = window.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientPopupWindowResizeEventArgs]
  }
}

