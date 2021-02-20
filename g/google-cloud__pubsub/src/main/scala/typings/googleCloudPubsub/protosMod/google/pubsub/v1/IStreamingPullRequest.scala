package typings.googleCloudPubsub.protosMod.google.pubsub.v1

import typings.long.mod.Long
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a StreamingPullRequest. */
@js.native
trait IStreamingPullRequest extends StObject {
  
  /** StreamingPullRequest ackIds */
  var ackIds: js.UndefOr[js.Array[String] | Null] = js.native
  
  /** StreamingPullRequest clientId */
  var clientId: js.UndefOr[String | Null] = js.native
  
  /** StreamingPullRequest maxOutstandingBytes */
  var maxOutstandingBytes: js.UndefOr[Double | Long | String | Null] = js.native
  
  /** StreamingPullRequest maxOutstandingMessages */
  var maxOutstandingMessages: js.UndefOr[Double | Long | String | Null] = js.native
  
  /** StreamingPullRequest modifyDeadlineAckIds */
  var modifyDeadlineAckIds: js.UndefOr[js.Array[String] | Null] = js.native
  
  /** StreamingPullRequest modifyDeadlineSeconds */
  var modifyDeadlineSeconds: js.UndefOr[js.Array[Double] | Null] = js.native
  
  /** StreamingPullRequest streamAckDeadlineSeconds */
  var streamAckDeadlineSeconds: js.UndefOr[Double | Null] = js.native
  
  /** StreamingPullRequest subscription */
  var subscription: js.UndefOr[String | Null] = js.native
}
object IStreamingPullRequest {
  
  @scala.inline
  def apply(): IStreamingPullRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IStreamingPullRequest]
  }
  
  @scala.inline
  implicit class IStreamingPullRequestMutableBuilder[Self <: IStreamingPullRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAckIds(value: js.Array[String]): Self = StObject.set(x, "ackIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAckIdsNull: Self = StObject.set(x, "ackIds", null)
    
    @scala.inline
    def setAckIdsUndefined: Self = StObject.set(x, "ackIds", js.undefined)
    
    @scala.inline
    def setAckIdsVarargs(value: String*): Self = StObject.set(x, "ackIds", js.Array(value :_*))
    
    @scala.inline
    def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientIdNull: Self = StObject.set(x, "clientId", null)
    
    @scala.inline
    def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
    
    @scala.inline
    def setMaxOutstandingBytes(value: Double | Long | String): Self = StObject.set(x, "maxOutstandingBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxOutstandingBytesNull: Self = StObject.set(x, "maxOutstandingBytes", null)
    
    @scala.inline
    def setMaxOutstandingBytesUndefined: Self = StObject.set(x, "maxOutstandingBytes", js.undefined)
    
    @scala.inline
    def setMaxOutstandingMessages(value: Double | Long | String): Self = StObject.set(x, "maxOutstandingMessages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxOutstandingMessagesNull: Self = StObject.set(x, "maxOutstandingMessages", null)
    
    @scala.inline
    def setMaxOutstandingMessagesUndefined: Self = StObject.set(x, "maxOutstandingMessages", js.undefined)
    
    @scala.inline
    def setModifyDeadlineAckIds(value: js.Array[String]): Self = StObject.set(x, "modifyDeadlineAckIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifyDeadlineAckIdsNull: Self = StObject.set(x, "modifyDeadlineAckIds", null)
    
    @scala.inline
    def setModifyDeadlineAckIdsUndefined: Self = StObject.set(x, "modifyDeadlineAckIds", js.undefined)
    
    @scala.inline
    def setModifyDeadlineAckIdsVarargs(value: String*): Self = StObject.set(x, "modifyDeadlineAckIds", js.Array(value :_*))
    
    @scala.inline
    def setModifyDeadlineSeconds(value: js.Array[Double]): Self = StObject.set(x, "modifyDeadlineSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifyDeadlineSecondsNull: Self = StObject.set(x, "modifyDeadlineSeconds", null)
    
    @scala.inline
    def setModifyDeadlineSecondsUndefined: Self = StObject.set(x, "modifyDeadlineSeconds", js.undefined)
    
    @scala.inline
    def setModifyDeadlineSecondsVarargs(value: Double*): Self = StObject.set(x, "modifyDeadlineSeconds", js.Array(value :_*))
    
    @scala.inline
    def setStreamAckDeadlineSeconds(value: Double): Self = StObject.set(x, "streamAckDeadlineSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamAckDeadlineSecondsNull: Self = StObject.set(x, "streamAckDeadlineSeconds", null)
    
    @scala.inline
    def setStreamAckDeadlineSecondsUndefined: Self = StObject.set(x, "streamAckDeadlineSeconds", js.undefined)
    
    @scala.inline
    def setSubscription(value: String): Self = StObject.set(x, "subscription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscriptionNull: Self = StObject.set(x, "subscription", null)
    
    @scala.inline
    def setSubscriptionUndefined: Self = StObject.set(x, "subscription", js.undefined)
  }
}
