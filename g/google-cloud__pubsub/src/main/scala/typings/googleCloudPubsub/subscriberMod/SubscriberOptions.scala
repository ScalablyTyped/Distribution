package typings.googleCloudPubsub.subscriberMod

import typings.googleCloudPubsub.leaseManagerMod.FlowControlOptions
import typings.googleCloudPubsub.messageQueuesMod.BatchOptions
import typings.googleCloudPubsub.messageStreamMod.MessageStreamOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscriberOptions extends js.Object {
  var ackDeadline: js.UndefOr[Double] = js.undefined
  var batching: js.UndefOr[BatchOptions] = js.undefined
  var flowControl: js.UndefOr[FlowControlOptions] = js.undefined
  var streamingOptions: js.UndefOr[MessageStreamOptions] = js.undefined
}

object SubscriberOptions {
  @scala.inline
  def apply(
    ackDeadline: js.UndefOr[Double] = js.undefined,
    batching: BatchOptions = null,
    flowControl: FlowControlOptions = null,
    streamingOptions: MessageStreamOptions = null
  ): SubscriberOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ackDeadline)) __obj.updateDynamic("ackDeadline")(ackDeadline.get.asInstanceOf[js.Any])
    if (batching != null) __obj.updateDynamic("batching")(batching.asInstanceOf[js.Any])
    if (flowControl != null) __obj.updateDynamic("flowControl")(flowControl.asInstanceOf[js.Any])
    if (streamingOptions != null) __obj.updateDynamic("streamingOptions")(streamingOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscriberOptions]
  }
}

