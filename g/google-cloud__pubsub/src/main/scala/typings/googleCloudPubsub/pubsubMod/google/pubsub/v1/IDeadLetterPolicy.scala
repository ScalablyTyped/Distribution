package typings.googleCloudPubsub.pubsubMod.google.pubsub.v1

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
  def apply(deadLetterTopic: String = null, maxDeliveryAttempts: Int | Double = null): IDeadLetterPolicy = {
    val __obj = js.Dynamic.literal()
    if (deadLetterTopic != null) __obj.updateDynamic("deadLetterTopic")(deadLetterTopic.asInstanceOf[js.Any])
    if (maxDeliveryAttempts != null) __obj.updateDynamic("maxDeliveryAttempts")(maxDeliveryAttempts.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDeadLetterPolicy]
  }
}

