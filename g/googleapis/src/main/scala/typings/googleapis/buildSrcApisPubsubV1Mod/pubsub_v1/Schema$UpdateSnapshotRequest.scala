package typings.googleapis.buildSrcApisPubsubV1Mod.pubsub_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request for the UpdateSnapshot method.
  */
@js.native
trait Schema$UpdateSnapshotRequest extends js.Object {
  /**
    * The updated snapshot object.
    */
  var snapshot: js.UndefOr[Schema$Snapshot] = js.native
  /**
    * Indicates which fields in the provided snapshot to update. Must be
    * specified and non-empty.
    */
  var updateMask: js.UndefOr[String] = js.native
}

object Schema$UpdateSnapshotRequest {
  @scala.inline
  def apply(snapshot: Schema$Snapshot = null, updateMask: String = null): Schema$UpdateSnapshotRequest = {
    val __obj = js.Dynamic.literal()
    if (snapshot != null) __obj.updateDynamic("snapshot")(snapshot.asInstanceOf[js.Any])
    if (updateMask != null) __obj.updateDynamic("updateMask")(updateMask.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$UpdateSnapshotRequest]
  }
}

