package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsreportingNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cohort extends js.Object {
  var dateRange: js.UndefOr[DateRange] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object Cohort {
  @scala.inline
  def apply(dateRange: DateRange = null, name: java.lang.String = null, `type`: java.lang.String = null): Cohort = {
    val __obj = js.Dynamic.literal()
    if (dateRange != null) __obj.updateDynamic("dateRange")(dateRange)
    if (name != null) __obj.updateDynamic("name")(name)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Cohort]
  }
}

