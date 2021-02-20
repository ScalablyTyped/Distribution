package typings.facebookJsSdk.facebook

import typings.facebookJsSdk.facebookJsSdkStrings.create
import typings.facebookJsSdk.facebookJsSdkStrings.iframe
import typings.facebookJsSdk.facebookJsSdkStrings.live_broadcast
import typings.facebookJsSdk.facebookJsSdkStrings.popup
import typings.facebookJsSdk.facebookJsSdkStrings.publish
import org.scalablytyped.runtime.StObject
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
  implicit class LiveDialogParamsMutableBuilder[Self <: LiveDialogParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBroadcast_data(value: LiveDialogResponse): Self = StObject.set(x, "broadcast_data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBroadcast_dataUndefined: Self = StObject.set(x, "broadcast_data", js.undefined)
    
    @scala.inline
    def setDisplay(value: popup | iframe): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethod(value: live_broadcast): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhase(value: create | publish): Self = StObject.set(x, "phase", value.asInstanceOf[js.Any])
  }
}
