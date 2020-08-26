package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientPopupControlBase.Resize event.
  */
@js.native
trait ASPxClientPopupWindowResizeEventArgs extends ASPxClientPopupWindowEventArgs {
  /**
    * Returns the value indicating the window state after resizing.
    */
  var resizeState: Double = js.native
}

object ASPxClientPopupWindowResizeEventArgs {
  @scala.inline
  def apply(resizeState: Double, window: ASPxClientPopupWindow): ASPxClientPopupWindowResizeEventArgs = {
    val __obj = js.Dynamic.literal(resizeState = resizeState.asInstanceOf[js.Any], window = window.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientPopupWindowResizeEventArgs]
  }
  @scala.inline
  implicit class ASPxClientPopupWindowResizeEventArgsOps[Self <: ASPxClientPopupWindowResizeEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setResizeState(value: Double): Self = this.set("resizeState", value.asInstanceOf[js.Any])
  }
  
}

