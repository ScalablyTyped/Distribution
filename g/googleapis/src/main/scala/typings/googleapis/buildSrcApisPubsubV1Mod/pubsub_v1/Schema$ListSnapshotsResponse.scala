package typings.googleapis.buildSrcApisPubsubV1Mod.pubsub_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response for the `ListSnapshots` method.
  */
@js.native
trait Schema$ListSnapshotsResponse extends js.Object {
  /**
    * If not empty, indicates that there may be more snapshot that match the
    * request; this value should be passed in a new `ListSnapshotsRequest`.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The resulting snapshots.
    */
  var snapshots: js.UndefOr[js.Array[Schema$Snapshot]] = js.native
}

object Schema$ListSnapshotsResponse {
  @scala.inline
  def apply(nextPageToken: String = null, snapshots: js.Array[Schema$Snapshot] = null): Schema$ListSnapshotsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (snapshots != null) __obj.updateDynamic("snapshots")(snapshots.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListSnapshotsResponse]
  }
}

