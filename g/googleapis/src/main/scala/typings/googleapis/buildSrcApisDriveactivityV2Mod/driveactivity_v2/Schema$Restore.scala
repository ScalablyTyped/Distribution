package typings.googleapis.buildSrcApisDriveactivityV2Mod.driveactivity_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A deleted object was restored.
  */
@js.native
trait Schema$Restore extends js.Object {
  /**
    * The type of restore action taken.
    */
  var `type`: js.UndefOr[String] = js.native
}

object Schema$Restore {
  @scala.inline
  def apply(`type`: String = null): Schema$Restore = {
    val __obj = js.Dynamic.literal()
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Restore]
  }
}

