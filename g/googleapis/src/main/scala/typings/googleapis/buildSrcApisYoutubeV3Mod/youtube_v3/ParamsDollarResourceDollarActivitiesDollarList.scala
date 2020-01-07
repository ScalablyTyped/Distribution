package typings.googleapis.buildSrcApisYoutubeV3Mod.youtube_v3

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarActivitiesDollarList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The channelId parameter specifies a unique YouTube channel ID. The API
    * will then return a list of that channel's activities.
    */
  var channelId: js.UndefOr[String] = js.native
  /**
    * Set this parameter's value to true to retrieve the activity feed that
    * displays on the YouTube home page for the currently authenticated user.
    */
  var home: js.UndefOr[Boolean] = js.native
  /**
    * The maxResults parameter specifies the maximum number of items that
    * should be returned in the result set.
    */
  var maxResults: js.UndefOr[Double] = js.native
  /**
    * Set this parameter's value to true to retrieve a feed of the
    * authenticated user's activities.
    */
  var mine: js.UndefOr[Boolean] = js.native
  /**
    * The pageToken parameter identifies a specific page in the result set that
    * should be returned. In an API response, the nextPageToken and
    * prevPageToken properties identify other pages that could be retrieved.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * The part parameter specifies a comma-separated list of one or more
    * activity resource properties that the API response will include.  If the
    * parameter identifies a property that contains child properties, the child
    * properties will be included in the response. For example, in an activity
    * resource, the snippet property contains other properties that identify
    * the type of activity, a display title for the activity, and so forth. If
    * you set part=snippet, the API response will also contain all of those
    * nested properties.
    */
  var part: js.UndefOr[String] = js.native
  /**
    * The publishedAfter parameter specifies the earliest date and time that an
    * activity could have occurred for that activity to be included in the API
    * response. If the parameter value specifies a day, but not a time, then
    * any activities that occurred that day will be included in the result set.
    * The value is specified in ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ) format.
    */
  var publishedAfter: js.UndefOr[String] = js.native
  /**
    * The publishedBefore parameter specifies the date and time before which an
    * activity must have occurred for that activity to be included in the API
    * response. If the parameter value specifies a day, but not a time, then
    * any activities that occurred that day will be excluded from the result
    * set. The value is specified in ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ) format.
    */
  var publishedBefore: js.UndefOr[String] = js.native
  /**
    * The regionCode parameter instructs the API to return results for the
    * specified country. The parameter value is an ISO 3166-1 alpha-2 country
    * code. YouTube uses this value when the authorized user's previous
    * activity on YouTube does not provide enough information to generate the
    * activity feed.
    */
  var regionCode: js.UndefOr[String] = js.native
}

object ParamsDollarResourceDollarActivitiesDollarList {
  @scala.inline
  def apply(
    alt: String = null,
    auth: String | OAuth2Client | JWT | Compute | UserRefreshClient = null,
    channelId: String = null,
    fields: String = null,
    home: js.UndefOr[Boolean] = js.undefined,
    key: String = null,
    maxResults: Int | Double = null,
    mine: js.UndefOr[Boolean] = js.undefined,
    oauth_token: String = null,
    pageToken: String = null,
    part: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    publishedAfter: String = null,
    publishedBefore: String = null,
    quotaUser: String = null,
    regionCode: String = null,
    userIp: String = null
  ): ParamsDollarResourceDollarActivitiesDollarList = {
    val __obj = js.Dynamic.literal()
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (channelId != null) __obj.updateDynamic("channelId")(channelId.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (!js.isUndefined(home)) __obj.updateDynamic("home")(home.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (!js.isUndefined(mine)) __obj.updateDynamic("mine")(mine.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    if (part != null) __obj.updateDynamic("part")(part.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.asInstanceOf[js.Any])
    if (publishedAfter != null) __obj.updateDynamic("publishedAfter")(publishedAfter.asInstanceOf[js.Any])
    if (publishedBefore != null) __obj.updateDynamic("publishedBefore")(publishedBefore.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (regionCode != null) __obj.updateDynamic("regionCode")(regionCode.asInstanceOf[js.Any])
    if (userIp != null) __obj.updateDynamic("userIp")(userIp.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsDollarResourceDollarActivitiesDollarList]
  }
}

