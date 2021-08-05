package typings.facebookJsSdk.facebook

import typings.facebookJsSdk.facebookJsSdkStrings.create
import typings.facebookJsSdk.facebookJsSdkStrings.iframe
import typings.facebookJsSdk.facebookJsSdkStrings.live_broadcast
import typings.facebookJsSdk.facebookJsSdkStrings.popup
import typings.facebookJsSdk.facebookJsSdkStrings.publish
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LiveDialogParams
  extends StObject
     with DialogParams {
  
  var broadcast_data: js.UndefOr[LiveDialogResponse] = js.undefined
  
  @JSName("display")
  var display_LiveDialogParams: popup | iframe
  
  var method: live_broadcast
  
  var phase: create | publish
}
object LiveDialogParams {
  
  inline def apply(display: popup | iframe, phase: create | publish): LiveDialogParams = {
    val __obj = js.Dynamic.literal(display = display.asInstanceOf[js.Any], method = "live_broadcast", phase = phase.asInstanceOf[js.Any])
    __obj.asInstanceOf[LiveDialogParams]
  }
  
  extension [Self <: LiveDialogParams](x: Self) {
    
    inline def setBroadcast_data(value: LiveDialogResponse): Self = StObject.set(x, "broadcast_data", value.asInstanceOf[js.Any])
    
    inline def setBroadcast_dataUndefined: Self = StObject.set(x, "broadcast_data", js.undefined)
    
    inline def setDisplay(value: popup | iframe): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    inline def setMethod(value: live_broadcast): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setPhase(value: create | publish): Self = StObject.set(x, "phase", value.asInstanceOf[js.Any])
  }
}
