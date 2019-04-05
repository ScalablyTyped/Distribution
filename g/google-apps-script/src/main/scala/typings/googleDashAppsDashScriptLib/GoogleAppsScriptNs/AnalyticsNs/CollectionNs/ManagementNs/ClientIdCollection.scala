package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsNs.CollectionNs.ManagementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientIdCollection extends js.Object {
  // Hashes the given Client ID.
  def hashClientId(resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsNs.SchemaNs.HashClientIdRequest): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsNs.SchemaNs.HashClientIdResponse
}

object ClientIdCollection {
  @scala.inline
  def apply(
    hashClientId: googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsNs.SchemaNs.HashClientIdRequest => googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsNs.SchemaNs.HashClientIdResponse
  ): ClientIdCollection = {
    val __obj = js.Dynamic.literal(hashClientId = js.Any.fromFunction1(hashClientId))
  
    __obj.asInstanceOf[ClientIdCollection]
  }
}

