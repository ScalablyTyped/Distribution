package typings.gapiClientYoutube.gapi.client.youtube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommentThreadReplies extends js.Object {
  /**
    * A limited number of replies. Unless the number of replies returned equals total_reply_count in the snippet the returned replies are only a subset of
    * the total number of replies.
    */
  var comments: js.UndefOr[js.Array[Comment]] = js.native
}

object CommentThreadReplies {
  @scala.inline
  def apply(): CommentThreadReplies = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommentThreadReplies]
  }
  @scala.inline
  implicit class CommentThreadRepliesOps[Self <: CommentThreadReplies] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCommentsVarargs(value: Comment*): Self = this.set("comments", js.Array(value :_*))
    @scala.inline
    def setComments(value: js.Array[Comment]): Self = this.set("comments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComments: Self = this.set("comments", js.undefined)
  }
  
}

