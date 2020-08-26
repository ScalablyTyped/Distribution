package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HeapStatistics extends js.Object {
  var doesZapGarbage: Boolean = js.native
  var heapSizeLimit: Double = js.native
  var mallocedMemory: Double = js.native
  var peakMallocedMemory: Double = js.native
  var totalAvailableSize: Double = js.native
  var totalHeapSize: Double = js.native
  var totalHeapSizeExecutable: Double = js.native
  var totalPhysicalSize: Double = js.native
  var usedHeapSize: Double = js.native
}

object HeapStatistics {
  @scala.inline
  def apply(
    doesZapGarbage: Boolean,
    heapSizeLimit: Double,
    mallocedMemory: Double,
    peakMallocedMemory: Double,
    totalAvailableSize: Double,
    totalHeapSize: Double,
    totalHeapSizeExecutable: Double,
    totalPhysicalSize: Double,
    usedHeapSize: Double
  ): HeapStatistics = {
    val __obj = js.Dynamic.literal(doesZapGarbage = doesZapGarbage.asInstanceOf[js.Any], heapSizeLimit = heapSizeLimit.asInstanceOf[js.Any], mallocedMemory = mallocedMemory.asInstanceOf[js.Any], peakMallocedMemory = peakMallocedMemory.asInstanceOf[js.Any], totalAvailableSize = totalAvailableSize.asInstanceOf[js.Any], totalHeapSize = totalHeapSize.asInstanceOf[js.Any], totalHeapSizeExecutable = totalHeapSizeExecutable.asInstanceOf[js.Any], totalPhysicalSize = totalPhysicalSize.asInstanceOf[js.Any], usedHeapSize = usedHeapSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeapStatistics]
  }
  @scala.inline
  implicit class HeapStatisticsOps[Self <: HeapStatistics] (val x: Self) extends AnyVal {
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
    def setDoesZapGarbage(value: Boolean): Self = this.set("doesZapGarbage", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeapSizeLimit(value: Double): Self = this.set("heapSizeLimit", value.asInstanceOf[js.Any])
    @scala.inline
    def setMallocedMemory(value: Double): Self = this.set("mallocedMemory", value.asInstanceOf[js.Any])
    @scala.inline
    def setPeakMallocedMemory(value: Double): Self = this.set("peakMallocedMemory", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotalAvailableSize(value: Double): Self = this.set("totalAvailableSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotalHeapSize(value: Double): Self = this.set("totalHeapSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotalHeapSizeExecutable(value: Double): Self = this.set("totalHeapSizeExecutable", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotalPhysicalSize(value: Double): Self = this.set("totalPhysicalSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setUsedHeapSize(value: Double): Self = this.set("usedHeapSize", value.asInstanceOf[js.Any])
  }
  
}

