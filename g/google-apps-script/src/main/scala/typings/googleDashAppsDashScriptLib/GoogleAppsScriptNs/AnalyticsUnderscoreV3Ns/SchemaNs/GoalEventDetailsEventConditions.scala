package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsUnderscoreV3Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoalEventDetailsEventConditions extends js.Object {
  var comparisonType: js.UndefOr[java.lang.String] = js.undefined
  var comparisonValue: js.UndefOr[java.lang.String] = js.undefined
  var expression: js.UndefOr[java.lang.String] = js.undefined
  var matchType: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object GoalEventDetailsEventConditions {
  @scala.inline
  def apply(
    comparisonType: java.lang.String = null,
    comparisonValue: java.lang.String = null,
    expression: java.lang.String = null,
    matchType: java.lang.String = null,
    `type`: java.lang.String = null
  ): GoalEventDetailsEventConditions = {
    val __obj = js.Dynamic.literal()
    if (comparisonType != null) __obj.updateDynamic("comparisonType")(comparisonType)
    if (comparisonValue != null) __obj.updateDynamic("comparisonValue")(comparisonValue)
    if (expression != null) __obj.updateDynamic("expression")(expression)
    if (matchType != null) __obj.updateDynamic("matchType")(matchType)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[GoalEventDetailsEventConditions]
  }
}

