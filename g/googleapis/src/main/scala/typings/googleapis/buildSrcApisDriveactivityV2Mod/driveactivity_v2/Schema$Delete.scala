package typings.googleapis.buildSrcApisDriveactivityV2Mod.driveactivity_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object was deleted.
  */
@js.native
trait Schema$Delete extends js.Object {
  /**
    * The type of delete action taken.
    */
  var `type`: js.UndefOr[String] = js.native
}

object Schema$Delete {
  @scala.inline
  def apply(`type`: String = null): Schema$Delete = {
    val __obj = js.Dynamic.literal()
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Delete]
  }
}

