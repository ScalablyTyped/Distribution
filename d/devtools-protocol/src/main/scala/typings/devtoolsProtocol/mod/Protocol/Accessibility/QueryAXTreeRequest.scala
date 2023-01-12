package typings.devtoolsProtocol.mod.Protocol.Accessibility

import typings.devtoolsProtocol.mod.Protocol.DOM.BackendNodeId
import typings.devtoolsProtocol.mod.Protocol.DOM.NodeId
import typings.devtoolsProtocol.mod.Protocol.Runtime.RemoteObjectId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryAXTreeRequest extends StObject {
  
  /**
    * Find nodes with this computed name.
    */
  var accessibleName: js.UndefOr[String] = js.undefined
  
  /**
    * Identifier of the backend node for the root to query.
    */
  var backendNodeId: js.UndefOr[BackendNodeId] = js.undefined
  
  /**
    * Identifier of the node for the root to query.
    */
  var nodeId: js.UndefOr[NodeId] = js.undefined
  
  /**
    * JavaScript object id of the node wrapper for the root to query.
    */
  var objectId: js.UndefOr[RemoteObjectId] = js.undefined
  
  /**
    * Find nodes with this computed role.
    */
  var role: js.UndefOr[String] = js.undefined
}
object QueryAXTreeRequest {
  
  inline def apply(): QueryAXTreeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryAXTreeRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueryAXTreeRequest] (val x: Self) extends AnyVal {
    
    inline def setAccessibleName(value: String): Self = StObject.set(x, "accessibleName", value.asInstanceOf[js.Any])
    
    inline def setAccessibleNameUndefined: Self = StObject.set(x, "accessibleName", js.undefined)
    
    inline def setBackendNodeId(value: BackendNodeId): Self = StObject.set(x, "backendNodeId", value.asInstanceOf[js.Any])
    
    inline def setBackendNodeIdUndefined: Self = StObject.set(x, "backendNodeId", js.undefined)
    
    inline def setNodeId(value: NodeId): Self = StObject.set(x, "nodeId", value.asInstanceOf[js.Any])
    
    inline def setNodeIdUndefined: Self = StObject.set(x, "nodeId", js.undefined)
    
    inline def setObjectId(value: RemoteObjectId): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    inline def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
    
    inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
  }
}
