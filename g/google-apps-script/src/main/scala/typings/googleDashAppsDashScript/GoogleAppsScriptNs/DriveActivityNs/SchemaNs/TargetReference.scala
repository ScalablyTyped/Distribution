package typings.googleDashAppsDashScript.GoogleAppsScriptNs.DriveActivityNs.SchemaNs

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
    if (driveItem != null) __obj.updateDynamic("driveItem")(driveItem)
    if (teamDrive != null) __obj.updateDynamic("teamDrive")(teamDrive)
    __obj.asInstanceOf[TargetReference]
  }
}

