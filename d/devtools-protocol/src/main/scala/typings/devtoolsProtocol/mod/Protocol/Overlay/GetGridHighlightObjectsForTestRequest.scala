package typings.devtoolsProtocol.mod.Protocol.Overlay

import typings.devtoolsProtocol.mod.Protocol.DOM.NodeId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetGridHighlightObjectsForTestRequest extends StObject {
  
  /**
    * Ids of the node to get highlight object for.
    */
  var nodeIds: js.Array[NodeId] = js.native
}
object GetGridHighlightObjectsForTestRequest {
  
  @scala.inline
  def apply(nodeIds: js.Array[NodeId]): GetGridHighlightObjectsForTestRequest = {
    val __obj = js.Dynamic.literal(nodeIds = nodeIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetGridHighlightObjectsForTestRequest]
  }
  
  @scala.inline
  implicit class GetGridHighlightObjectsForTestRequestMutableBuilder[Self <: GetGridHighlightObjectsForTestRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNodeIds(value: js.Array[NodeId]): Self = StObject.set(x, "nodeIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeIdsVarargs(value: NodeId*): Self = StObject.set(x, "nodeIds", js.Array(value :_*))
  }
}
