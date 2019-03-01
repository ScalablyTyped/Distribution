package typings
package gapiDotClientDotYoutubeLib.gapiNs.clientNs.youtubeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommentSnippet extends js.Object {
  /** The id of the author's YouTube channel, if any. */
  var authorChannelId: js.UndefOr[js.Any] = js.undefined
  /** Link to the author's YouTube channel, if any. */
  var authorChannelUrl: js.UndefOr[java.lang.String] = js.undefined
  /** The name of the user who posted the comment. */
  var authorDisplayName: js.UndefOr[java.lang.String] = js.undefined
  /** The URL for the avatar of the user who posted the comment. */
  var authorProfileImageUrl: js.UndefOr[java.lang.String] = js.undefined
  /** Whether the current viewer can rate this comment. */
  var canRate: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The id of the corresponding YouTube channel. In case of a channel comment this is the channel the comment refers to. In case of a video comment it's
    * the video's channel.
    */
  var channelId: js.UndefOr[java.lang.String] = js.undefined
  /** The total number of likes this comment has received. */
  var likeCount: js.UndefOr[scala.Double] = js.undefined
  /** The comment's moderation status. Will not be set if the comments were requested through the id filter. */
  var moderationStatus: js.UndefOr[java.lang.String] = js.undefined
  /** The unique id of the parent comment, only set for replies. */
  var parentId: js.UndefOr[java.lang.String] = js.undefined
  /** The date and time when the comment was orignally published. The value is specified in ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ) format. */
  var publishedAt: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The comment's text. The format is either plain text or HTML dependent on what has been requested. Even the plain text representation may differ from
    * the text originally posted in that it may replace video links with video titles etc.
    */
  var textDisplay: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The comment's original raw text as initially posted or last updated. The original text will only be returned if it is accessible to the viewer, which
    * is only guaranteed if the viewer is the comment's author.
    */
  var textOriginal: js.UndefOr[java.lang.String] = js.undefined
  /** The date and time when was last updated . The value is specified in ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ) format. */
  var updatedAt: js.UndefOr[java.lang.String] = js.undefined
  /** The ID of the video the comment refers to, if any. */
  var videoId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The rating the viewer has given to this comment. For the time being this will never return RATE_TYPE_DISLIKE and instead return RATE_TYPE_NONE. This
    * may change in the future.
    */
  var viewerRating: js.UndefOr[java.lang.String] = js.undefined
}

object CommentSnippet {
  @scala.inline
  def apply(
    authorChannelId: js.Any = null,
    authorChannelUrl: java.lang.String = null,
    authorDisplayName: java.lang.String = null,
    authorProfileImageUrl: java.lang.String = null,
    canRate: js.UndefOr[scala.Boolean] = js.undefined,
    channelId: java.lang.String = null,
    likeCount: scala.Int | scala.Double = null,
    moderationStatus: java.lang.String = null,
    parentId: java.lang.String = null,
    publishedAt: java.lang.String = null,
    textDisplay: java.lang.String = null,
    textOriginal: java.lang.String = null,
    updatedAt: java.lang.String = null,
    videoId: java.lang.String = null,
    viewerRating: java.lang.String = null
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

