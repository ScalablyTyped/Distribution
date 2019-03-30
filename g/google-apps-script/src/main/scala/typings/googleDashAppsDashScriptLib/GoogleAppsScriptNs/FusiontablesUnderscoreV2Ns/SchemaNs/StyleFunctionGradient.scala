package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.FusiontablesUnderscoreV2Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StyleFunctionGradient extends js.Object {
  var colors: js.UndefOr[js.Array[StyleFunctionGradientColors]] = js.undefined
  var max: js.UndefOr[stdLib.Number] = js.undefined
  var min: js.UndefOr[stdLib.Number] = js.undefined
}

object StyleFunctionGradient {
  @scala.inline
  def apply(
    colors: js.Array[StyleFunctionGradientColors] = null,
    max: stdLib.Number = null,
    min: stdLib.Number = null
  ): StyleFunctionGradient = {
    val __obj = js.Dynamic.literal()
    if (colors != null) __obj.updateDynamic("colors")(colors)
    if (max != null) __obj.updateDynamic("max")(max)
    if (min != null) __obj.updateDynamic("min")(min)
    __obj.asInstanceOf[StyleFunctionGradient]
  }
}

