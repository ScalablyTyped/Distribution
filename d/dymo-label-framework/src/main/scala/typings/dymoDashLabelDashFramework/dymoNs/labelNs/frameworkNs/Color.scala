package typings.dymoDashLabelDashFramework.dymoNs.labelNs.frameworkNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * Object with properties 'a' or 'alpha' to specify color's alpha channel,
	 * r/red, g/green, b/blue for red, green, blue channels.
	 * The valid range for a/r/g/b fields is [0..255].
	 */
trait Color extends js.Object {
  /** alpha channel [0..255] default: 255 */
  var alpha: js.UndefOr[Double] = js.undefined
  /** blue channel [0..255] default: 0 */
  var blue: js.UndefOr[Double] = js.undefined
  /** green channel [0..255] default: 0 */
  var green: js.UndefOr[Double] = js.undefined
  /** red channel [0..255] default: 0 */
  var red: js.UndefOr[Double] = js.undefined
}

object Color {
  @scala.inline
  def apply(
    alpha: Int | Double = null,
    blue: Int | Double = null,
    green: Int | Double = null,
    red: Int | Double = null
  ): Color = {
    val __obj = js.Dynamic.literal()
    if (alpha != null) __obj.updateDynamic("alpha")(alpha.asInstanceOf[js.Any])
    if (blue != null) __obj.updateDynamic("blue")(blue.asInstanceOf[js.Any])
    if (green != null) __obj.updateDynamic("green")(green.asInstanceOf[js.Any])
    if (red != null) __obj.updateDynamic("red")(red.asInstanceOf[js.Any])
    __obj.asInstanceOf[Color]
  }
}

