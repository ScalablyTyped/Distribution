package typings.gapiClientSlides.gapi.client.slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WeightedFontFamily extends js.Object {
  /**
    * The font family of the text.
    *
    * The font family can be any font from the Font menu in Slides or from
    * [Google Fonts] (https://fonts.google.com/). If the font name is
    * unrecognized, the text is rendered in `Arial`.
    */
  var fontFamily: js.UndefOr[String] = js.undefined
  /**
    * The rendered weight of the text. This field can have any value that is a
    * multiple of `100` between `100` and `900`, inclusive. This range
    * corresponds to the numerical values described in the CSS 2.1
    * Specification, [section 15.6](https://www.w3.org/TR/CSS21/fonts.html#font-boldness),
    * with non-numerical values disallowed. Weights greater than or equal to
    * `700` are considered bold, and weights less than `700`are not bold. The
    * default value is `400` ("normal").
    */
  var weight: js.UndefOr[Double] = js.undefined
}

object WeightedFontFamily {
  @scala.inline
  def apply(fontFamily: String = null, weight: js.UndefOr[Double] = js.undefined): WeightedFontFamily = {
    val __obj = js.Dynamic.literal()
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily.asInstanceOf[js.Any])
    if (!js.isUndefined(weight)) __obj.updateDynamic("weight")(weight.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[WeightedFontFamily]
  }
}

