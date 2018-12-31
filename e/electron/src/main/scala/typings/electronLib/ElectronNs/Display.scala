package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Display extends js.Object {
  // Docs: http://electronjs.org/docs/api/structures/display
  var bounds: Rectangle
  /**
    * Unique identifier associated with the display.
    */
  var id: scala.Double
  /**
    * Can be 0, 90, 180, 270, represents screen rotation in clock-wise degrees.
    */
  var rotation: scala.Double
  /**
    * Output device's pixel scale factor.
    */
  var scaleFactor: scala.Double
  var size: Size
  /**
    * Can be available, unavailable, unknown.
    */
  var touchSupport: electronLib.electronLibStrings.available | electronLib.electronLibStrings.unavailable | electronLib.electronLibStrings.unknown
  var workArea: Rectangle
  var workAreaSize: Size
}

