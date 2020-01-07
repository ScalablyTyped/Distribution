package typings.googleapis.buildSrcApisComputeAlphaMod.compute_alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configuration parameters for scaling based on Cloud Pub/Sub subscription
  * queue.
  */
@js.native
trait Schema$AutoscalingPolicyQueueBasedScalingCloudPubSub extends js.Object {
  /**
    * Cloud Pub/Sub subscription used for scaling. Provide the partial URL
    * (starting with projects/) or just the subscription name. The subscription
    * must be assigned to the topic specified in topicName and must be in a
    * pull configuration. The subscription must belong to the same project as
    * the Autoscaler.
    */
  var subscription: js.UndefOr[String] = js.native
  /**
    * Cloud Pub/Sub topic used for scaling. Provide the partial URL or partial
    * URL (starting with projects/) or just the topic name. The topic must
    * belong to the same project as the Autoscaler resource.
    */
  var topic: js.UndefOr[String] = js.native
}

object Schema$AutoscalingPolicyQueueBasedScalingCloudPubSub {
  @scala.inline
  def apply(subscription: String = null, topic: String = null): Schema$AutoscalingPolicyQueueBasedScalingCloudPubSub = {
    val __obj = js.Dynamic.literal()
    if (subscription != null) __obj.updateDynamic("subscription")(subscription.asInstanceOf[js.Any])
    if (topic != null) __obj.updateDynamic("topic")(topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$AutoscalingPolicyQueueBasedScalingCloudPubSub]
  }
}

