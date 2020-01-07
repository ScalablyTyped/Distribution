package typings.googleapis.buildSrcApisYoutubeV3Mod.youtube_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Basic details about a comment thread.
  */
@js.native
trait Schema$CommentThreadSnippet extends js.Object {
  /**
    * Whether the current viewer of the thread can reply to it. This is viewer
    * specific - other viewers may see a different value for this field.
    */
  var canReply: js.UndefOr[Boolean] = js.native
  /**
    * The YouTube channel the comments in the thread refer to or the channel
    * with the video the comments refer to. If video_id isn&#39;t set the
    * comments refer to the channel itself.
    */
  var channelId: js.UndefOr[String] = js.native
  /**
    * Whether the thread (and therefore all its comments) is visible to all
    * YouTube users.
    */
  var isPublic: js.UndefOr[Boolean] = js.native
  /**
    * The top level comment of this thread.
    */
  var topLevelComment: js.UndefOr[Schema$Comment] = js.native
  /**
    * The total number of replies (not including the top level comment).
    */
  var totalReplyCount: js.UndefOr[Double] = js.native
  /**
    * The ID of the video the comments refer to, if any. No video_id implies a
    * channel discussion comment.
    */
  var videoId: js.UndefOr[String] = js.native
}

object Schema$CommentThreadSnippet {
  @scala.inline
  def apply(
    canReply: js.UndefOr[Boolean] = js.undefined,
    channelId: String = null,
    isPublic: js.UndefOr[Boolean] = js.undefined,
    topLevelComment: Schema$Comment = null,
    totalReplyCount: Int | Double = null,
    videoId: String = null
  ): Schema$CommentThreadSnippet = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(canReply)) __obj.updateDynamic("canReply")(canReply.asInstanceOf[js.Any])
    if (channelId != null) __obj.updateDynamic("channelId")(channelId.asInstanceOf[js.Any])
    if (!js.isUndefined(isPublic)) __obj.updateDynamic("isPublic")(isPublic.asInstanceOf[js.Any])
    if (topLevelComment != null) __obj.updateDynamic("topLevelComment")(topLevelComment.asInstanceOf[js.Any])
    if (totalReplyCount != null) __obj.updateDynamic("totalReplyCount")(totalReplyCount.asInstanceOf[js.Any])
    if (videoId != null) __obj.updateDynamic("videoId")(videoId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CommentThreadSnippet]
  }
}

