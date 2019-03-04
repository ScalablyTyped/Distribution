package typings
package gapiDotClientDotBooksLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AltCpksverFieldsKey extends js.Object {
  /** Data format for the response. */
  var alt: js.UndefOr[java.lang.String] = js.undefined
  /** The device/version ID from which to request the restrictions. */
  var cpksver: java.lang.String
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[java.lang.String] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /** The type of access license to request. If not specified, the default is BOTH. */
  var licenseTypes: js.UndefOr[java.lang.String] = js.undefined
  /** ISO-639-1, ISO-3166-1 codes for message localization, i.e. en_US. */
  var locale: js.UndefOr[java.lang.String] = js.undefined
  /** The client nonce value. */
  var nonce: java.lang.String
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[java.lang.String] = js.undefined
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters.
    * Overrides userIp if both are provided.
    */
  var quotaUser: js.UndefOr[java.lang.String] = js.undefined
  /** String to identify the originator of this request. */
  var source: java.lang.String
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[java.lang.String] = js.undefined
  /** The volume to request concurrent/download restrictions for. */
  var volumeId: java.lang.String
}

object Anon_AltCpksverFieldsKey {
  @scala.inline
  def apply(
    cpksver: java.lang.String,
    nonce: java.lang.String,
    source: java.lang.String,
    volumeId: java.lang.String,
    alt: java.lang.String = null,
    fields: java.lang.String = null,
    key: java.lang.String = null,
    licenseTypes: java.lang.String = null,
    locale: java.lang.String = null,
    oauth_token: java.lang.String = null,
    prettyPrint: js.UndefOr[scala.Boolean] = js.undefined,
    quotaUser: java.lang.String = null,
    userIp: java.lang.String = null
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

