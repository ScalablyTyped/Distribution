package typings.devtoolsProtocol.mod.Protocol.Overlay

import typings.devtoolsProtocol.mod.Protocol.DOM.NodeId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodeHighlightRequestedEvent extends StObject {
  
  var nodeId: NodeId = js.native
}
object NodeHighlightRequestedEvent {
  
  @scala.inline
  def apply(nodeId: NodeId): NodeHighlightRequestedEvent = {
    val __obj = js.Dynamic.literal(nodeId = nodeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeHighlightRequestedEvent]
  }
  
  @scala.inline
  implicit class NodeHighlightRequestedEventMutableBuilder[Self <: NodeHighlightRequestedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNodeId(value: NodeId): Self = StObject.set(x, "nodeId", value.asInstanceOf[js.Any])
  }
}
