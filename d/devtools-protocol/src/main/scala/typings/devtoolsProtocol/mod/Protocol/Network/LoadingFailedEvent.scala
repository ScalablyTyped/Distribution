package typings.devtoolsProtocol.mod.Protocol.Network

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoadingFailedEvent extends js.Object {
  
  /**
    * The reason why loading was blocked, if any.
    */
  var blockedReason: js.UndefOr[BlockedReason] = js.native
  
  /**
    * True if loading was canceled.
    */
  var canceled: js.UndefOr[Boolean] = js.native
  
  /**
    * User friendly error message.
    */
  var errorText: String = js.native
  
  /**
    * Request identifier.
    */
  var requestId: RequestId = js.native
  
  /**
    * Timestamp.
    */
  var timestamp: MonotonicTime = js.native
  
  /**
    * Resource type.
    */
  var `type`: ResourceType = js.native
}
object LoadingFailedEvent {
  
  @scala.inline
  def apply(errorText: String, requestId: RequestId, timestamp: MonotonicTime, `type`: ResourceType): LoadingFailedEvent = {
    val __obj = js.Dynamic.literal(errorText = errorText.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadingFailedEvent]
  }
  
  @scala.inline
  implicit class LoadingFailedEventOps[Self <: LoadingFailedEvent] (val x: Self) extends AnyVal {
    
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
    def setErrorText(value: String): Self = this.set("errorText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestId(value: RequestId): Self = this.set("requestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: MonotonicTime): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ResourceType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlockedReason(value: BlockedReason): Self = this.set("blockedReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlockedReason: Self = this.set("blockedReason", js.undefined)
    
    @scala.inline
    def setCanceled(value: Boolean): Self = this.set("canceled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanceled: Self = this.set("canceled", js.undefined)
  }
}
