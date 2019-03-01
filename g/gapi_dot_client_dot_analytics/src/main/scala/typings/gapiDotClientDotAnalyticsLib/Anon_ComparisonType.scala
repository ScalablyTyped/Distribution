package typings
package gapiDotClientDotAnalyticsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ComparisonType extends js.Object {
  /** Type of comparison. Possible values are LESS_THAN, GREATER_THAN or EQUAL. */
  var comparisonType: js.UndefOr[java.lang.String] = js.undefined
  /** Value used for this comparison. */
  var comparisonValue: js.UndefOr[java.lang.String] = js.undefined
  /** Expression used for this match. */
  var expression: js.UndefOr[java.lang.String] = js.undefined
  /** Type of the match to be performed. Possible values are REGEXP, BEGINS_WITH, or EXACT. */
  var matchType: js.UndefOr[java.lang.String] = js.undefined
  /** Type of this event condition. Possible values are CATEGORY, ACTION, LABEL, or VALUE. */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_ComparisonType {
  @scala.inline
  def apply(
    comparisonType: java.lang.String = null,
    comparisonValue: java.lang.String = null,
    expression: java.lang.String = null,
    matchType: java.lang.String = null,
    `type`: java.lang.String = null
  ): Anon_ComparisonType = {
    val __obj = js.Dynamic.literal()
    if (comparisonType != null) __obj.updateDynamic("comparisonType")(comparisonType)
    if (comparisonValue != null) __obj.updateDynamic("comparisonValue")(comparisonValue)
    if (expression != null) __obj.updateDynamic("expression")(expression)
    if (matchType != null) __obj.updateDynamic("matchType")(matchType)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_ComparisonType]
  }
}

