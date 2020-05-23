package typings.googleCloudPubsub.subscriptionMod

import typings.googleCloudPubsub.leaseManagerMod.FlowControlOptions
import typings.googleCloudPubsub.messageQueuesMod.BatchOptions
import typings.googleCloudPubsub.messageStreamMod.MessageStreamOptions
import typings.googleCloudPubsub.topicMod.Topic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined @google-cloud/pubsub.@google-cloud/pubsub/build/src/subscriber.SubscriberOptions & {  topic ? :@google-cloud/pubsub.@google-cloud/pubsub/build/src/topic.Topic} */
trait SubscriptionOptions extends js.Object {
  var ackDeadline: js.UndefOr[Double] = js.undefined
  var batching: js.UndefOr[BatchOptions] = js.undefined
  var flowControl: js.UndefOr[FlowControlOptions] = js.undefined
  var streamingOptions: js.UndefOr[MessageStreamOptions] = js.undefined
  var topic: js.UndefOr[Topic] = js.undefined
}

object SubscriptionOptions {
  @scala.inline
  def apply(
    ackDeadline: js.UndefOr[Double] = js.undefined,
    batching: BatchOptions = null,
    flowControl: FlowControlOptions = null,
    streamingOptions: MessageStreamOptions = null,
    topic: Topic = null
  ): SubscriptionOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ackDeadline)) __obj.updateDynamic("ackDeadline")(ackDeadline.get.asInstanceOf[js.Any])
    if (batching != null) __obj.updateDynamic("batching")(batching.asInstanceOf[js.Any])
    if (flowControl != null) __obj.updateDynamic("flowControl")(flowControl.asInstanceOf[js.Any])
    if (streamingOptions != null) __obj.updateDynamic("streamingOptions")(streamingOptions.asInstanceOf[js.Any])
    if (topic != null) __obj.updateDynamic("topic")(topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscriptionOptions]
  }
}

