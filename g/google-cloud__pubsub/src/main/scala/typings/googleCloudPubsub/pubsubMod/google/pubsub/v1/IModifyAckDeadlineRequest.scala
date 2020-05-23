package typings.googleCloudPubsub.pubsubMod.google.pubsub.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a ModifyAckDeadlineRequest. */
trait IModifyAckDeadlineRequest extends js.Object {
  /** ModifyAckDeadlineRequest ackDeadlineSeconds */
  var ackDeadlineSeconds: js.UndefOr[Double | Null] = js.undefined
  /** ModifyAckDeadlineRequest ackIds */
  var ackIds: js.UndefOr[js.Array[String] | Null] = js.undefined
  /** ModifyAckDeadlineRequest subscription */
  var subscription: js.UndefOr[String | Null] = js.undefined
}

object IModifyAckDeadlineRequest {
  @scala.inline
  def apply(
    ackDeadlineSeconds: js.UndefOr[Null | Double] = js.undefined,
    ackIds: js.UndefOr[Null | js.Array[String]] = js.undefined,
    subscription: js.UndefOr[Null | String] = js.undefined
  ): IModifyAckDeadlineRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ackDeadlineSeconds)) __obj.updateDynamic("ackDeadlineSeconds")(ackDeadlineSeconds.asInstanceOf[js.Any])
    if (!js.isUndefined(ackIds)) __obj.updateDynamic("ackIds")(ackIds.asInstanceOf[js.Any])
    if (!js.isUndefined(subscription)) __obj.updateDynamic("subscription")(subscription.asInstanceOf[js.Any])
    __obj.asInstanceOf[IModifyAckDeadlineRequest]
  }
}

