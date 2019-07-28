package typings.googleDashAppsDashScript.GoogleAppsScriptNs.AnalyticsreportingNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DimensionFilter extends js.Object {
  var caseSensitive: js.UndefOr[Boolean] = js.undefined
  var dimensionName: js.UndefOr[String] = js.undefined
  var expressions: js.UndefOr[js.Array[String]] = js.undefined
  var not: js.UndefOr[Boolean] = js.undefined
  var operator: js.UndefOr[String] = js.undefined
}

object DimensionFilter {
  @scala.inline
  def apply(
    caseSensitive: js.UndefOr[Boolean] = js.undefined,
    dimensionName: String = null,
    expressions: js.Array[String] = null,
    not: js.UndefOr[Boolean] = js.undefined,
    operator: String = null
  ): DimensionFilter = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(caseSensitive)) __obj.updateDynamic("caseSensitive")(caseSensitive)
    if (dimensionName != null) __obj.updateDynamic("dimensionName")(dimensionName)
    if (expressions != null) __obj.updateDynamic("expressions")(expressions)
    if (!js.isUndefined(not)) __obj.updateDynamic("not")(not)
    if (operator != null) __obj.updateDynamic("operator")(operator)
    __obj.asInstanceOf[DimensionFilter]
  }
}

