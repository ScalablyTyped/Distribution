package typings.gapiClientDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountPermissionsListResponse extends js.Object {
  /** Account permission collection. */
  var accountPermissions: js.UndefOr[js.Array[AccountPermission]] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#accountPermissionsListResponse". */
  var kind: js.UndefOr[String] = js.undefined
}

object AccountPermissionsListResponse {
  @scala.inline
  def apply(accountPermissions: js.Array[AccountPermission] = null, kind: String = null): AccountPermissionsListResponse = {
    val __obj = js.Dynamic.literal()
    if (accountPermissions != null) __obj.updateDynamic("accountPermissions")(accountPermissions.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountPermissionsListResponse]
  }
}

