package typings.dymoLabelFramework.dymo.label.framework

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
    alpha: js.UndefOr[Double] = js.undefined,
    blue: js.UndefOr[Double] = js.undefined,
    green: js.UndefOr[Double] = js.undefined,
    red: js.UndefOr[Double] = js.undefined
  ): Color = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alpha)) __obj.updateDynamic("alpha")(alpha.get.asInstanceOf[js.Any])
    if (!js.isUndefined(blue)) __obj.updateDynamic("blue")(blue.get.asInstanceOf[js.Any])
    if (!js.isUndefined(green)) __obj.updateDynamic("green")(green.get.asInstanceOf[js.Any])
    if (!js.isUndefined(red)) __obj.updateDynamic("red")(red.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Color]
  }
}

