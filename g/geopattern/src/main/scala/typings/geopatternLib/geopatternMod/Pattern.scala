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
    toBase64: () => java.lang.String,
    toDataUri: () => java.lang.String,
    toDataUrl: () => java.lang.String,
    toString: () => java.lang.String,
    toSvg: () => java.lang.String
  ): Pattern = {
    val __obj = js.Dynamic.literal(color = color, toBase64 = js.Any.fromFunction0(toBase64), toDataUri = js.Any.fromFunction0(toDataUri), toDataUrl = js.Any.fromFunction0(toDataUrl), toString = js.Any.fromFunction0(toString), toSvg = js.Any.fromFunction0(toSvg))
  
    __obj.asInstanceOf[Pattern]
  }
}

