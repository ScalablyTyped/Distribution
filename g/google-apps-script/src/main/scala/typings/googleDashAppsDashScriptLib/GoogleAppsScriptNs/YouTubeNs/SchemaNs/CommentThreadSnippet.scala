package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YouTubeNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommentThreadSnippet extends js.Object {
  var canReply: js.UndefOr[scala.Boolean] = js.undefined
  var channelId: js.UndefOr[java.lang.String] = js.undefined
  var isPublic: js.UndefOr[scala.Boolean] = js.undefined
  var topLevelComment: js.UndefOr[Comment] = js.undefined
  var totalReplyCount: js.UndefOr[scala.Double] = js.undefined
  var videoId: js.UndefOr[java.lang.String] = js.undefined
}

object CommentThreadSnippet {
  @scala.inline
  def apply(
    canReply: js.UndefOr[scala.Boolean] = js.undefined,
    channelId: java.lang.String = null,
    isPublic: js.UndefOr[scala.Boolean] = js.undefined,
    topLevelComment: Comment = null,
    totalReplyCount: scala.Int | scala.Double = null,
    videoId: java.lang.String = null
  ): CommentThreadSnippet = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(canReply)) __obj.updateDynamic("canReply")(canReply)
    if (channelId != null) __obj.updateDynamic("channelId")(channelId)
    if (!js.isUndefined(isPublic)) __obj.updateDynamic("isPublic")(isPublic)
    if (topLevelComment != null) __obj.updateDynamic("topLevelComment")(topLevelComment)
    if (totalReplyCount != null) __obj.updateDynamic("totalReplyCount")(totalReplyCount.asInstanceOf[js.Any])
    if (videoId != null) __obj.updateDynamic("videoId")(videoId)
    __obj.asInstanceOf[CommentThreadSnippet]
  }
}

