package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ProcessMemoryInfo extends js.Object {
  /**
       * The maximum amount of memory that has ever been pinned to actual physical RAM.
       */
  var peakWorkingSetSize: scala.Double
  /**
       * The amount of memory not shared by other processes, such as JS heap or HTML
       * content.
       */
  var privateBytes: scala.Double
  /**
       * The amount of memory shared between processes, typically memory consumed by the
       * Electron code itself.
       */
  var sharedBytes: scala.Double
  /**
       * The amount of memory currently pinned to actual physical RAM.
       */
  var workingSetSize: scala.Double
}

