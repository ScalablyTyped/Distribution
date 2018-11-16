package typings
package gapiDotClientDotComputeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_ProjectPrettyPrintInstanceQuotaUserKeyUserIp extends js.Object {
  /** Data format for the response. */
  var alt: js.UndefOr[java.lang.String] = js.undefined
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[java.lang.String] = js.undefined
  /** Name of the instance scoping this request. */
  var instance: java.lang.String
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies which COM or serial port to retrieve data from. */
  var port: js.UndefOr[scala.Double] = js.undefined
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[scala.Boolean] = js.undefined
  /** Project ID for this request. */
  var project: java.lang.String
  /**
                   * Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters.
                   * Overrides userIp if both are provided.
                   */
  var quotaUser: js.UndefOr[java.lang.String] = js.undefined
  /**
                   * Returns output starting from a specific byte position. Use this to page through output when the output is too large to return in a single request. For
                   * the initial request, leave this field unspecified. For subsequent calls, this field should be set to the next value returned in the previous call.
                   */
  var start: js.UndefOr[java.lang.String] = js.undefined
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[java.lang.String] = js.undefined
  /** The name of the zone for this request. */
  var zone: java.lang.String
}

