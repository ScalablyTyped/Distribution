package typings.devtoolsProtocol.mod.Protocol.Accessibility

import typings.devtoolsProtocol.mod.Protocol.Page.FrameId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetChildAXNodesRequest extends StObject {
  
  /**
    * The frame in whose document the node resides.
    * If omitted, the root frame is used.
    */
  var frameId: js.UndefOr[FrameId] = js.undefined
  
  var id: AXNodeId
}
object GetChildAXNodesRequest {
  
  inline def apply(id: AXNodeId): GetChildAXNodesRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetChildAXNodesRequest]
  }
  
  extension [Self <: GetChildAXNodesRequest](x: Self) {
    
    inline def setFrameId(value: FrameId): Self = StObject.set(x, "frameId", value.asInstanceOf[js.Any])
    
    inline def setFrameIdUndefined: Self = StObject.set(x, "frameId", js.undefined)
    
    inline def setId(value: AXNodeId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
