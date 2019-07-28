package typings.googleDashAppsDashScript.GoogleAppsScriptNs.DriveNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Permission extends js.Object {
  var additionalRoles: js.UndefOr[js.Array[String]] = js.undefined
  var authKey: js.UndefOr[String] = js.undefined
  var deleted: js.UndefOr[Boolean] = js.undefined
  var domain: js.UndefOr[String] = js.undefined
  var emailAddress: js.UndefOr[String] = js.undefined
  var etag: js.UndefOr[String] = js.undefined
  var expirationDate: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var permissionDetails: js.UndefOr[js.Array[PermissionPermissionDetails]] = js.undefined
  var photoLink: js.UndefOr[String] = js.undefined
  var role: js.UndefOr[String] = js.undefined
  var selfLink: js.UndefOr[String] = js.undefined
  var teamDrivePermissionDetails: js.UndefOr[js.Array[PermissionTeamDrivePermissionDetails]] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[String] = js.undefined
  var withLink: js.UndefOr[Boolean] = js.undefined
}

object Permission {
  @scala.inline
  def apply(
    additionalRoles: js.Array[String] = null,
    authKey: String = null,
    deleted: js.UndefOr[Boolean] = js.undefined,
    domain: String = null,
    emailAddress: String = null,
    etag: String = null,
    expirationDate: String = null,
    id: String = null,
    kind: String = null,
    name: String = null,
    permissionDetails: js.Array[PermissionPermissionDetails] = null,
    photoLink: String = null,
    role: String = null,
    selfLink: String = null,
    teamDrivePermissionDetails: js.Array[PermissionTeamDrivePermissionDetails] = null,
    `type`: String = null,
    value: String = null,
    withLink: js.UndefOr[Boolean] = js.undefined
  ): Permission = {
    val __obj = js.Dynamic.literal()
    if (additionalRoles != null) __obj.updateDynamic("additionalRoles")(additionalRoles)
    if (authKey != null) __obj.updateDynamic("authKey")(authKey)
    if (!js.isUndefined(deleted)) __obj.updateDynamic("deleted")(deleted)
    if (domain != null) __obj.updateDynamic("domain")(domain)
    if (emailAddress != null) __obj.updateDynamic("emailAddress")(emailAddress)
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (expirationDate != null) __obj.updateDynamic("expirationDate")(expirationDate)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (name != null) __obj.updateDynamic("name")(name)
    if (permissionDetails != null) __obj.updateDynamic("permissionDetails")(permissionDetails)
    if (photoLink != null) __obj.updateDynamic("photoLink")(photoLink)
    if (role != null) __obj.updateDynamic("role")(role)
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink)
    if (teamDrivePermissionDetails != null) __obj.updateDynamic("teamDrivePermissionDetails")(teamDrivePermissionDetails)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (value != null) __obj.updateDynamic("value")(value)
    if (!js.isUndefined(withLink)) __obj.updateDynamic("withLink")(withLink)
    __obj.asInstanceOf[Permission]
  }
}

