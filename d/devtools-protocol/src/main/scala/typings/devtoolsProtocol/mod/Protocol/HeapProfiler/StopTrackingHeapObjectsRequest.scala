package typings.devtoolsProtocol.mod.Protocol.HeapProfiler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopTrackingHeapObjectsRequest extends js.Object {
  /**
    * If true 'reportHeapSnapshotProgress' events will be generated while snapshot is being taken
    * when the tracking is stopped.
    */
  var reportProgress: js.UndefOr[Boolean] = js.native
  var treatGlobalObjectsAsRoots: js.UndefOr[Boolean] = js.native
}

object StopTrackingHeapObjectsRequest {
  @scala.inline
  def apply(): StopTrackingHeapObjectsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StopTrackingHeapObjectsRequest]
  }
  @scala.inline
  implicit class StopTrackingHeapObjectsRequestOps[Self <: StopTrackingHeapObjectsRequest] (val x: Self) extends AnyVal {
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
    def setReportProgress(value: Boolean): Self = this.set("reportProgress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReportProgress: Self = this.set("reportProgress", js.undefined)
    @scala.inline
    def setTreatGlobalObjectsAsRoots(value: Boolean): Self = this.set("treatGlobalObjectsAsRoots", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTreatGlobalObjectsAsRoots: Self = this.set("treatGlobalObjectsAsRoots", js.undefined)
  }
  
}

