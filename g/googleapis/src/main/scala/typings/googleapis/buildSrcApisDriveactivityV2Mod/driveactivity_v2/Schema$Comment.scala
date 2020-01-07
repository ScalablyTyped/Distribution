package typings.googleapis.buildSrcApisDriveactivityV2Mod.driveactivity_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A change about comments on an object.
  */
@js.native
trait Schema$Comment extends js.Object {
  /**
    * A change on an assignment.
    */
  var assignment: js.UndefOr[Schema$Assignment] = js.native
  /**
    * Users who are mentioned in this comment.
    */
  var mentionedUsers: js.UndefOr[js.Array[Schema$User]] = js.native
  /**
    * A change on a regular posted comment.
    */
  var post: js.UndefOr[Schema$Post] = js.native
  /**
    * A change on a suggestion.
    */
  var suggestion: js.UndefOr[Schema$Suggestion] = js.native
}

object Schema$Comment {
  @scala.inline
  def apply(
    assignment: Schema$Assignment = null,
    mentionedUsers: js.Array[Schema$User] = null,
    post: Schema$Post = null,
    suggestion: Schema$Suggestion = null
  ): Schema$Comment = {
    val __obj = js.Dynamic.literal()
    if (assignment != null) __obj.updateDynamic("assignment")(assignment.asInstanceOf[js.Any])
    if (mentionedUsers != null) __obj.updateDynamic("mentionedUsers")(mentionedUsers.asInstanceOf[js.Any])
    if (post != null) __obj.updateDynamic("post")(post.asInstanceOf[js.Any])
    if (suggestion != null) __obj.updateDynamic("suggestion")(suggestion.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Comment]
  }
}

