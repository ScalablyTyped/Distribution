package typings
package gapiDotClientDotGamesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AltConsistencyTokenFieldsIncludeMatchDataKey extends js.Object {
  /** Data format for the response. */
  var alt: js.UndefOr[java.lang.String] = js.undefined
  /** The last-seen mutation timestamp. */
  var consistencyToken: js.UndefOr[java.lang.String] = js.undefined
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[java.lang.String] = js.undefined
  /**
    * True if match data should be returned in the response. Note that not all data will necessarily be returned if include_match_data is true; the server
    * may decide to only return data for some of the matches to limit download size for the client. The remainder of the data for these matches will be
    * retrievable on request.
    */
  var includeMatchData: js.UndefOr[scala.Boolean] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /** The preferred language to use for strings returned by this method. */
  var language: js.UndefOr[java.lang.String] = js.undefined
  /** The maximum number of completed or canceled matches to return in the response. If not set, all matches returned could be completed or canceled. */
  var maxCompletedMatches: js.UndefOr[scala.Double] = js.undefined
  /**
    * The maximum number of matches to return in the response, used for paging. For any response, the actual number of matches to return may be less than the
    * specified maxResults.
    */
  var maxResults: js.UndefOr[scala.Double] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[java.lang.String] = js.undefined
  /** The token returned by the previous request. */
  var pageToken: js.UndefOr[java.lang.String] = js.undefined
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters.
    * Overrides userIp if both are provided.
    */
  var quotaUser: js.UndefOr[java.lang.String] = js.undefined
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_AltConsistencyTokenFieldsIncludeMatchDataKey {
  @scala.inline
  def apply(
    alt: java.lang.String = null,
    consistencyToken: java.lang.String = null,
    fields: java.lang.String = null,
    includeMatchData: js.UndefOr[scala.Boolean] = js.undefined,
    key: java.lang.String = null,
    language: java.lang.String = null,
    maxCompletedMatches: scala.Int | scala.Double = null,
    maxResults: scala.Int | scala.Double = null,
    oauth_token: java.lang.String = null,
    pageToken: java.lang.String = null,
    prettyPrint: js.UndefOr[scala.Boolean] = js.undefined,
    quotaUser: java.lang.String = null,
    userIp: java.lang.String = null
  ): Anon_AltConsistencyTokenFieldsIncludeMatchDataKey = {
    val __obj = js.Dynamic.literal()
    if (alt != null) __obj.updateDynamic("alt")(alt)
    if (consistencyToken != null) __obj.updateDynamic("consistencyToken")(consistencyToken)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (!js.isUndefined(includeMatchData)) __obj.updateDynamic("includeMatchData")(includeMatchData)
    if (key != null) __obj.updateDynamic("key")(key)
    if (language != null) __obj.updateDynamic("language")(language)
    if (maxCompletedMatches != null) __obj.updateDynamic("maxCompletedMatches")(maxCompletedMatches.asInstanceOf[js.Any])
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token)
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken)
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint)
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser)
    if (userIp != null) __obj.updateDynamic("userIp")(userIp)
    __obj.asInstanceOf[Anon_AltConsistencyTokenFieldsIncludeMatchDataKey]
  }
}

