package typings.googleAppsScript.GoogleAppsScript.Analytics.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoalVisitNumPagesDetails extends js.Object {
  var comparisonType: js.UndefOr[String] = js.undefined
  var comparisonValue: js.UndefOr[String] = js.undefined
}

object GoalVisitNumPagesDetails {
  @scala.inline
  def apply(comparisonType: String = null, comparisonValue: String = null): GoalVisitNumPagesDetails = {
    val __obj = js.Dynamic.literal()
    if (comparisonType != null) __obj.updateDynamic("comparisonType")(comparisonType.asInstanceOf[js.Any])
    if (comparisonValue != null) __obj.updateDynamic("comparisonValue")(comparisonValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoalVisitNumPagesDetails]
  }
}

