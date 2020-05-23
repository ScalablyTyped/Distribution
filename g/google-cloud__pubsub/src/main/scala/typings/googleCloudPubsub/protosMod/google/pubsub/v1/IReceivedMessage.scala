package typings.googleCloudPubsub.protosMod.google.pubsub.v1

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
  def apply(
    ackId: js.UndefOr[Null | String] = js.undefined,
    deliveryAttempt: js.UndefOr[Null | Double] = js.undefined,
    message: js.UndefOr[Null | IPubsubMessage] = js.undefined
  ): IReceivedMessage = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ackId)) __obj.updateDynamic("ackId")(ackId.asInstanceOf[js.Any])
    if (!js.isUndefined(deliveryAttempt)) __obj.updateDynamic("deliveryAttempt")(deliveryAttempt.asInstanceOf[js.Any])
    if (!js.isUndefined(message)) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[IReceivedMessage]
  }
}

