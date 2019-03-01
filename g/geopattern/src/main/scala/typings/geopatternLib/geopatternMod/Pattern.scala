package typings
package geopatternLib.geopatternMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Pattern extends js.Object {
  /** Gets the pattern's background color as a hexadecimal string. */
  var color: java.lang.String
  /** Gets the SVG as a Base64-encoded string. */
  def toBase64(): java.lang.String
  /**
    * Gets the pattern as a data URI,
    * i.e. data:image/svg+xml;base64,PHN2ZyB...
    */
  def toDataUri(): java.lang.String
  /**
    * Gets the pattern as a data URL suitable for use as a CSS
    * background-image, i.e. url("data:image/svg+xml;base64,PHN2ZyB...").
    */
  def toDataUrl(): java.lang.String
  /** Gets the SVG string representing the pattern. */
  def toSvg(): java.lang.String
}

object Pattern {
  @scala.inline
  def apply(
    color: java.lang.String,
    toBase64: js.Function0[java.lang.String],
    toDataUri: js.Function0[java.lang.String],
    toDataUrl: js.Function0[java.lang.String],
    toString: js.Function0[java.lang.String],
    toSvg: js.Function0[java.lang.String]
  ): Pattern = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("color")(color)
    __obj.updateDynamic("toBase64")(toBase64)
    __obj.updateDynamic("toDataUri")(toDataUri)
    __obj.updateDynamic("toDataUrl")(toDataUrl)
    __obj.updateDynamic("toString")(toString)
    __obj.updateDynamic("toSvg")(toSvg)
    __obj.asInstanceOf[Pattern]
  }
}

