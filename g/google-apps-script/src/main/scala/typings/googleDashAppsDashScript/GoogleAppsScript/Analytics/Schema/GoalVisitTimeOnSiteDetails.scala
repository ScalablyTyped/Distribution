package typings.googleDashAppsDashScript.GoogleAppsScript.Analytics.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoalVisitTimeOnSiteDetails extends js.Object {
  var comparisonType: js.UndefOr[String] = js.undefined
  var comparisonValue: js.UndefOr[String] = js.undefined
}

object GoalVisitTimeOnSiteDetails {
  @scala.inline
  def apply(comparisonType: String = null, comparisonValue: String = null): GoalVisitTimeOnSiteDetails = {
    val __obj = js.Dynamic.literal()
    if (comparisonType != null) __obj.updateDynamic("comparisonType")(comparisonType)
    if (comparisonValue != null) __obj.updateDynamic("comparisonValue")(comparisonValue)
    __obj.asInstanceOf[GoalVisitTimeOnSiteDetails]
  }
}

