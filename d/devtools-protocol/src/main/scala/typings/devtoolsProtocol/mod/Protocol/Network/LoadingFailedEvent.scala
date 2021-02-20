package typings.devtoolsProtocol.mod.Protocol.Network

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoadingFailedEvent extends StObject {
  
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
  implicit class LoadingFailedEventMutableBuilder[Self <: LoadingFailedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlockedReason(value: BlockedReason): Self = StObject.set(x, "blockedReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlockedReasonUndefined: Self = StObject.set(x, "blockedReason", js.undefined)
    
    @scala.inline
    def setCanceled(value: Boolean): Self = StObject.set(x, "canceled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanceledUndefined: Self = StObject.set(x, "canceled", js.undefined)
    
    @scala.inline
    def setErrorText(value: String): Self = StObject.set(x, "errorText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestId(value: RequestId): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: MonotonicTime): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ResourceType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
