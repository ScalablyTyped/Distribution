package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserRolesListResponse extends js.Object {
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
  var userRoles: js.UndefOr[js.Array[UserRole]] = js.undefined
}

object UserRolesListResponse {
  @scala.inline
  def apply(
    kind: java.lang.String = null,
    nextPageToken: java.lang.String = null,
    userRoles: js.Array[UserRole] = null
  ): UserRolesListResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    if (userRoles != null) __obj.updateDynamic("userRoles")(userRoles)
    __obj.asInstanceOf[UserRolesListResponse]
  }
}

