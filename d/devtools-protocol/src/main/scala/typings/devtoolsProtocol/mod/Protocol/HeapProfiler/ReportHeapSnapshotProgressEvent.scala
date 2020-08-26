package typings.devtoolsProtocol.mod.Protocol.HeapProfiler

import typings.devtoolsProtocol.mod.Protocol.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReportHeapSnapshotProgressEvent extends js.Object {
  var done: integer = js.native
  var finished: js.UndefOr[Boolean] = js.native
  var total: integer = js.native
}

object ReportHeapSnapshotProgressEvent {
  @scala.inline
  def apply(done: integer, total: integer): ReportHeapSnapshotProgressEvent = {
    val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReportHeapSnapshotProgressEvent]
  }
  @scala.inline
  implicit class ReportHeapSnapshotProgressEventOps[Self <: ReportHeapSnapshotProgressEvent] (val x: Self) extends AnyVal {
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
    def setDone(value: integer): Self = this.set("done", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotal(value: integer): Self = this.set("total", value.asInstanceOf[js.Any])
    @scala.inline
    def setFinished(value: Boolean): Self = this.set("finished", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFinished: Self = this.set("finished", js.undefined)
  }
  
}

