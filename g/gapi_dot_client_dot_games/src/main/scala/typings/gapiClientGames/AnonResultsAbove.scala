package typings.gapiClientGames

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonResultsAbove extends js.Object {
  /** Data format for the response. */
  var alt: js.UndefOr[String] = js.undefined
  /** The collection of scores you're requesting. */
  var collection: String
  /** The last-seen mutation timestamp. */
  var consistencyToken: js.UndefOr[String] = js.undefined
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.undefined
  /** The preferred language to use for strings returned by this method. */
  var language: js.UndefOr[String] = js.undefined
  /** The ID of the leaderboard. */
  var leaderboardId: String
  /**
    * The maximum number of leaderboard scores to return in the response. For any response, the actual number of leaderboard scores returned may be less than
    * the specified maxResults.
    */
  var maxResults: js.UndefOr[Double] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.undefined
  /** The token returned by the previous request. */
  var pageToken: js.UndefOr[String] = js.undefined
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.undefined
  /**
    * Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters.
    * Overrides userIp if both are provided.
    */
  var quotaUser: js.UndefOr[String] = js.undefined
  /**
    * The preferred number of scores to return above the player's score. More scores may be returned if the player is at the bottom of the leaderboard; fewer
    * may be returned if the player is at the top. Must be less than or equal to maxResults.
    */
  var resultsAbove: js.UndefOr[Double] = js.undefined
  /** True if the top scores should be returned when the player is not in the leaderboard. Defaults to true. */
  var returnTopIfAbsent: js.UndefOr[Boolean] = js.undefined
  /** The time span for the scores and ranks you're requesting. */
  var timeSpan: String
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[String] = js.undefined
}

object AnonResultsAbove {
  @scala.inline
  def apply(
    collection: String,
    leaderboardId: String,
    timeSpan: String,
    alt: String = null,
    consistencyToken: String = null,
    fields: String = null,
    key: String = null,
    language: String = null,
    maxResults: Int | Double = null,
    oauth_token: String = null,
    pageToken: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    quotaUser: String = null,
    resultsAbove: Int | Double = null,
    returnTopIfAbsent: js.UndefOr[Boolean] = js.undefined,
    userIp: String = null
  ): AnonResultsAbove = {
    val __obj = js.Dynamic.literal(collection = collection.asInstanceOf[js.Any], leaderboardId = leaderboardId.asInstanceOf[js.Any], timeSpan = timeSpan.asInstanceOf[js.Any])
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (consistencyToken != null) __obj.updateDynamic("consistencyToken")(consistencyToken.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (resultsAbove != null) __obj.updateDynamic("resultsAbove")(resultsAbove.asInstanceOf[js.Any])
    if (!js.isUndefined(returnTopIfAbsent)) __obj.updateDynamic("returnTopIfAbsent")(returnTopIfAbsent.asInstanceOf[js.Any])
    if (userIp != null) __obj.updateDynamic("userIp")(userIp.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonResultsAbove]
  }
}

