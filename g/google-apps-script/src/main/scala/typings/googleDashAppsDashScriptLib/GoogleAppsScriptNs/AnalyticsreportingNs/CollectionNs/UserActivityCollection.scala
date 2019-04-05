package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsreportingNs.CollectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserActivityCollection extends js.Object {
  // Returns User Activity data.
  def search(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsreportingNs.SchemaNs.SearchUserActivityRequest
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsreportingNs.SchemaNs.SearchUserActivityResponse
}

object UserActivityCollection {
  @scala.inline
  def apply(
    search: googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsreportingNs.SchemaNs.SearchUserActivityRequest => googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsreportingNs.SchemaNs.SearchUserActivityResponse
  ): UserActivityCollection = {
    val __obj = js.Dynamic.literal(search = js.Any.fromFunction1(search))
  
    __obj.asInstanceOf[UserActivityCollection]
  }
}

