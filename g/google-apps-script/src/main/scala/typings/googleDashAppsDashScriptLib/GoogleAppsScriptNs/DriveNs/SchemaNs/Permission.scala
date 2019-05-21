package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Permission extends js.Object {
  var additionalRoles: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var authKey: js.UndefOr[java.lang.String] = js.undefined
  var deleted: js.UndefOr[scala.Boolean] = js.undefined
  var domain: js.UndefOr[java.lang.String] = js.undefined
  var emailAddress: js.UndefOr[java.lang.String] = js.undefined
  var etag: js.UndefOr[java.lang.String] = js.undefined
  var expirationDate: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var permissionDetails: js.UndefOr[js.Array[PermissionPermissionDetails]] = js.undefined
  var photoLink: js.UndefOr[java.lang.String] = js.undefined
  var role: js.UndefOr[java.lang.String] = js.undefined
  var selfLink: js.UndefOr[java.lang.String] = js.undefined
  var teamDrivePermissionDetails: js.UndefOr[js.Array[PermissionTeamDrivePermissionDetails]] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  var value: js.UndefOr[java.lang.String] = js.undefined
  var withLink: js.UndefOr[scala.Boolean] = js.undefined
}

object Permission {
  @scala.inline
  def apply(
    additionalRoles: js.Array[java.lang.String] = null,
    authKey: java.lang.String = null,
    deleted: js.UndefOr[scala.Boolean] = js.undefined,
    domain: java.lang.String = null,
    emailAddress: java.lang.String = null,
    etag: java.lang.String = null,
    expirationDate: java.lang.String = null,
    id: java.lang.String = null,
    kind: java.lang.String = null,
    name: java.lang.String = null,
    permissionDetails: js.Array[PermissionPermissionDetails] = null,
    photoLink: java.lang.String = null,
    role: java.lang.String = null,
    selfLink: java.lang.String = null,
    teamDrivePermissionDetails: js.Array[PermissionTeamDrivePermissionDetails] = null,
    `type`: java.lang.String = null,
    value: java.lang.String = null,
    withLink: js.UndefOr[scala.Boolean] = js.undefined
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

