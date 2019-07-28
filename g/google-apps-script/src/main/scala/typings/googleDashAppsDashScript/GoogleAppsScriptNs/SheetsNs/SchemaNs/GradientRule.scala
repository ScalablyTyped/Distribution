package typings.googleDashAppsDashScript.GoogleAppsScriptNs.SheetsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GradientRule extends js.Object {
  var maxpoint: js.UndefOr[InterpolationPoint] = js.undefined
  var midpoint: js.UndefOr[InterpolationPoint] = js.undefined
  var minpoint: js.UndefOr[InterpolationPoint] = js.undefined
}

object GradientRule {
  @scala.inline
  def apply(
    maxpoint: InterpolationPoint = null,
    midpoint: InterpolationPoint = null,
    minpoint: InterpolationPoint = null
  ): GradientRule = {
    val __obj = js.Dynamic.literal()
    if (maxpoint != null) __obj.updateDynamic("maxpoint")(maxpoint)
    if (midpoint != null) __obj.updateDynamic("midpoint")(midpoint)
    if (minpoint != null) __obj.updateDynamic("minpoint")(minpoint)
    __obj.asInstanceOf[GradientRule]
  }
}

