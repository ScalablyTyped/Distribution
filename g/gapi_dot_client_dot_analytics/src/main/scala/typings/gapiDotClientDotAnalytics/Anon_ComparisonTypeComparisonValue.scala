package typings.gapiDotClientDotAnalytics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ComparisonTypeComparisonValue extends js.Object {
  /** Type of comparison. Possible values are LESS_THAN or GREATER_THAN. */
  var comparisonType: js.UndefOr[String] = js.undefined
  /** Value used for this comparison. */
  var comparisonValue: js.UndefOr[String] = js.undefined
}

object Anon_ComparisonTypeComparisonValue {
  @scala.inline
  def apply(comparisonType: String = null, comparisonValue: String = null): Anon_ComparisonTypeComparisonValue = {
    val __obj = js.Dynamic.literal()
    if (comparisonType != null) __obj.updateDynamic("comparisonType")(comparisonType.asInstanceOf[js.Any])
    if (comparisonValue != null) __obj.updateDynamic("comparisonValue")(comparisonValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ComparisonTypeComparisonValue]
  }
}

