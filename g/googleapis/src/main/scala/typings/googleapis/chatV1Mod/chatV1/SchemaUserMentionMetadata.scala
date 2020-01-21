package typings.googleapis.chatV1Mod.chatV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Annotation metadata for user mentions (@).
  */
@js.native
trait SchemaUserMentionMetadata extends js.Object {
  /**
    * The type of user mention.
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * The user mentioned.
    */
  var user: js.UndefOr[SchemaUser] = js.native
}

object SchemaUserMentionMetadata {
  @scala.inline
  def apply(`type`: String = null, user: SchemaUser = null): SchemaUserMentionMetadata = {
    val __obj = js.Dynamic.literal()
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaUserMentionMetadata]
  }
}

