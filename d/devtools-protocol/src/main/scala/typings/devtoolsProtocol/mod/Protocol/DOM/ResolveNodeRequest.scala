package typings.devtoolsProtocol.mod.Protocol.DOM

import typings.devtoolsProtocol.mod.Protocol.Runtime.ExecutionContextId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResolveNodeRequest extends StObject {
  
  /**
    * Backend identifier of the node to resolve.
    */
  var backendNodeId: js.UndefOr[BackendNodeId] = js.undefined
  
  /**
    * Execution context in which to resolve the node.
    */
  var executionContextId: js.UndefOr[ExecutionContextId] = js.undefined
  
  /**
    * Id of the node to resolve.
    */
  var nodeId: js.UndefOr[NodeId] = js.undefined
  
  /**
    * Symbolic group name that can be used to release multiple objects.
    */
  var objectGroup: js.UndefOr[String] = js.undefined
}
object ResolveNodeRequest {
  
  inline def apply(): ResolveNodeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResolveNodeRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResolveNodeRequest] (val x: Self) extends AnyVal {
    
    inline def setBackendNodeId(value: BackendNodeId): Self = StObject.set(x, "backendNodeId", value.asInstanceOf[js.Any])
    
    inline def setBackendNodeIdUndefined: Self = StObject.set(x, "backendNodeId", js.undefined)
    
    inline def setExecutionContextId(value: ExecutionContextId): Self = StObject.set(x, "executionContextId", value.asInstanceOf[js.Any])
    
    inline def setExecutionContextIdUndefined: Self = StObject.set(x, "executionContextId", js.undefined)
    
    inline def setNodeId(value: NodeId): Self = StObject.set(x, "nodeId", value.asInstanceOf[js.Any])
    
    inline def setNodeIdUndefined: Self = StObject.set(x, "nodeId", js.undefined)
    
    inline def setObjectGroup(value: String): Self = StObject.set(x, "objectGroup", value.asInstanceOf[js.Any])
    
    inline def setObjectGroupUndefined: Self = StObject.set(x, "objectGroup", js.undefined)
  }
}
