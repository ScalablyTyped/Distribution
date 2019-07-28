package typings.gapiDotClientDotBooks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AltCpksverFieldsKey extends js.Object {
  /** Data format for the response. */
  var alt: js.UndefOr[String] = js.undefined
  /** The device/version ID from which to request the restrictions. */
  var cpksver: String
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.undefined
  /** The type of access license to request. If not specified, the default is BOTH. */
  var licenseTypes: js.UndefOr[String] = js.undefined
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
  /** String to identify the originator of this request. */
  var source: String
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[String] = js.undefined
  /** The volume to request concurrent/download restrictions for. */
  var volumeId: String
}

object Anon_AltCpksverFieldsKey {
  @scala.inline
  def apply(
    cpksver: String,
    nonce: String,
    source: String,
    volumeId: String,
    alt: String = null,
    fields: String = null,
    key: String = null,
    licenseTypes: String = null,
    locale: String = null,
    oauth_token: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    quotaUser: String = null,
    userIp: String = null
  ): Anon_AltCpksverFieldsKey = {
    val __obj = js.Dynamic.literal(cpksver = cpksver, nonce = nonce, source = source, volumeId = volumeId)
    if (alt != null) __obj.updateDynamic("alt")(alt)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (key != null) __obj.updateDynamic("key")(key)
    if (licenseTypes != null) __obj.updateDynamic("licenseTypes")(licenseTypes)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token)
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint)
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser)
    if (userIp != null) __obj.updateDynamic("userIp")(userIp)
    __obj.asInstanceOf[Anon_AltCpksverFieldsKey]
  }
}

