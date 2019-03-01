package typings
package gapiDotClientDotAnalyticsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ComparisonTypeComparisonValue extends js.Object {
  /** Type of comparison. Possible values are LESS_THAN or GREATER_THAN. */
  var comparisonType: js.UndefOr[java.lang.String] = js.undefined
  /** Value used for this comparison. */
  var comparisonValue: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_ComparisonTypeComparisonValue {
  @scala.inline
  def apply(comparisonType: java.lang.String = null, comparisonValue: java.lang.String = null): Anon_ComparisonTypeComparisonValue = {
    val __obj = js.Dynamic.literal()
    if (comparisonType != null) __obj.updateDynamic("comparisonType")(comparisonType)
    if (comparisonValue != null) __obj.updateDynamic("comparisonValue")(comparisonValue)
    __obj.asInstanceOf[Anon_ComparisonTypeComparisonValue]
  }
}

