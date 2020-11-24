package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PopupWindowCloseUpEventArgs extends PopupWindowEventArgs {
  
  val closeReason: BootstrapPopupControlCloseReason = js.native
}
object PopupWindowCloseUpEventArgs {
  
  @scala.inline
  def apply(closeReason: BootstrapPopupControlCloseReason, sender: Control, window: BootstrapPopupWindow): PopupWindowCloseUpEventArgs = {
    val __obj = js.Dynamic.literal(closeReason = closeReason.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], window = window.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopupWindowCloseUpEventArgs]
  }
  
  @scala.inline
  implicit class PopupWindowCloseUpEventArgsOps[Self <: PopupWindowCloseUpEventArgs] (val x: Self) extends AnyVal {
    
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
    def setCloseReason(value: BootstrapPopupControlCloseReason): Self = this.set("closeReason", value.asInstanceOf[js.Any])
  }
}
