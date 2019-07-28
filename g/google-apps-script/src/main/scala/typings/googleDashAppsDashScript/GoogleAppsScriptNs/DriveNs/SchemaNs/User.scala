package typings.googleDashAppsDashScript.GoogleAppsScriptNs.DriveNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait User extends js.Object {
  var displayName: js.UndefOr[String] = js.undefined
  var emailAddress: js.UndefOr[String] = js.undefined
  var isAuthenticatedUser: js.UndefOr[Boolean] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var permissionId: js.UndefOr[String] = js.undefined
  var picture: js.UndefOr[UserPicture] = js.undefined
}

object User {
  @scala.inline
  def apply(
    displayName: String = null,
    emailAddress: String = null,
    isAuthenticatedUser: js.UndefOr[Boolean] = js.undefined,
    kind: String = null,
    permissionId: String = null,
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

