package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsNs.CollectionNs.UserDeletionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserDeletionRequestCollection extends js.Object {
  // Insert or update a user deletion requests.
  def upsert(resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsNs.SchemaNs.UserDeletionRequest): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsNs.SchemaNs.UserDeletionRequest
}

object UserDeletionRequestCollection {
  @scala.inline
  def apply(
    upsert: googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsNs.SchemaNs.UserDeletionRequest => googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsNs.SchemaNs.UserDeletionRequest
  ): UserDeletionRequestCollection = {
    val __obj = js.Dynamic.literal(upsert = js.Any.fromFunction1(upsert))
  
    __obj.asInstanceOf[UserDeletionRequestCollection]
  }
}

