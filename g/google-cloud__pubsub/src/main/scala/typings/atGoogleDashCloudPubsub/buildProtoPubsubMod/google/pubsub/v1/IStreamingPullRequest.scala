package typings.atGoogleDashCloudPubsub.buildProtoPubsubMod.google.pubsub.v1

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
    ackIds: js.Array[String] = null,
    modifyDeadlineAckIds: js.Array[String] = null,
    modifyDeadlineSeconds: js.Array[Double] = null,
    streamAckDeadlineSeconds: Int | Double = null,
    subscription: String = null
  ): IStreamingPullRequest = {
    val __obj = js.Dynamic.literal()
    if (ackIds != null) __obj.updateDynamic("ackIds")(ackIds.asInstanceOf[js.Any])
    if (modifyDeadlineAckIds != null) __obj.updateDynamic("modifyDeadlineAckIds")(modifyDeadlineAckIds.asInstanceOf[js.Any])
    if (modifyDeadlineSeconds != null) __obj.updateDynamic("modifyDeadlineSeconds")(modifyDeadlineSeconds.asInstanceOf[js.Any])
    if (streamAckDeadlineSeconds != null) __obj.updateDynamic("streamAckDeadlineSeconds")(streamAckDeadlineSeconds.asInstanceOf[js.Any])
    if (subscription != null) __obj.updateDynamic("subscription")(subscription.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStreamingPullRequest]
  }
}

