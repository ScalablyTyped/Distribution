package typings.googleCloudPubsub.protosMod.google.pubsub.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a DeadLetterPolicy. */
trait IDeadLetterPolicy extends js.Object {
  /** DeadLetterPolicy deadLetterTopic */
  var deadLetterTopic: js.UndefOr[String | Null] = js.undefined
  /** DeadLetterPolicy maxDeliveryAttempts */
  var maxDeliveryAttempts: js.UndefOr[Double | Null] = js.undefined
}

object IDeadLetterPolicy {
  @scala.inline
  def apply(
    deadLetterTopic: js.UndefOr[Null | String] = js.undefined,
    maxDeliveryAttempts: js.UndefOr[Null | Double] = js.undefined
  ): IDeadLetterPolicy = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(deadLetterTopic)) __obj.updateDynamic("deadLetterTopic")(deadLetterTopic.asInstanceOf[js.Any])
    if (!js.isUndefined(maxDeliveryAttempts)) __obj.updateDynamic("maxDeliveryAttempts")(maxDeliveryAttempts.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDeadLetterPolicy]
  }
}

