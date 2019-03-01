package typings
package fabricLib.fabricDashImplMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fabric/fabric-impl", "Color")
@js.native
/**
	 * Color class
	 * The purpose of Color is to abstract and encapsulate common color operations;
	 * @param color optional in hex or rgb(a) format
	 */
class Color () extends js.Object {
  def this(color: java.lang.String) = this()
  /**
  	 * Gets value of alpha channel for this color
  	 */
  def getAlpha(): scala.Double = js.native
  /**
  	 * Returns source of this color (where source is an array representation; ex: [200, 200, 100, 1])
  	 */
  def getSource(): js.Array[scala.Double] = js.native
  def overlayWith(otherColor: Color): Color = js.native
  /**
  	 * Overlays color with another color
  	 */
  def overlayWith(otherColor: java.lang.String): Color = js.native
  /**
  	 * Sets value of alpha channel for this color
  	 * @param alpha Alpha value 0-1
  	 */
  def setAlpha(alpha: scala.Double): scala.Unit = js.native
  /**
  	 * Sets source of this color (where source is an array representation; ex: [200, 200, 100, 1])
  	 */
  def setSource(source: js.Array[scala.Double]): scala.Unit = js.native
  /**
  	 * Transforms color to its black and white representation
  	 */
  def toBlackWhite(threshold: scala.Double): Color = js.native
  /**
  	 * Transforms color to its grayscale representation
  	 */
  def toGrayscale(): Color = js.native
  /**
  	 * Returns color represenation in HEX format ex: FF5555
  	 */
  def toHex(): java.lang.String = js.native
  /**
  	 * Returns color representation in HEXA format
  	 * @return {String} ex: FF5555CC
  	 */
  def toHexa(): java.lang.String = js.native
  /**
  	 * Returns color represenation in HSL format ex: hsl(0-360,0%-100%,0%-100%)
  	 */
  def toHsl(): java.lang.String = js.native
  /**
  	 * Returns color represenation in HSLA format ex: hsla(0-360,0%-100%,0%-100%,0-1)
  	 */
  def toHsla(): java.lang.String = js.native
  /**
  	 * Returns color represenation in RGB format ex: rgb(0-255,0-255,0-255)
  	 */
  def toRgb(): java.lang.String = js.native
  /**
  	 * Returns color represenation in RGBA format ex: rgba(0-255,0-255,0-255,0-1)
  	 */
  def toRgba(): java.lang.String = js.native
}

/* static members */
@JSImport("fabric/fabric-impl", "Color")
@js.native
object Color extends js.Object {
  /**
  	 * Returns new color object, when given a color in HEX format
  	 * @param color Color value ex: FF5555
  	 */
  def fromHex(color: java.lang.String): fabricLib.fabricDashImplMod.Color = js.native
  /**
  	 * Returns new color object, when given a color in HSL format
  	 * @param color Color value ex: hsl(0-260,0%-100%,0%-100%)
  	 */
  def fromHsl(color: java.lang.String): fabricLib.fabricDashImplMod.Color = js.native
  /**
  	 * Returns new color object, when given a color in HSLA format
  	 * @param color Color value ex: hsl(0-260,0%-100%,0%-100%)
  	 */
  def fromHsla(color: java.lang.String): fabricLib.fabricDashImplMod.Color = js.native
  /**
  	 * Returns new color object, when given a color in RGB format
  	 * @param color Color value ex: rgb(0-255,0-255,0-255)
  	 */
  def fromRgb(color: java.lang.String): fabricLib.fabricDashImplMod.Color = js.native
  /**
  	 * Returns new color object, when given a color in RGBA format
  	 * @param color Color value ex: rgb(0-255,0-255,0-255)
  	 */
  def fromRgba(color: java.lang.String): fabricLib.fabricDashImplMod.Color = js.native
  /**
  	 * Returns new color object, when given color in array representation (ex: [200, 100, 100, 0.5])
  	 */
  def fromSource(source: js.Array[scala.Double]): fabricLib.fabricDashImplMod.Color = js.native
  /**
  	 * Returns array represenatation (ex: [100, 100, 200, 1]) of a color that's in HEX format
  	 * @param color ex: FF5555
  	 */
  def sourceFromHex(color: java.lang.String): js.Array[scala.Double] = js.native
  /**
  	 * Returns array represenatation (ex: [100, 100, 200, 1]) of a color that's in HSL or HSLA format.
  	 * @param color Color value ex: hsl(0-360,0%-100%,0%-100%) or hsla(0-360,0%-100%,0%-100%, 0-1)
  	 */
  def sourceFromHsl(color: java.lang.String): js.Array[scala.Double] = js.native
  /**
  	 * Returns array represenatation (ex: [100, 100, 200, 1]) of a color that's in RGB or RGBA format
  	 * @param color Color value ex: rgb(0-255,0-255,0-255), rgb(0%-100%,0%-100%,0%-100%)
  	 */
  def sourceFromRgb(color: java.lang.String): js.Array[scala.Double] = js.native
}

