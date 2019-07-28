package typings.fabric.fabricDashImplMod

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
@JSImport("fabric/fabric-impl", "Color")
@js.native
object Color extends js.Object {
  /**
  	 * Returns new color object, when given a color in HEX format
  	 * @param color Color value ex: FF5555
  	 */
  def fromHex(color: String): Color = js.native
  /**
  	 * Returns new color object, when given a color in HSL format
  	 * @param color Color value ex: hsl(0-260,0%-100%,0%-100%)
  	 */
  def fromHsl(color: String): Color = js.native
  /**
  	 * Returns new color object, when given a color in HSLA format
  	 * @param color Color value ex: hsl(0-260,0%-100%,0%-100%)
  	 */
  def fromHsla(color: String): Color = js.native
  /**
  	 * Returns new color object, when given a color in RGB format
  	 * @param color Color value ex: rgb(0-255,0-255,0-255)
  	 */
  def fromRgb(color: String): Color = js.native
  /**
  	 * Returns new color object, when given a color in RGBA format
  	 * @param color Color value ex: rgb(0-255,0-255,0-255)
  	 */
  def fromRgba(color: String): Color = js.native
  /**
  	 * Returns new color object, when given color in array representation (ex: [200, 100, 100, 0.5])
  	 */
  def fromSource(source: js.Array[Double]): Color = js.native
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

