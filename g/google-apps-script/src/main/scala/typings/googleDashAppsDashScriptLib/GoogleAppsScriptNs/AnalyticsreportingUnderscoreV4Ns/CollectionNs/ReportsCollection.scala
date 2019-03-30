package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsreportingUnderscoreV4Ns.CollectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportsCollection extends js.Object {
  // Returns the Analytics data.
  def batchGet(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsreportingUnderscoreV4Ns.SchemaNs.GetReportsRequest
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsreportingUnderscoreV4Ns.SchemaNs.GetReportsResponse
}

object ReportsCollection {
  @scala.inline
  def apply(
    batchGet: googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsreportingUnderscoreV4Ns.SchemaNs.GetReportsRequest => googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsreportingUnderscoreV4Ns.SchemaNs.GetReportsResponse
  ): ReportsCollection = {
    val __obj = js.Dynamic.literal(batchGet = js.Any.fromFunction1(batchGet))
  
    __obj.asInstanceOf[ReportsCollection]
  }
}

