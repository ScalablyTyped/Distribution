package typings
package gapiDotClientDotYoutubeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AltChannelId extends js.Object {
  /** Data format for the response. */
  var alt: js.UndefOr[java.lang.String] = js.undefined
  /** The channelId parameter specifies a unique YouTube channel ID. The API will then return a list of that channel's activities. */
  var channelId: js.UndefOr[java.lang.String] = js.undefined
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[java.lang.String] = js.undefined
  /** Set this parameter's value to true to retrieve the activity feed that displays on the YouTube home page for the currently authenticated user. */
  var home: js.UndefOr[scala.Boolean] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /** The maxResults parameter specifies the maximum number of items that should be returned in the result set. */
  var maxResults: js.UndefOr[scala.Double] = js.undefined
  /** Set this parameter's value to true to retrieve a feed of the authenticated user's activities. */
  var mine: js.UndefOr[scala.Boolean] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The pageToken parameter identifies a specific page in the result set that should be returned. In an API response, the nextPageToken and prevPageToken
    * properties identify other pages that could be retrieved.
    */
  var pageToken: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The part parameter specifies a comma-separated list of one or more activity resource properties that the API response will include.
    *
    * If the parameter identifies a property that contains child properties, the child properties will be included in the response. For example, in an
    * activity resource, the snippet property contains other properties that identify the type of activity, a display title for the activity, and so forth.
    * If you set part=snippet, the API response will also contain all of those nested properties.
    */
  var part: java.lang.String
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The publishedAfter parameter specifies the earliest date and time that an activity could have occurred for that activity to be included in the API
    * response. If the parameter value specifies a day, but not a time, then any activities that occurred that day will be included in the result set. The
    * value is specified in ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ) format.
    */
  var publishedAfter: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The publishedBefore parameter specifies the date and time before which an activity must have occurred for that activity to be included in the API
    * response. If the parameter value specifies a day, but not a time, then any activities that occurred that day will be excluded from the result set. The
    * value is specified in ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ) format.
    */
  var publishedBefore: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters.
    * Overrides userIp if both are provided.
    */
  var quotaUser: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The regionCode parameter instructs the API to return results for the specified country. The parameter value is an ISO 3166-1 alpha-2 country code.
    * YouTube uses this value when the authorized user's previous activity on YouTube does not provide enough information to generate the activity feed.
    */
  var regionCode: js.UndefOr[java.lang.String] = js.undefined
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_AltChannelId {
  @scala.inline
  def apply(
    part: java.lang.String,
    alt: java.lang.String = null,
    channelId: java.lang.String = null,
    fields: java.lang.String = null,
    home: js.UndefOr[scala.Boolean] = js.undefined,
    key: java.lang.String = null,
    maxResults: scala.Int | scala.Double = null,
    mine: js.UndefOr[scala.Boolean] = js.undefined,
    oauth_token: java.lang.String = null,
    pageToken: java.lang.String = null,
    prettyPrint: js.UndefOr[scala.Boolean] = js.undefined,
    publishedAfter: java.lang.String = null,
    publishedBefore: java.lang.String = null,
    quotaUser: java.lang.String = null,
    regionCode: java.lang.String = null,
    userIp: java.lang.String = null
  ): Anon_AltChannelId = {
    val __obj = js.Dynamic.literal(part = part)
    if (alt != null) __obj.updateDynamic("alt")(alt)
    if (channelId != null) __obj.updateDynamic("channelId")(channelId)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (!js.isUndefined(home)) __obj.updateDynamic("home")(home)
    if (key != null) __obj.updateDynamic("key")(key)
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (!js.isUndefined(mine)) __obj.updateDynamic("mine")(mine)
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token)
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken)
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint)
    if (publishedAfter != null) __obj.updateDynamic("publishedAfter")(publishedAfter)
    if (publishedBefore != null) __obj.updateDynamic("publishedBefore")(publishedBefore)
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser)
    if (regionCode != null) __obj.updateDynamic("regionCode")(regionCode)
    if (userIp != null) __obj.updateDynamic("userIp")(userIp)
    __obj.asInstanceOf[Anon_AltChannelId]
  }
}

