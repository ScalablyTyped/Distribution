package typings.facebookJsSdk.facebook

import typings.facebookJsSdk.facebookJsSdkStrings.create
import typings.facebookJsSdk.facebookJsSdkStrings.iframe
import typings.facebookJsSdk.facebookJsSdkStrings.live_broadcast
import typings.facebookJsSdk.facebookJsSdkStrings.popup
import typings.facebookJsSdk.facebookJsSdkStrings.publish
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LiveDialogParams extends DialogParams {
  
  var broadcast_data: js.UndefOr[LiveDialogResponse] = js.native
  
  @JSName("display")
  var display_LiveDialogParams: popup | iframe = js.native
  
  var method: live_broadcast = js.native
  
  var phase: create | publish = js.native
}
object LiveDialogParams {
  
  @scala.inline
  def apply(display: popup | iframe, method: live_broadcast, phase: create | publish): LiveDialogParams = {
    val __obj = js.Dynamic.literal(display = display.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], phase = phase.asInstanceOf[js.Any])
    __obj.asInstanceOf[LiveDialogParams]
  }
  
  @scala.inline
  implicit class LiveDialogParamsOps[Self <: LiveDialogParams] (val x: Self) extends AnyVal {
    
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
    def setDisplay(value: popup | iframe): Self = this.set("display", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethod(value: live_broadcast): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhase(value: create | publish): Self = this.set("phase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBroadcast_data(value: LiveDialogResponse): Self = this.set("broadcast_data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBroadcast_data: Self = this.set("broadcast_data", js.undefined)
  }
}
