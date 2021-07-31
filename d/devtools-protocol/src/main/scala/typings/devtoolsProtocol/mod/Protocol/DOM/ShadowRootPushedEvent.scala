package typings.devtoolsProtocol.mod.Protocol.DOM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShadowRootPushedEvent extends StObject {
  
  /**
    * Host element id.
    */
  var hostId: NodeId
  
  /**
    * Shadow root.
    */
  var root: Node
}
object ShadowRootPushedEvent {
  
  @scala.inline
  def apply(hostId: NodeId, root: Node): ShadowRootPushedEvent = {
    val __obj = js.Dynamic.literal(hostId = hostId.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShadowRootPushedEvent]
  }
  
  @scala.inline
  implicit class ShadowRootPushedEventMutableBuilder[Self <: ShadowRootPushedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHostId(value: NodeId): Self = StObject.set(x, "hostId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoot(value: Node): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
  }
}
