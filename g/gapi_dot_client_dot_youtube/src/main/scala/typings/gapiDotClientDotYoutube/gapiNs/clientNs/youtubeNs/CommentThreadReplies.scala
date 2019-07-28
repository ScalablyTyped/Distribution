package typings.gapiDotClientDotYoutube.gapiNs.clientNs.youtubeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommentThreadReplies extends js.Object {
  /**
    * A limited number of replies. Unless the number of replies returned equals total_reply_count in the snippet the returned replies are only a subset of
    * the total number of replies.
    */
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

