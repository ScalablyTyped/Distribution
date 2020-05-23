package typings.googleCloudPubsub.pubsubMod.google.pubsub.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a ListSnapshotsResponse. */
trait IListSnapshotsResponse extends js.Object {
  /** ListSnapshotsResponse nextPageToken */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  /** ListSnapshotsResponse snapshots */
  var snapshots: js.UndefOr[js.Array[ISnapshot] | Null] = js.undefined
}

object IListSnapshotsResponse {
  @scala.inline
  def apply(
    nextPageToken: js.UndefOr[Null | String] = js.undefined,
    snapshots: js.UndefOr[Null | js.Array[ISnapshot]] = js.undefined
  ): IListSnapshotsResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(nextPageToken)) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (!js.isUndefined(snapshots)) __obj.updateDynamic("snapshots")(snapshots.asInstanceOf[js.Any])
    __obj.asInstanceOf[IListSnapshotsResponse]
  }
}

