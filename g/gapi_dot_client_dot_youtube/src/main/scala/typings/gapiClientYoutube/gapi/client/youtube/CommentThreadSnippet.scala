package typings.gapiClientYoutube.gapi.client.youtube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommentThreadSnippet extends js.Object {
  /** Whether the current viewer of the thread can reply to it. This is viewer specific - other viewers may see a different value for this field. */
  var canReply: js.UndefOr[Boolean] = js.native
  /**
    * The YouTube channel the comments in the thread refer to or the channel with the video the comments refer to. If video_id isn't set the comments refer
    * to the channel itself.
    */
  var channelId: js.UndefOr[String] = js.native
  /** Whether the thread (and therefore all its comments) is visible to all YouTube users. */
  var isPublic: js.UndefOr[Boolean] = js.native
  /** The top level comment of this thread. */
  var topLevelComment: js.UndefOr[Comment] = js.native
  /** The total number of replies (not including the top level comment). */
  var totalReplyCount: js.UndefOr[Double] = js.native
  /** The ID of the video the comments refer to, if any. No video_id implies a channel discussion comment. */
  var videoId: js.UndefOr[String] = js.native
}

object CommentThreadSnippet {
  @scala.inline
  def apply(): CommentThreadSnippet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommentThreadSnippet]
  }
  @scala.inline
  implicit class CommentThreadSnippetOps[Self <: CommentThreadSnippet] (val x: Self) extends AnyVal {
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
    def setCanReply(value: Boolean): Self = this.set("canReply", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCanReply: Self = this.set("canReply", js.undefined)
    @scala.inline
    def setChannelId(value: String): Self = this.set("channelId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChannelId: Self = this.set("channelId", js.undefined)
    @scala.inline
    def setIsPublic(value: Boolean): Self = this.set("isPublic", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsPublic: Self = this.set("isPublic", js.undefined)
    @scala.inline
    def setTopLevelComment(value: Comment): Self = this.set("topLevelComment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTopLevelComment: Self = this.set("topLevelComment", js.undefined)
    @scala.inline
    def setTotalReplyCount(value: Double): Self = this.set("totalReplyCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotalReplyCount: Self = this.set("totalReplyCount", js.undefined)
    @scala.inline
    def setVideoId(value: String): Self = this.set("videoId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVideoId: Self = this.set("videoId", js.undefined)
  }
  
}

