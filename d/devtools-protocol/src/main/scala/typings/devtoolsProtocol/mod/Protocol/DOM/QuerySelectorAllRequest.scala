package typings.devtoolsProtocol.mod.Protocol.DOM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QuerySelectorAllRequest extends StObject {
  
  /**
    * Id of the node to query upon.
    */
  var nodeId: NodeId = js.native
  
  /**
    * Selector string.
    */
  var selector: String = js.native
}
object QuerySelectorAllRequest {
  
  @scala.inline
  def apply(nodeId: NodeId, selector: String): QuerySelectorAllRequest = {
    val __obj = js.Dynamic.literal(nodeId = nodeId.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuerySelectorAllRequest]
  }
  
  @scala.inline
  implicit class QuerySelectorAllRequestMutableBuilder[Self <: QuerySelectorAllRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNodeId(value: NodeId): Self = StObject.set(x, "nodeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
  }
}
