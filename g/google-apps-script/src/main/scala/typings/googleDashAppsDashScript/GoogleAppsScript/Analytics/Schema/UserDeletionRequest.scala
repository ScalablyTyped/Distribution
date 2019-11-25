package typings.googleDashAppsDashScript.GoogleAppsScript.Analytics.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserDeletionRequest extends js.Object {
  var deletionRequestTime: js.UndefOr[String] = js.undefined
  var firebaseProjectId: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[UserDeletionRequestId] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var webPropertyId: js.UndefOr[String] = js.undefined
}

object UserDeletionRequest {
  @scala.inline
  def apply(
    deletionRequestTime: String = null,
    firebaseProjectId: String = null,
    id: UserDeletionRequestId = null,
    kind: String = null,
    webPropertyId: String = null
  ): UserDeletionRequest = {
    val __obj = js.Dynamic.literal()
    if (deletionRequestTime != null) __obj.updateDynamic("deletionRequestTime")(deletionRequestTime.asInstanceOf[js.Any])
    if (firebaseProjectId != null) __obj.updateDynamic("firebaseProjectId")(firebaseProjectId.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (webPropertyId != null) __obj.updateDynamic("webPropertyId")(webPropertyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserDeletionRequest]
  }
}

