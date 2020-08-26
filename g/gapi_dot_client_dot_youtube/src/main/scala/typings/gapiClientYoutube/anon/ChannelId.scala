package typings.gapiClientYoutube.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChannelId extends js.Object {
  /** Data format for the response. */
  var alt: js.UndefOr[String] = js.native
  /** The channelId parameter specifies a unique YouTube channel ID. The API will then return a list of that channel's activities. */
  var channelId: js.UndefOr[String] = js.native
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.native
  /** Set this parameter's value to true to retrieve the activity feed that displays on the YouTube home page for the currently authenticated user. */
  var home: js.UndefOr[Boolean] = js.native
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.native
  /** The maxResults parameter specifies the maximum number of items that should be returned in the result set. */
  var maxResults: js.UndefOr[Double] = js.native
  /** Set this parameter's value to true to retrieve a feed of the authenticated user's activities. */
  var mine: js.UndefOr[Boolean] = js.native
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.native
  /**
    * The pageToken parameter identifies a specific page in the result set that should be returned. In an API response, the nextPageToken and prevPageToken
    * properties identify other pages that could be retrieved.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * The part parameter specifies a comma-separated list of one or more activity resource properties that the API response will include.
    *
    * If the parameter identifies a property that contains child properties, the child properties will be included in the response. For example, in an
    * activity resource, the snippet property contains other properties that identify the type of activity, a display title for the activity, and so forth.
    * If you set part=snippet, the API response will also contain all of those nested properties.
    */
  var part: String = js.native
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.native
  /**
    * The publishedAfter parameter specifies the earliest date and time that an activity could have occurred for that activity to be included in the API
    * response. If the parameter value specifies a day, but not a time, then any activities that occurred that day will be included in the result set. The
    * value is specified in ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ) format.
    */
  var publishedAfter: js.UndefOr[String] = js.native
  /**
    * The publishedBefore parameter specifies the date and time before which an activity must have occurred for that activity to be included in the API
    * response. If the parameter value specifies a day, but not a time, then any activities that occurred that day will be excluded from the result set. The
    * value is specified in ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ) format.
    */
  var publishedBefore: js.UndefOr[String] = js.native
  /**
    * Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters.
    * Overrides userIp if both are provided.
    */
  var quotaUser: js.UndefOr[String] = js.native
  /**
    * The regionCode parameter instructs the API to return results for the specified country. The parameter value is an ISO 3166-1 alpha-2 country code.
    * YouTube uses this value when the authorized user's previous activity on YouTube does not provide enough information to generate the activity feed.
    */
  var regionCode: js.UndefOr[String] = js.native
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[String] = js.native
}

object ChannelId {
  @scala.inline
  def apply(part: String): ChannelId = {
    val __obj = js.Dynamic.literal(part = part.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelId]
  }
  @scala.inline
  implicit class ChannelIdOps[Self <: ChannelId] (val x: Self) extends AnyVal {
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
    def setHome(value: Boolean): Self = this.set("home", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHome: Self = this.set("home", js.undefined)
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setMaxResults(value: Double): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    @scala.inline
    def setMine(value: Boolean): Self = this.set("mine", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMine: Self = this.set("mine", js.undefined)
    @scala.inline
    def setOauth_token(value: String): Self = this.set("oauth_token", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOauth_token: Self = this.set("oauth_token", js.undefined)
    @scala.inline
    def setPageToken(value: String): Self = this.set("pageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageToken: Self = this.set("pageToken", js.undefined)
    @scala.inline
    def setPrettyPrint(value: Boolean): Self = this.set("prettyPrint", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrettyPrint: Self = this.set("prettyPrint", js.undefined)
    @scala.inline
    def setPublishedAfter(value: String): Self = this.set("publishedAfter", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePublishedAfter: Self = this.set("publishedAfter", js.undefined)
    @scala.inline
    def setPublishedBefore(value: String): Self = this.set("publishedBefore", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePublishedBefore: Self = this.set("publishedBefore", js.undefined)
    @scala.inline
    def setQuotaUser(value: String): Self = this.set("quotaUser", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuotaUser: Self = this.set("quotaUser", js.undefined)
    @scala.inline
    def setRegionCode(value: String): Self = this.set("regionCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegionCode: Self = this.set("regionCode", js.undefined)
    @scala.inline
    def setUserIp(value: String): Self = this.set("userIp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserIp: Self = this.set("userIp", js.undefined)
  }
  
}

