package typings.geopattern.geopatternMod

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
  var baseColor: js.UndefOr[String] = js.undefined
  /**
    * Specify an exact background color. This is a CSS hexadecimal color
    * value.
    */
  var color: js.UndefOr[String] = js.undefined
  /**
    * Determines the pattern. All of the original patterns from the Ruby
    * version at jasonlong/geo_pattern are available in this port, and their
    * names are camelCased.
    */
  var generator: js.UndefOr[GeneratorType] = js.undefined
}

object PatternOptions {
  @scala.inline
  def apply(baseColor: String = null, color: String = null, generator: GeneratorType = null): PatternOptions = {
    val __obj = js.Dynamic.literal()
    if (baseColor != null) __obj.updateDynamic("baseColor")(baseColor.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (generator != null) __obj.updateDynamic("generator")(generator.asInstanceOf[js.Any])
    __obj.asInstanceOf[PatternOptions]
  }
}

