package typings.devtoolsProtocol.mod.Protocol.DOM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChildNodeRemovedEvent extends StObject {
  
  /**
    * Id of the node that has been removed.
    */
  var nodeId: NodeId
  
  /**
    * Parent id.
    */
  var parentNodeId: NodeId
}
object ChildNodeRemovedEvent {
  
  inline def apply(nodeId: NodeId, parentNodeId: NodeId): ChildNodeRemovedEvent = {
    val __obj = js.Dynamic.literal(nodeId = nodeId.asInstanceOf[js.Any], parentNodeId = parentNodeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChildNodeRemovedEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChildNodeRemovedEvent] (val x: Self) extends AnyVal {
    
    inline def setNodeId(value: NodeId): Self = StObject.set(x, "nodeId", value.asInstanceOf[js.Any])
    
    inline def setParentNodeId(value: NodeId): Self = StObject.set(x, "parentNodeId", value.asInstanceOf[js.Any])
  }
}
