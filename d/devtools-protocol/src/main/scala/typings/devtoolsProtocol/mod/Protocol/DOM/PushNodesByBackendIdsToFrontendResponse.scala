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
  
  @scala.inline
  def apply(nodeIds: js.Array[NodeId]): PushNodesByBackendIdsToFrontendResponse = {
    val __obj = js.Dynamic.literal(nodeIds = nodeIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[PushNodesByBackendIdsToFrontendResponse]
  }
  
  @scala.inline
  implicit class PushNodesByBackendIdsToFrontendResponseMutableBuilder[Self <: PushNodesByBackendIdsToFrontendResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNodeIds(value: js.Array[NodeId]): Self = StObject.set(x, "nodeIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeIdsVarargs(value: NodeId*): Self = StObject.set(x, "nodeIds", js.Array(value :_*))
  }
}
