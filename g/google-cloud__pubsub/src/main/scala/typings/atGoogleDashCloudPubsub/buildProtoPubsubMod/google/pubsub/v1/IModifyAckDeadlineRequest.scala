package typings.atGoogleDashCloudPubsub.buildProtoPubsubMod.google.pubsub.v1

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
    ackDeadlineSeconds: Int | Double = null,
    ackIds: js.Array[String] = null,
    subscription: String = null
  ): IModifyAckDeadlineRequest = {
    val __obj = js.Dynamic.literal()
    if (ackDeadlineSeconds != null) __obj.updateDynamic("ackDeadlineSeconds")(ackDeadlineSeconds.asInstanceOf[js.Any])
    if (ackIds != null) __obj.updateDynamic("ackIds")(ackIds.asInstanceOf[js.Any])
    if (subscription != null) __obj.updateDynamic("subscription")(subscription.asInstanceOf[js.Any])
    __obj.asInstanceOf[IModifyAckDeadlineRequest]
  }
}

