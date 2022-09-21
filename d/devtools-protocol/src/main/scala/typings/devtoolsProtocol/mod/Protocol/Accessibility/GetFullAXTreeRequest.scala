package typings.devtoolsProtocol.mod.Protocol.Accessibility

import typings.devtoolsProtocol.mod.Protocol.Page.FrameId
import typings.devtoolsProtocol.mod.Protocol.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetFullAXTreeRequest extends StObject {
  
  /**
    * The maximum depth at which descendants of the root node should be retrieved.
    * If omitted, the full tree is returned.
    */
  var depth: js.UndefOr[integer] = js.undefined
  
  /**
    * The frame for whose document the AX tree should be retrieved.
    * If omited, the root frame is used.
    */
  var frameId: js.UndefOr[FrameId] = js.undefined
}
object GetFullAXTreeRequest {
  
  inline def apply(): GetFullAXTreeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetFullAXTreeRequest]
  }
  
  extension [Self <: GetFullAXTreeRequest](x: Self) {
    
    inline def setDepth(value: integer): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
    
    inline def setDepthUndefined: Self = StObject.set(x, "depth", js.undefined)
    
    inline def setFrameId(value: FrameId): Self = StObject.set(x, "frameId", value.asInstanceOf[js.Any])
    
    inline def setFrameIdUndefined: Self = StObject.set(x, "frameId", js.undefined)
  }
}
