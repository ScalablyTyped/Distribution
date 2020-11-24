package typings.gcStats.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MemoryStatistics extends js.Object {
  
  var heapSizeLimit: Double = js.native
  
  var mallocedMemory: js.UndefOr[Double] = js.native
  
   // became available with node 10+
  var numberOfDetachedContexts: js.UndefOr[Double] = js.native
  
   // became available with node 7+
  var numberOfNativeContexts: js.UndefOr[Double] = js.native
  
   // became available with node 7+
  var peakMallocedMemory: js.UndefOr[Double] = js.native
  
  var totalAvailableSize: Double = js.native
  
  var totalHeapExecutableSize: Double = js.native
  
  var totalHeapSize: Double = js.native
  
  var totalPhysicalSize: Double = js.native
  
  var usedHeapSize: Double = js.native
}
object MemoryStatistics {
  
  @scala.inline
  def apply(
    heapSizeLimit: Double,
    totalAvailableSize: Double,
    totalHeapExecutableSize: Double,
    totalHeapSize: Double,
    totalPhysicalSize: Double,
    usedHeapSize: Double
  ): MemoryStatistics = {
    val __obj = js.Dynamic.literal(heapSizeLimit = heapSizeLimit.asInstanceOf[js.Any], totalAvailableSize = totalAvailableSize.asInstanceOf[js.Any], totalHeapExecutableSize = totalHeapExecutableSize.asInstanceOf[js.Any], totalHeapSize = totalHeapSize.asInstanceOf[js.Any], totalPhysicalSize = totalPhysicalSize.asInstanceOf[js.Any], usedHeapSize = usedHeapSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemoryStatistics]
  }
  
  @scala.inline
  implicit class MemoryStatisticsOps[Self <: MemoryStatistics] (val x: Self) extends AnyVal {
    
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
    def setHeapSizeLimit(value: Double): Self = this.set("heapSizeLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalAvailableSize(value: Double): Self = this.set("totalAvailableSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalHeapExecutableSize(value: Double): Self = this.set("totalHeapExecutableSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalHeapSize(value: Double): Self = this.set("totalHeapSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalPhysicalSize(value: Double): Self = this.set("totalPhysicalSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsedHeapSize(value: Double): Self = this.set("usedHeapSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMallocedMemory(value: Double): Self = this.set("mallocedMemory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMallocedMemory: Self = this.set("mallocedMemory", js.undefined)
    
    @scala.inline
    def setNumberOfDetachedContexts(value: Double): Self = this.set("numberOfDetachedContexts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumberOfDetachedContexts: Self = this.set("numberOfDetachedContexts", js.undefined)
    
    @scala.inline
    def setNumberOfNativeContexts(value: Double): Self = this.set("numberOfNativeContexts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumberOfNativeContexts: Self = this.set("numberOfNativeContexts", js.undefined)
    
    @scala.inline
    def setPeakMallocedMemory(value: Double): Self = this.set("peakMallocedMemory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePeakMallocedMemory: Self = this.set("peakMallocedMemory", js.undefined)
  }
}
