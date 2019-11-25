package typings.atGoogleDashCloudPubsub.buildProtoPubsubMod.google.pubsub.v1

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
  def apply(nextPageToken: String = null, snapshots: js.Array[ISnapshot] = null): IListSnapshotsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (snapshots != null) __obj.updateDynamic("snapshots")(snapshots.asInstanceOf[js.Any])
    __obj.asInstanceOf[IListSnapshotsResponse]
  }
}

