package typings.googleCloudPubsub.pubsubMod.google.pubsub.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a ListTopicSnapshotsResponse. */
trait IListTopicSnapshotsResponse extends js.Object {
  /** ListTopicSnapshotsResponse nextPageToken */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  /** ListTopicSnapshotsResponse snapshots */
  var snapshots: js.UndefOr[js.Array[String] | Null] = js.undefined
}

object IListTopicSnapshotsResponse {
  @scala.inline
  def apply(nextPageToken: String = null, snapshots: js.Array[String] = null): IListTopicSnapshotsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (snapshots != null) __obj.updateDynamic("snapshots")(snapshots.asInstanceOf[js.Any])
    __obj.asInstanceOf[IListTopicSnapshotsResponse]
  }
}

