package typings.googleapis.buildSrcApisDriveactivityV2Mod.driveactivity_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Activity in applications other than Drive.
  */
@js.native
trait Schema$ApplicationReference extends js.Object {
  /**
    * The reference type corresponding to this event.
    */
  var `type`: js.UndefOr[String] = js.native
}

object Schema$ApplicationReference {
  @scala.inline
  def apply(`type`: String = null): Schema$ApplicationReference = {
    val __obj = js.Dynamic.literal()
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ApplicationReference]
  }
}

