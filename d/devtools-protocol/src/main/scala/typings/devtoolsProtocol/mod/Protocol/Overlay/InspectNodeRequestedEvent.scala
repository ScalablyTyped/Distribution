package typings.devtoolsProtocol.mod.Protocol.Overlay

import typings.devtoolsProtocol.mod.Protocol.DOM.BackendNodeId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InspectNodeRequestedEvent extends StObject {
  
  /**
    * Id of the node to inspect.
    */
  var backendNodeId: BackendNodeId = js.native
}
object InspectNodeRequestedEvent {
  
  @scala.inline
  def apply(backendNodeId: BackendNodeId): InspectNodeRequestedEvent = {
    val __obj = js.Dynamic.literal(backendNodeId = backendNodeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[InspectNodeRequestedEvent]
  }
  
  @scala.inline
  implicit class InspectNodeRequestedEventMutableBuilder[Self <: InspectNodeRequestedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackendNodeId(value: BackendNodeId): Self = StObject.set(x, "backendNodeId", value.asInstanceOf[js.Any])
  }
}
