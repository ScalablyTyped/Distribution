package typings.devtoolsProtocol.mod.Protocol.DOM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChildNodeInsertedEvent extends StObject {
  
  /**
    * Inserted node data.
    */
  var node: Node
  
  /**
    * Id of the node that has changed.
    */
  var parentNodeId: NodeId
  
  /**
    * If of the previous siblint.
    */
  var previousNodeId: NodeId
}
object ChildNodeInsertedEvent {
  
  inline def apply(node: Node, parentNodeId: NodeId, previousNodeId: NodeId): ChildNodeInsertedEvent = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], parentNodeId = parentNodeId.asInstanceOf[js.Any], previousNodeId = previousNodeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChildNodeInsertedEvent]
  }
  
  extension [Self <: ChildNodeInsertedEvent](x: Self) {
    
    inline def setNode(value: Node): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setParentNodeId(value: NodeId): Self = StObject.set(x, "parentNodeId", value.asInstanceOf[js.Any])
    
    inline def setPreviousNodeId(value: NodeId): Self = StObject.set(x, "previousNodeId", value.asInstanceOf[js.Any])
  }
}
