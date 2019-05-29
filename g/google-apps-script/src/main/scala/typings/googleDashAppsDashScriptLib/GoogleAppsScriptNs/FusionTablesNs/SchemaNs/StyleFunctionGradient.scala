package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.FusionTablesNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StyleFunctionGradient extends js.Object {
  var colors: js.UndefOr[js.Array[StyleFunctionGradientColors]] = js.undefined
  var max: js.UndefOr[scala.Double] = js.undefined
  var min: js.UndefOr[scala.Double] = js.undefined
}

object StyleFunctionGradient {
  @scala.inline
  def apply(
    colors: js.Array[StyleFunctionGradientColors] = null,
    max: scala.Int | scala.Double = null,
    min: scala.Int | scala.Double = null
  ): StyleFunctionGradient = {
    val __obj = js.Dynamic.literal()
    if (colors != null) __obj.updateDynamic("colors")(colors)
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    __obj.asInstanceOf[StyleFunctionGradient]
  }
}

