package typings.googleapis.buildSrcApisDriveactivityV2Mod.driveactivity_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A change in the object&#39;s data leak prevention status.
  */
@js.native
trait Schema$DataLeakPreventionChange extends js.Object {
  /**
    * The type of Data Leak Prevention (DLP) change.
    */
  var `type`: js.UndefOr[String] = js.native
}

object Schema$DataLeakPreventionChange {
  @scala.inline
  def apply(`type`: String = null): Schema$DataLeakPreventionChange = {
    val __obj = js.Dynamic.literal()
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DataLeakPreventionChange]
  }
}

