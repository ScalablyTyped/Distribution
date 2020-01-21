package typings.googleCloudPubsub.pubsubMod.google.pubsub.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a GetSnapshotRequest. */
trait IGetSnapshotRequest extends js.Object {
  /** GetSnapshotRequest snapshot */
  var snapshot: js.UndefOr[String | Null] = js.undefined
}

object IGetSnapshotRequest {
  @scala.inline
  def apply(snapshot: String = null): IGetSnapshotRequest = {
    val __obj = js.Dynamic.literal()
    if (snapshot != null) __obj.updateDynamic("snapshot")(snapshot.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGetSnapshotRequest]
  }
}

