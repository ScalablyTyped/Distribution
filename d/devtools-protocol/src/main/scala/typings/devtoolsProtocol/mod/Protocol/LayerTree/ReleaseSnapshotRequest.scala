package typings.devtoolsProtocol.mod.Protocol.LayerTree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReleaseSnapshotRequest extends js.Object {
  /**
    * The id of the layer snapshot.
    */
  var snapshotId: SnapshotId = js.native
}

object ReleaseSnapshotRequest {
  @scala.inline
  def apply(snapshotId: SnapshotId): ReleaseSnapshotRequest = {
    val __obj = js.Dynamic.literal(snapshotId = snapshotId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReleaseSnapshotRequest]
  }
  @scala.inline
  implicit class ReleaseSnapshotRequestOps[Self <: ReleaseSnapshotRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setSnapshotId(value: SnapshotId): Self = this.set("snapshotId", value.asInstanceOf[js.Any])
  }
  
}

