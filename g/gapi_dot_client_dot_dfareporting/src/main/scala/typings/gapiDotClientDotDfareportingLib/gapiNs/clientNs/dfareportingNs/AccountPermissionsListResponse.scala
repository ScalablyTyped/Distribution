package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountPermissionsListResponse extends js.Object {
  /** Account permission collection. */
  var accountPermissions: js.UndefOr[js.Array[AccountPermission]] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#accountPermissionsListResponse". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
}

object AccountPermissionsListResponse {
  @scala.inline
  def apply(accountPermissions: js.Array[AccountPermission] = null, kind: java.lang.String = null): AccountPermissionsListResponse = {
    val __obj = js.Dynamic.literal()
    if (accountPermissions != null) __obj.updateDynamic("accountPermissions")(accountPermissions)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[AccountPermissionsListResponse]
  }
}

