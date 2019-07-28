package typings.gapiDotClientDotGames

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AltConsistencyTokenFieldsKeyLanguageLeaderboardId extends js.Object {
  /** Data format for the response. */
  var alt: js.UndefOr[String] = js.undefined
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
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.undefined
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.undefined
  /**
    * Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters.
    * Overrides userIp if both are provided.
    */
  var quotaUser: js.UndefOr[String] = js.undefined
  /**
    * The score you're submitting. The submitted score is ignored if it is worse than a previously submitted score, where worse depends on the leaderboard
    * sort order. The meaning of the score value depends on the leaderboard format type. For fixed-point, the score represents the raw value. For time, the
    * score represents elapsed time in milliseconds. For currency, the score represents a value in micro units.
    */
  var score: String
  /**
    * Additional information about the score you're submitting. Values must contain no more than 64 URI-safe characters as defined by section 2.3 of RFC
    * 3986.
    */
  var scoreTag: js.UndefOr[String] = js.undefined
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[String] = js.undefined
}

object Anon_AltConsistencyTokenFieldsKeyLanguageLeaderboardId {
  @scala.inline
  def apply(
    leaderboardId: String,
    score: String,
    alt: String = null,
    consistencyToken: String = null,
    fields: String = null,
    key: String = null,
    language: String = null,
    oauth_token: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    quotaUser: String = null,
    scoreTag: String = null,
    userIp: String = null
  ): Anon_AltConsistencyTokenFieldsKeyLanguageLeaderboardId = {
    val __obj = js.Dynamic.literal(leaderboardId = leaderboardId, score = score)
    if (alt != null) __obj.updateDynamic("alt")(alt)
    if (consistencyToken != null) __obj.updateDynamic("consistencyToken")(consistencyToken)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (key != null) __obj.updateDynamic("key")(key)
    if (language != null) __obj.updateDynamic("language")(language)
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token)
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint)
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser)
    if (scoreTag != null) __obj.updateDynamic("scoreTag")(scoreTag)
    if (userIp != null) __obj.updateDynamic("userIp")(userIp)
    __obj.asInstanceOf[Anon_AltConsistencyTokenFieldsKeyLanguageLeaderboardId]
  }
}

