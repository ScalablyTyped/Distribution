package typings.googleAppsScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommentThreadSnippet extends js.Object {
  var canReply: js.UndefOr[Boolean] = js.undefined
  var channelId: js.UndefOr[String] = js.undefined
  var isPublic: js.UndefOr[Boolean] = js.undefined
  var topLevelComment: js.UndefOr[Comment] = js.undefined
  var totalReplyCount: js.UndefOr[Double] = js.undefined
  var videoId: js.UndefOr[String] = js.undefined
}

object CommentThreadSnippet {
  @scala.inline
  def apply(
    canReply: js.UndefOr[Boolean] = js.undefined,
    channelId: String = null,
    isPublic: js.UndefOr[Boolean] = js.undefined,
    topLevelComment: Comment = null,
    totalReplyCount: Int | Double = null,
    videoId: String = null
  ): CommentThreadSnippet = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(canReply)) __obj.updateDynamic("canReply")(canReply.asInstanceOf[js.Any])
    if (channelId != null) __obj.updateDynamic("channelId")(channelId.asInstanceOf[js.Any])
    if (!js.isUndefined(isPublic)) __obj.updateDynamic("isPublic")(isPublic.asInstanceOf[js.Any])
    if (topLevelComment != null) __obj.updateDynamic("topLevelComment")(topLevelComment.asInstanceOf[js.Any])
    if (totalReplyCount != null) __obj.updateDynamic("totalReplyCount")(totalReplyCount.asInstanceOf[js.Any])
    if (videoId != null) __obj.updateDynamic("videoId")(videoId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommentThreadSnippet]
  }
}

