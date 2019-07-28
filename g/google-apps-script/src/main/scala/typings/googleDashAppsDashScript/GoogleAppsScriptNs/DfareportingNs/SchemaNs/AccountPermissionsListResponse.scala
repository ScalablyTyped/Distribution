package typings.googleDashAppsDashScript.GoogleAppsScriptNs.DfareportingNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountPermissionsListResponse extends js.Object {
  var accountPermissions: js.UndefOr[js.Array[AccountPermission]] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
}

object AccountPermissionsListResponse {
  @scala.inline
  def apply(accountPermissions: js.Array[AccountPermission] = null, kind: String = null): AccountPermissionsListResponse = {
    val __obj = js.Dynamic.literal()
    if (accountPermissions != null) __obj.updateDynamic("accountPermissions")(accountPermissions)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[AccountPermissionsListResponse]
  }
}

