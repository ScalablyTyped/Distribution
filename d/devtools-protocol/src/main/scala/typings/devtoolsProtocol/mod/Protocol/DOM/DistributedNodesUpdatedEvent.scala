package typings.devtoolsProtocol.mod.Protocol.DOM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DistributedNodesUpdatedEvent extends StObject {
  
  /**
    * Distributed nodes for given insertion point.
    */
  var distributedNodes: js.Array[BackendNode]
  
  /**
    * Insertion point where distributed nodes were updated.
    */
  var insertionPointId: NodeId
}
object DistributedNodesUpdatedEvent {
  
  inline def apply(distributedNodes: js.Array[BackendNode], insertionPointId: NodeId): DistributedNodesUpdatedEvent = {
    val __obj = js.Dynamic.literal(distributedNodes = distributedNodes.asInstanceOf[js.Any], insertionPointId = insertionPointId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistributedNodesUpdatedEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DistributedNodesUpdatedEvent] (val x: Self) extends AnyVal {
    
    inline def setDistributedNodes(value: js.Array[BackendNode]): Self = StObject.set(x, "distributedNodes", value.asInstanceOf[js.Any])
    
    inline def setDistributedNodesVarargs(value: BackendNode*): Self = StObject.set(x, "distributedNodes", js.Array(value*))
    
    inline def setInsertionPointId(value: NodeId): Self = StObject.set(x, "insertionPointId", value.asInstanceOf[js.Any])
  }
}
