package typings.googleCloudPubsub.protosMod.google.pubsub.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudPubsub.protosMod.google.protobuf.IDuration
import typings.googleCloudPubsub.protosMod.google.pubsub.v1.Subscription.State
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a Subscription. */
trait ISubscription extends StObject {
  
  /** Subscription ackDeadlineSeconds */
  var ackDeadlineSeconds: js.UndefOr[Double | Null] = js.undefined
  
  /** Subscription bigqueryConfig */
  var bigqueryConfig: js.UndefOr[IBigQueryConfig | Null] = js.undefined
  
  /** Subscription deadLetterPolicy */
  var deadLetterPolicy: js.UndefOr[IDeadLetterPolicy | Null] = js.undefined
  
  /** Subscription detached */
  var detached: js.UndefOr[Boolean | Null] = js.undefined
  
  /** Subscription enableExactlyOnceDelivery */
  var enableExactlyOnceDelivery: js.UndefOr[Boolean | Null] = js.undefined
  
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
  
  /** Subscription state */
  var state: js.UndefOr[
    State | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.pubsub.v1.Subscription.State * / any */ String) | Null
  ] = js.undefined
  
  /** Subscription topic */
  var topic: js.UndefOr[String | Null] = js.undefined
  
  /** Subscription topicMessageRetentionDuration */
  var topicMessageRetentionDuration: js.UndefOr[IDuration | Null] = js.undefined
}
object ISubscription {
  
  inline def apply(): ISubscription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISubscription]
  }
  
  extension [Self <: ISubscription](x: Self) {
    
    inline def setAckDeadlineSeconds(value: Double): Self = StObject.set(x, "ackDeadlineSeconds", value.asInstanceOf[js.Any])
    
    inline def setAckDeadlineSecondsNull: Self = StObject.set(x, "ackDeadlineSeconds", null)
    
    inline def setAckDeadlineSecondsUndefined: Self = StObject.set(x, "ackDeadlineSeconds", js.undefined)
    
    inline def setBigqueryConfig(value: IBigQueryConfig): Self = StObject.set(x, "bigqueryConfig", value.asInstanceOf[js.Any])
    
    inline def setBigqueryConfigNull: Self = StObject.set(x, "bigqueryConfig", null)
    
    inline def setBigqueryConfigUndefined: Self = StObject.set(x, "bigqueryConfig", js.undefined)
    
    inline def setDeadLetterPolicy(value: IDeadLetterPolicy): Self = StObject.set(x, "deadLetterPolicy", value.asInstanceOf[js.Any])
    
    inline def setDeadLetterPolicyNull: Self = StObject.set(x, "deadLetterPolicy", null)
    
    inline def setDeadLetterPolicyUndefined: Self = StObject.set(x, "deadLetterPolicy", js.undefined)
    
    inline def setDetached(value: Boolean): Self = StObject.set(x, "detached", value.asInstanceOf[js.Any])
    
    inline def setDetachedNull: Self = StObject.set(x, "detached", null)
    
    inline def setDetachedUndefined: Self = StObject.set(x, "detached", js.undefined)
    
    inline def setEnableExactlyOnceDelivery(value: Boolean): Self = StObject.set(x, "enableExactlyOnceDelivery", value.asInstanceOf[js.Any])
    
    inline def setEnableExactlyOnceDeliveryNull: Self = StObject.set(x, "enableExactlyOnceDelivery", null)
    
    inline def setEnableExactlyOnceDeliveryUndefined: Self = StObject.set(x, "enableExactlyOnceDelivery", js.undefined)
    
    inline def setEnableMessageOrdering(value: Boolean): Self = StObject.set(x, "enableMessageOrdering", value.asInstanceOf[js.Any])
    
    inline def setEnableMessageOrderingNull: Self = StObject.set(x, "enableMessageOrdering", null)
    
    inline def setEnableMessageOrderingUndefined: Self = StObject.set(x, "enableMessageOrdering", js.undefined)
    
    inline def setExpirationPolicy(value: IExpirationPolicy): Self = StObject.set(x, "expirationPolicy", value.asInstanceOf[js.Any])
    
    inline def setExpirationPolicyNull: Self = StObject.set(x, "expirationPolicy", null)
    
    inline def setExpirationPolicyUndefined: Self = StObject.set(x, "expirationPolicy", js.undefined)
    
    inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterNull: Self = StObject.set(x, "filter", null)
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsNull: Self = StObject.set(x, "labels", null)
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setMessageRetentionDuration(value: IDuration): Self = StObject.set(x, "messageRetentionDuration", value.asInstanceOf[js.Any])
    
    inline def setMessageRetentionDurationNull: Self = StObject.set(x, "messageRetentionDuration", null)
    
    inline def setMessageRetentionDurationUndefined: Self = StObject.set(x, "messageRetentionDuration", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPushConfig(value: IPushConfig): Self = StObject.set(x, "pushConfig", value.asInstanceOf[js.Any])
    
    inline def setPushConfigNull: Self = StObject.set(x, "pushConfig", null)
    
    inline def setPushConfigUndefined: Self = StObject.set(x, "pushConfig", js.undefined)
    
    inline def setRetainAckedMessages(value: Boolean): Self = StObject.set(x, "retainAckedMessages", value.asInstanceOf[js.Any])
    
    inline def setRetainAckedMessagesNull: Self = StObject.set(x, "retainAckedMessages", null)
    
    inline def setRetainAckedMessagesUndefined: Self = StObject.set(x, "retainAckedMessages", js.undefined)
    
    inline def setRetryPolicy(value: IRetryPolicy): Self = StObject.set(x, "retryPolicy", value.asInstanceOf[js.Any])
    
    inline def setRetryPolicyNull: Self = StObject.set(x, "retryPolicy", null)
    
    inline def setRetryPolicyUndefined: Self = StObject.set(x, "retryPolicy", js.undefined)
    
    inline def setState(
      value: State | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.pubsub.v1.Subscription.State * / any */ String)
    ): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
    
    inline def setTopicMessageRetentionDuration(value: IDuration): Self = StObject.set(x, "topicMessageRetentionDuration", value.asInstanceOf[js.Any])
    
    inline def setTopicMessageRetentionDurationNull: Self = StObject.set(x, "topicMessageRetentionDuration", null)
    
    inline def setTopicMessageRetentionDurationUndefined: Self = StObject.set(x, "topicMessageRetentionDuration", js.undefined)
    
    inline def setTopicNull: Self = StObject.set(x, "topic", null)
    
    inline def setTopicUndefined: Self = StObject.set(x, "topic", js.undefined)
  }
}
