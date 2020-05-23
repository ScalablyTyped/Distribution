package typings.googleAppsScript.GoogleAppsScript.Analyticsreporting.Schema

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
    if (!js.isUndefined(caseSensitive)) __obj.updateDynamic("caseSensitive")(caseSensitive.get.asInstanceOf[js.Any])
    if (dimensionName != null) __obj.updateDynamic("dimensionName")(dimensionName.asInstanceOf[js.Any])
    if (expressions != null) __obj.updateDynamic("expressions")(expressions.asInstanceOf[js.Any])
    if (!js.isUndefined(not)) __obj.updateDynamic("not")(not.get.asInstanceOf[js.Any])
    if (operator != null) __obj.updateDynamic("operator")(operator.asInstanceOf[js.Any])
    __obj.asInstanceOf[DimensionFilter]
  }
}

