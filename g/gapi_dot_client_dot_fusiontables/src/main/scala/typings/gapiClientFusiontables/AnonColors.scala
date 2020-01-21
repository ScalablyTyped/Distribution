package typings.gapiClientFusiontables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonColors extends js.Object {
  /** Array with two or more colors. */
  var colors: js.UndefOr[js.Array[AnonColor]] = js.undefined
  /** Higher-end of the interpolation range: rows with this value will be assigned to colors[n-1]. */
  var max: js.UndefOr[Double] = js.undefined
  /** Lower-end of the interpolation range: rows with this value will be assigned to colors[0]. */
  var min: js.UndefOr[Double] = js.undefined
}

object AnonColors {
  @scala.inline
  def apply(colors: js.Array[AnonColor] = null, max: Int | Double = null, min: Int | Double = null): AnonColors = {
    val __obj = js.Dynamic.literal()
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonColors]
  }
}

