package typings.devtoolsProtocol.mod.Protocol.WebAudio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AudioNodeWillBeDestroyedEvent extends StObject {
  
  var contextId: GraphObjectId
  
  var nodeId: GraphObjectId
}
object AudioNodeWillBeDestroyedEvent {
  
  @scala.inline
  def apply(contextId: GraphObjectId, nodeId: GraphObjectId): AudioNodeWillBeDestroyedEvent = {
    val __obj = js.Dynamic.literal(contextId = contextId.asInstanceOf[js.Any], nodeId = nodeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioNodeWillBeDestroyedEvent]
  }
  
  @scala.inline
  implicit class AudioNodeWillBeDestroyedEventMutableBuilder[Self <: AudioNodeWillBeDestroyedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContextId(value: GraphObjectId): Self = StObject.set(x, "contextId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeId(value: GraphObjectId): Self = StObject.set(x, "nodeId", value.asInstanceOf[js.Any])
  }
}
