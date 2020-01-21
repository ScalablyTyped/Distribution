package typings.googleCloudPubsub.pubsubMod.google.pubsub.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a ReceivedMessage. */
trait IReceivedMessage extends js.Object {
  /** ReceivedMessage ackId */
  var ackId: js.UndefOr[String | Null] = js.undefined
  /** ReceivedMessage deliveryAttempt */
  var deliveryAttempt: js.UndefOr[Double | Null] = js.undefined
  /** ReceivedMessage message */
  var message: js.UndefOr[IPubsubMessage | Null] = js.undefined
}

object IReceivedMessage {
  @scala.inline
  def apply(ackId: String = null, deliveryAttempt: Int | Double = null, message: IPubsubMessage = null): IReceivedMessage = {
    val __obj = js.Dynamic.literal()
    if (ackId != null) __obj.updateDynamic("ackId")(ackId.asInstanceOf[js.Any])
    if (deliveryAttempt != null) __obj.updateDynamic("deliveryAttempt")(deliveryAttempt.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[IReceivedMessage]
  }
}

