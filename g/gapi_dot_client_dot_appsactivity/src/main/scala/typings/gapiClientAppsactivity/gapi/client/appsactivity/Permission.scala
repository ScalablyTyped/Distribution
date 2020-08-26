package typings.gapiClientAppsactivity.gapi.client.appsactivity

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Permission extends js.Object {
  /** The name of the user or group the permission applies to. */
  var name: js.UndefOr[String] = js.native
  /** The ID for this permission. Corresponds to the Drive API's permission ID returned as part of the Drive Permissions resource. */
  var permissionId: js.UndefOr[String] = js.native
  /** Indicates the Google Drive permissions role. The role determines a user's ability to read, write, or comment on the file. */
  var role: js.UndefOr[String] = js.native
  /** Indicates how widely permissions are granted. */
  var `type`: js.UndefOr[String] = js.native
  /** The user's information if the type is USER. */
  var user: js.UndefOr[User] = js.native
  /** Whether the permission requires a link to the file. */
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPermissionId(value: String): Self = this.set("permissionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePermissionId: Self = this.set("permissionId", js.undefined)
    @scala.inline
    def setRole(value: String): Self = this.set("role", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRole: Self = this.set("role", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setUser(value: User): Self = this.set("user", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUser: Self = this.set("user", js.undefined)
    @scala.inline
    def setWithLink(value: Boolean): Self = this.set("withLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWithLink: Self = this.set("withLink", js.undefined)
  }
  
}

