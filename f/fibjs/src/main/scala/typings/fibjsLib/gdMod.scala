package typings
package fibjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** module Or Internal Object */
/**
	* @brief 图像文件处理模块
	* @detail 基础模块。可用于创建和操作图像文件，引用方式：,```JavaScript,var gd = require('gd');,```
	*/
@JSImport("gd", JSImport.Namespace)
@js.native
object gdMod extends js.Object {
  val ARC: fibjsLib.fibjsLibNumbers.`0` = js.native
  val BMP: fibjsLib.fibjsLibNumbers.`5` = js.native
  val BOTH: fibjsLib.fibjsLibNumbers.`3` = js.native
  val BRIGHTNESS: fibjsLib.fibjsLibNumbers.`8` = js.native
  val CHORD: fibjsLib.fibjsLibNumbers.`1` = js.native
  val COLORIZE: fibjsLib.fibjsLibNumbers.`10` = js.native
  val CONTRAST: fibjsLib.fibjsLibNumbers.`9` = js.native
  val EDGED: fibjsLib.fibjsLibNumbers.`4` = js.native
  val EDGEDETECT: fibjsLib.fibjsLibNumbers.`1` = js.native
  val EMBOSS: fibjsLib.fibjsLibNumbers.`2` = js.native
  val GAUSSIAN_BLUR: fibjsLib.fibjsLibNumbers.`4` = js.native
  val GIF: fibjsLib.fibjsLibNumbers.`2` = js.native
  val GRAYSCALE: fibjsLib.fibjsLibNumbers.`6` = js.native
  val HORIZONTAL: fibjsLib.fibjsLibNumbers.`1` = js.native
  val JPEG: fibjsLib.fibjsLibNumbers.`1` = js.native
  val LEFT: fibjsLib.fibjsLibNumbers.`1` = js.native
  val MEAN_REMOVAL: fibjsLib.fibjsLibNumbers.`0` = js.native
  val NEGATE: fibjsLib.fibjsLibNumbers.`5` = js.native
  val NOFILL: fibjsLib.fibjsLibNumbers.`2` = js.native
  val NONE: fibjsLib.fibjsLibNumbers.`0` = js.native
  val PALETTE: fibjsLib.fibjsLibNumbers.`1` = js.native
  val PNG: fibjsLib.fibjsLibNumbers.`3` = js.native
  val RIGHT: fibjsLib.fibjsLibNumbers.`2` = js.native
  val SELECTIVE_BLUR: fibjsLib.fibjsLibNumbers.`3` = js.native
  val SMOOTH: fibjsLib.fibjsLibNumbers.`7` = js.native
  val TIFF: fibjsLib.fibjsLibNumbers.`4` = js.native
  val TRUECOLOR: fibjsLib.fibjsLibNumbers.`0` = js.native
  val VERTICAL: fibjsLib.fibjsLibNumbers.`2` = js.native
  val WEBP: fibjsLib.fibjsLibNumbers.`6` = js.native
  def color(color: java.lang.String): scala.Double = js.native
  def create(width: scala.Double, height: scala.Double): fibjsLib.Class_Image = js.native
  def create(width: scala.Double, height: scala.Double, color: scala.Double): fibjsLib.Class_Image = js.native
  def hsb(hue: scala.Double, saturation: scala.Double, brightness: scala.Double): scala.Double = js.native
  def hsba(hue: scala.Double, saturation: scala.Double, brightness: scala.Double, alpha: scala.Double): scala.Double = js.native
  def hsl(hue: scala.Double, saturation: scala.Double, lightness: scala.Double): scala.Double = js.native
  def hsla(hue: scala.Double, saturation: scala.Double, lightness: scala.Double, alpha: scala.Double): scala.Double = js.native
  def load(data: fibjsLib.Class_Buffer): fibjsLib.Class_Image = js.native
  def load(fname: java.lang.String): fibjsLib.Class_Image = js.native
  def load(stm: fibjsLib.Class_SeekableStream): fibjsLib.Class_Image = js.native
  def rgb(red: scala.Double, green: scala.Double, blue: scala.Double): scala.Double = js.native
  def rgba(red: scala.Double, green: scala.Double, blue: scala.Double, alpha: scala.Double): scala.Double = js.native
}

