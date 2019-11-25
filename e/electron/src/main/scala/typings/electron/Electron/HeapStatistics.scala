package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeapStatistics extends js.Object {
  var doesZapGarbage: Boolean
  var heapSizeLimit: Double
  var mallocedMemory: Double
  var peakMallocedMemory: Double
  var totalAvailableSize: Double
  var totalHeapSize: Double
  var totalHeapSizeExecutable: Double
  var totalPhysicalSize: Double
  var usedHeapSize: Double
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
}

