package typings
package gapiDotClientDotGamesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AltCollectionConsistencyTokenFieldsKey extends js.Object {
  /** Data format for the response. */
  var alt: js.UndefOr[java.lang.String] = js.undefined
  /** The collection of scores you're requesting. */
  var collection: java.lang.String
  /** The last-seen mutation timestamp. */
  var consistencyToken: js.UndefOr[java.lang.String] = js.undefined
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[java.lang.String] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /** The preferred language to use for strings returned by this method. */
  var language: js.UndefOr[java.lang.String] = js.undefined
  /** The ID of the leaderboard. */
  var leaderboardId: java.lang.String
  /**
    * The maximum number of leaderboard scores to return in the response. For any response, the actual number of leaderboard scores returned may be less than
    * the specified maxResults.
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
  /**
    * The preferred number of scores to return above the player's score. More scores may be returned if the player is at the bottom of the leaderboard; fewer
    * may be returned if the player is at the top. Must be less than or equal to maxResults.
    */
  var resultsAbove: js.UndefOr[scala.Double] = js.undefined
  /** True if the top scores should be returned when the player is not in the leaderboard. Defaults to true. */
  var returnTopIfAbsent: js.UndefOr[scala.Boolean] = js.undefined
  /** The time span for the scores and ranks you're requesting. */
  var timeSpan: java.lang.String
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_AltCollectionConsistencyTokenFieldsKey {
  @scala.inline
  def apply(
    collection: java.lang.String,
    leaderboardId: java.lang.String,
    timeSpan: java.lang.String,
    alt: java.lang.String = null,
    consistencyToken: java.lang.String = null,
    fields: java.lang.String = null,
    key: java.lang.String = null,
    language: java.lang.String = null,
    maxResults: scala.Int | scala.Double = null,
    oauth_token: java.lang.String = null,
    pageToken: java.lang.String = null,
    prettyPrint: js.UndefOr[scala.Boolean] = js.undefined,
    quotaUser: java.lang.String = null,
    resultsAbove: scala.Int | scala.Double = null,
    returnTopIfAbsent: js.UndefOr[scala.Boolean] = js.undefined,
    userIp: java.lang.String = null
  ): Anon_AltCollectionConsistencyTokenFieldsKey = {
    val __obj = js.Dynamic.literal(collection = collection, leaderboardId = leaderboardId, timeSpan = timeSpan)
    if (alt != null) __obj.updateDynamic("alt")(alt)
    if (consistencyToken != null) __obj.updateDynamic("consistencyToken")(consistencyToken)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (key != null) __obj.updateDynamic("key")(key)
    if (language != null) __obj.updateDynamic("language")(language)
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token)
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken)
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint)
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser)
    if (resultsAbove != null) __obj.updateDynamic("resultsAbove")(resultsAbove.asInstanceOf[js.Any])
    if (!js.isUndefined(returnTopIfAbsent)) __obj.updateDynamic("returnTopIfAbsent")(returnTopIfAbsent)
    if (userIp != null) __obj.updateDynamic("userIp")(userIp)
    __obj.asInstanceOf[Anon_AltCollectionConsistencyTokenFieldsKey]
  }
}

