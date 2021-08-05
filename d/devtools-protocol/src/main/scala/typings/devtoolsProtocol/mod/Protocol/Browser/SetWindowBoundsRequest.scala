package typings.devtoolsProtocol.mod.Protocol.Browser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetWindowBoundsRequest extends StObject {
  
  /**
    * New window bounds. The 'minimized', 'maximized' and 'fullscreen' states cannot be combined
    * with 'left', 'top', 'width' or 'height'. Leaves unspecified fields unchanged.
    */
  var bounds: Bounds
  
  /**
    * Browser window id.
    */
  var windowId: WindowID
}
object SetWindowBoundsRequest {
  
  inline def apply(bounds: Bounds, windowId: WindowID): SetWindowBoundsRequest = {
    val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], windowId = windowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetWindowBoundsRequest]
  }
  
  extension [Self <: SetWindowBoundsRequest](x: Self) {
    
    inline def setBounds(value: Bounds): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
    
    inline def setWindowId(value: WindowID): Self = StObject.set(x, "windowId", value.asInstanceOf[js.Any])
  }
}
