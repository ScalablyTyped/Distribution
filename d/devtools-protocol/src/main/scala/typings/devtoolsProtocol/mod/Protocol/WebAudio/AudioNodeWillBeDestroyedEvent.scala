package typings.devtoolsProtocol.mod.Protocol.WebAudio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AudioNodeWillBeDestroyedEvent extends StObject {
  
  var contextId: GraphObjectId
  
  var nodeId: GraphObjectId
}
object AudioNodeWillBeDestroyedEvent {
  
  inline def apply(contextId: GraphObjectId, nodeId: GraphObjectId): AudioNodeWillBeDestroyedEvent = {
    val __obj = js.Dynamic.literal(contextId = contextId.asInstanceOf[js.Any], nodeId = nodeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioNodeWillBeDestroyedEvent]
  }
  
  extension [Self <: AudioNodeWillBeDestroyedEvent](x: Self) {
    
    inline def setContextId(value: GraphObjectId): Self = StObject.set(x, "contextId", value.asInstanceOf[js.Any])
    
    inline def setNodeId(value: GraphObjectId): Self = StObject.set(x, "nodeId", value.asInstanceOf[js.Any])
  }
}
