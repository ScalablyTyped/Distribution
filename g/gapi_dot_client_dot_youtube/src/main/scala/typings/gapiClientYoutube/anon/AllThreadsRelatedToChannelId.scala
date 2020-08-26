package typings.gapiClientYoutube.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AllThreadsRelatedToChannelId extends js.Object {
  /**
    * The allThreadsRelatedToChannelId parameter instructs the API to return all comment threads associated with the specified channel. The response can
    * include comments about the channel or about the channel's videos.
    */
  var allThreadsRelatedToChannelId: js.UndefOr[String] = js.native
  /** Data format for the response. */
  var alt: js.UndefOr[String] = js.native
  /**
    * The channelId parameter instructs the API to return comment threads containing comments about the specified channel. (The response will not include
    * comments left on videos that the channel uploaded.)
    */
  var channelId: js.UndefOr[String] = js.native
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.native
  /** The id parameter specifies a comma-separated list of comment thread IDs for the resources that should be retrieved. */
  var id: js.UndefOr[String] = js.native
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.native
  /**
    * The maxResults parameter specifies the maximum number of items that should be returned in the result set.
    *
    * Note: This parameter is not supported for use in conjunction with the id parameter.
    */
  var maxResults: js.UndefOr[Double] = js.native
  /**
    * Set this parameter to limit the returned comment threads to a particular moderation state.
    *
    * Note: This parameter is not supported for use in conjunction with the id parameter.
    */
  var moderationStatus: js.UndefOr[String] = js.native
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.native
  /**
    * The order parameter specifies the order in which the API response should list comment threads. Valid values are:
    * - time - Comment threads are ordered by time. This is the default behavior.
    * - relevance - Comment threads are ordered by relevance.Note: This parameter is not supported for use in conjunction with the id parameter.
    */
  var order: js.UndefOr[String] = js.native
  /**
    * The pageToken parameter identifies a specific page in the result set that should be returned. In an API response, the nextPageToken property identifies
    * the next page of the result that can be retrieved.
    *
    * Note: This parameter is not supported for use in conjunction with the id parameter.
    */
  var pageToken: js.UndefOr[String] = js.native
  /** The part parameter specifies a comma-separated list of one or more commentThread resource properties that the API response will include. */
  var part: String = js.native
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.native
  /**
    * Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters.
    * Overrides userIp if both are provided.
    */
  var quotaUser: js.UndefOr[String] = js.native
  /**
    * The searchTerms parameter instructs the API to limit the API response to only contain comments that contain the specified search terms.
    *
    * Note: This parameter is not supported for use in conjunction with the id parameter.
    */
  var searchTerms: js.UndefOr[String] = js.native
  /** Set this parameter's value to html or plainText to instruct the API to return the comments left by users in html formatted or in plain text. */
  var textFormat: js.UndefOr[String] = js.native
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[String] = js.native
  /** The videoId parameter instructs the API to return comment threads associated with the specified video ID. */
  var videoId: js.UndefOr[String] = js.native
}

object AllThreadsRelatedToChannelId {
  @scala.inline
  def apply(part: String): AllThreadsRelatedToChannelId = {
    val __obj = js.Dynamic.literal(part = part.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllThreadsRelatedToChannelId]
  }
  @scala.inline
  implicit class AllThreadsRelatedToChannelIdOps[Self <: AllThreadsRelatedToChannelId] (val x: Self) extends AnyVal {
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
    def setPart(value: String): Self = this.set("part", value.asInstanceOf[js.Any])
    @scala.inline
    def setAllThreadsRelatedToChannelId(value: String): Self = this.set("allThreadsRelatedToChannelId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllThreadsRelatedToChannelId: Self = this.set("allThreadsRelatedToChannelId", js.undefined)
    @scala.inline
    def setAlt(value: String): Self = this.set("alt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlt: Self = this.set("alt", js.undefined)
    @scala.inline
    def setChannelId(value: String): Self = this.set("channelId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChannelId: Self = this.set("channelId", js.undefined)
    @scala.inline
    def setFields(value: String): Self = this.set("fields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setMaxResults(value: Double): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    @scala.inline
    def setModerationStatus(value: String): Self = this.set("moderationStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModerationStatus: Self = this.set("moderationStatus", js.undefined)
    @scala.inline
    def setOauth_token(value: String): Self = this.set("oauth_token", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOauth_token: Self = this.set("oauth_token", js.undefined)
    @scala.inline
    def setOrder(value: String): Self = this.set("order", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrder: Self = this.set("order", js.undefined)
    @scala.inline
    def setPageToken(value: String): Self = this.set("pageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageToken: Self = this.set("pageToken", js.undefined)
    @scala.inline
    def setPrettyPrint(value: Boolean): Self = this.set("prettyPrint", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrettyPrint: Self = this.set("prettyPrint", js.undefined)
    @scala.inline
    def setQuotaUser(value: String): Self = this.set("quotaUser", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuotaUser: Self = this.set("quotaUser", js.undefined)
    @scala.inline
    def setSearchTerms(value: String): Self = this.set("searchTerms", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSearchTerms: Self = this.set("searchTerms", js.undefined)
    @scala.inline
    def setTextFormat(value: String): Self = this.set("textFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextFormat: Self = this.set("textFormat", js.undefined)
    @scala.inline
    def setUserIp(value: String): Self = this.set("userIp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserIp: Self = this.set("userIp", js.undefined)
    @scala.inline
    def setVideoId(value: String): Self = this.set("videoId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVideoId: Self = this.set("videoId", js.undefined)
  }
  
}

