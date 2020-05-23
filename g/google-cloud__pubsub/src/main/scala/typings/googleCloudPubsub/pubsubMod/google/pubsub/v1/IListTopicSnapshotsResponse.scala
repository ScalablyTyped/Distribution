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
  def apply(
    nextPageToken: js.UndefOr[Null | String] = js.undefined,
    snapshots: js.UndefOr[Null | js.Array[String]] = js.undefined
  ): IListTopicSnapshotsResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(nextPageToken)) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (!js.isUndefined(snapshots)) __obj.updateDynamic("snapshots")(snapshots.asInstanceOf[js.Any])
    __obj.asInstanceOf[IListTopicSnapshotsResponse]
  }
}

