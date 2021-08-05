package typings.devtoolsProtocol.mod.Protocol.HeapProfiler

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TakeHeapSnapshotRequest extends StObject {
  
  /**
    * If true 'reportHeapSnapshotProgress' events will be generated while snapshot is being taken.
    */
  var reportProgress: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If true, a raw snapshot without artifical roots will be generated
    */
  var treatGlobalObjectsAsRoots: js.UndefOr[Boolean] = js.undefined
}
object TakeHeapSnapshotRequest {
  
  inline def apply(): TakeHeapSnapshotRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TakeHeapSnapshotRequest]
  }
  
  extension [Self <: TakeHeapSnapshotRequest](x: Self) {
    
    inline def setReportProgress(value: Boolean): Self = StObject.set(x, "reportProgress", value.asInstanceOf[js.Any])
    
    inline def setReportProgressUndefined: Self = StObject.set(x, "reportProgress", js.undefined)
    
    inline def setTreatGlobalObjectsAsRoots(value: Boolean): Self = StObject.set(x, "treatGlobalObjectsAsRoots", value.asInstanceOf[js.Any])
    
    inline def setTreatGlobalObjectsAsRootsUndefined: Self = StObject.set(x, "treatGlobalObjectsAsRoots", js.undefined)
  }
}
