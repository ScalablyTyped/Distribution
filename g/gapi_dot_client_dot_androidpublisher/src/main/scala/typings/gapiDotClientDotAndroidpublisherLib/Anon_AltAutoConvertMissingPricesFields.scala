package typings
package gapiDotClientDotAndroidpublisherLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AltAutoConvertMissingPricesFields extends js.Object {
  /** Data format for the response. */
  var alt: js.UndefOr[java.lang.String] = js.undefined
  /**
    * If true the prices for all regions targeted by the parent app that don't have a price specified for this in-app product will be auto converted to the
    * target currency based on the default price. Defaults to false.
    */
  var autoConvertMissingPrices: js.UndefOr[scala.Boolean] = js.undefined
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[java.lang.String] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[java.lang.String] = js.undefined
  /** Unique identifier for the Android app with the in-app product; for example, "com.spiffygame". */
  var packageName: java.lang.String
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters.
    * Overrides userIp if both are provided.
    */
  var quotaUser: js.UndefOr[java.lang.String] = js.undefined
  /** Unique identifier for the in-app product. */
  var sku: java.lang.String
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_AltAutoConvertMissingPricesFields {
  @scala.inline
  def apply(
    packageName: java.lang.String,
    sku: java.lang.String,
    alt: java.lang.String = null,
    autoConvertMissingPrices: js.UndefOr[scala.Boolean] = js.undefined,
    fields: java.lang.String = null,
    key: java.lang.String = null,
    oauth_token: java.lang.String = null,
    prettyPrint: js.UndefOr[scala.Boolean] = js.undefined,
    quotaUser: java.lang.String = null,
    userIp: java.lang.String = null
  ): Anon_AltAutoConvertMissingPricesFields = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("packageName")(packageName)
    __obj.updateDynamic("sku")(sku)
    if (alt != null) __obj.updateDynamic("alt")(alt)
    if (!js.isUndefined(autoConvertMissingPrices)) __obj.updateDynamic("autoConvertMissingPrices")(autoConvertMissingPrices)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (key != null) __obj.updateDynamic("key")(key)
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token)
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint)
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser)
    if (userIp != null) __obj.updateDynamic("userIp")(userIp)
    __obj.asInstanceOf[Anon_AltAutoConvertMissingPricesFields]
  }
}

