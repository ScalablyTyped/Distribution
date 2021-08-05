package typings.devtoolsProtocol.mod.Protocol.HeapProfiler

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartTrackingHeapObjectsRequest extends StObject {
  
  var trackAllocations: js.UndefOr[Boolean] = js.undefined
}
object StartTrackingHeapObjectsRequest {
  
  inline def apply(): StartTrackingHeapObjectsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartTrackingHeapObjectsRequest]
  }
  
  extension [Self <: StartTrackingHeapObjectsRequest](x: Self) {
    
    inline def setTrackAllocations(value: Boolean): Self = StObject.set(x, "trackAllocations", value.asInstanceOf[js.Any])
    
    inline def setTrackAllocationsUndefined: Self = StObject.set(x, "trackAllocations", js.undefined)
  }
}
