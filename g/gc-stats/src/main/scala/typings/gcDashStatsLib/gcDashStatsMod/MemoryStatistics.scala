package typings
package gcDashStatsLib.gcDashStatsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MemoryStatistics extends js.Object {
  var heapSizeLimit: scala.Double
  var mallocedMemory: js.UndefOr[scala.Double] = js.undefined
   // became available with node 10+
  var numberOfDetachedContexts: js.UndefOr[scala.Double] = js.undefined
   // became available with node 7+
  var numberOfNativeContexts: js.UndefOr[scala.Double] = js.undefined
   // became available with node 7+
  var peakMallocedMemory: js.UndefOr[scala.Double] = js.undefined
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
    totalAvailableSize: scala.Double,
    totalHeapExecutableSize: scala.Double,
    totalHeapSize: scala.Double,
    totalPhysicalSize: scala.Double,
    usedHeapSize: scala.Double,
    mallocedMemory: scala.Int | scala.Double = null,
    numberOfDetachedContexts: scala.Int | scala.Double = null,
    numberOfNativeContexts: scala.Int | scala.Double = null,
    peakMallocedMemory: scala.Int | scala.Double = null
  ): MemoryStatistics = {
    val __obj = js.Dynamic.literal(heapSizeLimit = heapSizeLimit, totalAvailableSize = totalAvailableSize, totalHeapExecutableSize = totalHeapExecutableSize, totalHeapSize = totalHeapSize, totalPhysicalSize = totalPhysicalSize, usedHeapSize = usedHeapSize)
    if (mallocedMemory != null) __obj.updateDynamic("mallocedMemory")(mallocedMemory.asInstanceOf[js.Any])
    if (numberOfDetachedContexts != null) __obj.updateDynamic("numberOfDetachedContexts")(numberOfDetachedContexts.asInstanceOf[js.Any])
    if (numberOfNativeContexts != null) __obj.updateDynamic("numberOfNativeContexts")(numberOfNativeContexts.asInstanceOf[js.Any])
    if (peakMallocedMemory != null) __obj.updateDynamic("peakMallocedMemory")(peakMallocedMemory.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemoryStatistics]
  }
}

