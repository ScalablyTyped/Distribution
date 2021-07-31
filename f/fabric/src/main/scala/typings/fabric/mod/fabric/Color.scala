package typings.fabric.mod.fabric

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fabric", "fabric.Color")
@js.native
/**
  * Color class
  * The purpose of Color is to abstract and encapsulate common color operations;
  * @param color optional in hex or rgb(a) format
  */
class Color ()
  extends typings.fabric.fabricImplMod.Color {
  def this(color: String) = this()
}
/* static members */
object Color {
  
  @JSImport("fabric", "fabric.Color")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Returns new color object, when given a color in HEX format
    * @param color Color value ex: FF5555
    */
  @scala.inline
  def fromHex(color: String): typings.fabric.fabricImplMod.Color = ^.asInstanceOf[js.Dynamic].applyDynamic("fromHex")(color.asInstanceOf[js.Any]).asInstanceOf[typings.fabric.fabricImplMod.Color]
  
  /**
    * Returns new color object, when given a color in HSL format
    * @param color Color value ex: hsl(0-260,0%-100%,0%-100%)
    */
  @scala.inline
  def fromHsl(color: String): typings.fabric.fabricImplMod.Color = ^.asInstanceOf[js.Dynamic].applyDynamic("fromHsl")(color.asInstanceOf[js.Any]).asInstanceOf[typings.fabric.fabricImplMod.Color]
  
  /**
    * Returns new color object, when given a color in HSLA format
    * @param color Color value ex: hsl(0-260,0%-100%,0%-100%)
    */
  @scala.inline
  def fromHsla(color: String): typings.fabric.fabricImplMod.Color = ^.asInstanceOf[js.Dynamic].applyDynamic("fromHsla")(color.asInstanceOf[js.Any]).asInstanceOf[typings.fabric.fabricImplMod.Color]
  
  /**
    * Returns new color object, when given a color in RGB format
    * @param color Color value ex: rgb(0-255,0-255,0-255)
    */
  @scala.inline
  def fromRgb(color: String): typings.fabric.fabricImplMod.Color = ^.asInstanceOf[js.Dynamic].applyDynamic("fromRgb")(color.asInstanceOf[js.Any]).asInstanceOf[typings.fabric.fabricImplMod.Color]
  
  /**
    * Returns new color object, when given a color in RGBA format
    * @param color Color value ex: rgb(0-255,0-255,0-255)
    */
  @scala.inline
  def fromRgba(color: String): typings.fabric.fabricImplMod.Color = ^.asInstanceOf[js.Dynamic].applyDynamic("fromRgba")(color.asInstanceOf[js.Any]).asInstanceOf[typings.fabric.fabricImplMod.Color]
  
  /**
    * Returns new color object, when given color in array representation (ex: [200, 100, 100, 0.5])
    */
  @scala.inline
  def fromSource(source: js.Array[Double]): typings.fabric.fabricImplMod.Color = ^.asInstanceOf[js.Dynamic].applyDynamic("fromSource")(source.asInstanceOf[js.Any]).asInstanceOf[typings.fabric.fabricImplMod.Color]
  
  /**
    * Regex matching color in HSL or HSLA formats (ex: hsl(200, 80%, 10%), hsla(300, 50%, 80%, 0.5), hsla( 300 , 50% , 80% , 0.5 ))
    * @static
    * @field
    * @memberOf fabric.Color
    */
  @JSImport("fabric", "fabric.Color.reHSLa")
  @js.native
  def reHSLa: RegExp = js.native
  @scala.inline
  def reHSLa_=(x: RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("reHSLa")(x.asInstanceOf[js.Any])
  
  /**
    * Regex matching color in HEX format (ex: #FF5544CC, #FF5555, 010155, aff)
    * @static
    * @field
    * @memberOf fabric.Color
    */
  @JSImport("fabric", "fabric.Color.reHex")
  @js.native
  def reHex: RegExp = js.native
  @scala.inline
  def reHex_=(x: RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("reHex")(x.asInstanceOf[js.Any])
  
  /**
    * Regex matching color in RGB or RGBA formats (ex: rgb(0, 0, 0), rgba(255, 100, 10, 0.5), rgba( 255 , 100 , 10 , 0.5 ), rgb(1,1,1), rgba(100%, 60%, 10%, 0.5))
    * @static
    * @field
    * @memberOf fabric.Color
    */
  @JSImport("fabric", "fabric.Color.reRGBa")
  @js.native
  def reRGBa: RegExp = js.native
  @scala.inline
  def reRGBa_=(x: RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("reRGBa")(x.asInstanceOf[js.Any])
  
  /**
    * Returns array represenatation (ex: [100, 100, 200, 1]) of a color that's in HEX format
    * @param color ex: FF5555
    */
  @scala.inline
  def sourceFromHex(color: String): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("sourceFromHex")(color.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  
  /**
    * Returns array represenatation (ex: [100, 100, 200, 1]) of a color that's in HSL or HSLA format.
    * @param color Color value ex: hsl(0-360,0%-100%,0%-100%) or hsla(0-360,0%-100%,0%-100%, 0-1)
    */
  @scala.inline
  def sourceFromHsl(color: String): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("sourceFromHsl")(color.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  
  /**
    * Returns array represenatation (ex: [100, 100, 200, 1]) of a color that's in RGB or RGBA format
    * @param color Color value ex: rgb(0-255,0-255,0-255), rgb(0%-100%,0%-100%,0%-100%)
    */
  @scala.inline
  def sourceFromRgb(color: String): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("sourceFromRgb")(color.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
}
