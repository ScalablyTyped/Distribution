package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountPermissionGroupsListResponse extends js.Object {
  /** Account permission group collection. */
  var accountPermissionGroups: js.UndefOr[js.Array[AccountPermissionGroup]] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#accountPermissionGroupsListResponse". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
}

object AccountPermissionGroupsListResponse {
  @scala.inline
  def apply(accountPermissionGroups: js.Array[AccountPermissionGroup] = null, kind: java.lang.String = null): AccountPermissionGroupsListResponse = {
    val __obj = js.Dynamic.literal()
    if (accountPermissionGroups != null) __obj.updateDynamic("accountPermissionGroups")(accountPermissionGroups)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[AccountPermissionGroupsListResponse]
  }
}

