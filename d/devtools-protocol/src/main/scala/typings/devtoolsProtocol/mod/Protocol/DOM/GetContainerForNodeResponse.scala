package typings.devtoolsProtocol.mod.Protocol.DOM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetContainerForNodeResponse extends StObject {
  
  /**
    * The container node for the given node, or null if not found.
    */
  var nodeId: js.UndefOr[NodeId] = js.undefined
}
object GetContainerForNodeResponse {
  
  inline def apply(): GetContainerForNodeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetContainerForNodeResponse]
  }
  
  extension [Self <: GetContainerForNodeResponse](x: Self) {
    
    inline def setNodeId(value: NodeId): Self = StObject.set(x, "nodeId", value.asInstanceOf[js.Any])
    
    inline def setNodeIdUndefined: Self = StObject.set(x, "nodeId", js.undefined)
  }
}
