package typings.devtoolsProtocol.mod.Protocol.WebAudio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeParamConnectedEvent extends StObject {
  
  var contextId: GraphObjectId
  
  var destinationId: GraphObjectId
  
  var sourceId: GraphObjectId
  
  var sourceOutputIndex: js.UndefOr[Double] = js.undefined
}
object NodeParamConnectedEvent {
  
  @scala.inline
  def apply(contextId: GraphObjectId, destinationId: GraphObjectId, sourceId: GraphObjectId): NodeParamConnectedEvent = {
    val __obj = js.Dynamic.literal(contextId = contextId.asInstanceOf[js.Any], destinationId = destinationId.asInstanceOf[js.Any], sourceId = sourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeParamConnectedEvent]
  }
  
  @scala.inline
  implicit class NodeParamConnectedEventMutableBuilder[Self <: NodeParamConnectedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContextId(value: GraphObjectId): Self = StObject.set(x, "contextId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationId(value: GraphObjectId): Self = StObject.set(x, "destinationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceId(value: GraphObjectId): Self = StObject.set(x, "sourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceOutputIndex(value: Double): Self = StObject.set(x, "sourceOutputIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceOutputIndexUndefined: Self = StObject.set(x, "sourceOutputIndex", js.undefined)
  }
}
