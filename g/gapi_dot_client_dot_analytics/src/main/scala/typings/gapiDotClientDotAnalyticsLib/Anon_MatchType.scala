package typings
package gapiDotClientDotAnalyticsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MatchType extends js.Object {
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

