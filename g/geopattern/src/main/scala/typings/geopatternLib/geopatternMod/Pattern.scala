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

