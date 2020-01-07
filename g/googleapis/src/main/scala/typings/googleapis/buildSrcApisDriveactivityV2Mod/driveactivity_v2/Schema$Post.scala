package typings.googleapis.buildSrcApisDriveactivityV2Mod.driveactivity_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A regular posted comment.
  */
@js.native
trait Schema$Post extends js.Object {
  /**
    * The sub-type of this event.
    */
  var subtype: js.UndefOr[String] = js.native
}

object Schema$Post {
  @scala.inline
  def apply(subtype: String = null): Schema$Post = {
    val __obj = js.Dynamic.literal()
    if (subtype != null) __obj.updateDynamic("subtype")(subtype.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Post]
  }
}

