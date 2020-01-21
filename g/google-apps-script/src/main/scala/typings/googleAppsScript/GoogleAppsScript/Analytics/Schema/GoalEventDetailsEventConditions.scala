package typings.googleAppsScript.GoogleAppsScript.Analytics.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoalEventDetailsEventConditions extends js.Object {
  var comparisonType: js.UndefOr[String] = js.undefined
  var comparisonValue: js.UndefOr[String] = js.undefined
  var expression: js.UndefOr[String] = js.undefined
  var matchType: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object GoalEventDetailsEventConditions {
  @scala.inline
  def apply(
    comparisonType: String = null,
    comparisonValue: String = null,
    expression: String = null,
    matchType: String = null,
    `type`: String = null
  ): GoalEventDetailsEventConditions = {
    val __obj = js.Dynamic.literal()
    if (comparisonType != null) __obj.updateDynamic("comparisonType")(comparisonType.asInstanceOf[js.Any])
    if (comparisonValue != null) __obj.updateDynamic("comparisonValue")(comparisonValue.asInstanceOf[js.Any])
    if (expression != null) __obj.updateDynamic("expression")(expression.asInstanceOf[js.Any])
    if (matchType != null) __obj.updateDynamic("matchType")(matchType.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoalEventDetailsEventConditions]
  }
}

