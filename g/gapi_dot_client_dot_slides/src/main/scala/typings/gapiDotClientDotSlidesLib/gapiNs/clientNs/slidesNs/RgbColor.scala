package typings
package gapiDotClientDotSlidesLib.gapiNs.clientNs.slidesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RgbColor extends js.Object {
  /** The blue component of the color, from 0.0 to 1.0. */
  var blue: js.UndefOr[scala.Double] = js.undefined
  /** The green component of the color, from 0.0 to 1.0. */
  var green: js.UndefOr[scala.Double] = js.undefined
  /** The red component of the color, from 0.0 to 1.0. */
  var red: js.UndefOr[scala.Double] = js.undefined
}

object RgbColor {
  @scala.inline
  def apply(
    blue: scala.Int | scala.Double = null,
    green: scala.Int | scala.Double = null,
    red: scala.Int | scala.Double = null
  ): RgbColor = {
    val __obj = js.Dynamic.literal()
    if (blue != null) __obj.updateDynamic("blue")(blue.asInstanceOf[js.Any])
    if (green != null) __obj.updateDynamic("green")(green.asInstanceOf[js.Any])
    if (red != null) __obj.updateDynamic("red")(red.asInstanceOf[js.Any])
    __obj.asInstanceOf[RgbColor]
  }
}

