package typings.easeljs.createjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColorMatrix extends js.Object {
  // methods
  def adjustBrightness(value: Double): ColorMatrix = js.native
  def adjustColor(brightness: Double, contrast: Double, saturation: Double, hue: Double): ColorMatrix = js.native
  def adjustContrast(value: Double): ColorMatrix = js.native
  def adjustHue(value: Double): ColorMatrix = js.native
  def adjustSaturation(value: Double): ColorMatrix = js.native
  def concat(matrix: Double*): ColorMatrix = js.native
  def concat(matrix: ColorMatrix): ColorMatrix = js.native
  def copy(matrix: Double*): ColorMatrix = js.native
  def copy(matrix: ColorMatrix): ColorMatrix = js.native
  def reset(): ColorMatrix = js.native
  def setColor(brightness: Double, contrast: Double, saturation: Double, hue: Double): ColorMatrix = js.native
  def toArray(): js.Array[Double] = js.native
}

