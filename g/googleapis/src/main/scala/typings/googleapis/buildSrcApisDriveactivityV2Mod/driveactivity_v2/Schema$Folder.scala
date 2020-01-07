package typings.googleapis.buildSrcApisDriveactivityV2Mod.driveactivity_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Drive item which is a folder.
  */
@js.native
trait Schema$Folder extends js.Object {
  /**
    * The type of Drive folder.
    */
  var `type`: js.UndefOr[String] = js.native
}

object Schema$Folder {
  @scala.inline
  def apply(`type`: String = null): Schema$Folder = {
    val __obj = js.Dynamic.literal()
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Folder]
  }
}

