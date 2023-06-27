package typings.fabric.fabricImplMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fabric/fabric-impl", "Color")
@js.native
/**
  * Color class
  * The purpose of Color is to abstract and encapsulate common color operations;
  * @param color optional in hex or rgb(a) format
  */
open class Color () extends StObject {
  def this(color: String) = this()
  
  /**
    * Gets value of alpha channel for this color
    */
  def getAlpha(): Double = js.native
  
  /**
    * Returns source of this color (where source is an array representation; ex: [200, 200, 100, 1])
    */
  def getSource(): js.Array[Double] = js.native
  
  /**
    * Overlays color with another color
    */
  def overlayWith(otherColor: String): Color = js.native
  def overlayWith(otherColor: Color): Color = js.native
  
  /**
    * Sets value of alpha channel for this color
    * @param alpha Alpha value 0-1
    */
  def setAlpha(alpha: Double): Unit = js.native
  
  /**
    * Sets source of this color (where source is an array representation; ex: [200, 200, 100, 1])
    */
  def setSource(source: js.Array[Double]): Unit = js.native
  
  /**
    * Transforms color to its black and white representation
    */
  def toBlackWhite(threshold: Double): Color = js.native
  
  /**
    * Transforms color to its grayscale representation
    */
  def toGrayscale(): Color = js.native
  
  /**
    * Returns color represenation in HEX format ex: FF5555
    */
  def toHex(): String = js.native
  
  /**
    * Returns color representation in HEXA format
    * @return {String} ex: FF5555CC
    */
  def toHexa(): String = js.native
  
  /**
    * Returns color represenation in HSL format ex: hsl(0-360,0%-100%,0%-100%)
    */
  def toHsl(): String = js.native
  
  /**
    * Returns color represenation in HSLA format ex: hsla(0-360,0%-100%,0%-100%,0-1)
    */
  def toHsla(): String = js.native
  
  /**
    * Returns color represenation in RGB format ex: rgb(0-255,0-255,0-255)
    */
  def toRgb(): String = js.native
  
  /**
    * Returns color represenation in RGBA format ex: rgba(0-255,0-255,0-255,0-1)
    */
  def toRgba(): String = js.native
}
/* static members */
object Color {
  
  @JSImport("fabric/fabric-impl", "Color")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Returns new color object, when given a color in HEX format
    * @param color Color value ex: FF5555
    */
  inline def fromHex(color: String): Color = ^.asInstanceOf[js.Dynamic].applyDynamic("fromHex")(color.asInstanceOf[js.Any]).asInstanceOf[Color]
  
  /**
    * Returns new color object, when given a color in HSL format
    * @param color Color value ex: hsl(0-260,0%-100%,0%-100%)
    */
  inline def fromHsl(color: String): Color = ^.asInstanceOf[js.Dynamic].applyDynamic("fromHsl")(color.asInstanceOf[js.Any]).asInstanceOf[Color]
  
  /**
    * Returns new color object, when given a color in HSLA format
    * @param color Color value ex: hsl(0-260,0%-100%,0%-100%)
    */
  inline def fromHsla(color: String): Color = ^.asInstanceOf[js.Dynamic].applyDynamic("fromHsla")(color.asInstanceOf[js.Any]).asInstanceOf[Color]
  
  /**
    * Returns new color object, when given a color in RGB format
    * @param color Color value ex: rgb(0-255,0-255,0-255)
    */
  inline def fromRgb(color: String): Color = ^.asInstanceOf[js.Dynamic].applyDynamic("fromRgb")(color.asInstanceOf[js.Any]).asInstanceOf[Color]
  
  /**
    * Returns new color object, when given a color in RGBA format
    * @param color Color value ex: rgb(0-255,0-255,0-255)
    */
  inline def fromRgba(color: String): Color = ^.asInstanceOf[js.Dynamic].applyDynamic("fromRgba")(color.asInstanceOf[js.Any]).asInstanceOf[Color]
  
  /**
    * Returns new color object, when given color in array representation (ex: [200, 100, 100, 0.5])
    */
  inline def fromSource(source: js.Array[Double]): Color = ^.asInstanceOf[js.Dynamic].applyDynamic("fromSource")(source.asInstanceOf[js.Any]).asInstanceOf[Color]
  
  /**
    * Regex matching color in HSL or HSLA formats (ex: hsl(200, 80%, 10%), hsla(300, 50%, 80%, 0.5), hsla( 300 , 50% , 80% , 0.5 ))
    * @static
    * @field
    */
  @JSImport("fabric/fabric-impl", "Color.reHSLa")
  @js.native
  def reHSLa: js.RegExp = js.native
  inline def reHSLa_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("reHSLa")(x.asInstanceOf[js.Any])
  
  /**
    * Regex matching color in HEX format (ex: #FF5544CC, #FF5555, 010155, aff)
    * @static
    * @field
    */
  @JSImport("fabric/fabric-impl", "Color.reHex")
  @js.native
  def reHex: js.RegExp = js.native
  inline def reHex_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("reHex")(x.asInstanceOf[js.Any])
  
  /**
    * Regex matching color in RGB or RGBA formats (ex: rgb(0, 0, 0), rgba(255, 100, 10, 0.5), rgba( 255 , 100 , 10 , 0.5 ), rgb(1,1,1), rgba(100%, 60%, 10%, 0.5))
    * @static
    * @field
    */
  @JSImport("fabric/fabric-impl", "Color.reRGBa")
  @js.native
  def reRGBa: js.RegExp = js.native
  inline def reRGBa_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("reRGBa")(x.asInstanceOf[js.Any])
  
  /**
    * Returns array represenatation (ex: [100, 100, 200, 1]) of a color that's in HEX format
    * @param color ex: FF5555
    */
  inline def sourceFromHex(color: String): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("sourceFromHex")(color.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  
  /**
    * Returns array represenatation (ex: [100, 100, 200, 1]) of a color that's in HSL or HSLA format.
    * @param color Color value ex: hsl(0-360,0%-100%,0%-100%) or hsla(0-360,0%-100%,0%-100%, 0-1)
    */
  inline def sourceFromHsl(color: String): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("sourceFromHsl")(color.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  
  /**
    * Returns array represenatation (ex: [100, 100, 200, 1]) of a color that's in RGB or RGBA format
    * @param color Color value ex: rgb(0-255,0-255,0-255), rgb(0%-100%,0%-100%,0%-100%)
    */
  inline def sourceFromRgb(color: String): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("sourceFromRgb")(color.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
}
