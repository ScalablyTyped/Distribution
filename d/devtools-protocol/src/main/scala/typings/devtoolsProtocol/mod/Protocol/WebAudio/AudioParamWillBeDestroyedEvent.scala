package typings.devtoolsProtocol.mod.Protocol.WebAudio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AudioParamWillBeDestroyedEvent extends StObject {
  
  var contextId: GraphObjectId
  
  var nodeId: GraphObjectId
  
  var paramId: GraphObjectId
}
object AudioParamWillBeDestroyedEvent {
  
  inline def apply(contextId: GraphObjectId, nodeId: GraphObjectId, paramId: GraphObjectId): AudioParamWillBeDestroyedEvent = {
    val __obj = js.Dynamic.literal(contextId = contextId.asInstanceOf[js.Any], nodeId = nodeId.asInstanceOf[js.Any], paramId = paramId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioParamWillBeDestroyedEvent]
  }
  
  extension [Self <: AudioParamWillBeDestroyedEvent](x: Self) {
    
    inline def setContextId(value: GraphObjectId): Self = StObject.set(x, "contextId", value.asInstanceOf[js.Any])
    
    inline def setNodeId(value: GraphObjectId): Self = StObject.set(x, "nodeId", value.asInstanceOf[js.Any])
    
    inline def setParamId(value: GraphObjectId): Self = StObject.set(x, "paramId", value.asInstanceOf[js.Any])
  }
}
