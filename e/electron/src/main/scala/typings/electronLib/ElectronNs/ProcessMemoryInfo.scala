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

