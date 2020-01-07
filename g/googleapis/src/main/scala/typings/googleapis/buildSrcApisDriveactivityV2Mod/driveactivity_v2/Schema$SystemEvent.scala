package typings.googleapis.buildSrcApisDriveactivityV2Mod.driveactivity_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Event triggered by system operations instead of end users.
  */
@js.native
trait Schema$SystemEvent extends js.Object {
  /**
    * The type of the system event that may triggered activity.
    */
  var `type`: js.UndefOr[String] = js.native
}

object Schema$SystemEvent {
  @scala.inline
  def apply(`type`: String = null): Schema$SystemEvent = {
    val __obj = js.Dynamic.literal()
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$SystemEvent]
  }
}

