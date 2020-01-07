package typings.googleapis.buildSrcApisDriveactivityV2Mod.driveactivity_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about a Team Drive.
  */
@js.native
trait Schema$TeamDrive extends js.Object {
  /**
    * The resource name of the Team Drive. The format is
    * &quot;teamDrives/TEAM_DRIVE_ID&quot;.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The root of this Team Drive.
    */
  var root: js.UndefOr[Schema$DriveItem] = js.native
  /**
    * The title of the Team Drive.
    */
  var title: js.UndefOr[String] = js.native
}

object Schema$TeamDrive {
  @scala.inline
  def apply(name: String = null, root: Schema$DriveItem = null, title: String = null): Schema$TeamDrive = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$TeamDrive]
  }
}

