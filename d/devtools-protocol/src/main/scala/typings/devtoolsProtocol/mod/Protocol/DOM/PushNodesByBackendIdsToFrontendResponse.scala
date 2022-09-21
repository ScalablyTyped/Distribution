package typings.devtoolsProtocol.mod.Protocol.DOM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PushNodesByBackendIdsToFrontendResponse extends StObject {
  
  /**
    * The array of ids of pushed nodes that correspond to the backend ids specified in
    * backendNodeIds.
    */
  var nodeIds: js.Array[NodeId]
}
object PushNodesByBackendIdsToFrontendResponse {
  
  inline def apply(nodeIds: js.Array[NodeId]): PushNodesByBackendIdsToFrontendResponse = {
    val __obj = js.Dynamic.literal(nodeIds = nodeIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[PushNodesByBackendIdsToFrontendResponse]
  }
  
  extension [Self <: PushNodesByBackendIdsToFrontendResponse](x: Self) {
    
    inline def setNodeIds(value: js.Array[NodeId]): Self = StObject.set(x, "nodeIds", value.asInstanceOf[js.Any])
    
    inline def setNodeIdsVarargs(value: NodeId*): Self = StObject.set(x, "nodeIds", js.Array(value*))
  }
}
