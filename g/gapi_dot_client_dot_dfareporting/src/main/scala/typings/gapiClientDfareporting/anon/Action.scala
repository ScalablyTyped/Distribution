package typings.gapiClientDfareporting.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Action extends js.Object {
  /** Select only change logs with the specified action. */
  var action: js.UndefOr[String] = js.undefined
  /** Data format for the response. */
  var alt: js.UndefOr[String] = js.undefined
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.undefined
  /** Select only change logs with these IDs. */
  var ids: js.UndefOr[String] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.undefined
  /**
    * Select only change logs whose change time is before the specified maxChangeTime.The time should be formatted as an RFC3339 date/time string. For
    * example, for 10:54 PM on July 18th, 2015, in the America/New York time zone, the format is "2015-07-18T22:54:00-04:00". In other words, the year,
    * month, day, the letter T, the hour (24-hour clock system), minute, second, and then the time zone offset.
    */
  var maxChangeTime: js.UndefOr[String] = js.undefined
  /** Maximum number of results to return. */
  var maxResults: js.UndefOr[Double] = js.undefined
  /**
    * Select only change logs whose change time is before the specified minChangeTime.The time should be formatted as an RFC3339 date/time string. For
    * example, for 10:54 PM on July 18th, 2015, in the America/New York time zone, the format is "2015-07-18T22:54:00-04:00". In other words, the year,
    * month, day, the letter T, the hour (24-hour clock system), minute, second, and then the time zone offset.
    */
  var minChangeTime: js.UndefOr[String] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.undefined
  /** Select only change logs with these object IDs. */
  var objectIds: js.UndefOr[String] = js.undefined
  /** Select only change logs with the specified object type. */
  var objectType: js.UndefOr[String] = js.undefined
  /** Value of the nextPageToken from the previous result page. */
  var pageToken: js.UndefOr[String] = js.undefined
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.undefined
  /** User profile ID associated with this request. */
  var profileId: String
  /**
    * Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters.
    * Overrides userIp if both are provided.
    */
  var quotaUser: js.UndefOr[String] = js.undefined
  /** Select only change logs whose object ID, user name, old or new values match the search string. */
  var searchString: js.UndefOr[String] = js.undefined
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[String] = js.undefined
  /** Select only change logs with these user profile IDs. */
  var userProfileIds: js.UndefOr[String] = js.undefined
}

object Action {
  @scala.inline
  def apply(
    profileId: String,
    action: String = null,
    alt: String = null,
    fields: String = null,
    ids: String = null,
    key: String = null,
    maxChangeTime: String = null,
    maxResults: js.UndefOr[Double] = js.undefined,
    minChangeTime: String = null,
    oauth_token: String = null,
    objectIds: String = null,
    objectType: String = null,
    pageToken: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    quotaUser: String = null,
    searchString: String = null,
    userIp: String = null,
    userProfileIds: String = null
  ): Action = {
    val __obj = js.Dynamic.literal(profileId = profileId.asInstanceOf[js.Any])
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (ids != null) __obj.updateDynamic("ids")(ids.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (maxChangeTime != null) __obj.updateDynamic("maxChangeTime")(maxChangeTime.asInstanceOf[js.Any])
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults.get.asInstanceOf[js.Any])
    if (minChangeTime != null) __obj.updateDynamic("minChangeTime")(minChangeTime.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (objectIds != null) __obj.updateDynamic("objectIds")(objectIds.asInstanceOf[js.Any])
    if (objectType != null) __obj.updateDynamic("objectType")(objectType.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.get.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (searchString != null) __obj.updateDynamic("searchString")(searchString.asInstanceOf[js.Any])
    if (userIp != null) __obj.updateDynamic("userIp")(userIp.asInstanceOf[js.Any])
    if (userProfileIds != null) __obj.updateDynamic("userProfileIds")(userProfileIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action]
  }
}

