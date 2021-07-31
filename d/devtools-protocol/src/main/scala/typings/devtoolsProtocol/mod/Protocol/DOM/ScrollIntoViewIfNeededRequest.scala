package typings.devtoolsProtocol.mod.Protocol.DOM

import typings.devtoolsProtocol.mod.Protocol.Runtime.RemoteObjectId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScrollIntoViewIfNeededRequest extends StObject {
  
  /**
    * Identifier of the backend node.
    */
  var backendNodeId: js.UndefOr[BackendNodeId] = js.undefined
  
  /**
    * Identifier of the node.
    */
  var nodeId: js.UndefOr[NodeId] = js.undefined
  
  /**
    * JavaScript object id of the node wrapper.
    */
  var objectId: js.UndefOr[RemoteObjectId] = js.undefined
  
  /**
    * The rect to be scrolled into view, relative to the node's border box, in CSS pixels.
    * When omitted, center of the node will be used, similar to Element.scrollIntoView.
    */
  var rect: js.UndefOr[Rect] = js.undefined
}
object ScrollIntoViewIfNeededRequest {
  
  @scala.inline
  def apply(): ScrollIntoViewIfNeededRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScrollIntoViewIfNeededRequest]
  }
  
  @scala.inline
  implicit class ScrollIntoViewIfNeededRequestMutableBuilder[Self <: ScrollIntoViewIfNeededRequest] (val x: Self) extends AnyVal {
    
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
    def setRect(value: Rect): Self = StObject.set(x, "rect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRectUndefined: Self = StObject.set(x, "rect", js.undefined)
  }
}
