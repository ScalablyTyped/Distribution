package typings.gapiClientYoutube.gapi.client.youtube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommentSnippet extends js.Object {
  /** The id of the author's YouTube channel, if any. */
  var authorChannelId: js.UndefOr[js.Any] = js.undefined
  /** Link to the author's YouTube channel, if any. */
  var authorChannelUrl: js.UndefOr[String] = js.undefined
  /** The name of the user who posted the comment. */
  var authorDisplayName: js.UndefOr[String] = js.undefined
  /** The URL for the avatar of the user who posted the comment. */
  var authorProfileImageUrl: js.UndefOr[String] = js.undefined
  /** Whether the current viewer can rate this comment. */
  var canRate: js.UndefOr[Boolean] = js.undefined
  /**
    * The id of the corresponding YouTube channel. In case of a channel comment this is the channel the comment refers to. In case of a video comment it's
    * the video's channel.
    */
  var channelId: js.UndefOr[String] = js.undefined
  /** The total number of likes this comment has received. */
  var likeCount: js.UndefOr[Double] = js.undefined
  /** The comment's moderation status. Will not be set if the comments were requested through the id filter. */
  var moderationStatus: js.UndefOr[String] = js.undefined
  /** The unique id of the parent comment, only set for replies. */
  var parentId: js.UndefOr[String] = js.undefined
  /** The date and time when the comment was orignally published. The value is specified in ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ) format. */
  var publishedAt: js.UndefOr[String] = js.undefined
  /**
    * The comment's text. The format is either plain text or HTML dependent on what has been requested. Even the plain text representation may differ from
    * the text originally posted in that it may replace video links with video titles etc.
    */
  var textDisplay: js.UndefOr[String] = js.undefined
  /**
    * The comment's original raw text as initially posted or last updated. The original text will only be returned if it is accessible to the viewer, which
    * is only guaranteed if the viewer is the comment's author.
    */
  var textOriginal: js.UndefOr[String] = js.undefined
  /** The date and time when was last updated . The value is specified in ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ) format. */
  var updatedAt: js.UndefOr[String] = js.undefined
  /** The ID of the video the comment refers to, if any. */
  var videoId: js.UndefOr[String] = js.undefined
  /**
    * The rating the viewer has given to this comment. For the time being this will never return RATE_TYPE_DISLIKE and instead return RATE_TYPE_NONE. This
    * may change in the future.
    */
  var viewerRating: js.UndefOr[String] = js.undefined
}

object CommentSnippet {
  @scala.inline
  def apply(
    authorChannelId: js.Any = null,
    authorChannelUrl: String = null,
    authorDisplayName: String = null,
    authorProfileImageUrl: String = null,
    canRate: js.UndefOr[Boolean] = js.undefined,
    channelId: String = null,
    likeCount: js.UndefOr[Double] = js.undefined,
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
    if (authorChannelId != null) __obj.updateDynamic("authorChannelId")(authorChannelId.asInstanceOf[js.Any])
    if (authorChannelUrl != null) __obj.updateDynamic("authorChannelUrl")(authorChannelUrl.asInstanceOf[js.Any])
    if (authorDisplayName != null) __obj.updateDynamic("authorDisplayName")(authorDisplayName.asInstanceOf[js.Any])
    if (authorProfileImageUrl != null) __obj.updateDynamic("authorProfileImageUrl")(authorProfileImageUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(canRate)) __obj.updateDynamic("canRate")(canRate.get.asInstanceOf[js.Any])
    if (channelId != null) __obj.updateDynamic("channelId")(channelId.asInstanceOf[js.Any])
    if (!js.isUndefined(likeCount)) __obj.updateDynamic("likeCount")(likeCount.get.asInstanceOf[js.Any])
    if (moderationStatus != null) __obj.updateDynamic("moderationStatus")(moderationStatus.asInstanceOf[js.Any])
    if (parentId != null) __obj.updateDynamic("parentId")(parentId.asInstanceOf[js.Any])
    if (publishedAt != null) __obj.updateDynamic("publishedAt")(publishedAt.asInstanceOf[js.Any])
    if (textDisplay != null) __obj.updateDynamic("textDisplay")(textDisplay.asInstanceOf[js.Any])
    if (textOriginal != null) __obj.updateDynamic("textOriginal")(textOriginal.asInstanceOf[js.Any])
    if (updatedAt != null) __obj.updateDynamic("updatedAt")(updatedAt.asInstanceOf[js.Any])
    if (videoId != null) __obj.updateDynamic("videoId")(videoId.asInstanceOf[js.Any])
    if (viewerRating != null) __obj.updateDynamic("viewerRating")(viewerRating.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommentSnippet]
  }
}

