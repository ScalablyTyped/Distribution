package typings.googleDashAppsDashScript.GoogleAppsScript.Analytics.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserDeletionRequestId extends js.Object {
  var `type`: js.UndefOr[String] = js.undefined
  var userId: js.UndefOr[String] = js.undefined
}

object UserDeletionRequestId {
  @scala.inline
  def apply(`type`: String = null, userId: String = null): UserDeletionRequestId = {
    val __obj = js.Dynamic.literal()
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (userId != null) __obj.updateDynamic("userId")(userId)
    __obj.asInstanceOf[UserDeletionRequestId]
  }
}

