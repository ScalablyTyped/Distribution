package typings.devtoolsProtocol.mod.Protocol.DOM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DistributedNodesUpdatedEvent extends StObject {
  
  /**
    * Distributed nodes for given insertion point.
    */
  var distributedNodes: js.Array[BackendNode] = js.native
  
  /**
    * Insertion point where distrubuted nodes were updated.
    */
  var insertionPointId: NodeId = js.native
}
object DistributedNodesUpdatedEvent {
  
  @scala.inline
  def apply(distributedNodes: js.Array[BackendNode], insertionPointId: NodeId): DistributedNodesUpdatedEvent = {
    val __obj = js.Dynamic.literal(distributedNodes = distributedNodes.asInstanceOf[js.Any], insertionPointId = insertionPointId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistributedNodesUpdatedEvent]
  }
  
  @scala.inline
  implicit class DistributedNodesUpdatedEventMutableBuilder[Self <: DistributedNodesUpdatedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDistributedNodes(value: js.Array[BackendNode]): Self = StObject.set(x, "distributedNodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistributedNodesVarargs(value: BackendNode*): Self = StObject.set(x, "distributedNodes", js.Array(value :_*))
    
    @scala.inline
    def setInsertionPointId(value: NodeId): Self = StObject.set(x, "insertionPointId", value.asInstanceOf[js.Any])
  }
}
