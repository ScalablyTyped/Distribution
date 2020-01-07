package typings.googleapis.buildSrcApisDriveactivityV2Mod.driveactivity_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A lightweight reference to the target of activity.
  */
@js.native
trait Schema$TargetReference extends js.Object {
  /**
    * The target is a Drive item.
    */
  var driveItem: js.UndefOr[Schema$DriveItemReference] = js.native
  /**
    * The target is a Team Drive.
    */
  var teamDrive: js.UndefOr[Schema$TeamDriveReference] = js.native
}

object Schema$TargetReference {
  @scala.inline
  def apply(driveItem: Schema$DriveItemReference = null, teamDrive: Schema$TeamDriveReference = null): Schema$TargetReference = {
    val __obj = js.Dynamic.literal()
    if (driveItem != null) __obj.updateDynamic("driveItem")(driveItem.asInstanceOf[js.Any])
    if (teamDrive != null) __obj.updateDynamic("teamDrive")(teamDrive.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$TargetReference]
  }
}

