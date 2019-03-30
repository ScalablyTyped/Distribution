package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.FusiontablesUnderscoreV2Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StyleFunctionGradientColors extends js.Object {
  var color: js.UndefOr[java.lang.String] = js.undefined
  var opacity: js.UndefOr[stdLib.Number] = js.undefined
}

object StyleFunctionGradientColors {
  @scala.inline
  def apply(color: java.lang.String = null, opacity: stdLib.Number = null): StyleFunctionGradientColors = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity)
    __obj.asInstanceOf[StyleFunctionGradientColors]
  }
}

