package typings.devtoolsProtocol.mod.Protocol.DOM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InlineStyleInvalidatedEvent extends StObject {
  
  /**
    * Ids of the nodes for which the inline styles have been invalidated.
    */
  var nodeIds: js.Array[NodeId]
}
object InlineStyleInvalidatedEvent {
  
  inline def apply(nodeIds: js.Array[NodeId]): InlineStyleInvalidatedEvent = {
    val __obj = js.Dynamic.literal(nodeIds = nodeIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[InlineStyleInvalidatedEvent]
  }
  
  extension [Self <: InlineStyleInvalidatedEvent](x: Self) {
    
    inline def setNodeIds(value: js.Array[NodeId]): Self = StObject.set(x, "nodeIds", value.asInstanceOf[js.Any])
    
    inline def setNodeIdsVarargs(value: NodeId*): Self = StObject.set(x, "nodeIds", js.Array(value*))
  }
}
