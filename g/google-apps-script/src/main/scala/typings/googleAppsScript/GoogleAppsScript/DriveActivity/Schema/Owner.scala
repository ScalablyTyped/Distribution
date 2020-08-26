package typings.googleAppsScript.GoogleAppsScript.DriveActivity.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Owner extends js.Object {
  var domain: js.UndefOr[Domain] = js.native
  var teamDrive: js.UndefOr[TeamDriveReference] = js.native
  var user: js.UndefOr[User] = js.native
}

object Owner {
  @scala.inline
  def apply(): Owner = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Owner]
  }
  @scala.inline
  implicit class OwnerOps[Self <: Owner] (val x: Self) extends AnyVal {
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
    def setDomain(value: Domain): Self = this.set("domain", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomain: Self = this.set("domain", js.undefined)
    @scala.inline
    def setTeamDrive(value: TeamDriveReference): Self = this.set("teamDrive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTeamDrive: Self = this.set("teamDrive", js.undefined)
    @scala.inline
    def setUser(value: User): Self = this.set("user", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUser: Self = this.set("user", js.undefined)
  }
  
}

