package typings.fibjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** module Or Internal Object */
/**
  * @brief 图像文件处理模块
  * @detail 基础模块。可用于创建和操作图像文件，引用方式：,```JavaScript,var gd = require('gd');,```
  */
object gdMod {
  
  @JSImport("gd", "ARC")
  @js.native
  val ARC: /* 0 */ Double = js.native
  
  @JSImport("gd", "BMP")
  @js.native
  val BMP: /* 5 */ Double = js.native
  
  @JSImport("gd", "BOTH")
  @js.native
  val BOTH: /* 3 */ Double = js.native
  
  @JSImport("gd", "BRIGHTNESS")
  @js.native
  val BRIGHTNESS: /* 8 */ Double = js.native
  
  @JSImport("gd", "CHORD")
  @js.native
  val CHORD: /* 1 */ Double = js.native
  
  @JSImport("gd", "COLORIZE")
  @js.native
  val COLORIZE: /* 10 */ Double = js.native
  
  @JSImport("gd", "CONTRAST")
  @js.native
  val CONTRAST: /* 9 */ Double = js.native
  
  @JSImport("gd", "EDGED")
  @js.native
  val EDGED: /* 4 */ Double = js.native
  
  @JSImport("gd", "EDGEDETECT")
  @js.native
  val EDGEDETECT: /* 1 */ Double = js.native
  
  @JSImport("gd", "EMBOSS")
  @js.native
  val EMBOSS: /* 2 */ Double = js.native
  
  @JSImport("gd", "GAUSSIAN_BLUR")
  @js.native
  val GAUSSIAN_BLUR: /* 4 */ Double = js.native
  
  @JSImport("gd", "GIF")
  @js.native
  val GIF: /* 2 */ Double = js.native
  
  @JSImport("gd", "GRAYSCALE")
  @js.native
  val GRAYSCALE: /* 6 */ Double = js.native
  
  @JSImport("gd", "HORIZONTAL")
  @js.native
  val HORIZONTAL: /* 1 */ Double = js.native
  
  @JSImport("gd", "JPEG")
  @js.native
  val JPEG: /* 1 */ Double = js.native
  
  @JSImport("gd", "LEFT")
  @js.native
  val LEFT: /* 1 */ Double = js.native
  
  @JSImport("gd", "MEAN_REMOVAL")
  @js.native
  val MEAN_REMOVAL: /* 0 */ Double = js.native
  
  @JSImport("gd", "NEGATE")
  @js.native
  val NEGATE: /* 5 */ Double = js.native
  
  @JSImport("gd", "NOFILL")
  @js.native
  val NOFILL: /* 2 */ Double = js.native
  
  @JSImport("gd", "NONE")
  @js.native
  val NONE: /* 0 */ Double = js.native
  
  @JSImport("gd", "PALETTE")
  @js.native
  val PALETTE: /* 1 */ Double = js.native
  
  @JSImport("gd", "PNG")
  @js.native
  val PNG: /* 3 */ Double = js.native
  
  @JSImport("gd", "RIGHT")
  @js.native
  val RIGHT: /* 2 */ Double = js.native
  
  @JSImport("gd", "SELECTIVE_BLUR")
  @js.native
  val SELECTIVE_BLUR: /* 3 */ Double = js.native
  
  @JSImport("gd", "SMOOTH")
  @js.native
  val SMOOTH: /* 7 */ Double = js.native
  
  @JSImport("gd", "TIFF")
  @js.native
  val TIFF: /* 4 */ Double = js.native
  
  @JSImport("gd", "TRUECOLOR")
  @js.native
  val TRUECOLOR: /* 0 */ Double = js.native
  
  @JSImport("gd", "VERTICAL")
  @js.native
  val VERTICAL: /* 2 */ Double = js.native
  
  @JSImport("gd", "WEBP")
  @js.native
  val WEBP: /* 6 */ Double = js.native
  
  @JSImport("gd", "color")
  @js.native
  def color(color: String): Double = js.native
  
  @JSImport("gd", "create")
  @js.native
  def create(width: Double, height: Double): ClassImage = js.native
  @JSImport("gd", "create")
  @js.native
  def create(width: Double, height: Double, color: Double): ClassImage = js.native
  
  @JSImport("gd", "hsb")
  @js.native
  def hsb(hue: Double, saturation: Double, brightness: Double): Double = js.native
  
  @JSImport("gd", "hsba")
  @js.native
  def hsba(hue: Double, saturation: Double, brightness: Double, alpha: Double): Double = js.native
  
  @JSImport("gd", "hsl")
  @js.native
  def hsl(hue: Double, saturation: Double, lightness: Double): Double = js.native
  
  @JSImport("gd", "hsla")
  @js.native
  def hsla(hue: Double, saturation: Double, lightness: Double, alpha: Double): Double = js.native
  
  @JSImport("gd", "load")
  @js.native
  def load(data: ClassBuffer): ClassImage = js.native
  @JSImport("gd", "load")
  @js.native
  def load(fname: String): ClassImage = js.native
  @JSImport("gd", "load")
  @js.native
  def load(stm: ClassSeekableStream): ClassImage = js.native
  
  @JSImport("gd", "rgb")
  @js.native
  def rgb(red: Double, green: Double, blue: Double): Double = js.native
  
  @JSImport("gd", "rgba")
  @js.native
  def rgba(red: Double, green: Double, blue: Double, alpha: Double): Double = js.native
}
