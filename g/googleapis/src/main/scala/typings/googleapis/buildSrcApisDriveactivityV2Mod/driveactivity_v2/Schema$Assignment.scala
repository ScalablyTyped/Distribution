package typings.googleapis.buildSrcApisDriveactivityV2Mod.driveactivity_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A comment with an assignment.
  */
@js.native
trait Schema$Assignment extends js.Object {
  /**
    * The sub-type of this event.
    */
  var subtype: js.UndefOr[String] = js.native
}

object Schema$Assignment {
  @scala.inline
  def apply(subtype: String = null): Schema$Assignment = {
    val __obj = js.Dynamic.literal()
    if (subtype != null) __obj.updateDynamic("subtype")(subtype.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Assignment]
  }
}

