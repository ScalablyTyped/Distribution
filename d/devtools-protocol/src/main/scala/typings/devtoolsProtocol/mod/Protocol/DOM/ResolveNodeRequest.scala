package typings.devtoolsProtocol.mod.Protocol.DOM

import typings.devtoolsProtocol.mod.Protocol.Runtime.ExecutionContextId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResolveNodeRequest extends StObject {
  
  /**
    * Backend identifier of the node to resolve.
    */
  var backendNodeId: js.UndefOr[BackendNodeId] = js.native
  
  /**
    * Execution context in which to resolve the node.
    */
  var executionContextId: js.UndefOr[ExecutionContextId] = js.native
  
  /**
    * Id of the node to resolve.
    */
  var nodeId: js.UndefOr[NodeId] = js.native
  
  /**
    * Symbolic group name that can be used to release multiple objects.
    */
  var objectGroup: js.UndefOr[String] = js.native
}
object ResolveNodeRequest {
  
  @scala.inline
  def apply(): ResolveNodeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResolveNodeRequest]
  }
  
  @scala.inline
  implicit class ResolveNodeRequestMutableBuilder[Self <: ResolveNodeRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackendNodeId(value: BackendNodeId): Self = StObject.set(x, "backendNodeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackendNodeIdUndefined: Self = StObject.set(x, "backendNodeId", js.undefined)
    
    @scala.inline
    def setExecutionContextId(value: ExecutionContextId): Self = StObject.set(x, "executionContextId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutionContextIdUndefined: Self = StObject.set(x, "executionContextId", js.undefined)
    
    @scala.inline
    def setNodeId(value: NodeId): Self = StObject.set(x, "nodeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeIdUndefined: Self = StObject.set(x, "nodeId", js.undefined)
    
    @scala.inline
    def setObjectGroup(value: String): Self = StObject.set(x, "objectGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectGroupUndefined: Self = StObject.set(x, "objectGroup", js.undefined)
  }
}
