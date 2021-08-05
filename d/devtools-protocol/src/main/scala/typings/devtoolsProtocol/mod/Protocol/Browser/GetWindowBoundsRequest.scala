package typings.devtoolsProtocol.mod.Protocol.Browser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetWindowBoundsRequest extends StObject {
  
  /**
    * Browser window id.
    */
  var windowId: WindowID
}
object GetWindowBoundsRequest {
  
  inline def apply(windowId: WindowID): GetWindowBoundsRequest = {
    val __obj = js.Dynamic.literal(windowId = windowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetWindowBoundsRequest]
  }
  
  extension [Self <: GetWindowBoundsRequest](x: Self) {
    
    inline def setWindowId(value: WindowID): Self = StObject.set(x, "windowId", value.asInstanceOf[js.Any])
  }
}
