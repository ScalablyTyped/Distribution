package typings.devtoolsProtocol.mod.Protocol.DOM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShadowRootPoppedEvent extends StObject {
  
  /**
    * Host element id.
    */
  var hostId: NodeId
  
  /**
    * Shadow root id.
    */
  var rootId: NodeId
}
object ShadowRootPoppedEvent {
  
  @scala.inline
  def apply(hostId: NodeId, rootId: NodeId): ShadowRootPoppedEvent = {
    val __obj = js.Dynamic.literal(hostId = hostId.asInstanceOf[js.Any], rootId = rootId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShadowRootPoppedEvent]
  }
  
  @scala.inline
  implicit class ShadowRootPoppedEventMutableBuilder[Self <: ShadowRootPoppedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHostId(value: NodeId): Self = StObject.set(x, "hostId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootId(value: NodeId): Self = StObject.set(x, "rootId", value.asInstanceOf[js.Any])
  }
}
