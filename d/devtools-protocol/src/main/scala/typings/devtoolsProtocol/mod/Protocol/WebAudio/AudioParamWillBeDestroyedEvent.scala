package typings.devtoolsProtocol.mod.Protocol.WebAudio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AudioParamWillBeDestroyedEvent extends StObject {
  
  var contextId: GraphObjectId = js.native
  
  var nodeId: GraphObjectId = js.native
  
  var paramId: GraphObjectId = js.native
}
object AudioParamWillBeDestroyedEvent {
  
  @scala.inline
  def apply(contextId: GraphObjectId, nodeId: GraphObjectId, paramId: GraphObjectId): AudioParamWillBeDestroyedEvent = {
    val __obj = js.Dynamic.literal(contextId = contextId.asInstanceOf[js.Any], nodeId = nodeId.asInstanceOf[js.Any], paramId = paramId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioParamWillBeDestroyedEvent]
  }
  
  @scala.inline
  implicit class AudioParamWillBeDestroyedEventMutableBuilder[Self <: AudioParamWillBeDestroyedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContextId(value: GraphObjectId): Self = StObject.set(x, "contextId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeId(value: GraphObjectId): Self = StObject.set(x, "nodeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamId(value: GraphObjectId): Self = StObject.set(x, "paramId", value.asInstanceOf[js.Any])
  }
}
