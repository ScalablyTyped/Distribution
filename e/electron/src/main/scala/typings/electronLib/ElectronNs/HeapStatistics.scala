package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeapStatistics extends js.Object {
  var doesZapGarbage: scala.Boolean
  var heapSizeLimit: scala.Double
  var mallocedMemory: scala.Double
  var peakMallocedMemory: scala.Double
  var totalAvailableSize: scala.Double
  var totalHeapSize: scala.Double
  var totalHeapSizeExecutable: scala.Double
  var totalPhysicalSize: scala.Double
  var usedHeapSize: scala.Double
}

object HeapStatistics {
  @scala.inline
  def apply(
    doesZapGarbage: scala.Boolean,
    heapSizeLimit: scala.Double,
    mallocedMemory: scala.Double,
    peakMallocedMemory: scala.Double,
    totalAvailableSize: scala.Double,
    totalHeapSize: scala.Double,
    totalHeapSizeExecutable: scala.Double,
    totalPhysicalSize: scala.Double,
    usedHeapSize: scala.Double
  ): HeapStatistics = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("doesZapGarbage")(doesZapGarbage)
    __obj.updateDynamic("heapSizeLimit")(heapSizeLimit)
    __obj.updateDynamic("mallocedMemory")(mallocedMemory)
    __obj.updateDynamic("peakMallocedMemory")(peakMallocedMemory)
    __obj.updateDynamic("totalAvailableSize")(totalAvailableSize)
    __obj.updateDynamic("totalHeapSize")(totalHeapSize)
    __obj.updateDynamic("totalHeapSizeExecutable")(totalHeapSizeExecutable)
    __obj.updateDynamic("totalPhysicalSize")(totalPhysicalSize)
    __obj.updateDynamic("usedHeapSize")(usedHeapSize)
    __obj.asInstanceOf[HeapStatistics]
  }
}

