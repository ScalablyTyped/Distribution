package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YouTubeNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommentThreadReplies extends js.Object {
  var comments: js.UndefOr[js.Array[Comment]] = js.undefined
}

object CommentThreadReplies {
  @scala.inline
  def apply(comments: js.Array[Comment] = null): CommentThreadReplies = {
    val __obj = js.Dynamic.literal()
    if (comments != null) __obj.updateDynamic("comments")(comments)
    __obj.asInstanceOf[CommentThreadReplies]
  }
}

