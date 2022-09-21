package typings.devtoolsProtocol.mod.Protocol.CSS

import typings.devtoolsProtocol.mod.Protocol.DOM.NodeId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TakeComputedStyleUpdatesResponse extends StObject {
  
  /**
    * The list of node Ids that have their tracked computed styles updated
    */
  var nodeIds: js.Array[NodeId]
}
object TakeComputedStyleUpdatesResponse {
  
  inline def apply(nodeIds: js.Array[NodeId]): TakeComputedStyleUpdatesResponse = {
    val __obj = js.Dynamic.literal(nodeIds = nodeIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[TakeComputedStyleUpdatesResponse]
  }
  
  extension [Self <: TakeComputedStyleUpdatesResponse](x: Self) {
    
    inline def setNodeIds(value: js.Array[NodeId]): Self = StObject.set(x, "nodeIds", value.asInstanceOf[js.Any])
    
    inline def setNodeIdsVarargs(value: NodeId*): Self = StObject.set(x, "nodeIds", js.Array(value*))
  }
}
