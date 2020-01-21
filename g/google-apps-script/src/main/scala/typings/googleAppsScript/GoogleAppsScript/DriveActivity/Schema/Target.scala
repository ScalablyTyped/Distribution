package typings.googleAppsScript.GoogleAppsScript.DriveActivity.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Target extends js.Object {
  var driveItem: js.UndefOr[DriveItem] = js.undefined
  var fileComment: js.UndefOr[js.Any] = js.undefined
  var teamDrive: js.UndefOr[TeamDrive] = js.undefined
}

object Target {
  @scala.inline
  def apply(driveItem: DriveItem = null, fileComment: js.Any = null, teamDrive: TeamDrive = null): Target = {
    val __obj = js.Dynamic.literal()
    if (driveItem != null) __obj.updateDynamic("driveItem")(driveItem.asInstanceOf[js.Any])
    if (fileComment != null) __obj.updateDynamic("fileComment")(fileComment.asInstanceOf[js.Any])
    if (teamDrive != null) __obj.updateDynamic("teamDrive")(teamDrive.asInstanceOf[js.Any])
    __obj.asInstanceOf[Target]
  }
}

