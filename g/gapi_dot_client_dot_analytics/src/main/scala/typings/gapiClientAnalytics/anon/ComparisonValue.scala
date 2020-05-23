package typings.gapiClientAnalytics.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComparisonValue extends js.Object {
  /** Type of comparison. Possible values are LESS_THAN or GREATER_THAN. */
  var comparisonType: js.UndefOr[String] = js.undefined
  /** Value used for this comparison. */
  var comparisonValue: js.UndefOr[String] = js.undefined
}

object ComparisonValue {
  @scala.inline
  def apply(comparisonType: String = null, comparisonValue: String = null): ComparisonValue = {
    val __obj = js.Dynamic.literal()
    if (comparisonType != null) __obj.updateDynamic("comparisonType")(comparisonType.asInstanceOf[js.Any])
    if (comparisonValue != null) __obj.updateDynamic("comparisonValue")(comparisonValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComparisonValue]
  }
}

