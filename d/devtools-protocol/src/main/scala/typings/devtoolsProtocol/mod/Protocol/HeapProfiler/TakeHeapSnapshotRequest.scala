package typings.devtoolsProtocol.mod.Protocol.HeapProfiler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TakeHeapSnapshotRequest extends js.Object {
  
  /**
    * If true 'reportHeapSnapshotProgress' events will be generated while snapshot is being taken.
    */
  var reportProgress: js.UndefOr[Boolean] = js.native
  
  /**
    * If true, a raw snapshot without artifical roots will be generated
    */
  var treatGlobalObjectsAsRoots: js.UndefOr[Boolean] = js.native
}
object TakeHeapSnapshotRequest {
  
  @scala.inline
  def apply(): TakeHeapSnapshotRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TakeHeapSnapshotRequest]
  }
  
  @scala.inline
  implicit class TakeHeapSnapshotRequestOps[Self <: TakeHeapSnapshotRequest] (val x: Self) extends AnyVal {
    
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
