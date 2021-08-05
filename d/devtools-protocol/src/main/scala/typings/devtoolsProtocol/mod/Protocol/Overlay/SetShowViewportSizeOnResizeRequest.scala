package typings.devtoolsProtocol.mod.Protocol.Overlay

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetShowViewportSizeOnResizeRequest extends StObject {
  
  /**
    * Whether to paint size or not.
    */
  var show: Boolean
}
object SetShowViewportSizeOnResizeRequest {
  
  inline def apply(show: Boolean): SetShowViewportSizeOnResizeRequest = {
    val __obj = js.Dynamic.literal(show = show.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetShowViewportSizeOnResizeRequest]
  }
  
  extension [Self <: SetShowViewportSizeOnResizeRequest](x: Self) {
    
    inline def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
  }
}
