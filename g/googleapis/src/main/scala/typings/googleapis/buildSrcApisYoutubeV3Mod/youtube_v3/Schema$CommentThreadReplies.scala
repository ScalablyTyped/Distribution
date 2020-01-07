package typings.googleapis.buildSrcApisYoutubeV3Mod.youtube_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Comments written in (direct or indirect) reply to the top level comment.
  */
@js.native
trait Schema$CommentThreadReplies extends js.Object {
  /**
    * A limited number of replies. Unless the number of replies returned equals
    * total_reply_count in the snippet the returned replies are only a subset
    * of the total number of replies.
    */
  var comments: js.UndefOr[js.Array[Schema$Comment]] = js.native
}

object Schema$CommentThreadReplies {
  @scala.inline
  def apply(comments: js.Array[Schema$Comment] = null): Schema$CommentThreadReplies = {
    val __obj = js.Dynamic.literal()
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CommentThreadReplies]
  }
}

