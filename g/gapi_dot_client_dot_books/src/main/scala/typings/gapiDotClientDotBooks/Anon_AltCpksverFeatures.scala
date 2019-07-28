package typings.gapiDotClientDotBooks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AltCpksverFeatures extends js.Object {
  /** Data format for the response. */
  var alt: js.UndefOr[String] = js.undefined
  /** The device/version ID from which to release the restriction. */
  var cpksver: String
  /** List of features supported by the client, i.e., 'RENTALS' */
  var features: js.UndefOr[String] = js.undefined
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.undefined
  /** Set to true to include non-comics series. Defaults to false. */
  var includeNonComicsSeries: js.UndefOr[Boolean] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.undefined
  /** ISO-639-1, ISO-3166-1 codes for message localization, i.e. en_US. */
  var locale: js.UndefOr[String] = js.undefined
  /** The client nonce value. */
  var nonce: String
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.undefined
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.undefined
  /**
    * Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters.
    * Overrides userIp if both are provided.
    */
  var quotaUser: js.UndefOr[String] = js.undefined
  /** Set to true to show pre-ordered books. Defaults to false. */
  var showPreorders: js.UndefOr[Boolean] = js.undefined
  /** String to identify the originator of this request. */
  var source: String
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[String] = js.undefined
  /** The volume(s) to request download restrictions for. */
  var volumeIds: js.UndefOr[String] = js.undefined
}

object Anon_AltCpksverFeatures {
  @scala.inline
  def apply(
    cpksver: String,
    nonce: String,
    source: String,
    alt: String = null,
    features: String = null,
    fields: String = null,
    includeNonComicsSeries: js.UndefOr[Boolean] = js.undefined,
    key: String = null,
    locale: String = null,
    oauth_token: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    quotaUser: String = null,
    showPreorders: js.UndefOr[Boolean] = js.undefined,
    userIp: String = null,
    volumeIds: String = null
  ): Anon_AltCpksverFeatures = {
    val __obj = js.Dynamic.literal(cpksver = cpksver, nonce = nonce, source = source)
    if (alt != null) __obj.updateDynamic("alt")(alt)
    if (features != null) __obj.updateDynamic("features")(features)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (!js.isUndefined(includeNonComicsSeries)) __obj.updateDynamic("includeNonComicsSeries")(includeNonComicsSeries)
    if (key != null) __obj.updateDynamic("key")(key)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token)
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint)
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser)
    if (!js.isUndefined(showPreorders)) __obj.updateDynamic("showPreorders")(showPreorders)
    if (userIp != null) __obj.updateDynamic("userIp")(userIp)
    if (volumeIds != null) __obj.updateDynamic("volumeIds")(volumeIds)
    __obj.asInstanceOf[Anon_AltCpksverFeatures]
  }
}

