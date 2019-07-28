package typings.gapiDotClientDotGames

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AltCollection extends js.Object {
  /** Data format for the response. */
  var alt: js.UndefOr[String] = js.undefined
  /** The collection of categories for which data will be returned. */
  var collection: String
  /** The last-seen mutation timestamp. */
  var consistencyToken: js.UndefOr[String] = js.undefined
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.undefined
  /** The preferred language to use for strings returned by this method. */
  var language: js.UndefOr[String] = js.undefined
  /**
    * The maximum number of category resources to return in the response, used for paging. For any response, the actual number of category resources returned
    * may be less than the specified maxResults.
    */
  var maxResults: js.UndefOr[Double] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.undefined
  /** The token returned by the previous request. */
  var pageToken: js.UndefOr[String] = js.undefined
  /** A player ID. A value of me may be used in place of the authenticated player's ID. */
  var playerId: String
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.undefined
  /**
    * Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters.
    * Overrides userIp if both are provided.
    */
  var quotaUser: js.UndefOr[String] = js.undefined
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[String] = js.undefined
}

object Anon_AltCollection {
  @scala.inline
  def apply(
    collection: String,
    playerId: String,
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
    userIp: String = null
  ): Anon_AltCollection = {
    val __obj = js.Dynamic.literal(collection = collection, playerId = playerId)
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
    if (userIp != null) __obj.updateDynamic("userIp")(userIp)
    __obj.asInstanceOf[Anon_AltCollection]
  }
}

