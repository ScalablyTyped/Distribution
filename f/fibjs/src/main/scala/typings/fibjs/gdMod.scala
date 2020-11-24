package typings.fibjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** module Or Internal Object */
/**
  * @brief 图像文件处理模块
  * @detail 基础模块。可用于创建和操作图像文件，引用方式：,```JavaScript,var gd = require('gd');,```
  */
@JSImport("gd", JSImport.Namespace)
@js.native
object gdMod extends js.Object {
  
  val ARC: /* 0 */ Double = js.native
  
  val BMP: /* 5 */ Double = js.native
  
  val BOTH: /* 3 */ Double = js.native
  
  val BRIGHTNESS: /* 8 */ Double = js.native
  
  val CHORD: /* 1 */ Double = js.native
  
  val COLORIZE: /* 10 */ Double = js.native
  
  val CONTRAST: /* 9 */ Double = js.native
  
  val EDGED: /* 4 */ Double = js.native
  
  val EDGEDETECT: /* 1 */ Double = js.native
  
  val EMBOSS: /* 2 */ Double = js.native
  
  val GAUSSIAN_BLUR: /* 4 */ Double = js.native
  
  val GIF: /* 2 */ Double = js.native
  
  val GRAYSCALE: /* 6 */ Double = js.native
  
  val HORIZONTAL: /* 1 */ Double = js.native
  
  val JPEG: /* 1 */ Double = js.native
  
  val LEFT: /* 1 */ Double = js.native
  
  val MEAN_REMOVAL: /* 0 */ Double = js.native
  
  val NEGATE: /* 5 */ Double = js.native
  
  val NOFILL: /* 2 */ Double = js.native
  
  val NONE: /* 0 */ Double = js.native
  
  val PALETTE: /* 1 */ Double = js.native
  
  val PNG: /* 3 */ Double = js.native
  
  val RIGHT: /* 2 */ Double = js.native
  
  val SELECTIVE_BLUR: /* 3 */ Double = js.native
  
  val SMOOTH: /* 7 */ Double = js.native
  
  val TIFF: /* 4 */ Double = js.native
  
  val TRUECOLOR: /* 0 */ Double = js.native
  
  val VERTICAL: /* 2 */ Double = js.native
  
  val WEBP: /* 6 */ Double = js.native
  
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
