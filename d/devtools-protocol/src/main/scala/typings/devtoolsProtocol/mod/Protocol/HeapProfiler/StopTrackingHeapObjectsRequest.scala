package typings.devtoolsProtocol.mod.Protocol.HeapProfiler

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopTrackingHeapObjectsRequest extends StObject {
  
  /**
    * If true, numerical values are included in the snapshot
    */
  var captureNumericValue: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If true, exposes internals of the snapshot.
    */
  var exposeInternals: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If true 'reportHeapSnapshotProgress' events will be generated while snapshot is being taken
    * when the tracking is stopped.
    */
  var reportProgress: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Deprecated in favor of `exposeInternals`.
    */
  var treatGlobalObjectsAsRoots: js.UndefOr[Boolean] = js.undefined
}
object StopTrackingHeapObjectsRequest {
  
  inline def apply(): StopTrackingHeapObjectsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StopTrackingHeapObjectsRequest]
  }
  
  extension [Self <: StopTrackingHeapObjectsRequest](x: Self) {
    
    inline def setCaptureNumericValue(value: Boolean): Self = StObject.set(x, "captureNumericValue", value.asInstanceOf[js.Any])
    
    inline def setCaptureNumericValueUndefined: Self = StObject.set(x, "captureNumericValue", js.undefined)
    
    inline def setExposeInternals(value: Boolean): Self = StObject.set(x, "exposeInternals", value.asInstanceOf[js.Any])
    
    inline def setExposeInternalsUndefined: Self = StObject.set(x, "exposeInternals", js.undefined)
    
    inline def setReportProgress(value: Boolean): Self = StObject.set(x, "reportProgress", value.asInstanceOf[js.Any])
    
    inline def setReportProgressUndefined: Self = StObject.set(x, "reportProgress", js.undefined)
    
    inline def setTreatGlobalObjectsAsRoots(value: Boolean): Self = StObject.set(x, "treatGlobalObjectsAsRoots", value.asInstanceOf[js.Any])
    
    inline def setTreatGlobalObjectsAsRootsUndefined: Self = StObject.set(x, "treatGlobalObjectsAsRoots", js.undefined)
  }
}
