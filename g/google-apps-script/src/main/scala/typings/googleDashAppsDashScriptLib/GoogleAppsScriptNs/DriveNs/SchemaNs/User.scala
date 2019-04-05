package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait User extends js.Object {
  var displayName: js.UndefOr[java.lang.String] = js.undefined
  var emailAddress: js.UndefOr[java.lang.String] = js.undefined
  var isAuthenticatedUser: js.UndefOr[scala.Boolean] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var permissionId: js.UndefOr[java.lang.String] = js.undefined
  var picture: js.UndefOr[UserPicture] = js.undefined
}

object User {
  @scala.inline
  def apply(
    displayName: java.lang.String = null,
    emailAddress: java.lang.String = null,
    isAuthenticatedUser: js.UndefOr[scala.Boolean] = js.undefined,
    kind: java.lang.String = null,
    permissionId: java.lang.String = null,
    picture: UserPicture = null
  ): User = {
    val __obj = js.Dynamic.literal()
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (emailAddress != null) __obj.updateDynamic("emailAddress")(emailAddress)
    if (!js.isUndefined(isAuthenticatedUser)) __obj.updateDynamic("isAuthenticatedUser")(isAuthenticatedUser)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (permissionId != null) __obj.updateDynamic("permissionId")(permissionId)
    if (picture != null) __obj.updateDynamic("picture")(picture)
    __obj.asInstanceOf[User]
  }
}

