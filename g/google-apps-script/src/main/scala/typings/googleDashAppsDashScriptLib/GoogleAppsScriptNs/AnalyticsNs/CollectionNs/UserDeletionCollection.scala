package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsNs.CollectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserDeletionCollection extends js.Object {
  var UserDeletionRequest: js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsNs.CollectionNs.UserDeletionNs.UserDeletionRequestCollection
  ] = js.undefined
}

object UserDeletionCollection {
  @scala.inline
  def apply(
    UserDeletionRequest: googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsNs.CollectionNs.UserDeletionNs.UserDeletionRequestCollection = null
  ): UserDeletionCollection = {
    val __obj = js.Dynamic.literal()
    if (UserDeletionRequest != null) __obj.updateDynamic("UserDeletionRequest")(UserDeletionRequest)
    __obj.asInstanceOf[UserDeletionCollection]
  }
}

