package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonComparisonValue extends js.Object {
  var comparisonType: js.UndefOr[String] = js.native
  var comparisonValue: js.UndefOr[String] = js.native
}

object AnonComparisonValue {
  @scala.inline
  def apply(comparisonType: String = null, comparisonValue: String = null): AnonComparisonValue = {
    val __obj = js.Dynamic.literal()
    if (comparisonType != null) __obj.updateDynamic("comparisonType")(comparisonType.asInstanceOf[js.Any])
    if (comparisonValue != null) __obj.updateDynamic("comparisonValue")(comparisonValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonComparisonValue]
  }
}

