package typings.gapiDotClientDotPlaymoviespartner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AccesstokenAccountId extends js.Object {
  /** V1 error format. */
  @JSName("$.xgafv")
  var `$.xgafv`: js.UndefOr[String] = js.undefined
  /** OAuth access token. */
  var access_token: js.UndefOr[String] = js.undefined
  /** REQUIRED. See _General rules_ for more information about this field. */
  var accountId: String
  /** Data format for response. */
  var alt: js.UndefOr[String] = js.undefined
  /**
    * Filter Avails that match a case-insensitive, partner-specific custom id.
    * NOTE: this field is deprecated and will be removed on V2; `alt_ids`
    * should be used instead.
    */
  var altId: js.UndefOr[String] = js.undefined
  /** Filter Avails that match (case-insensitive) any of the given partner-specific custom ids. */
  var altIds: js.UndefOr[String] = js.undefined
  /** OAuth bearer token. */
  var bearer_token: js.UndefOr[String] = js.undefined
  /** JSONP */
  var callback: js.UndefOr[String] = js.undefined
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.undefined
  /** See _List methods rules_ for info about this field. */
  var pageSize: js.UndefOr[Double] = js.undefined
  /** See _List methods rules_ for info about this field. */
  var pageToken: js.UndefOr[String] = js.undefined
  /** Pretty-print response. */
  var pp: js.UndefOr[Boolean] = js.undefined
  /** See _List methods rules_ for info about this field. */
  var pphNames: js.UndefOr[String] = js.undefined
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.undefined
  /** Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. */
  var quotaUser: js.UndefOr[String] = js.undefined
  /** See _List methods rules_ for info about this field. */
  var studioNames: js.UndefOr[String] = js.undefined
  /**
    * Filter Avails that match (case-insensitive) any of the given country codes,
    * using the "ISO 3166-1 alpha-2" format (examples: "US", "us", "Us").
    */
  var territories: js.UndefOr[String] = js.undefined
  /**
    * Filter that matches Avails with a `title_internal_alias`,
    * `series_title_internal_alias`, `season_title_internal_alias`,
    * or `episode_title_internal_alias` that contains the given
    * case-insensitive title.
    */
  var title: js.UndefOr[String] = js.undefined
  /** Legacy upload protocol for media (e.g. "media", "multipart"). */
  var uploadType: js.UndefOr[String] = js.undefined
  /** Upload protocol for media (e.g. "raw", "multipart"). */
  var upload_protocol: js.UndefOr[String] = js.undefined
  /** Filter Avails that match any of the given `video_id`s. */
  var videoIds: js.UndefOr[String] = js.undefined
}

object Anon_AccesstokenAccountId {
  @scala.inline
  def apply(
    accountId: String,
    `$.xgafv`: String = null,
    access_token: String = null,
    alt: String = null,
    altId: String = null,
    altIds: String = null,
    bearer_token: String = null,
    callback: String = null,
    fields: String = null,
    key: String = null,
    oauth_token: String = null,
    pageSize: Int | Double = null,
    pageToken: String = null,
    pp: js.UndefOr[Boolean] = js.undefined,
    pphNames: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    quotaUser: String = null,
    studioNames: String = null,
    territories: String = null,
    title: String = null,
    uploadType: String = null,
    upload_protocol: String = null,
    videoIds: String = null
  ): Anon_AccesstokenAccountId = {
    val __obj = js.Dynamic.literal(accountId = accountId)
    if (`$.xgafv` != null) __obj.updateDynamic("$.xgafv")(`$.xgafv`)
    if (access_token != null) __obj.updateDynamic("access_token")(access_token)
    if (alt != null) __obj.updateDynamic("alt")(alt)
    if (altId != null) __obj.updateDynamic("altId")(altId)
    if (altIds != null) __obj.updateDynamic("altIds")(altIds)
    if (bearer_token != null) __obj.updateDynamic("bearer_token")(bearer_token)
    if (callback != null) __obj.updateDynamic("callback")(callback)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (key != null) __obj.updateDynamic("key")(key)
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token)
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken)
    if (!js.isUndefined(pp)) __obj.updateDynamic("pp")(pp)
    if (pphNames != null) __obj.updateDynamic("pphNames")(pphNames)
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint)
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser)
    if (studioNames != null) __obj.updateDynamic("studioNames")(studioNames)
    if (territories != null) __obj.updateDynamic("territories")(territories)
    if (title != null) __obj.updateDynamic("title")(title)
    if (uploadType != null) __obj.updateDynamic("uploadType")(uploadType)
    if (upload_protocol != null) __obj.updateDynamic("upload_protocol")(upload_protocol)
    if (videoIds != null) __obj.updateDynamic("videoIds")(videoIds)
    __obj.asInstanceOf[Anon_AccesstokenAccountId]
  }
}

