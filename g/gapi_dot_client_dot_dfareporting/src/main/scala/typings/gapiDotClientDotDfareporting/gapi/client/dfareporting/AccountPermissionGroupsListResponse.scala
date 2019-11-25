package typings.gapiDotClientDotDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountPermissionGroupsListResponse extends js.Object {
  /** Account permission group collection. */
  var accountPermissionGroups: js.UndefOr[js.Array[AccountPermissionGroup]] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#accountPermissionGroupsListResponse". */
  var kind: js.UndefOr[String] = js.undefined
}

object AccountPermissionGroupsListResponse {
  @scala.inline
  def apply(accountPermissionGroups: js.Array[AccountPermissionGroup] = null, kind: String = null): AccountPermissionGroupsListResponse = {
    val __obj = js.Dynamic.literal()
    if (accountPermissionGroups != null) __obj.updateDynamic("accountPermissionGroups")(accountPermissionGroups.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountPermissionGroupsListResponse]
  }
}

