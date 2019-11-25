package typings.googleDashAppsDashScript.GoogleAppsScript.DriveActivity.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetReference extends js.Object {
  var driveItem: js.UndefOr[DriveItemReference] = js.undefined
  var teamDrive: js.UndefOr[TeamDriveReference] = js.undefined
}

object TargetReference {
  @scala.inline
  def apply(driveItem: DriveItemReference = null, teamDrive: TeamDriveReference = null): TargetReference = {
    val __obj = js.Dynamic.literal()
    if (driveItem != null) __obj.updateDynamic("driveItem")(driveItem.asInstanceOf[js.Any])
    if (teamDrive != null) __obj.updateDynamic("teamDrive")(teamDrive.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetReference]
  }
}

