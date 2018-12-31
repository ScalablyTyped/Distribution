package typings
package geopatternLib.geopatternMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PatternOptions extends js.Object {
  /**
    * Controls the relative background color of the generated image. The color
    * is not identical to that used in the pattern because the hue is rotated
    * by the generator. This is a CSS hexadecimal color value, which defaults
    * to #933c3c.
    */
  var baseColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Specify an exact background color. This is a CSS hexadecimal color
    * value.
    */
  var color: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Determines the pattern. All of the original patterns from the Ruby
    * version at jasonlong/geo_pattern are available in this port, and their
    * names are camelCased.
    */
  var generator: js.UndefOr[GeneratorType] = js.undefined
}

