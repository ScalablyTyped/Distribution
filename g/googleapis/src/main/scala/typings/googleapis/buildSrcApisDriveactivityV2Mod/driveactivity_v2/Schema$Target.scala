package typings.googleapis.buildSrcApisDriveactivityV2Mod.driveactivity_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about the target of activity.
  */
@js.native
trait Schema$Target extends js.Object {
  /**
    * The target is a Drive item.
    */
  var driveItem: js.UndefOr[Schema$DriveItem] = js.native
  /**
    * The target is a comment on a Drive file.
    */
  var fileComment: js.UndefOr[Schema$FileComment] = js.native
  /**
    * The target is a Team Drive.
    */
  var teamDrive: js.UndefOr[Schema$TeamDrive] = js.native
}

object Schema$Target {
  @scala.inline
  def apply(
    driveItem: Schema$DriveItem = null,
    fileComment: Schema$FileComment = null,
    teamDrive: Schema$TeamDrive = null
  ): Schema$Target = {
    val __obj = js.Dynamic.literal()
    if (driveItem != null) __obj.updateDynamic("driveItem")(driveItem.asInstanceOf[js.Any])
    if (fileComment != null) __obj.updateDynamic("fileComment")(fileComment.asInstanceOf[js.Any])
    if (teamDrive != null) __obj.updateDynamic("teamDrive")(teamDrive.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Target]
  }
}

