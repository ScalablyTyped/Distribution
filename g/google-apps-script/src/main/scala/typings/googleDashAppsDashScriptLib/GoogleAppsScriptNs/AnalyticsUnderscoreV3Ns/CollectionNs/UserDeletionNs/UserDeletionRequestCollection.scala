package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsUnderscoreV3Ns.CollectionNs.UserDeletionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserDeletionRequestCollection extends js.Object {
  // Insert or update a user deletion requests.
  def upsert(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsUnderscoreV3Ns.SchemaNs.UserDeletionRequest
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsUnderscoreV3Ns.SchemaNs.UserDeletionRequest
}

object UserDeletionRequestCollection {
  @scala.inline
  def apply(
    upsert: googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsUnderscoreV3Ns.SchemaNs.UserDeletionRequest => googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsUnderscoreV3Ns.SchemaNs.UserDeletionRequest
  ): UserDeletionRequestCollection = {
    val __obj = js.Dynamic.literal(upsert = js.Any.fromFunction1(upsert))
  
    __obj.asInstanceOf[UserDeletionRequestCollection]
  }
}

