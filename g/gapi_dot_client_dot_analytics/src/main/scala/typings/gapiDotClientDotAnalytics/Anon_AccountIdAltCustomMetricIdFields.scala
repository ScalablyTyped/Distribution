package typings.gapiDotClientDotAnalytics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AccountIdAltCustomMetricIdFields extends js.Object {
  /** Account ID for the custom metric to update. */
  var accountId: String
  /** Data format for the response. */
  var alt: js.UndefOr[String] = js.undefined
  /** Custom metric ID for the custom metric to update. */
  var customMetricId: String
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.undefined
  /** Force the update and ignore any warnings related to the custom metric being linked to a custom data source / data set. */
  var ignoreCustomDataSourceLinks: js.UndefOr[Boolean] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.undefined
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.undefined
  /**
    * Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters.
    * Overrides userIp if both are provided.
    */
  var quotaUser: js.UndefOr[String] = js.undefined
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[String] = js.undefined
  /** Web property ID for the custom metric to update. */
  var webPropertyId: String
}

object Anon_AccountIdAltCustomMetricIdFields {
  @scala.inline
  def apply(
    accountId: String,
    customMetricId: String,
    webPropertyId: String,
    alt: String = null,
    fields: String = null,
    ignoreCustomDataSourceLinks: js.UndefOr[Boolean] = js.undefined,
    key: String = null,
    oauth_token: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    quotaUser: String = null,
    userIp: String = null
  ): Anon_AccountIdAltCustomMetricIdFields = {
    val __obj = js.Dynamic.literal(accountId = accountId, customMetricId = customMetricId, webPropertyId = webPropertyId)
    if (alt != null) __obj.updateDynamic("alt")(alt)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (!js.isUndefined(ignoreCustomDataSourceLinks)) __obj.updateDynamic("ignoreCustomDataSourceLinks")(ignoreCustomDataSourceLinks)
    if (key != null) __obj.updateDynamic("key")(key)
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token)
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint)
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser)
    if (userIp != null) __obj.updateDynamic("userIp")(userIp)
    __obj.asInstanceOf[Anon_AccountIdAltCustomMetricIdFields]
  }
}

