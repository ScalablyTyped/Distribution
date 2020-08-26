package typings.googleAppsScript.GoogleAppsScript.DriveActivity.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Permission extends js.Object {
  var allowDiscovery: js.UndefOr[Boolean] = js.native
  var anyone: js.UndefOr[js.Any] = js.native
  var domain: js.UndefOr[Domain] = js.native
  var group: js.UndefOr[Group] = js.native
  var role: js.UndefOr[String] = js.native
  var user: js.UndefOr[User] = js.native
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
    def setAllowDiscovery(value: Boolean): Self = this.set("allowDiscovery", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowDiscovery: Self = this.set("allowDiscovery", js.undefined)
    @scala.inline
    def setAnyone(value: js.Any): Self = this.set("anyone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnyone: Self = this.set("anyone", js.undefined)
    @scala.inline
    def setDomain(value: Domain): Self = this.set("domain", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomain: Self = this.set("domain", js.undefined)
    @scala.inline
    def setGroup(value: Group): Self = this.set("group", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroup: Self = this.set("group", js.undefined)
    @scala.inline
    def setRole(value: String): Self = this.set("role", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRole: Self = this.set("role", js.undefined)
    @scala.inline
    def setUser(value: User): Self = this.set("user", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUser: Self = this.set("user", js.undefined)
  }
  
}

