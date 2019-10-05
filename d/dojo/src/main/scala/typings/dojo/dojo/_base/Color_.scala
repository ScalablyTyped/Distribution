package typings.dojo.dojo._base

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/_base/Color.html
  *
  * Takes a named string, hex string, array of rgb or rgba values,
  * an object with r, g, b, and a properties, or another Color object
  * and creates a new Color instance to work from.
  *
  * @param color
  */
@JSGlobal("dojo._base.Color")
@js.native
class Color_ protected () extends js.Object {
  def this(color: js.Array[_]) = this()
  /**
    *
    */
  var a: Double = js.native
  /**
    *
    */
  var b: Double = js.native
  /**
    *
    */
  var g: Double = js.native
  /**
    * Dictionary list of all CSS named colors, by name. Values are 3-item arrays with corresponding RG and B values.
    *
    */
  var named: js.Object = js.native
  /**
    *
    */
  var r: Double = js.native
  /**
    * Blend colors end and start with weight from 0 to 1, 0.5 being a 50/50 blend,
    * can reuse a previously allocated Color object for the result
    *
    * @param start
    * @param end
    * @param weight
    * @param obj               Optional
    */
  def blendColors(start: Color, end: Color, weight: Double): js.Any = js.native
  def blendColors(start: Color, end: Color, weight: Double, obj: Color): js.Any = js.native
  /**
    * Builds a Color from a 3 or 4 element array, mapping each
    * element in sequence to the rgb(a) values of the color.
    *
    * @param a
    * @param obj               Optional
    */
  def fromArray(a: js.Array[_]): js.Any = js.native
  def fromArray(a: js.Array[_], obj: Color): js.Any = js.native
  /**
    * Converts a hex string with a '#' prefix to a color object.
    * Supports 12-bit #rgb shorthand. Optionally accepts a
    * Color object to update with the parsed value.
    *
    * @param color
    * @param obj               Optional
    */
  def fromHex(color: String): js.Any = js.native
  def fromHex(color: String, obj: Color): js.Any = js.native
  /**
    * get rgb(a) array from css-style color declarations
    * this function can handle all 4 CSS3 Color Module formats: rgb,
    * rgba, hsl, hsla, including rgb(a) with percentage values.
    *
    * @param color
    * @param obj               Optional
    */
  def fromRgb(color: String): js.Any = js.native
  def fromRgb(color: String, obj: Color): js.Any = js.native
  /**
    * Parses str for a color value. Accepts hex, rgb, and rgba
    * style color values.
    * Acceptable input values for str may include arrays of any form
    * accepted by dojo.colorFromArray, hex strings such as "#aaaaaa", or
    * rgb or rgba strings such as "rgb(133, 200, 16)" or "rgba(10, 10,
    * 10, 50)"
    *
    * @param str
    * @param obj               Optional
    */
  def fromString(str: String): js.Any = js.native
  def fromString(str: String, obj: Color): js.Any = js.native
  /**
    * creates a greyscale color with an optional alpha
    *
    * @param g
    * @param a               Optional
    */
  def makeGrey(g: Double): Unit = js.native
  def makeGrey(g: Double, a: Double): Unit = js.native
  /**
    * makes sure that the object has correct attributes
    *
    */
  def sanitize(): Unit = js.native
  /**
    * Takes a named string, hex string, array of rgb or rgba values,
    * an object with r, g, b, and a properties, or another Color object
    * and sets this color instance to that value.
    *
    * @param color
    */
  def setColor(color: String): js.Function = js.native
  /**
    * Takes a named string, hex string, array of rgb or rgba values,
    * an object with r, g, b, and a properties, or another Color object
    * and sets this color instance to that value.
    *
    * @param color
    */
  def setColor(color: js.Array[_]): js.Function = js.native
  /**
    * Takes a named string, hex string, array of rgb or rgba values,
    * an object with r, g, b, and a properties, or another Color object
    * and sets this color instance to that value.
    *
    * @param color
    */
  def setColor(color: js.Object): js.Function = js.native
  /**
    * Convert this Color to a CMY definition.
    *
    */
  def toCmy(): js.Object = js.native
  /**
    * Convert this Color to a CMYK definition.
    *
    */
  def toCmyk(): js.Object = js.native
  /**
    * Returns a css color string in rgb(a) representation
    *
    * @param includeAlpha               Optional
    */
  def toCss(): String = js.native
  def toCss(includeAlpha: Boolean): String = js.native
  /**
    * Returns a CSS color string in hexadecimal representation
    *
    */
  def toHex(): String = js.native
  /**
    * Convert this Color to an HSL definition.
    *
    */
  def toHsl(): js.Object = js.native
  /**
    * Convert this Color to an HSV definition.
    *
    */
  def toHsv(): js.Object = js.native
  /**
    * Returns 3 component array of rgb values
    *
    */
  def toRgb(): js.Array[_] = js.native
  /**
    * Returns a 4 component array of rgba values from the color
    * represented by this object.
    *
    */
  def toRgba(): js.Array[_] = js.native
}

