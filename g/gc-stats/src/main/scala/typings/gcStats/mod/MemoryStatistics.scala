package typings.gcStats.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MemoryStatistics extends js.Object {
  var heapSizeLimit: Double
  var mallocedMemory: js.UndefOr[Double] = js.undefined
   // became available with node 10+
  var numberOfDetachedContexts: js.UndefOr[Double] = js.undefined
   // became available with node 7+
  var numberOfNativeContexts: js.UndefOr[Double] = js.undefined
   // became available with node 7+
  var peakMallocedMemory: js.UndefOr[Double] = js.undefined
  var totalAvailableSize: Double
  var totalHeapExecutableSize: Double
  var totalHeapSize: Double
  var totalPhysicalSize: Double
  var usedHeapSize: Double
}

object MemoryStatistics {
  @scala.inline
  def apply(
    heapSizeLimit: Double,
    totalAvailableSize: Double,
    totalHeapExecutableSize: Double,
    totalHeapSize: Double,
    totalPhysicalSize: Double,
    usedHeapSize: Double,
    mallocedMemory: js.UndefOr[Double] = js.undefined,
    numberOfDetachedContexts: js.UndefOr[Double] = js.undefined,
    numberOfNativeContexts: js.UndefOr[Double] = js.undefined,
    peakMallocedMemory: js.UndefOr[Double] = js.undefined
  ): MemoryStatistics = {
    val __obj = js.Dynamic.literal(heapSizeLimit = heapSizeLimit.asInstanceOf[js.Any], totalAvailableSize = totalAvailableSize.asInstanceOf[js.Any], totalHeapExecutableSize = totalHeapExecutableSize.asInstanceOf[js.Any], totalHeapSize = totalHeapSize.asInstanceOf[js.Any], totalPhysicalSize = totalPhysicalSize.asInstanceOf[js.Any], usedHeapSize = usedHeapSize.asInstanceOf[js.Any])
    if (!js.isUndefined(mallocedMemory)) __obj.updateDynamic("mallocedMemory")(mallocedMemory.get.asInstanceOf[js.Any])
    if (!js.isUndefined(numberOfDetachedContexts)) __obj.updateDynamic("numberOfDetachedContexts")(numberOfDetachedContexts.get.asInstanceOf[js.Any])
    if (!js.isUndefined(numberOfNativeContexts)) __obj.updateDynamic("numberOfNativeContexts")(numberOfNativeContexts.get.asInstanceOf[js.Any])
    if (!js.isUndefined(peakMallocedMemory)) __obj.updateDynamic("peakMallocedMemory")(peakMallocedMemory.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemoryStatistics]
  }
}

