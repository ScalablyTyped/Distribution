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
  
  inline def apply(hostId: NodeId, root: Node): ShadowRootPushedEvent = {
    val __obj = js.Dynamic.literal(hostId = hostId.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShadowRootPushedEvent]
  }
  
  extension [Self <: ShadowRootPushedEvent](x: Self) {
    
    inline def setHostId(value: NodeId): Self = StObject.set(x, "hostId", value.asInstanceOf[js.Any])
    
    inline def setRoot(value: Node): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
  }
}
