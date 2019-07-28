package typings.googleDashAppsDashScript.GoogleAppsScriptNs.AnalyticsNs.CollectionNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.AnalyticsNs.CollectionNs.UserDeletionNs.UserDeletionRequestCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserDeletionCollection extends js.Object {
  var UserDeletionRequest: js.UndefOr[UserDeletionRequestCollection] = js.undefined
}

object UserDeletionCollection {
  @scala.inline
  def apply(UserDeletionRequest: UserDeletionRequestCollection = null): UserDeletionCollection = {
    val __obj = js.Dynamic.literal()
    if (UserDeletionRequest != null) __obj.updateDynamic("UserDeletionRequest")(UserDeletionRequest)
    __obj.asInstanceOf[UserDeletionCollection]
  }
}

