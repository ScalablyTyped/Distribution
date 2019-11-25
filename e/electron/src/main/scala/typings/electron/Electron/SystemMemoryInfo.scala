package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SystemMemoryInfo extends js.Object {
  /**
    * The total amount of memory not being used by applications or disk cache.
    */
  var free: Double
  /**
    * The free amount of swap memory in Kilobytes available to the system.
    */
  var swapFree: Double
  /**
    * The total amount of swap memory in Kilobytes available to the system.
    */
  var swapTotal: Double
  /**
    * The total amount of physical memory in Kilobytes available to the system.
    */
  var total: Double
}

object SystemMemoryInfo {
  @scala.inline
  def apply(free: Double, swapFree: Double, swapTotal: Double, total: Double): SystemMemoryInfo = {
    val __obj = js.Dynamic.literal(free = free.asInstanceOf[js.Any], swapFree = swapFree.asInstanceOf[js.Any], swapTotal = swapTotal.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SystemMemoryInfo]
  }
}

