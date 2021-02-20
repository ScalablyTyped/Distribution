package typings.devtoolsProtocol.mod.Protocol.WebAudio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodesDisconnectedEvent extends StObject {
  
  var contextId: GraphObjectId = js.native
  
  var destinationId: GraphObjectId = js.native
  
  var destinationInputIndex: js.UndefOr[Double] = js.native
  
  var sourceId: GraphObjectId = js.native
  
  var sourceOutputIndex: js.UndefOr[Double] = js.native
}
object NodesDisconnectedEvent {
  
  @scala.inline
  def apply(contextId: GraphObjectId, destinationId: GraphObjectId, sourceId: GraphObjectId): NodesDisconnectedEvent = {
    val __obj = js.Dynamic.literal(contextId = contextId.asInstanceOf[js.Any], destinationId = destinationId.asInstanceOf[js.Any], sourceId = sourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodesDisconnectedEvent]
  }
  
  @scala.inline
  implicit class NodesDisconnectedEventMutableBuilder[Self <: NodesDisconnectedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContextId(value: GraphObjectId): Self = StObject.set(x, "contextId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationId(value: GraphObjectId): Self = StObject.set(x, "destinationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationInputIndex(value: Double): Self = StObject.set(x, "destinationInputIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationInputIndexUndefined: Self = StObject.set(x, "destinationInputIndex", js.undefined)
    
    @scala.inline
    def setSourceId(value: GraphObjectId): Self = StObject.set(x, "sourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceOutputIndex(value: Double): Self = StObject.set(x, "sourceOutputIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceOutputIndexUndefined: Self = StObject.set(x, "sourceOutputIndex", js.undefined)
  }
}
