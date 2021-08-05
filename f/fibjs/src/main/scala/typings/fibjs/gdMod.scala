package typings.fibjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** module Or Internal Object */
/**
  * @brief 图像文件处理模块
  * @detail 基础模块。可用于创建和操作图像文件，引用方式：,```JavaScript,var gd = require('gd');,```
  */
object gdMod {
  
  @JSImport("gd", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
  
  inline def color(color: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("color")(color.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def create(width: Double, height: Double): ClassImage = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[ClassImage]
  inline def create(width: Double, height: Double, color: Double): ClassImage = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[ClassImage]
  
  inline def hsb(hue: Double, saturation: Double, brightness: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("hsb")(hue.asInstanceOf[js.Any], saturation.asInstanceOf[js.Any], brightness.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def hsba(hue: Double, saturation: Double, brightness: Double, alpha: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("hsba")(hue.asInstanceOf[js.Any], saturation.asInstanceOf[js.Any], brightness.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def hsl(hue: Double, saturation: Double, lightness: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("hsl")(hue.asInstanceOf[js.Any], saturation.asInstanceOf[js.Any], lightness.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def hsla(hue: Double, saturation: Double, lightness: Double, alpha: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("hsla")(hue.asInstanceOf[js.Any], saturation.asInstanceOf[js.Any], lightness.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def load(data: ClassBuffer): ClassImage = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(data.asInstanceOf[js.Any]).asInstanceOf[ClassImage]
  inline def load(fname: String): ClassImage = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(fname.asInstanceOf[js.Any]).asInstanceOf[ClassImage]
  inline def load(stm: ClassSeekableStream): ClassImage = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(stm.asInstanceOf[js.Any]).asInstanceOf[ClassImage]
  
  inline def rgb(red: Double, green: Double, blue: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("rgb")(red.asInstanceOf[js.Any], green.asInstanceOf[js.Any], blue.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def rgba(red: Double, green: Double, blue: Double, alpha: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("rgba")(red.asInstanceOf[js.Any], green.asInstanceOf[js.Any], blue.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[Double]
}
