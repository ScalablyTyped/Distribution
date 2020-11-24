package typings.devtoolsProtocol.mod.Protocol.Network

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebSocketCreatedEvent extends js.Object {
  
  /**
    * Request initiator.
    */
  var initiator: js.UndefOr[Initiator] = js.native
  
  /**
    * Request identifier.
    */
  var requestId: RequestId = js.native
  
  /**
    * WebSocket request URL.
    */
  var url: String = js.native
}
object WebSocketCreatedEvent {
  
  @scala.inline
  def apply(requestId: RequestId, url: String): WebSocketCreatedEvent = {
    val __obj = js.Dynamic.literal(requestId = requestId.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebSocketCreatedEvent]
  }
  
  @scala.inline
  implicit class WebSocketCreatedEventOps[Self <: WebSocketCreatedEvent] (val x: Self) extends AnyVal {
    
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
    def setRequestId(value: RequestId): Self = this.set("requestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitiator(value: Initiator): Self = this.set("initiator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitiator: Self = this.set("initiator", js.undefined)
  }
}
