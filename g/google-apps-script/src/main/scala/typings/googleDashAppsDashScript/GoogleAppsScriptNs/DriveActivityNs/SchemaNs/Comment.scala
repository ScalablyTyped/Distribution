package typings.googleDashAppsDashScript.GoogleAppsScriptNs.DriveActivityNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Comment extends js.Object {
  var assignment: js.UndefOr[Assignment] = js.undefined
  var mentionedUsers: js.UndefOr[js.Array[User]] = js.undefined
  var post: js.UndefOr[Post] = js.undefined
  var suggestion: js.UndefOr[Suggestion] = js.undefined
}

object Comment {
  @scala.inline
  def apply(
    assignment: Assignment = null,
    mentionedUsers: js.Array[User] = null,
    post: Post = null,
    suggestion: Suggestion = null
  ): Comment = {
    val __obj = js.Dynamic.literal()
    if (assignment != null) __obj.updateDynamic("assignment")(assignment)
    if (mentionedUsers != null) __obj.updateDynamic("mentionedUsers")(mentionedUsers)
    if (post != null) __obj.updateDynamic("post")(post)
    if (suggestion != null) __obj.updateDynamic("suggestion")(suggestion)
    __obj.asInstanceOf[Comment]
  }
}

