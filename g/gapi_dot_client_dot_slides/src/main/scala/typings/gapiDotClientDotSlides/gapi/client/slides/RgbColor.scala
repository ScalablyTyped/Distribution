package typings.gapiDotClientDotSlides.gapi.client.slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RgbColor extends js.Object {
  /** The blue component of the color, from 0.0 to 1.0. */
  var blue: js.UndefOr[Double] = js.undefined
  /** The green component of the color, from 0.0 to 1.0. */
  var green: js.UndefOr[Double] = js.undefined
  /** The red component of the color, from 0.0 to 1.0. */
  var red: js.UndefOr[Double] = js.undefined
}

object RgbColor {
  @scala.inline
  def apply(blue: Int | Double = null, green: Int | Double = null, red: Int | Double = null): RgbColor = {
    val __obj = js.Dynamic.literal()
    if (blue != null) __obj.updateDynamic("blue")(blue.asInstanceOf[js.Any])
    if (green != null) __obj.updateDynamic("green")(green.asInstanceOf[js.Any])
    if (red != null) __obj.updateDynamic("red")(red.asInstanceOf[js.Any])
    __obj.asInstanceOf[RgbColor]
  }
}

