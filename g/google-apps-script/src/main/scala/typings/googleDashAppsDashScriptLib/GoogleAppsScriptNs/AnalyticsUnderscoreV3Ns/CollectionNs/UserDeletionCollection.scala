package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsUnderscoreV3Ns.CollectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserDeletionCollection extends js.Object {
  var UserDeletionRequest: js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsUnderscoreV3Ns.CollectionNs.UserDeletionNs.UserDeletionRequestCollection
  ] = js.undefined
}

object UserDeletionCollection {
  @scala.inline
  def apply(
    UserDeletionRequest: googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsUnderscoreV3Ns.CollectionNs.UserDeletionNs.UserDeletionRequestCollection = null
  ): UserDeletionCollection = {
    val __obj = js.Dynamic.literal()
    if (UserDeletionRequest != null) __obj.updateDynamic("UserDeletionRequest")(UserDeletionRequest)
    __obj.asInstanceOf[UserDeletionCollection]
  }
}

