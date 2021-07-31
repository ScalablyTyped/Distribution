package typings.googleCloudPubsub.protosMod.google.pubsub.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudPubsub.protosMod.google.protobuf.IDuration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a Subscription. */
trait ISubscription extends StObject {
  
  /** Subscription ackDeadlineSeconds */
  var ackDeadlineSeconds: js.UndefOr[Double | Null] = js.undefined
  
  /** Subscription deadLetterPolicy */
  var deadLetterPolicy: js.UndefOr[IDeadLetterPolicy | Null] = js.undefined
  
  /** Subscription detached */
  var detached: js.UndefOr[Boolean | Null] = js.undefined
  
  /** Subscription enableMessageOrdering */
  var enableMessageOrdering: js.UndefOr[Boolean | Null] = js.undefined
  
  /** Subscription expirationPolicy */
  var expirationPolicy: js.UndefOr[IExpirationPolicy | Null] = js.undefined
  
  /** Subscription filter */
  var filter: js.UndefOr[String | Null] = js.undefined
  
  /** Subscription labels */
  var labels: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /** Subscription messageRetentionDuration */
  var messageRetentionDuration: js.UndefOr[IDuration | Null] = js.undefined
  
  /** Subscription name */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /** Subscription pushConfig */
  var pushConfig: js.UndefOr[IPushConfig | Null] = js.undefined
  
  /** Subscription retainAckedMessages */
  var retainAckedMessages: js.UndefOr[Boolean | Null] = js.undefined
  
  /** Subscription retryPolicy */
  var retryPolicy: js.UndefOr[IRetryPolicy | Null] = js.undefined
  
  /** Subscription topic */
  var topic: js.UndefOr[String | Null] = js.undefined
}
object ISubscription {
  
  @scala.inline
  def apply(): ISubscription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISubscription]
  }
  
  @scala.inline
  implicit class ISubscriptionMutableBuilder[Self <: ISubscription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAckDeadlineSeconds(value: Double): Self = StObject.set(x, "ackDeadlineSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAckDeadlineSecondsNull: Self = StObject.set(x, "ackDeadlineSeconds", null)
    
    @scala.inline
    def setAckDeadlineSecondsUndefined: Self = StObject.set(x, "ackDeadlineSeconds", js.undefined)
    
    @scala.inline
    def setDeadLetterPolicy(value: IDeadLetterPolicy): Self = StObject.set(x, "deadLetterPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeadLetterPolicyNull: Self = StObject.set(x, "deadLetterPolicy", null)
    
    @scala.inline
    def setDeadLetterPolicyUndefined: Self = StObject.set(x, "deadLetterPolicy", js.undefined)
    
    @scala.inline
    def setDetached(value: Boolean): Self = StObject.set(x, "detached", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetachedNull: Self = StObject.set(x, "detached", null)
    
    @scala.inline
    def setDetachedUndefined: Self = StObject.set(x, "detached", js.undefined)
    
    @scala.inline
    def setEnableMessageOrdering(value: Boolean): Self = StObject.set(x, "enableMessageOrdering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableMessageOrderingNull: Self = StObject.set(x, "enableMessageOrdering", null)
    
    @scala.inline
    def setEnableMessageOrderingUndefined: Self = StObject.set(x, "enableMessageOrdering", js.undefined)
    
    @scala.inline
    def setExpirationPolicy(value: IExpirationPolicy): Self = StObject.set(x, "expirationPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpirationPolicyNull: Self = StObject.set(x, "expirationPolicy", null)
    
    @scala.inline
    def setExpirationPolicyUndefined: Self = StObject.set(x, "expirationPolicy", js.undefined)
    
    @scala.inline
    def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterNull: Self = StObject.set(x, "filter", null)
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    @scala.inline
    def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsNull: Self = StObject.set(x, "labels", null)
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    @scala.inline
    def setMessageRetentionDuration(value: IDuration): Self = StObject.set(x, "messageRetentionDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageRetentionDurationNull: Self = StObject.set(x, "messageRetentionDuration", null)
    
    @scala.inline
    def setMessageRetentionDurationUndefined: Self = StObject.set(x, "messageRetentionDuration", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameNull: Self = StObject.set(x, "name", null)
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPushConfig(value: IPushConfig): Self = StObject.set(x, "pushConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPushConfigNull: Self = StObject.set(x, "pushConfig", null)
    
    @scala.inline
    def setPushConfigUndefined: Self = StObject.set(x, "pushConfig", js.undefined)
    
    @scala.inline
    def setRetainAckedMessages(value: Boolean): Self = StObject.set(x, "retainAckedMessages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetainAckedMessagesNull: Self = StObject.set(x, "retainAckedMessages", null)
    
    @scala.inline
    def setRetainAckedMessagesUndefined: Self = StObject.set(x, "retainAckedMessages", js.undefined)
    
    @scala.inline
    def setRetryPolicy(value: IRetryPolicy): Self = StObject.set(x, "retryPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetryPolicyNull: Self = StObject.set(x, "retryPolicy", null)
    
    @scala.inline
    def setRetryPolicyUndefined: Self = StObject.set(x, "retryPolicy", js.undefined)
    
    @scala.inline
    def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopicNull: Self = StObject.set(x, "topic", null)
    
    @scala.inline
    def setTopicUndefined: Self = StObject.set(x, "topic", js.undefined)
  }
}
