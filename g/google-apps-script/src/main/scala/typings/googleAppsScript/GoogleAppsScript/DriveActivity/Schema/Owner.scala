package typings.googleAppsScript.GoogleAppsScript.DriveActivity.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Owner extends js.Object {
  var domain: js.UndefOr[Domain] = js.undefined
  var teamDrive: js.UndefOr[TeamDriveReference] = js.undefined
  var user: js.UndefOr[User] = js.undefined
}

object Owner {
  @scala.inline
  def apply(domain: Domain = null, teamDrive: TeamDriveReference = null, user: User = null): Owner = {
    val __obj = js.Dynamic.literal()
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (teamDrive != null) __obj.updateDynamic("teamDrive")(teamDrive.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user.asInstanceOf[js.Any])
    __obj.asInstanceOf[Owner]
  }
}

