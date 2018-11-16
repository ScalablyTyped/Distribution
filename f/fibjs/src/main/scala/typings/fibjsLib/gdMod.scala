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
  val ARC: /* 0 */ scala.Double = js.native
  val BMP: /* 5 */ scala.Double = js.native
  val BOTH: /* 3 */ scala.Double = js.native
  val BRIGHTNESS: /* 8 */ scala.Double = js.native
  val CHORD: /* 1 */ scala.Double = js.native
  val COLORIZE: /* 10 */ scala.Double = js.native
  val CONTRAST: /* 9 */ scala.Double = js.native
  val EDGED: /* 4 */ scala.Double = js.native
  val EDGEDETECT: /* 1 */ scala.Double = js.native
  val EMBOSS: /* 2 */ scala.Double = js.native
  val GAUSSIAN_BLUR: /* 4 */ scala.Double = js.native
  val GIF: /* 2 */ scala.Double = js.native
  val GRAYSCALE: /* 6 */ scala.Double = js.native
  val HORIZONTAL: /* 1 */ scala.Double = js.native
  val JPEG: /* 1 */ scala.Double = js.native
  val LEFT: /* 1 */ scala.Double = js.native
  val MEAN_REMOVAL: /* 0 */ scala.Double = js.native
  val NEGATE: /* 5 */ scala.Double = js.native
  val NOFILL: /* 2 */ scala.Double = js.native
  val NONE: /* 0 */ scala.Double = js.native
  val PALETTE: /* 1 */ scala.Double = js.native
  val PNG: /* 3 */ scala.Double = js.native
  val RIGHT: /* 2 */ scala.Double = js.native
  val SELECTIVE_BLUR: /* 3 */ scala.Double = js.native
  val SMOOTH: /* 7 */ scala.Double = js.native
  val TIFF: /* 4 */ scala.Double = js.native
  val TRUECOLOR: /* 0 */ scala.Double = js.native
  val VERTICAL: /* 2 */ scala.Double = js.native
  val WEBP: /* 6 */ scala.Double = js.native
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

