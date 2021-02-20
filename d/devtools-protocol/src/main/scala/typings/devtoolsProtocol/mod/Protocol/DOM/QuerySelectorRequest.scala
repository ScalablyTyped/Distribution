package typings.devtoolsProtocol.mod.Protocol.DOM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QuerySelectorRequest extends StObject {
  
  /**
    * Id of the node to query upon.
    */
  var nodeId: NodeId = js.native
  
  /**
    * Selector string.
    */
  var selector: String = js.native
}
object QuerySelectorRequest {
  
  @scala.inline
  def apply(nodeId: NodeId, selector: String): QuerySelectorRequest = {
    val __obj = js.Dynamic.literal(nodeId = nodeId.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuerySelectorRequest]
  }
  
  @scala.inline
  implicit class QuerySelectorRequestMutableBuilder[Self <: QuerySelectorRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNodeId(value: NodeId): Self = StObject.set(x, "nodeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
  }
}
