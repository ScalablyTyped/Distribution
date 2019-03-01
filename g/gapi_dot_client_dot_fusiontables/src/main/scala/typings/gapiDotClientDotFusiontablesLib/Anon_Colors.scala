package typings
package gapiDotClientDotFusiontablesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Colors extends js.Object {
  /** Array with two or more colors. */
  var colors: js.UndefOr[js.Array[Anon_Color]] = js.undefined
  /** Higher-end of the interpolation range: rows with this value will be assigned to colors[n-1]. */
  var max: js.UndefOr[scala.Double] = js.undefined
  /** Lower-end of the interpolation range: rows with this value will be assigned to colors[0]. */
  var min: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Colors {
  @scala.inline
  def apply(
    colors: js.Array[Anon_Color] = null,
    max: scala.Int | scala.Double = null,
    min: scala.Int | scala.Double = null
  ): Anon_Colors = {
    val __obj = js.Dynamic.literal()
    if (colors != null) __obj.updateDynamic("colors")(colors)
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Colors]
  }
}

