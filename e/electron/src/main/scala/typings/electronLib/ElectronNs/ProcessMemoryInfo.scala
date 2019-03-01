package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProcessMemoryInfo extends js.Object {
  /**
    * The amount of memory not shared by other processes, such as JS heap or HTML
    * content in Kilobytes.
    */
  var `private`: scala.Double
  /**
    * and The amount of memory currently pinned to actual physical RAM in Kilobytes.
    */
  var residentSet: scala.Double
  /**
    * The amount of memory shared between processes, typically memory consumed by the
    * Electron code itself in Kilobytes.
    */
  var shared: scala.Double
}

object ProcessMemoryInfo {
  @scala.inline
  def apply(`private`: scala.Double, residentSet: scala.Double, shared: scala.Double): ProcessMemoryInfo = {
    val __obj = js.Dynamic.literal(`private` = `private`)
    __obj.updateDynamic("residentSet")(residentSet)
    __obj.updateDynamic("shared")(shared)
    __obj.asInstanceOf[ProcessMemoryInfo]
  }
}

