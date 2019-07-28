package typings.electron.ElectronNs

import typings.electron.electronStrings.available
import typings.electron.electronStrings.unavailable
import typings.electron.electronStrings.unknown
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Display extends js.Object {
  // Docs: http://electronjs.org/docs/api/structures/display
  var bounds: Rectangle
  /**
    * Unique identifier associated with the display.
    */
  var id: Double
  /**
    * Can be 0, 90, 180, 270, represents screen rotation in clock-wise degrees.
    */
  var rotation: Double
  /**
    * Output device's pixel scale factor.
    */
  var scaleFactor: Double
  var size: Size
  /**
    * Can be available, unavailable, unknown.
    */
  var touchSupport: available | unavailable | unknown
  var workArea: Rectangle
  var workAreaSize: Size
}

object Display {
  @scala.inline
  def apply(
    bounds: Rectangle,
    id: Double,
    rotation: Double,
    scaleFactor: Double,
    size: Size,
    touchSupport: available | unavailable | unknown,
    workArea: Rectangle,
    workAreaSize: Size
  ): Display = {
    val __obj = js.Dynamic.literal(bounds = bounds, id = id, rotation = rotation, scaleFactor = scaleFactor, size = size, touchSupport = touchSupport.asInstanceOf[js.Any], workArea = workArea, workAreaSize = workAreaSize)
  
    __obj.asInstanceOf[Display]
  }
}

