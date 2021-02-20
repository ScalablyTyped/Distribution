package typings.devtoolsProtocol.mod.Protocol.HeapProfiler

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StopTrackingHeapObjectsRequest extends StObject {
  
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
  implicit class StopTrackingHeapObjectsRequestMutableBuilder[Self <: StopTrackingHeapObjectsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReportProgress(value: Boolean): Self = StObject.set(x, "reportProgress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReportProgressUndefined: Self = StObject.set(x, "reportProgress", js.undefined)
    
    @scala.inline
    def setTreatGlobalObjectsAsRoots(value: Boolean): Self = StObject.set(x, "treatGlobalObjectsAsRoots", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTreatGlobalObjectsAsRootsUndefined: Self = StObject.set(x, "treatGlobalObjectsAsRoots", js.undefined)
  }
}
