package typings
package gapiDotClientDotContentLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_DatafeedIdPrettyPrintCountry extends js.Object {
  /** Data format for the response. */
  var alt: js.UndefOr[java.lang.String] = js.undefined
  /**
                   * The country for which to get the datafeed status. If this parameter is provided then language must also be provided. Note that this parameter is
                   * required for feeds targeting multiple countries and languages, since a feed may have a different status for each target.
                   */
  var country: js.UndefOr[java.lang.String] = js.undefined
  var datafeedId: java.lang.String
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[java.lang.String] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /**
                   * The language for which to get the datafeed status. If this parameter is provided then country must also be provided. Note that this parameter is
                   * required for feeds targeting multiple countries and languages, since a feed may have a different status for each target.
                   */
  var language: js.UndefOr[java.lang.String] = js.undefined
  var merchantId: java.lang.String
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[java.lang.String] = js.undefined
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[scala.Boolean] = js.undefined
  /**
                   * Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters.
                   * Overrides userIp if both are provided.
                   */
  var quotaUser: js.UndefOr[java.lang.String] = js.undefined
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[java.lang.String] = js.undefined
}

