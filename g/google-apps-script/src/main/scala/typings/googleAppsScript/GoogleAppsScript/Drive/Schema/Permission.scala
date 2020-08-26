package typings.googleAppsScript.GoogleAppsScript.Drive.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Permission extends js.Object {
  var additionalRoles: js.UndefOr[js.Array[String]] = js.native
  var authKey: js.UndefOr[String] = js.native
  var deleted: js.UndefOr[Boolean] = js.native
  var domain: js.UndefOr[String] = js.native
  var emailAddress: js.UndefOr[String] = js.native
  var etag: js.UndefOr[String] = js.native
  var expirationDate: js.UndefOr[String] = js.native
  var id: js.UndefOr[String] = js.native
  var kind: js.UndefOr[String] = js.native
  var name: js.UndefOr[String] = js.native
  var permissionDetails: js.UndefOr[js.Array[PermissionPermissionDetails]] = js.native
  var photoLink: js.UndefOr[String] = js.native
  var role: js.UndefOr[String] = js.native
  var selfLink: js.UndefOr[String] = js.native
  var teamDrivePermissionDetails: js.UndefOr[js.Array[PermissionTeamDrivePermissionDetails]] = js.native
  var `type`: js.UndefOr[String] = js.native
  var value: js.UndefOr[String] = js.native
  var withLink: js.UndefOr[Boolean] = js.native
}

object Permission {
  @scala.inline
  def apply(): Permission = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Permission]
  }
  @scala.inline
  implicit class PermissionOps[Self <: Permission] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAdditionalRolesVarargs(value: String*): Self = this.set("additionalRoles", js.Array(value :_*))
    @scala.inline
    def setAdditionalRoles(value: js.Array[String]): Self = this.set("additionalRoles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdditionalRoles: Self = this.set("additionalRoles", js.undefined)
    @scala.inline
    def setAuthKey(value: String): Self = this.set("authKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthKey: Self = this.set("authKey", js.undefined)
    @scala.inline
    def setDeleted(value: Boolean): Self = this.set("deleted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeleted: Self = this.set("deleted", js.undefined)
    @scala.inline
    def setDomain(value: String): Self = this.set("domain", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomain: Self = this.set("domain", js.undefined)
    @scala.inline
    def setEmailAddress(value: String): Self = this.set("emailAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmailAddress: Self = this.set("emailAddress", js.undefined)
    @scala.inline
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    @scala.inline
    def setExpirationDate(value: String): Self = this.set("expirationDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpirationDate: Self = this.set("expirationDate", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPermissionDetailsVarargs(value: PermissionPermissionDetails*): Self = this.set("permissionDetails", js.Array(value :_*))
    @scala.inline
    def setPermissionDetails(value: js.Array[PermissionPermissionDetails]): Self = this.set("permissionDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePermissionDetails: Self = this.set("permissionDetails", js.undefined)
    @scala.inline
    def setPhotoLink(value: String): Self = this.set("photoLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePhotoLink: Self = this.set("photoLink", js.undefined)
    @scala.inline
    def setRole(value: String): Self = this.set("role", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRole: Self = this.set("role", js.undefined)
    @scala.inline
    def setSelfLink(value: String): Self = this.set("selfLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelfLink: Self = this.set("selfLink", js.undefined)
    @scala.inline
    def setTeamDrivePermissionDetailsVarargs(value: PermissionTeamDrivePermissionDetails*): Self = this.set("teamDrivePermissionDetails", js.Array(value :_*))
    @scala.inline
    def setTeamDrivePermissionDetails(value: js.Array[PermissionTeamDrivePermissionDetails]): Self = this.set("teamDrivePermissionDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTeamDrivePermissionDetails: Self = this.set("teamDrivePermissionDetails", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    @scala.inline
    def setWithLink(value: Boolean): Self = this.set("withLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWithLink: Self = this.set("withLink", js.undefined)
  }
  
}

