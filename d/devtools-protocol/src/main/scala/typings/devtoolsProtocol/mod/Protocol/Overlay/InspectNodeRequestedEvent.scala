package typings.devtoolsProtocol.mod.Protocol.Overlay

import typings.devtoolsProtocol.mod.Protocol.DOM.BackendNodeId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InspectNodeRequestedEvent extends StObject {
  
  /**
    * Id of the node to inspect.
    */
  var backendNodeId: BackendNodeId
}
object InspectNodeRequestedEvent {
  
  inline def apply(backendNodeId: BackendNodeId): InspectNodeRequestedEvent = {
    val __obj = js.Dynamic.literal(backendNodeId = backendNodeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[InspectNodeRequestedEvent]
  }
  
  extension [Self <: InspectNodeRequestedEvent](x: Self) {
    
    inline def setBackendNodeId(value: BackendNodeId): Self = StObject.set(x, "backendNodeId", value.asInstanceOf[js.Any])
  }
}
