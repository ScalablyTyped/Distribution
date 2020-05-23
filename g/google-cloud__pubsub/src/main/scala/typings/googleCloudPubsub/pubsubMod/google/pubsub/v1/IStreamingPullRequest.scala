package typings.googleCloudPubsub.pubsubMod.google.pubsub.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a StreamingPullRequest. */
trait IStreamingPullRequest extends js.Object {
  /** StreamingPullRequest ackIds */
  var ackIds: js.UndefOr[js.Array[String] | Null] = js.undefined
  /** StreamingPullRequest modifyDeadlineAckIds */
  var modifyDeadlineAckIds: js.UndefOr[js.Array[String] | Null] = js.undefined
  /** StreamingPullRequest modifyDeadlineSeconds */
  var modifyDeadlineSeconds: js.UndefOr[js.Array[Double] | Null] = js.undefined
  /** StreamingPullRequest streamAckDeadlineSeconds */
  var streamAckDeadlineSeconds: js.UndefOr[Double | Null] = js.undefined
  /** StreamingPullRequest subscription */
  var subscription: js.UndefOr[String | Null] = js.undefined
}

object IStreamingPullRequest {
  @scala.inline
  def apply(
    ackIds: js.UndefOr[Null | js.Array[String]] = js.undefined,
    modifyDeadlineAckIds: js.UndefOr[Null | js.Array[String]] = js.undefined,
    modifyDeadlineSeconds: js.UndefOr[Null | js.Array[Double]] = js.undefined,
    streamAckDeadlineSeconds: js.UndefOr[Null | Double] = js.undefined,
    subscription: js.UndefOr[Null | String] = js.undefined
  ): IStreamingPullRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ackIds)) __obj.updateDynamic("ackIds")(ackIds.asInstanceOf[js.Any])
    if (!js.isUndefined(modifyDeadlineAckIds)) __obj.updateDynamic("modifyDeadlineAckIds")(modifyDeadlineAckIds.asInstanceOf[js.Any])
    if (!js.isUndefined(modifyDeadlineSeconds)) __obj.updateDynamic("modifyDeadlineSeconds")(modifyDeadlineSeconds.asInstanceOf[js.Any])
    if (!js.isUndefined(streamAckDeadlineSeconds)) __obj.updateDynamic("streamAckDeadlineSeconds")(streamAckDeadlineSeconds.asInstanceOf[js.Any])
    if (!js.isUndefined(subscription)) __obj.updateDynamic("subscription")(subscription.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStreamingPullRequest]
  }
}

