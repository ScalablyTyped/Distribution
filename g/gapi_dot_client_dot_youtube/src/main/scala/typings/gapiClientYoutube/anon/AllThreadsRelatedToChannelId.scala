package typings.gapiClientYoutube.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AllThreadsRelatedToChannelId extends js.Object {
  /**
    * The allThreadsRelatedToChannelId parameter instructs the API to return all comment threads associated with the specified channel. The response can
    * include comments about the channel or about the channel's videos.
    */
  var allThreadsRelatedToChannelId: js.UndefOr[String] = js.undefined
  /** Data format for the response. */
  var alt: js.UndefOr[String] = js.undefined
  /**
    * The channelId parameter instructs the API to return comment threads containing comments about the specified channel. (The response will not include
    * comments left on videos that the channel uploaded.)
    */
  var channelId: js.UndefOr[String] = js.undefined
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.undefined
  /** The id parameter specifies a comma-separated list of comment thread IDs for the resources that should be retrieved. */
  var id: js.UndefOr[String] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.undefined
  /**
    * The maxResults parameter specifies the maximum number of items that should be returned in the result set.
    *
    * Note: This parameter is not supported for use in conjunction with the id parameter.
    */
  var maxResults: js.UndefOr[Double] = js.undefined
  /**
    * Set this parameter to limit the returned comment threads to a particular moderation state.
    *
    * Note: This parameter is not supported for use in conjunction with the id parameter.
    */
  var moderationStatus: js.UndefOr[String] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.undefined
  /**
    * The order parameter specifies the order in which the API response should list comment threads. Valid values are:
    * - time - Comment threads are ordered by time. This is the default behavior.
    * - relevance - Comment threads are ordered by relevance.Note: This parameter is not supported for use in conjunction with the id parameter.
    */
  var order: js.UndefOr[String] = js.undefined
  /**
    * The pageToken parameter identifies a specific page in the result set that should be returned. In an API response, the nextPageToken property identifies
    * the next page of the result that can be retrieved.
    *
    * Note: This parameter is not supported for use in conjunction with the id parameter.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  /** The part parameter specifies a comma-separated list of one or more commentThread resource properties that the API response will include. */
  var part: String
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.undefined
  /**
    * Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters.
    * Overrides userIp if both are provided.
    */
  var quotaUser: js.UndefOr[String] = js.undefined
  /**
    * The searchTerms parameter instructs the API to limit the API response to only contain comments that contain the specified search terms.
    *
    * Note: This parameter is not supported for use in conjunction with the id parameter.
    */
  var searchTerms: js.UndefOr[String] = js.undefined
  /** Set this parameter's value to html or plainText to instruct the API to return the comments left by users in html formatted or in plain text. */
  var textFormat: js.UndefOr[String] = js.undefined
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[String] = js.undefined
  /** The videoId parameter instructs the API to return comment threads associated with the specified video ID. */
  var videoId: js.UndefOr[String] = js.undefined
}

object AllThreadsRelatedToChannelId {
  @scala.inline
  def apply(
    part: String,
    allThreadsRelatedToChannelId: String = null,
    alt: String = null,
    channelId: String = null,
    fields: String = null,
    id: String = null,
    key: String = null,
    maxResults: js.UndefOr[Double] = js.undefined,
    moderationStatus: String = null,
    oauth_token: String = null,
    order: String = null,
    pageToken: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    quotaUser: String = null,
    searchTerms: String = null,
    textFormat: String = null,
    userIp: String = null,
    videoId: String = null
  ): AllThreadsRelatedToChannelId = {
    val __obj = js.Dynamic.literal(part = part.asInstanceOf[js.Any])
    if (allThreadsRelatedToChannelId != null) __obj.updateDynamic("allThreadsRelatedToChannelId")(allThreadsRelatedToChannelId.asInstanceOf[js.Any])
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (channelId != null) __obj.updateDynamic("channelId")(channelId.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults.get.asInstanceOf[js.Any])
    if (moderationStatus != null) __obj.updateDynamic("moderationStatus")(moderationStatus.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.get.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (searchTerms != null) __obj.updateDynamic("searchTerms")(searchTerms.asInstanceOf[js.Any])
    if (textFormat != null) __obj.updateDynamic("textFormat")(textFormat.asInstanceOf[js.Any])
    if (userIp != null) __obj.updateDynamic("userIp")(userIp.asInstanceOf[js.Any])
    if (videoId != null) __obj.updateDynamic("videoId")(videoId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllThreadsRelatedToChannelId]
  }
}

