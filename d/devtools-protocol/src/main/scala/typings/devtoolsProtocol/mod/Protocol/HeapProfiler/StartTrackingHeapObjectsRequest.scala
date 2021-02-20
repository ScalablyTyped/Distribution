package typings.devtoolsProtocol.mod.Protocol.HeapProfiler

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartTrackingHeapObjectsRequest extends StObject {
  
  var trackAllocations: js.UndefOr[Boolean] = js.native
}
object StartTrackingHeapObjectsRequest {
  
  @scala.inline
  def apply(): StartTrackingHeapObjectsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartTrackingHeapObjectsRequest]
  }
  
  @scala.inline
  implicit class StartTrackingHeapObjectsRequestMutableBuilder[Self <: StartTrackingHeapObjectsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTrackAllocations(value: Boolean): Self = StObject.set(x, "trackAllocations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrackAllocationsUndefined: Self = StObject.set(x, "trackAllocations", js.undefined)
  }
}
