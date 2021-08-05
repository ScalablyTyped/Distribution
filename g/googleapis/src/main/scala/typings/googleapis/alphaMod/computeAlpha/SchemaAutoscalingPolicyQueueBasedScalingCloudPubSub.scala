package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Configuration parameters for scaling based on Cloud Pub/Sub subscription
  * queue.
  */
trait SchemaAutoscalingPolicyQueueBasedScalingCloudPubSub extends StObject {
  
  /**
    * Cloud Pub/Sub subscription used for scaling. Provide the partial URL
    * (starting with projects/) or just the subscription name. The subscription
    * must be assigned to the topic specified in topicName and must be in a
    * pull configuration. The subscription must belong to the same project as
    * the Autoscaler.
    */
  var subscription: js.UndefOr[String] = js.undefined
  
  /**
    * Cloud Pub/Sub topic used for scaling. Provide the partial URL or partial
    * URL (starting with projects/) or just the topic name. The topic must
    * belong to the same project as the Autoscaler resource.
    */
  var topic: js.UndefOr[String] = js.undefined
}
object SchemaAutoscalingPolicyQueueBasedScalingCloudPubSub {
  
  inline def apply(): SchemaAutoscalingPolicyQueueBasedScalingCloudPubSub = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAutoscalingPolicyQueueBasedScalingCloudPubSub]
  }
  
  extension [Self <: SchemaAutoscalingPolicyQueueBasedScalingCloudPubSub](x: Self) {
    
    inline def setSubscription(value: String): Self = StObject.set(x, "subscription", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionUndefined: Self = StObject.set(x, "subscription", js.undefined)
    
    inline def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
    
    inline def setTopicUndefined: Self = StObject.set(x, "topic", js.undefined)
  }
}
