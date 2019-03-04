package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MemoryUsageDetails extends js.Object {
  // Docs: http://electronjs.org/docs/api/structures/memory-usage-details
  var count: scala.Double
  var liveSize: scala.Double
  var size: scala.Double
}

object MemoryUsageDetails {
  @scala.inline
  def apply(count: scala.Double, liveSize: scala.Double, size: scala.Double): MemoryUsageDetails = {
    val __obj = js.Dynamic.literal(count = count, liveSize = liveSize, size = size)
  
    __obj.asInstanceOf[MemoryUsageDetails]
  }
}

