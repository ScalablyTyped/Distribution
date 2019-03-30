package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsUnderscoreV3Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterExpression extends js.Object {
  var caseSensitive: js.UndefOr[scala.Boolean] = js.undefined
  var expressionValue: js.UndefOr[java.lang.String] = js.undefined
  var field: js.UndefOr[java.lang.String] = js.undefined
  var fieldIndex: js.UndefOr[scala.Double] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var matchType: js.UndefOr[java.lang.String] = js.undefined
}

object FilterExpression {
  @scala.inline
  def apply(
    caseSensitive: js.UndefOr[scala.Boolean] = js.undefined,
    expressionValue: java.lang.String = null,
    field: java.lang.String = null,
    fieldIndex: scala.Int | scala.Double = null,
    kind: java.lang.String = null,
    matchType: java.lang.String = null
  ): FilterExpression = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(caseSensitive)) __obj.updateDynamic("caseSensitive")(caseSensitive)
    if (expressionValue != null) __obj.updateDynamic("expressionValue")(expressionValue)
    if (field != null) __obj.updateDynamic("field")(field)
    if (fieldIndex != null) __obj.updateDynamic("fieldIndex")(fieldIndex.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (matchType != null) __obj.updateDynamic("matchType")(matchType)
    __obj.asInstanceOf[FilterExpression]
  }
}

