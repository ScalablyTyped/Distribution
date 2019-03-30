package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsreportingUnderscoreV4Ns.CollectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserActivityCollection extends js.Object {
  // Returns User Activity data.
  def search(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsreportingUnderscoreV4Ns.SchemaNs.SearchUserActivityRequest
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsreportingUnderscoreV4Ns.SchemaNs.SearchUserActivityResponse
}

object UserActivityCollection {
  @scala.inline
  def apply(
    search: googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsreportingUnderscoreV4Ns.SchemaNs.SearchUserActivityRequest => googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsreportingUnderscoreV4Ns.SchemaNs.SearchUserActivityResponse
  ): UserActivityCollection = {
    val __obj = js.Dynamic.literal(search = js.Any.fromFunction1(search))
  
    __obj.asInstanceOf[UserActivityCollection]
  }
}

