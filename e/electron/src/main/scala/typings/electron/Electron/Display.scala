package typings.electron.Electron

import typings.electron.electronStrings.available
import typings.electron.electronStrings.unavailable
import typings.electron.electronStrings.unknown
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Display extends js.Object {
  // Docs: http://electronjs.org/docs/api/structures/display
  /**
    * Can be available, unavailable, unknown.
    */
  var accelerometerSupport: available | unavailable | unknown
  var bounds: Rectangle
  /**
    * The number of bits per pixel.
    */
  var colorDepth: Double
  /**
    * represent a color space (three-dimensional object which contains all realizable
    * color combinations) for the purpose of color conversions
    */
  var colorSpace: String
  /**
    * The number of bits per color component.
    */
  var depthPerComponent: Double
  /**
    * Unique identifier associated with the display.
    */
  var id: Double
  /**
    * true for an internal display and false for an external display
    */
  var internal: Boolean
  /**
    * Whether or not the display is a monochrome display.
    */
  var monochrome: Boolean
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
    accelerometerSupport: available | unavailable | unknown,
    bounds: Rectangle,
    colorDepth: Double,
    colorSpace: String,
    depthPerComponent: Double,
    id: Double,
    internal: Boolean,
    monochrome: Boolean,
    rotation: Double,
    scaleFactor: Double,
    size: Size,
    touchSupport: available | unavailable | unknown,
    workArea: Rectangle,
    workAreaSize: Size
  ): Display = {
    val __obj = js.Dynamic.literal(accelerometerSupport = accelerometerSupport.asInstanceOf[js.Any], bounds = bounds, colorDepth = colorDepth, colorSpace = colorSpace, depthPerComponent = depthPerComponent, id = id, internal = internal, monochrome = monochrome, rotation = rotation, scaleFactor = scaleFactor, size = size, touchSupport = touchSupport.asInstanceOf[js.Any], workArea = workArea, workAreaSize = workAreaSize)
  
    __obj.asInstanceOf[Display]
  }
}

