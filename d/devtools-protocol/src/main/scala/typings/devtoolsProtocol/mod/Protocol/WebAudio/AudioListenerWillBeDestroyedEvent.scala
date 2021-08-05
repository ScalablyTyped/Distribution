package typings.devtoolsProtocol.mod.Protocol.WebAudio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AudioListenerWillBeDestroyedEvent extends StObject {
  
  var contextId: GraphObjectId
  
  var listenerId: GraphObjectId
}
object AudioListenerWillBeDestroyedEvent {
  
  inline def apply(contextId: GraphObjectId, listenerId: GraphObjectId): AudioListenerWillBeDestroyedEvent = {
    val __obj = js.Dynamic.literal(contextId = contextId.asInstanceOf[js.Any], listenerId = listenerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioListenerWillBeDestroyedEvent]
  }
  
  extension [Self <: AudioListenerWillBeDestroyedEvent](x: Self) {
    
    inline def setContextId(value: GraphObjectId): Self = StObject.set(x, "contextId", value.asInstanceOf[js.Any])
    
    inline def setListenerId(value: GraphObjectId): Self = StObject.set(x, "listenerId", value.asInstanceOf[js.Any])
  }
}
