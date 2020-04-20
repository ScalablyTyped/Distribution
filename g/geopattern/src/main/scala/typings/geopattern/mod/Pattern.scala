package typings.geopattern.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Pattern extends js.Object {
  /** Gets the pattern's background color as a hexadecimal string. */
  var color: String
  /** Gets the SVG as a Base64-encoded string. */
  def toBase64(): String
  /**
    * Gets the pattern as a data URI,
    * i.e. data:image/svg+xml;base64,PHN2ZyB...
    */
  def toDataUri(): String
  /**
    * Gets the pattern as a data URL suitable for use as a CSS
    * background-image, i.e. url("data:image/svg+xml;base64,PHN2ZyB...").
    */
  def toDataUrl(): String
  /** Gets the SVG string representing the pattern. */
  def toSvg(): String
}

object Pattern {
  @scala.inline
  def apply(
    color: String,
    toBase64: () => String,
    toDataUri: () => String,
    toDataUrl: () => String,
    toSvg: () => String
  ): Pattern = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], toBase64 = js.Any.fromFunction0(toBase64), toDataUri = js.Any.fromFunction0(toDataUri), toDataUrl = js.Any.fromFunction0(toDataUrl), toSvg = js.Any.fromFunction0(toSvg))
    __obj.asInstanceOf[Pattern]
  }
}

