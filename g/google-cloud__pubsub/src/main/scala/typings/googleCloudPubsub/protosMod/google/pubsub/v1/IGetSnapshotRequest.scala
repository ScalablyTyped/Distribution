package typings.googleCloudPubsub.protosMod.google.pubsub.v1

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
  def apply(snapshot: js.UndefOr[Null | String] = js.undefined): IGetSnapshotRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(snapshot)) __obj.updateDynamic("snapshot")(snapshot.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGetSnapshotRequest]
  }
}

