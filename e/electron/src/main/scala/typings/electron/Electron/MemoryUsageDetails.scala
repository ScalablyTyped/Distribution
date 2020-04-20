package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MemoryUsageDetails extends js.Object {
  // Docs: http://electronjs.org/docs/api/structures/memory-usage-details
  var count: Double
  var liveSize: Double
  var size: Double
}

object MemoryUsageDetails {
  @scala.inline
  def apply(count: Double, liveSize: Double, size: Double): MemoryUsageDetails = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], liveSize = liveSize.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemoryUsageDetails]
  }
}

