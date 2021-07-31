package typings.devtoolsProtocol.mod.Protocol.DOM

import typings.devtoolsProtocol.mod.Protocol.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestChildNodesRequest extends StObject {
  
  /**
    * The maximum depth at which children should be retrieved, defaults to 1. Use -1 for the
    * entire subtree or provide an integer larger than 0.
    */
  var depth: js.UndefOr[integer] = js.undefined
  
  /**
    * Id of the node to get children for.
    */
  var nodeId: NodeId
  
  /**
    * Whether or not iframes and shadow roots should be traversed when returning the sub-tree
    * (default is false).
    */
  var pierce: js.UndefOr[Boolean] = js.undefined
}
object RequestChildNodesRequest {
  
  @scala.inline
  def apply(nodeId: NodeId): RequestChildNodesRequest = {
    val __obj = js.Dynamic.literal(nodeId = nodeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestChildNodesRequest]
  }
  
  @scala.inline
  implicit class RequestChildNodesRequestMutableBuilder[Self <: RequestChildNodesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDepth(value: integer): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDepthUndefined: Self = StObject.set(x, "depth", js.undefined)
    
    @scala.inline
    def setNodeId(value: NodeId): Self = StObject.set(x, "nodeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPierce(value: Boolean): Self = StObject.set(x, "pierce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPierceUndefined: Self = StObject.set(x, "pierce", js.undefined)
  }
}
