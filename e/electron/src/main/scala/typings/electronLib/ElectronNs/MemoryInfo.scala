package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MemoryInfo extends js.Object {
  // Docs: http://electronjs.org/docs/api/structures/memory-info
  /**
    * The maximum amount of memory that has ever been pinned to actual physical RAM.
    * On macOS its value will always be 0.
    */
  var peakWorkingSetSize: scala.Double
  /**
    * Process id of the process.
    */
  var pid: scala.Double
  /**
    * The amount of memory not shared by other processes, such as JS heap or HTML
    * content.
    */
  var privateBytes: scala.Double
  /**
    * The amount of memory shared between processes, typically memory consumed by the
    * Electron code itself
    */
  var sharedBytes: scala.Double
  /**
    * The amount of memory currently pinned to actual physical RAM.
    */
  var workingSetSize: scala.Double
}

object MemoryInfo {
  @scala.inline
  def apply(
    peakWorkingSetSize: scala.Double,
    pid: scala.Double,
    privateBytes: scala.Double,
    sharedBytes: scala.Double,
    workingSetSize: scala.Double
  ): MemoryInfo = {
    val __obj = js.Dynamic.literal(peakWorkingSetSize = peakWorkingSetSize, pid = pid, privateBytes = privateBytes, sharedBytes = sharedBytes, workingSetSize = workingSetSize)
  
    __obj.asInstanceOf[MemoryInfo]
  }
}

