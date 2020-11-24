package typings.devtoolsProtocol.mod.Protocol.WebAudio

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodesConnectedEvent extends js.Object {
  
  var contextId: GraphObjectId = js.native
  
  var destinationId: GraphObjectId = js.native
  
  var destinationInputIndex: js.UndefOr[Double] = js.native
  
  var sourceId: GraphObjectId = js.native
  
  var sourceOutputIndex: js.UndefOr[Double] = js.native
}
object NodesConnectedEvent {
  
  @scala.inline
  def apply(contextId: GraphObjectId, destinationId: GraphObjectId, sourceId: GraphObjectId): NodesConnectedEvent = {
    val __obj = js.Dynamic.literal(contextId = contextId.asInstanceOf[js.Any], destinationId = destinationId.asInstanceOf[js.Any], sourceId = sourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodesConnectedEvent]
  }
  
  @scala.inline
  implicit class NodesConnectedEventOps[Self <: NodesConnectedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setContextId(value: GraphObjectId): Self = this.set("contextId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationId(value: GraphObjectId): Self = this.set("destinationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceId(value: GraphObjectId): Self = this.set("sourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationInputIndex(value: Double): Self = this.set("destinationInputIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestinationInputIndex: Self = this.set("destinationInputIndex", js.undefined)
    
    @scala.inline
    def setSourceOutputIndex(value: Double): Self = this.set("sourceOutputIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceOutputIndex: Self = this.set("sourceOutputIndex", js.undefined)
  }
}
