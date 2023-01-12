package typings.devtoolsProtocol.mod.Protocol.WebAudio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodesDisconnectedEvent extends StObject {
  
  var contextId: GraphObjectId
  
  var destinationId: GraphObjectId
  
  var destinationInputIndex: js.UndefOr[Double] = js.undefined
  
  var sourceId: GraphObjectId
  
  var sourceOutputIndex: js.UndefOr[Double] = js.undefined
}
object NodesDisconnectedEvent {
  
  inline def apply(contextId: GraphObjectId, destinationId: GraphObjectId, sourceId: GraphObjectId): NodesDisconnectedEvent = {
    val __obj = js.Dynamic.literal(contextId = contextId.asInstanceOf[js.Any], destinationId = destinationId.asInstanceOf[js.Any], sourceId = sourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodesDisconnectedEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NodesDisconnectedEvent] (val x: Self) extends AnyVal {
    
    inline def setContextId(value: GraphObjectId): Self = StObject.set(x, "contextId", value.asInstanceOf[js.Any])
    
    inline def setDestinationId(value: GraphObjectId): Self = StObject.set(x, "destinationId", value.asInstanceOf[js.Any])
    
    inline def setDestinationInputIndex(value: Double): Self = StObject.set(x, "destinationInputIndex", value.asInstanceOf[js.Any])
    
    inline def setDestinationInputIndexUndefined: Self = StObject.set(x, "destinationInputIndex", js.undefined)
    
    inline def setSourceId(value: GraphObjectId): Self = StObject.set(x, "sourceId", value.asInstanceOf[js.Any])
    
    inline def setSourceOutputIndex(value: Double): Self = StObject.set(x, "sourceOutputIndex", value.asInstanceOf[js.Any])
    
    inline def setSourceOutputIndexUndefined: Self = StObject.set(x, "sourceOutputIndex", js.undefined)
  }
}
