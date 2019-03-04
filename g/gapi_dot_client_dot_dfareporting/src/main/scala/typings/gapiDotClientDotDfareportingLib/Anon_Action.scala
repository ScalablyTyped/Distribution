package typings
package gapiDotClientDotDfareportingLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Action extends js.Object {
  /** Select only change logs with the specified action. */
  var action: js.UndefOr[java.lang.String] = js.undefined
  /** Data format for the response. */
  var alt: js.UndefOr[java.lang.String] = js.undefined
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[java.lang.String] = js.undefined
  /** Select only change logs with these IDs. */
  var ids: js.UndefOr[java.lang.String] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Select only change logs whose change time is before the specified maxChangeTime.The time should be formatted as an RFC3339 date/time string. For
    * example, for 10:54 PM on July 18th, 2015, in the America/New York time zone, the format is "2015-07-18T22:54:00-04:00". In other words, the year,
    * month, day, the letter T, the hour (24-hour clock system), minute, second, and then the time zone offset.
    */
  var maxChangeTime: js.UndefOr[java.lang.String] = js.undefined
  /** Maximum number of results to return. */
  var maxResults: js.UndefOr[scala.Double] = js.undefined
  /**
    * Select only change logs whose change time is before the specified minChangeTime.The time should be formatted as an RFC3339 date/time string. For
    * example, for 10:54 PM on July 18th, 2015, in the America/New York time zone, the format is "2015-07-18T22:54:00-04:00". In other words, the year,
    * month, day, the letter T, the hour (24-hour clock system), minute, second, and then the time zone offset.
    */
  var minChangeTime: js.UndefOr[java.lang.String] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[java.lang.String] = js.undefined
  /** Select only change logs with these object IDs. */
  var objectIds: js.UndefOr[java.lang.String] = js.undefined
  /** Select only change logs with the specified object type. */
  var objectType: js.UndefOr[java.lang.String] = js.undefined
  /** Value of the nextPageToken from the previous result page. */
  var pageToken: js.UndefOr[java.lang.String] = js.undefined
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[scala.Boolean] = js.undefined
  /** User profile ID associated with this request. */
  var profileId: java.lang.String
  /**
    * Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters.
    * Overrides userIp if both are provided.
    */
  var quotaUser: js.UndefOr[java.lang.String] = js.undefined
  /** Select only change logs whose object ID, user name, old or new values match the search string. */
  var searchString: js.UndefOr[java.lang.String] = js.undefined
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[java.lang.String] = js.undefined
  /** Select only change logs with these user profile IDs. */
  var userProfileIds: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Action {
  @scala.inline
  def apply(
    profileId: java.lang.String,
    action: java.lang.String = null,
    alt: java.lang.String = null,
    fields: java.lang.String = null,
    ids: java.lang.String = null,
    key: java.lang.String = null,
    maxChangeTime: java.lang.String = null,
    maxResults: scala.Int | scala.Double = null,
    minChangeTime: java.lang.String = null,
    oauth_token: java.lang.String = null,
    objectIds: java.lang.String = null,
    objectType: java.lang.String = null,
    pageToken: java.lang.String = null,
    prettyPrint: js.UndefOr[scala.Boolean] = js.undefined,
    quotaUser: java.lang.String = null,
    searchString: java.lang.String = null,
    userIp: java.lang.String = null,
    userProfileIds: java.lang.String = null
  ): Anon_Action = {
    val __obj = js.Dynamic.literal(profileId = profileId)
    if (action != null) __obj.updateDynamic("action")(action)
    if (alt != null) __obj.updateDynamic("alt")(alt)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (ids != null) __obj.updateDynamic("ids")(ids)
    if (key != null) __obj.updateDynamic("key")(key)
    if (maxChangeTime != null) __obj.updateDynamic("maxChangeTime")(maxChangeTime)
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (minChangeTime != null) __obj.updateDynamic("minChangeTime")(minChangeTime)
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token)
    if (objectIds != null) __obj.updateDynamic("objectIds")(objectIds)
    if (objectType != null) __obj.updateDynamic("objectType")(objectType)
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken)
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint)
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser)
    if (searchString != null) __obj.updateDynamic("searchString")(searchString)
    if (userIp != null) __obj.updateDynamic("userIp")(userIp)
    if (userProfileIds != null) __obj.updateDynamic("userProfileIds")(userProfileIds)
    __obj.asInstanceOf[Anon_Action]
  }
}

