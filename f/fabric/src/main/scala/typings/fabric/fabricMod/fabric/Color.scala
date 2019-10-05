package typings.fabric.fabricMod.fabric

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fabric", "fabric.Color")
@js.native
/**
	 * Color class
	 * The purpose of Color is to abstract and encapsulate common color operations;
	 * @param color optional in hex or rgb(a) format
	 */
class Color ()
  extends typings.fabric.fabricDashImplMod.Color {
  def this(color: String) = this()
}

/* static members */
@JSImport("fabric", "fabric.Color")
@js.native
object Color extends js.Object {
  /**
  	 * Returns new color object, when given a color in HEX format
  	 * @param color Color value ex: FF5555
  	 */
  def fromHex(color: String): typings.fabric.fabricDashImplMod.Color = js.native
  /**
  	 * Returns new color object, when given a color in HSL format
  	 * @param color Color value ex: hsl(0-260,0%-100%,0%-100%)
  	 */
  def fromHsl(color: String): typings.fabric.fabricDashImplMod.Color = js.native
  /**
  	 * Returns new color object, when given a color in HSLA format
  	 * @param color Color value ex: hsl(0-260,0%-100%,0%-100%)
  	 */
  def fromHsla(color: String): typings.fabric.fabricDashImplMod.Color = js.native
  /**
  	 * Returns new color object, when given a color in RGB format
  	 * @param color Color value ex: rgb(0-255,0-255,0-255)
  	 */
  def fromRgb(color: String): typings.fabric.fabricDashImplMod.Color = js.native
  /**
  	 * Returns new color object, when given a color in RGBA format
  	 * @param color Color value ex: rgb(0-255,0-255,0-255)
  	 */
  def fromRgba(color: String): typings.fabric.fabricDashImplMod.Color = js.native
  /**
  	 * Returns new color object, when given color in array representation (ex: [200, 100, 100, 0.5])
  	 */
  def fromSource(source: js.Array[Double]): typings.fabric.fabricDashImplMod.Color = js.native
  /**
  	 * Returns array represenatation (ex: [100, 100, 200, 1]) of a color that's in HEX format
  	 * @param color ex: FF5555
  	 */
  def sourceFromHex(color: String): js.Array[Double] = js.native
  /**
  	 * Returns array represenatation (ex: [100, 100, 200, 1]) of a color that's in HSL or HSLA format.
  	 * @param color Color value ex: hsl(0-360,0%-100%,0%-100%) or hsla(0-360,0%-100%,0%-100%, 0-1)
  	 */
  def sourceFromHsl(color: String): js.Array[Double] = js.native
  /**
  	 * Returns array represenatation (ex: [100, 100, 200, 1]) of a color that's in RGB or RGBA format
  	 * @param color Color value ex: rgb(0-255,0-255,0-255), rgb(0%-100%,0%-100%,0%-100%)
  	 */
  def sourceFromRgb(color: String): js.Array[Double] = js.native
}

