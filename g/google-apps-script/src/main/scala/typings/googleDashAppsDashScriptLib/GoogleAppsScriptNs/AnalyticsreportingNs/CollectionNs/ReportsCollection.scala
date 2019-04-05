package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsreportingNs.CollectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportsCollection extends js.Object {
  // Returns the Analytics data.
  def batchGet(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsreportingNs.SchemaNs.GetReportsRequest
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsreportingNs.SchemaNs.GetReportsResponse
}

object ReportsCollection {
  @scala.inline
  def apply(
    batchGet: googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsreportingNs.SchemaNs.GetReportsRequest => googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsreportingNs.SchemaNs.GetReportsResponse
  ): ReportsCollection = {
    val __obj = js.Dynamic.literal(batchGet = js.Any.fromFunction1(batchGet))
  
    __obj.asInstanceOf[ReportsCollection]
  }
}

