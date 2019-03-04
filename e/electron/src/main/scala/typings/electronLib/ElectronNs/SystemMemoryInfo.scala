package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SystemMemoryInfo extends js.Object {
  /**
    * The total amount of memory not being used by applications or disk cache.
    */
  var free: scala.Double
  /**
    * The free amount of swap memory in Kilobytes available to the system.
    */
  var swapFree: scala.Double
  /**
    * The total amount of swap memory in Kilobytes available to the system.
    */
  var swapTotal: scala.Double
  /**
    * The total amount of physical memory in Kilobytes available to the system.
    */
  var total: scala.Double
}

object SystemMemoryInfo {
  @scala.inline
  def apply(free: scala.Double, swapFree: scala.Double, swapTotal: scala.Double, total: scala.Double): SystemMemoryInfo = {
    val __obj = js.Dynamic.literal(free = free, swapFree = swapFree, swapTotal = swapTotal, total = total)
  
    __obj.asInstanceOf[SystemMemoryInfo]
  }
}

