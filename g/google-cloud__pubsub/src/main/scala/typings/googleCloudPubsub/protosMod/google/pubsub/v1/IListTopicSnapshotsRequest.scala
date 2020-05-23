package typings.googleCloudPubsub.protosMod.google.pubsub.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a ListTopicSnapshotsRequest. */
trait IListTopicSnapshotsRequest extends js.Object {
  /** ListTopicSnapshotsRequest pageSize */
  var pageSize: js.UndefOr[Double | Null] = js.undefined
  /** ListTopicSnapshotsRequest pageToken */
  var pageToken: js.UndefOr[String | Null] = js.undefined
  /** ListTopicSnapshotsRequest topic */
  var topic: js.UndefOr[String | Null] = js.undefined
}

object IListTopicSnapshotsRequest {
  @scala.inline
  def apply(
    pageSize: js.UndefOr[Null | Double] = js.undefined,
    pageToken: js.UndefOr[Null | String] = js.undefined,
    topic: js.UndefOr[Null | String] = js.undefined
  ): IListTopicSnapshotsRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(pageSize)) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (!js.isUndefined(pageToken)) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    if (!js.isUndefined(topic)) __obj.updateDynamic("topic")(topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[IListTopicSnapshotsRequest]
  }
}

