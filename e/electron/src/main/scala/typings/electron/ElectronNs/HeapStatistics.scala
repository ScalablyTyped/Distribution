package typings.electron.ElectronNs

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
    val __obj = js.Dynamic.literal(doesZapGarbage = doesZapGarbage, heapSizeLimit = heapSizeLimit, mallocedMemory = mallocedMemory, peakMallocedMemory = peakMallocedMemory, totalAvailableSize = totalAvailableSize, totalHeapSize = totalHeapSize, totalHeapSizeExecutable = totalHeapSizeExecutable, totalPhysicalSize = totalPhysicalSize, usedHeapSize = usedHeapSize)
  
    __obj.asInstanceOf[HeapStatistics]
  }
}

