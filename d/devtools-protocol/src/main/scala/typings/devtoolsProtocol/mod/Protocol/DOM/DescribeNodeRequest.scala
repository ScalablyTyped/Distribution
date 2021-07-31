package typings.devtoolsProtocol.mod.Protocol.DOM

import typings.devtoolsProtocol.mod.Protocol.Runtime.RemoteObjectId
import typings.devtoolsProtocol.mod.Protocol.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeNodeRequest extends StObject {
  
  /**
    * Identifier of the backend node.
    */
  var backendNodeId: js.UndefOr[BackendNodeId] = js.undefined
  
  /**
    * The maximum depth at which children should be retrieved, defaults to 1. Use -1 for the
    * entire subtree or provide an integer larger than 0.
    */
  var depth: js.UndefOr[integer] = js.undefined
  
  /**
    * Identifier of the node.
    */
  var nodeId: js.UndefOr[NodeId] = js.undefined
  
  /**
    * JavaScript object id of the node wrapper.
    */
  var objectId: js.UndefOr[RemoteObjectId] = js.undefined
  
  /**
    * Whether or not iframes and shadow roots should be traversed when returning the subtree
    * (default is false).
    */
  var pierce: js.UndefOr[Boolean] = js.undefined
}
object DescribeNodeRequest {
  
  @scala.inline
  def apply(): DescribeNodeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeNodeRequest]
  }
  
  @scala.inline
  implicit class DescribeNodeRequestMutableBuilder[Self <: DescribeNodeRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackendNodeId(value: BackendNodeId): Self = StObject.set(x, "backendNodeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackendNodeIdUndefined: Self = StObject.set(x, "backendNodeId", js.undefined)
    
    @scala.inline
    def setDepth(value: integer): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDepthUndefined: Self = StObject.set(x, "depth", js.undefined)
    
    @scala.inline
    def setNodeId(value: NodeId): Self = StObject.set(x, "nodeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeIdUndefined: Self = StObject.set(x, "nodeId", js.undefined)
    
    @scala.inline
    def setObjectId(value: RemoteObjectId): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
    
    @scala.inline
    def setPierce(value: Boolean): Self = StObject.set(x, "pierce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPierceUndefined: Self = StObject.set(x, "pierce", js.undefined)
  }
}
