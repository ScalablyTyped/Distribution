package typings.devtoolsProtocol.mod.Protocol.Overlay

import typings.devtoolsProtocol.mod.Protocol.DOM.BackendNodeId
import typings.devtoolsProtocol.mod.Protocol.DOM.NodeId
import typings.devtoolsProtocol.mod.Protocol.Runtime.RemoteObjectId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HighlightSourceOrderRequest extends StObject {
  
  /**
    * Identifier of the backend node to highlight.
    */
  var backendNodeId: js.UndefOr[BackendNodeId] = js.undefined
  
  /**
    * Identifier of the node to highlight.
    */
  var nodeId: js.UndefOr[NodeId] = js.undefined
  
  /**
    * JavaScript object id of the node to be highlighted.
    */
  var objectId: js.UndefOr[RemoteObjectId] = js.undefined
  
  /**
    * A descriptor for the appearance of the overlay drawing.
    */
  var sourceOrderConfig: SourceOrderConfig
}
object HighlightSourceOrderRequest {
  
  inline def apply(sourceOrderConfig: SourceOrderConfig): HighlightSourceOrderRequest = {
    val __obj = js.Dynamic.literal(sourceOrderConfig = sourceOrderConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[HighlightSourceOrderRequest]
  }
  
  extension [Self <: HighlightSourceOrderRequest](x: Self) {
    
    inline def setBackendNodeId(value: BackendNodeId): Self = StObject.set(x, "backendNodeId", value.asInstanceOf[js.Any])
    
    inline def setBackendNodeIdUndefined: Self = StObject.set(x, "backendNodeId", js.undefined)
    
    inline def setNodeId(value: NodeId): Self = StObject.set(x, "nodeId", value.asInstanceOf[js.Any])
    
    inline def setNodeIdUndefined: Self = StObject.set(x, "nodeId", js.undefined)
    
    inline def setObjectId(value: RemoteObjectId): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    inline def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
    
    inline def setSourceOrderConfig(value: SourceOrderConfig): Self = StObject.set(x, "sourceOrderConfig", value.asInstanceOf[js.Any])
  }
}
