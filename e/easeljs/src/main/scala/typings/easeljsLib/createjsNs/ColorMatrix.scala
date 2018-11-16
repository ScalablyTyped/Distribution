package typings
package easeljsLib.createjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("createjs.ColorMatrix")
@js.native
class ColorMatrix () extends js.Object {
  def this(brightness: scala.Double) = this()
  def this(brightness: scala.Double, contrast: scala.Double) = this()
  def this(brightness: scala.Double, contrast: scala.Double, saturation: scala.Double) = this()
  def this(brightness: scala.Double, contrast: scala.Double, saturation: scala.Double, hue: scala.Double) = this()
  // methods
  def adjustBrightness(value: scala.Double): ColorMatrix = js.native
  def adjustColor(brightness: scala.Double, contrast: scala.Double, saturation: scala.Double, hue: scala.Double): ColorMatrix = js.native
  def adjustContrast(value: scala.Double): ColorMatrix = js.native
  def adjustHue(value: scala.Double): ColorMatrix = js.native
  def adjustSaturation(value: scala.Double): ColorMatrix = js.native
  def concat(matrix: scala.Double*): ColorMatrix = js.native
  def concat(matrix: ColorMatrix): ColorMatrix = js.native
  def copy(matrix: scala.Double*): ColorMatrix = js.native
  def copy(matrix: ColorMatrix): ColorMatrix = js.native
  def reset(): ColorMatrix = js.native
  def setColor(brightness: scala.Double, contrast: scala.Double, saturation: scala.Double, hue: scala.Double): ColorMatrix = js.native
  def toArray(): js.Array[scala.Double] = js.native
}

