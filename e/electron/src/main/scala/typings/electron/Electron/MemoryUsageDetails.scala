package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MemoryUsageDetails extends js.Object {
  
  // Docs: https://electronjs.org/docs/api/structures/memory-usage-details
  var count: Double = js.native
  
  var liveSize: Double = js.native
  
  var size: Double = js.native
}
object MemoryUsageDetails {
  
  @scala.inline
  def apply(count: Double, liveSize: Double, size: Double): MemoryUsageDetails = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], liveSize = liveSize.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemoryUsageDetails]
  }
  
  @scala.inline
  implicit class MemoryUsageDetailsOps[Self <: MemoryUsageDetails] (val x: Self) extends AnyVal {
    
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
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLiveSize(value: Double): Self = this.set("liveSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
  }
}
