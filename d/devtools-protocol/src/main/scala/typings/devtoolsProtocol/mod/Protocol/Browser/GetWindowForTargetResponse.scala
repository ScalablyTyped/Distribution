package typings.devtoolsProtocol.mod.Protocol.Browser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetWindowForTargetResponse extends StObject {
  
  /**
    * Bounds information of the window. When window state is 'minimized', the restored window
    * position and size are returned.
    */
  var bounds: Bounds
  
  /**
    * Browser window id.
    */
  var windowId: WindowID
}
object GetWindowForTargetResponse {
  
  inline def apply(bounds: Bounds, windowId: WindowID): GetWindowForTargetResponse = {
    val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], windowId = windowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetWindowForTargetResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetWindowForTargetResponse] (val x: Self) extends AnyVal {
    
    inline def setBounds(value: Bounds): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
    
    inline def setWindowId(value: WindowID): Self = StObject.set(x, "windowId", value.asInstanceOf[js.Any])
  }
}
