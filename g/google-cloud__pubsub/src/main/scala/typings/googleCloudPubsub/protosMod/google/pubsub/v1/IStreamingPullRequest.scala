package typings.googleCloudPubsub.protosMod.google.pubsub.v1

import typings.long.mod.Long
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a StreamingPullRequest. */
trait IStreamingPullRequest extends StObject {
  
  /** StreamingPullRequest ackIds */
  var ackIds: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /** StreamingPullRequest clientId */
  var clientId: js.UndefOr[String | Null] = js.undefined
  
  /** StreamingPullRequest maxOutstandingBytes */
  var maxOutstandingBytes: js.UndefOr[Double | Long | String | Null] = js.undefined
  
  /** StreamingPullRequest maxOutstandingMessages */
  var maxOutstandingMessages: js.UndefOr[Double | Long | String | Null] = js.undefined
  
  /** StreamingPullRequest modifyDeadlineAckIds */
  var modifyDeadlineAckIds: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /** StreamingPullRequest modifyDeadlineSeconds */
  var modifyDeadlineSeconds: js.UndefOr[js.Array[Double] | Null] = js.undefined
  
  /** StreamingPullRequest streamAckDeadlineSeconds */
  var streamAckDeadlineSeconds: js.UndefOr[Double | Null] = js.undefined
  
  /** StreamingPullRequest subscription */
  var subscription: js.UndefOr[String | Null] = js.undefined
}
object IStreamingPullRequest {
  
  inline def apply(): IStreamingPullRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IStreamingPullRequest]
  }
  
  extension [Self <: IStreamingPullRequest](x: Self) {
    
    inline def setAckIds(value: js.Array[String]): Self = StObject.set(x, "ackIds", value.asInstanceOf[js.Any])
    
    inline def setAckIdsNull: Self = StObject.set(x, "ackIds", null)
    
    inline def setAckIdsUndefined: Self = StObject.set(x, "ackIds", js.undefined)
    
    inline def setAckIdsVarargs(value: String*): Self = StObject.set(x, "ackIds", js.Array(value :_*))
    
    inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    inline def setClientIdNull: Self = StObject.set(x, "clientId", null)
    
    inline def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
    
    inline def setMaxOutstandingBytes(value: Double | Long | String): Self = StObject.set(x, "maxOutstandingBytes", value.asInstanceOf[js.Any])
    
    inline def setMaxOutstandingBytesNull: Self = StObject.set(x, "maxOutstandingBytes", null)
    
    inline def setMaxOutstandingBytesUndefined: Self = StObject.set(x, "maxOutstandingBytes", js.undefined)
    
    inline def setMaxOutstandingMessages(value: Double | Long | String): Self = StObject.set(x, "maxOutstandingMessages", value.asInstanceOf[js.Any])
    
    inline def setMaxOutstandingMessagesNull: Self = StObject.set(x, "maxOutstandingMessages", null)
    
    inline def setMaxOutstandingMessagesUndefined: Self = StObject.set(x, "maxOutstandingMessages", js.undefined)
    
    inline def setModifyDeadlineAckIds(value: js.Array[String]): Self = StObject.set(x, "modifyDeadlineAckIds", value.asInstanceOf[js.Any])
    
    inline def setModifyDeadlineAckIdsNull: Self = StObject.set(x, "modifyDeadlineAckIds", null)
    
    inline def setModifyDeadlineAckIdsUndefined: Self = StObject.set(x, "modifyDeadlineAckIds", js.undefined)
    
    inline def setModifyDeadlineAckIdsVarargs(value: String*): Self = StObject.set(x, "modifyDeadlineAckIds", js.Array(value :_*))
    
    inline def setModifyDeadlineSeconds(value: js.Array[Double]): Self = StObject.set(x, "modifyDeadlineSeconds", value.asInstanceOf[js.Any])
    
    inline def setModifyDeadlineSecondsNull: Self = StObject.set(x, "modifyDeadlineSeconds", null)
    
    inline def setModifyDeadlineSecondsUndefined: Self = StObject.set(x, "modifyDeadlineSeconds", js.undefined)
    
    inline def setModifyDeadlineSecondsVarargs(value: Double*): Self = StObject.set(x, "modifyDeadlineSeconds", js.Array(value :_*))
    
    inline def setStreamAckDeadlineSeconds(value: Double): Self = StObject.set(x, "streamAckDeadlineSeconds", value.asInstanceOf[js.Any])
    
    inline def setStreamAckDeadlineSecondsNull: Self = StObject.set(x, "streamAckDeadlineSeconds", null)
    
    inline def setStreamAckDeadlineSecondsUndefined: Self = StObject.set(x, "streamAckDeadlineSeconds", js.undefined)
    
    inline def setSubscription(value: String): Self = StObject.set(x, "subscription", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionNull: Self = StObject.set(x, "subscription", null)
    
    inline def setSubscriptionUndefined: Self = StObject.set(x, "subscription", js.undefined)
  }
}
