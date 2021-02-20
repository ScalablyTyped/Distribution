package typings.devtoolsProtocol.mod.Protocol.Overlay

import typings.devtoolsProtocol.mod.Protocol.DOM.BackendNodeId
import typings.devtoolsProtocol.mod.Protocol.DOM.NodeId
import typings.devtoolsProtocol.mod.Protocol.Runtime.RemoteObjectId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HighlightSourceOrderRequest extends StObject {
  
  /**
    * Identifier of the backend node to highlight.
    */
  var backendNodeId: js.UndefOr[BackendNodeId] = js.native
  
  /**
    * Identifier of the node to highlight.
    */
  var nodeId: js.UndefOr[NodeId] = js.native
  
  /**
    * JavaScript object id of the node to be highlighted.
    */
  var objectId: js.UndefOr[RemoteObjectId] = js.native
  
  /**
    * A descriptor for the appearance of the overlay drawing.
    */
  var sourceOrderConfig: SourceOrderConfig = js.native
}
object HighlightSourceOrderRequest {
  
  @scala.inline
  def apply(sourceOrderConfig: SourceOrderConfig): HighlightSourceOrderRequest = {
    val __obj = js.Dynamic.literal(sourceOrderConfig = sourceOrderConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[HighlightSourceOrderRequest]
  }
  
  @scala.inline
  implicit class HighlightSourceOrderRequestMutableBuilder[Self <: HighlightSourceOrderRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackendNodeId(value: BackendNodeId): Self = StObject.set(x, "backendNodeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackendNodeIdUndefined: Self = StObject.set(x, "backendNodeId", js.undefined)
    
    @scala.inline
    def setNodeId(value: NodeId): Self = StObject.set(x, "nodeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeIdUndefined: Self = StObject.set(x, "nodeId", js.undefined)
    
    @scala.inline
    def setObjectId(value: RemoteObjectId): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
    
    @scala.inline
    def setSourceOrderConfig(value: SourceOrderConfig): Self = StObject.set(x, "sourceOrderConfig", value.asInstanceOf[js.Any])
  }
}
