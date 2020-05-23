package typings.gapiClientFusiontables.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Colors extends js.Object {
  /** Array with two or more colors. */
  var colors: js.UndefOr[js.Array[Color]] = js.undefined
  /** Higher-end of the interpolation range: rows with this value will be assigned to colors[n-1]. */
  var max: js.UndefOr[Double] = js.undefined
  /** Lower-end of the interpolation range: rows with this value will be assigned to colors[0]. */
  var min: js.UndefOr[Double] = js.undefined
}

object Colors {
  @scala.inline
  def apply(
    colors: js.Array[Color] = null,
    max: js.UndefOr[Double] = js.undefined,
    min: js.UndefOr[Double] = js.undefined
  ): Colors = {
    val __obj = js.Dynamic.literal()
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (!js.isUndefined(max)) __obj.updateDynamic("max")(max.get.asInstanceOf[js.Any])
    if (!js.isUndefined(min)) __obj.updateDynamic("min")(min.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Colors]
  }
}

