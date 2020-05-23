package typings.googleCloudPubsub.pubsubMod.google.pubsub.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of an AcknowledgeRequest. */
trait IAcknowledgeRequest extends js.Object {
  /** AcknowledgeRequest ackIds */
  var ackIds: js.UndefOr[js.Array[String] | Null] = js.undefined
  /** AcknowledgeRequest subscription */
  var subscription: js.UndefOr[String | Null] = js.undefined
}

object IAcknowledgeRequest {
  @scala.inline
  def apply(
    ackIds: js.UndefOr[Null | js.Array[String]] = js.undefined,
    subscription: js.UndefOr[Null | String] = js.undefined
  ): IAcknowledgeRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ackIds)) __obj.updateDynamic("ackIds")(ackIds.asInstanceOf[js.Any])
    if (!js.isUndefined(subscription)) __obj.updateDynamic("subscription")(subscription.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAcknowledgeRequest]
  }
}

