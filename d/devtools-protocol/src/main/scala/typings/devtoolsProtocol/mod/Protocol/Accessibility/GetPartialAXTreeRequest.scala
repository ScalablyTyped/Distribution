package typings.devtoolsProtocol.mod.Protocol.Accessibility

import typings.devtoolsProtocol.mod.Protocol.DOM.BackendNodeId
import typings.devtoolsProtocol.mod.Protocol.DOM.NodeId
import typings.devtoolsProtocol.mod.Protocol.Runtime.RemoteObjectId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPartialAXTreeRequest extends StObject {
  
  /**
    * Identifier of the backend node to get the partial accessibility tree for.
    */
  var backendNodeId: js.UndefOr[BackendNodeId] = js.undefined
  
  /**
    * Whether to fetch this nodes ancestors, siblings and children. Defaults to true.
    */
  var fetchRelatives: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Identifier of the node to get the partial accessibility tree for.
    */
  var nodeId: js.UndefOr[NodeId] = js.undefined
  
  /**
    * JavaScript object id of the node wrapper to get the partial accessibility tree for.
    */
  var objectId: js.UndefOr[RemoteObjectId] = js.undefined
}
object GetPartialAXTreeRequest {
  
  inline def apply(): GetPartialAXTreeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetPartialAXTreeRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetPartialAXTreeRequest] (val x: Self) extends AnyVal {
    
    inline def setBackendNodeId(value: BackendNodeId): Self = StObject.set(x, "backendNodeId", value.asInstanceOf[js.Any])
    
    inline def setBackendNodeIdUndefined: Self = StObject.set(x, "backendNodeId", js.undefined)
    
    inline def setFetchRelatives(value: Boolean): Self = StObject.set(x, "fetchRelatives", value.asInstanceOf[js.Any])
    
    inline def setFetchRelativesUndefined: Self = StObject.set(x, "fetchRelatives", js.undefined)
    
    inline def setNodeId(value: NodeId): Self = StObject.set(x, "nodeId", value.asInstanceOf[js.Any])
    
    inline def setNodeIdUndefined: Self = StObject.set(x, "nodeId", js.undefined)
    
    inline def setObjectId(value: RemoteObjectId): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    inline def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
  }
}
