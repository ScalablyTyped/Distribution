package typings.googleapis.buildSrcApisChatV1Mod.chat_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Annotation metadata for user mentions (@).
  */
@js.native
trait Schema$UserMentionMetadata extends js.Object {
  /**
    * The type of user mention.
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * The user mentioned.
    */
  var user: js.UndefOr[Schema$User] = js.native
}

object Schema$UserMentionMetadata {
  @scala.inline
  def apply(`type`: String = null, user: Schema$User = null): Schema$UserMentionMetadata = {
    val __obj = js.Dynamic.literal()
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$UserMentionMetadata]
  }
}

