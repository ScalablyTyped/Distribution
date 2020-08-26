package typings.devtoolsProtocol.mod.Protocol.LayerTree

import typings.devtoolsProtocol.mod.Protocol.DOM.Rect
import typings.devtoolsProtocol.mod.Protocol.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProfileSnapshotRequest extends js.Object {
  /**
    * The clip rectangle to apply when replaying the snapshot.
    */
  var clipRect: js.UndefOr[Rect] = js.native
  /**
    * The minimum duration (in seconds) to replay the snapshot.
    */
  var minDuration: js.UndefOr[Double] = js.native
  /**
    * The maximum number of times to replay the snapshot (1, if not specified).
    */
  var minRepeatCount: js.UndefOr[integer] = js.native
  /**
    * The id of the layer snapshot.
    */
  var snapshotId: SnapshotId = js.native
}

object ProfileSnapshotRequest {
  @scala.inline
  def apply(snapshotId: SnapshotId): ProfileSnapshotRequest = {
    val __obj = js.Dynamic.literal(snapshotId = snapshotId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProfileSnapshotRequest]
  }
  @scala.inline
  implicit class ProfileSnapshotRequestOps[Self <: ProfileSnapshotRequest] (val x: Self) extends AnyVal {
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
    @scala.inline
    def setClipRect(value: Rect): Self = this.set("clipRect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClipRect: Self = this.set("clipRect", js.undefined)
    @scala.inline
    def setMinDuration(value: Double): Self = this.set("minDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinDuration: Self = this.set("minDuration", js.undefined)
    @scala.inline
    def setMinRepeatCount(value: integer): Self = this.set("minRepeatCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinRepeatCount: Self = this.set("minRepeatCount", js.undefined)
  }
  
}

