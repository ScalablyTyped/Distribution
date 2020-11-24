package typings.devtoolsProtocol.mod.Protocol.Overlay

import typings.devtoolsProtocol.mod.Protocol.DOM.BackendNodeId
import typings.devtoolsProtocol.mod.Protocol.DOM.NodeId
import typings.devtoolsProtocol.mod.Protocol.Runtime.RemoteObjectId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HighlightSourceOrderRequest extends js.Object {
  
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
  implicit class HighlightSourceOrderRequestOps[Self <: HighlightSourceOrderRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setSourceOrderConfig(value: SourceOrderConfig): Self = this.set("sourceOrderConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackendNodeId(value: BackendNodeId): Self = this.set("backendNodeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackendNodeId: Self = this.set("backendNodeId", js.undefined)
    
    @scala.inline
    def setNodeId(value: NodeId): Self = this.set("nodeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNodeId: Self = this.set("nodeId", js.undefined)
    
    @scala.inline
    def setObjectId(value: RemoteObjectId): Self = this.set("objectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObjectId: Self = this.set("objectId", js.undefined)
  }
}
