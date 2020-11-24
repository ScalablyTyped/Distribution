package typings.devtoolsProtocol.mod.Protocol.HeapProfiler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartTrackingHeapObjectsRequest extends js.Object {
  
  var trackAllocations: js.UndefOr[Boolean] = js.native
}
object StartTrackingHeapObjectsRequest {
  
  @scala.inline
  def apply(): StartTrackingHeapObjectsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartTrackingHeapObjectsRequest]
  }
  
  @scala.inline
  implicit class StartTrackingHeapObjectsRequestOps[Self <: StartTrackingHeapObjectsRequest] (val x: Self) extends AnyVal {
    
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
    def setTrackAllocations(value: Boolean): Self = this.set("trackAllocations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrackAllocations: Self = this.set("trackAllocations", js.undefined)
  }
}
