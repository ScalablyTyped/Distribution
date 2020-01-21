package typings.googleapis.chatV1Mod.chatV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A user in Hangouts Chat.
  */
@js.native
trait SchemaUser extends js.Object {
  /**
    * The user&#39;s display name.
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    * Resource name, in the format &quot;users/ *&quot;.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * User type.
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaUser {
  @scala.inline
  def apply(displayName: String = null, name: String = null, `type`: String = null): SchemaUser = {
    val __obj = js.Dynamic.literal()
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaUser]
  }
}

