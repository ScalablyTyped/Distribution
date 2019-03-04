package typings
package gapiDotClientDotComputeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRequestIdSnapshot extends js.Object {
  /** Data format for the response. */
  var alt: js.UndefOr[java.lang.String] = js.undefined
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[java.lang.String] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[java.lang.String] = js.undefined
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
    * An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the
    * request if it has already been completed.
    *
    * For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID,
    * the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from
    * accidentally creating duplicate commitments.
    *
    * The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    */
  var requestId: js.UndefOr[java.lang.String] = js.undefined
  /** Name of the Snapshot resource to delete. */
  var snapshot: java.lang.String
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRequestIdSnapshot {
  @scala.inline
  def apply(
    project: java.lang.String,
    snapshot: java.lang.String,
    alt: java.lang.String = null,
    fields: java.lang.String = null,
    key: java.lang.String = null,
    oauth_token: java.lang.String = null,
    prettyPrint: js.UndefOr[scala.Boolean] = js.undefined,
    quotaUser: java.lang.String = null,
    requestId: java.lang.String = null,
    userIp: java.lang.String = null
  ): Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRequestIdSnapshot = {
    val __obj = js.Dynamic.literal(project = project, snapshot = snapshot)
    if (alt != null) __obj.updateDynamic("alt")(alt)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (key != null) __obj.updateDynamic("key")(key)
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token)
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint)
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser)
    if (requestId != null) __obj.updateDynamic("requestId")(requestId)
    if (userIp != null) __obj.updateDynamic("userIp")(userIp)
    __obj.asInstanceOf[Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRequestIdSnapshot]
  }
}

