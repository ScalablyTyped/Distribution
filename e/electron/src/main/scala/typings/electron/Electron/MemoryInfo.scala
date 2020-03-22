package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MemoryInfo extends js.Object {
  // Docs: http://electronjs.org/docs/api/structures/memory-info
  /**
    * The maximum amount of memory that has ever been pinned to actual physical RAM.
    */
  var peakWorkingSetSize: Double
  /**
    * The amount of memory not shared by other processes, such as JS heap or HTML
    * content.
    *
    * @platform win32
    */
  var privateBytes: js.UndefOr[Double] = js.undefined
  /**
    * The amount of memory currently pinned to actual physical RAM.
    */
  var workingSetSize: Double
}

object MemoryInfo {
  @scala.inline
  def apply(peakWorkingSetSize: Double, workingSetSize: Double, privateBytes: Int | Double = null): MemoryInfo = {
    val __obj = js.Dynamic.literal(peakWorkingSetSize = peakWorkingSetSize.asInstanceOf[js.Any], workingSetSize = workingSetSize.asInstanceOf[js.Any])
    if (privateBytes != null) __obj.updateDynamic("privateBytes")(privateBytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemoryInfo]
  }
}

