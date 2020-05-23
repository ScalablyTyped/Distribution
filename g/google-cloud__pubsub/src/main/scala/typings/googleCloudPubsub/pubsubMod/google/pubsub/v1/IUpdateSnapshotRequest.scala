package typings.googleCloudPubsub.pubsubMod.google.pubsub.v1

import typings.googleCloudPubsub.pubsubMod.google.protobuf.IFieldMask
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of an UpdateSnapshotRequest. */
trait IUpdateSnapshotRequest extends js.Object {
  /** UpdateSnapshotRequest snapshot */
  var snapshot: js.UndefOr[ISnapshot | Null] = js.undefined
  /** UpdateSnapshotRequest updateMask */
  var updateMask: js.UndefOr[IFieldMask | Null] = js.undefined
}

object IUpdateSnapshotRequest {
  @scala.inline
  def apply(
    snapshot: js.UndefOr[Null | ISnapshot] = js.undefined,
    updateMask: js.UndefOr[Null | IFieldMask] = js.undefined
  ): IUpdateSnapshotRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(snapshot)) __obj.updateDynamic("snapshot")(snapshot.asInstanceOf[js.Any])
    if (!js.isUndefined(updateMask)) __obj.updateDynamic("updateMask")(updateMask.asInstanceOf[js.Any])
    __obj.asInstanceOf[IUpdateSnapshotRequest]
  }
}

