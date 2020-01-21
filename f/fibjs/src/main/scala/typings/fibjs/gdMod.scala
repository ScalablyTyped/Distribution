package typings.fibjs

import typings.fibjs.fibjsNumbers.`0`
import typings.fibjs.fibjsNumbers.`10`
import typings.fibjs.fibjsNumbers.`1`
import typings.fibjs.fibjsNumbers.`2`
import typings.fibjs.fibjsNumbers.`3`
import typings.fibjs.fibjsNumbers.`4`
import typings.fibjs.fibjsNumbers.`5`
import typings.fibjs.fibjsNumbers.`6`
import typings.fibjs.fibjsNumbers.`7`
import typings.fibjs.fibjsNumbers.`8`
import typings.fibjs.fibjsNumbers.`9`
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
  val ARC: `0` = js.native
  val BMP: `5` = js.native
  val BOTH: `3` = js.native
  val BRIGHTNESS: `8` = js.native
  val CHORD: `1` = js.native
  val COLORIZE: `10` = js.native
  val CONTRAST: `9` = js.native
  val EDGED: `4` = js.native
  val EDGEDETECT: `1` = js.native
  val EMBOSS: `2` = js.native
  val GAUSSIAN_BLUR: `4` = js.native
  val GIF: `2` = js.native
  val GRAYSCALE: `6` = js.native
  val HORIZONTAL: `1` = js.native
  val JPEG: `1` = js.native
  val LEFT: `1` = js.native
  val MEAN_REMOVAL: `0` = js.native
  val NEGATE: `5` = js.native
  val NOFILL: `2` = js.native
  val NONE: `0` = js.native
  val PALETTE: `1` = js.native
  val PNG: `3` = js.native
  val RIGHT: `2` = js.native
  val SELECTIVE_BLUR: `3` = js.native
  val SMOOTH: `7` = js.native
  val TIFF: `4` = js.native
  val TRUECOLOR: `0` = js.native
  val VERTICAL: `2` = js.native
  val WEBP: `6` = js.native
  def color(color: String): Double = js.native
  def create(width: Double, height: Double): ClassImage = js.native
  def create(width: Double, height: Double, color: Double): ClassImage = js.native
  def hsb(hue: Double, saturation: Double, brightness: Double): Double = js.native
  def hsba(hue: Double, saturation: Double, brightness: Double, alpha: Double): Double = js.native
  def hsl(hue: Double, saturation: Double, lightness: Double): Double = js.native
  def hsla(hue: Double, saturation: Double, lightness: Double, alpha: Double): Double = js.native
  def load(data: ClassBuffer): ClassImage = js.native
  def load(fname: String): ClassImage = js.native
  def load(stm: ClassSeekableStream): ClassImage = js.native
  def rgb(red: Double, green: Double, blue: Double): Double = js.native
  def rgba(red: Double, green: Double, blue: Double, alpha: Double): Double = js.native
}

