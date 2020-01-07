package typings.googleapis.buildSrcApisChatV1Mod.chat_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A room or DM in Hangouts Chat.
  */
@js.native
trait Schema$Space extends js.Object {
  /**
    * Output only. The display name (only if the space is a room).
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    * Resource name of the space, in the form &quot;spaces/ *&quot;.  Example:
    * spaces/AAAAMpdlehYs
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Output only. The type of a space.
    */
  var `type`: js.UndefOr[String] = js.native
}

object Schema$Space {
  @scala.inline
  def apply(displayName: String = null, name: String = null, `type`: String = null): Schema$Space = {
    val __obj = js.Dynamic.literal()
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Space]
  }
}

