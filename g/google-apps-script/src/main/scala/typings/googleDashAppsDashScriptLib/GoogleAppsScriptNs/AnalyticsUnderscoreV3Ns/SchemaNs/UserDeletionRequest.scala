package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsUnderscoreV3Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserDeletionRequest extends js.Object {
  var deletionRequestTime: js.UndefOr[java.lang.String] = js.undefined
  var firebaseProjectId: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[UserDeletionRequestId] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var webPropertyId: js.UndefOr[java.lang.String] = js.undefined
}

object UserDeletionRequest {
  @scala.inline
  def apply(
    deletionRequestTime: java.lang.String = null,
    firebaseProjectId: java.lang.String = null,
    id: UserDeletionRequestId = null,
    kind: java.lang.String = null,
    webPropertyId: java.lang.String = null
  ): UserDeletionRequest = {
    val __obj = js.Dynamic.literal()
    if (deletionRequestTime != null) __obj.updateDynamic("deletionRequestTime")(deletionRequestTime)
    if (firebaseProjectId != null) __obj.updateDynamic("firebaseProjectId")(firebaseProjectId)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (webPropertyId != null) __obj.updateDynamic("webPropertyId")(webPropertyId)
    __obj.asInstanceOf[UserDeletionRequest]
  }
}

