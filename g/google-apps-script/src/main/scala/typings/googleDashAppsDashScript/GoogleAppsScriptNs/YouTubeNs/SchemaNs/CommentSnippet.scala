package typings.googleDashAppsDashScript.GoogleAppsScriptNs.YouTubeNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommentSnippet extends js.Object {
  var authorChannelId: js.UndefOr[js.Object] = js.undefined
  var authorChannelUrl: js.UndefOr[String] = js.undefined
  var authorDisplayName: js.UndefOr[String] = js.undefined
  var authorProfileImageUrl: js.UndefOr[String] = js.undefined
  var canRate: js.UndefOr[Boolean] = js.undefined
  var channelId: js.UndefOr[String] = js.undefined
  var likeCount: js.UndefOr[Double] = js.undefined
  var moderationStatus: js.UndefOr[String] = js.undefined
  var parentId: js.UndefOr[String] = js.undefined
  var publishedAt: js.UndefOr[String] = js.undefined
  var textDisplay: js.UndefOr[String] = js.undefined
  var textOriginal: js.UndefOr[String] = js.undefined
  var updatedAt: js.UndefOr[String] = js.undefined
  var videoId: js.UndefOr[String] = js.undefined
  var viewerRating: js.UndefOr[String] = js.undefined
}

object CommentSnippet {
  @scala.inline
  def apply(
    authorChannelId: js.Object = null,
    authorChannelUrl: String = null,
    authorDisplayName: String = null,
    authorProfileImageUrl: String = null,
    canRate: js.UndefOr[Boolean] = js.undefined,
    channelId: String = null,
    likeCount: Int | Double = null,
    moderationStatus: String = null,
    parentId: String = null,
    publishedAt: String = null,
    textDisplay: String = null,
    textOriginal: String = null,
    updatedAt: String = null,
    videoId: String = null,
    viewerRating: String = null
  ): CommentSnippet = {
    val __obj = js.Dynamic.literal()
    if (authorChannelId != null) __obj.updateDynamic("authorChannelId")(authorChannelId)
    if (authorChannelUrl != null) __obj.updateDynamic("authorChannelUrl")(authorChannelUrl)
    if (authorDisplayName != null) __obj.updateDynamic("authorDisplayName")(authorDisplayName)
    if (authorProfileImageUrl != null) __obj.updateDynamic("authorProfileImageUrl")(authorProfileImageUrl)
    if (!js.isUndefined(canRate)) __obj.updateDynamic("canRate")(canRate)
    if (channelId != null) __obj.updateDynamic("channelId")(channelId)
    if (likeCount != null) __obj.updateDynamic("likeCount")(likeCount.asInstanceOf[js.Any])
    if (moderationStatus != null) __obj.updateDynamic("moderationStatus")(moderationStatus)
    if (parentId != null) __obj.updateDynamic("parentId")(parentId)
    if (publishedAt != null) __obj.updateDynamic("publishedAt")(publishedAt)
    if (textDisplay != null) __obj.updateDynamic("textDisplay")(textDisplay)
    if (textOriginal != null) __obj.updateDynamic("textOriginal")(textOriginal)
    if (updatedAt != null) __obj.updateDynamic("updatedAt")(updatedAt)
    if (videoId != null) __obj.updateDynamic("videoId")(videoId)
    if (viewerRating != null) __obj.updateDynamic("viewerRating")(viewerRating)
    __obj.asInstanceOf[CommentSnippet]
  }
}

