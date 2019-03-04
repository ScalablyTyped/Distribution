package typings
package gcDashStatsLib.gcDashStatsMod.GCStatsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MemoryStatistics extends js.Object {
  var heapSizeLimit: scala.Double
  var mallocedMemory: scala.Double
  var peakMallocedMemory: scala.Double
  var totalAvailableSize: scala.Double
  var totalHeapExecutableSize: scala.Double
  var totalHeapSize: scala.Double
  var totalPhysicalSize: scala.Double
  var usedHeapSize: scala.Double
}

object MemoryStatistics {
  @scala.inline
  def apply(
    heapSizeLimit: scala.Double,
    mallocedMemory: scala.Double,
    peakMallocedMemory: scala.Double,
    totalAvailableSize: scala.Double,
    totalHeapExecutableSize: scala.Double,
    totalHeapSize: scala.Double,
    totalPhysicalSize: scala.Double,
    usedHeapSize: scala.Double
  ): MemoryStatistics = {
    val __obj = js.Dynamic.literal(heapSizeLimit = heapSizeLimit, mallocedMemory = mallocedMemory, peakMallocedMemory = peakMallocedMemory, totalAvailableSize = totalAvailableSize, totalHeapExecutableSize = totalHeapExecutableSize, totalHeapSize = totalHeapSize, totalPhysicalSize = totalPhysicalSize, usedHeapSize = usedHeapSize)
  
    __obj.asInstanceOf[MemoryStatistics]
  }
}

