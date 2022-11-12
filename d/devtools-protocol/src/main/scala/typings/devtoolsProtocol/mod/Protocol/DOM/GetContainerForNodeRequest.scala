package typings.devtoolsProtocol.mod.Protocol.DOM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetContainerForNodeRequest extends StObject {
  
  var containerName: js.UndefOr[String] = js.undefined
  
  var logicalAxes: js.UndefOr[LogicalAxes] = js.undefined
  
  var nodeId: NodeId
  
  var physicalAxes: js.UndefOr[PhysicalAxes] = js.undefined
}
object GetContainerForNodeRequest {
  
  inline def apply(nodeId: NodeId): GetContainerForNodeRequest = {
    val __obj = js.Dynamic.literal(nodeId = nodeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetContainerForNodeRequest]
  }
  
  extension [Self <: GetContainerForNodeRequest](x: Self) {
    
    inline def setContainerName(value: String): Self = StObject.set(x, "containerName", value.asInstanceOf[js.Any])
    
    inline def setContainerNameUndefined: Self = StObject.set(x, "containerName", js.undefined)
    
    inline def setLogicalAxes(value: LogicalAxes): Self = StObject.set(x, "logicalAxes", value.asInstanceOf[js.Any])
    
    inline def setLogicalAxesUndefined: Self = StObject.set(x, "logicalAxes", js.undefined)
    
    inline def setNodeId(value: NodeId): Self = StObject.set(x, "nodeId", value.asInstanceOf[js.Any])
    
    inline def setPhysicalAxes(value: PhysicalAxes): Self = StObject.set(x, "physicalAxes", value.asInstanceOf[js.Any])
    
    inline def setPhysicalAxesUndefined: Self = StObject.set(x, "physicalAxes", js.undefined)
  }
}
