package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsUnderscoreV3Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoalVisitTimeOnSiteDetails extends js.Object {
  var comparisonType: js.UndefOr[java.lang.String] = js.undefined
  var comparisonValue: js.UndefOr[java.lang.String] = js.undefined
}

object GoalVisitTimeOnSiteDetails {
  @scala.inline
  def apply(comparisonType: java.lang.String = null, comparisonValue: java.lang.String = null): GoalVisitTimeOnSiteDetails = {
    val __obj = js.Dynamic.literal()
    if (comparisonType != null) __obj.updateDynamic("comparisonType")(comparisonType)
    if (comparisonValue != null) __obj.updateDynamic("comparisonValue")(comparisonValue)
    __obj.asInstanceOf[GoalVisitTimeOnSiteDetails]
  }
}

