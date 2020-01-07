package typings.googleapis.buildSrcApisDfareportingV3Dot1Mod.dfareporting_v3_1

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarChangelogsDollarList extends StandardParameters {
  /**
    * Select only change logs with the specified action.
    */
  var action: js.UndefOr[String] = js.native
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Select only change logs with these IDs.
    */
  var ids: js.UndefOr[js.Array[String]] = js.native
  /**
    * Select only change logs whose change time is before the specified
    * maxChangeTime.The time should be formatted as an RFC3339 date/time
    * string. For example, for 10:54 PM on July 18th, 2015, in the America/New
    * York time zone, the format is "2015-07-18T22:54:00-04:00". In other
    * words, the year, month, day, the letter T, the hour (24-hour clock
    * system), minute, second, and then the time zone offset.
    */
  var maxChangeTime: js.UndefOr[String] = js.native
  /**
    * Maximum number of results to return.
    */
  var maxResults: js.UndefOr[Double] = js.native
  /**
    * Select only change logs whose change time is before the specified
    * minChangeTime.The time should be formatted as an RFC3339 date/time
    * string. For example, for 10:54 PM on July 18th, 2015, in the America/New
    * York time zone, the format is "2015-07-18T22:54:00-04:00". In other
    * words, the year, month, day, the letter T, the hour (24-hour clock
    * system), minute, second, and then the time zone offset.
    */
  var minChangeTime: js.UndefOr[String] = js.native
  /**
    * Select only change logs with these object IDs.
    */
  var objectIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * Select only change logs with the specified object type.
    */
  var objectType: js.UndefOr[String] = js.native
  /**
    * Value of the nextPageToken from the previous result page.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * User profile ID associated with this request.
    */
  var profileId: js.UndefOr[String] = js.native
  /**
    * Select only change logs whose object ID, user name, old or new values
    * match the search string.
    */
  var searchString: js.UndefOr[String] = js.native
  /**
    * Select only change logs with these user profile IDs.
    */
  var userProfileIds: js.UndefOr[js.Array[String]] = js.native
}

object ParamsDollarResourceDollarChangelogsDollarList {
  @scala.inline
  def apply(
    action: String = null,
    alt: String = null,
    auth: String | OAuth2Client | JWT | Compute | UserRefreshClient = null,
    fields: String = null,
    ids: js.Array[String] = null,
    key: String = null,
    maxChangeTime: String = null,
    maxResults: Int | Double = null,
    minChangeTime: String = null,
    oauth_token: String = null,
    objectIds: js.Array[String] = null,
    objectType: String = null,
    pageToken: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    profileId: String = null,
    quotaUser: String = null,
    searchString: String = null,
    userIp: String = null,
    userProfileIds: js.Array[String] = null
  ): ParamsDollarResourceDollarChangelogsDollarList = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (ids != null) __obj.updateDynamic("ids")(ids.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (maxChangeTime != null) __obj.updateDynamic("maxChangeTime")(maxChangeTime.asInstanceOf[js.Any])
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (minChangeTime != null) __obj.updateDynamic("minChangeTime")(minChangeTime.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (objectIds != null) __obj.updateDynamic("objectIds")(objectIds.asInstanceOf[js.Any])
    if (objectType != null) __obj.updateDynamic("objectType")(objectType.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.asInstanceOf[js.Any])
    if (profileId != null) __obj.updateDynamic("profileId")(profileId.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (searchString != null) __obj.updateDynamic("searchString")(searchString.asInstanceOf[js.Any])
    if (userIp != null) __obj.updateDynamic("userIp")(userIp.asInstanceOf[js.Any])
    if (userProfileIds != null) __obj.updateDynamic("userProfileIds")(userProfileIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsDollarResourceDollarChangelogsDollarList]
  }
}

