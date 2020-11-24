package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientPopupControlBase.PinnedChanged event.
  */
@js.native
trait ASPxClientPopupWindowPinnedChangedEventArgs extends ASPxClientPopupWindowEventArgs {
  
  /**
    * Gets a value indicating whether the processed popup window has been pinned.
    */
  var pinned: Boolean = js.native
}
object ASPxClientPopupWindowPinnedChangedEventArgs {
  
  @scala.inline
  def apply(pinned: Boolean, window: ASPxClientPopupWindow): ASPxClientPopupWindowPinnedChangedEventArgs = {
    val __obj = js.Dynamic.literal(pinned = pinned.asInstanceOf[js.Any], window = window.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientPopupWindowPinnedChangedEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientPopupWindowPinnedChangedEventArgsOps[Self <: ASPxClientPopupWindowPinnedChangedEventArgs] (val x: Self) extends AnyVal {
    
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
    def setPinned(value: Boolean): Self = this.set("pinned", value.asInstanceOf[js.Any])
  }
}
