package typings.gapiClientAnalytics.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComparisonType extends js.Object {
  /** Type of comparison. Possible values are LESS_THAN, GREATER_THAN or EQUAL. */
  var comparisonType: js.UndefOr[String] = js.undefined
  /** Value used for this comparison. */
  var comparisonValue: js.UndefOr[String] = js.undefined
  /** Expression used for this match. */
  var expression: js.UndefOr[String] = js.undefined
  /** Type of the match to be performed. Possible values are REGEXP, BEGINS_WITH, or EXACT. */
  var matchType: js.UndefOr[String] = js.undefined
  /** Type of this event condition. Possible values are CATEGORY, ACTION, LABEL, or VALUE. */
  var `type`: js.UndefOr[String] = js.undefined
}

object ComparisonType {
  @scala.inline
  def apply(
    comparisonType: String = null,
    comparisonValue: String = null,
    expression: String = null,
    matchType: String = null,
    `type`: String = null
  ): ComparisonType = {
    val __obj = js.Dynamic.literal()
    if (comparisonType != null) __obj.updateDynamic("comparisonType")(comparisonType.asInstanceOf[js.Any])
    if (comparisonValue != null) __obj.updateDynamic("comparisonValue")(comparisonValue.asInstanceOf[js.Any])
    if (expression != null) __obj.updateDynamic("expression")(expression.asInstanceOf[js.Any])
    if (matchType != null) __obj.updateDynamic("matchType")(matchType.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComparisonType]
  }
}

