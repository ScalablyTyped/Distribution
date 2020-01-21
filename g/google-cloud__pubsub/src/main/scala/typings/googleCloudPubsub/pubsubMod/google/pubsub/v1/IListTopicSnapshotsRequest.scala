package typings.googleCloudPubsub.pubsubMod.google.pubsub.v1

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
  def apply(pageSize: Int | Double = null, pageToken: String = null, topic: String = null): IListTopicSnapshotsRequest = {
    val __obj = js.Dynamic.literal()
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    if (topic != null) __obj.updateDynamic("topic")(topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[IListTopicSnapshotsRequest]
  }
}

