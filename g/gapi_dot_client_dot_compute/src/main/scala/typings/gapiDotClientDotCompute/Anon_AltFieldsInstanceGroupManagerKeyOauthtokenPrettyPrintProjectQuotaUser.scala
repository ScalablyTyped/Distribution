package typings.gapiDotClientDotCompute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AltFieldsInstanceGroupManagerKeyOauthtokenPrettyPrintProjectQuotaUser extends js.Object {
  /** Data format for the response. */
  var alt: js.UndefOr[String] = js.undefined
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.undefined
  /** Name of the managed instance group. */
  var instanceGroupManager: String
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.undefined
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.undefined
  /** Project ID for this request. */
  var project: String
  /**
    * Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters.
    * Overrides userIp if both are provided.
    */
  var quotaUser: js.UndefOr[String] = js.undefined
  /** Name of the region scoping this request. */
  var region: String
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
  var requestId: js.UndefOr[String] = js.undefined
  /** Number of instances that should exist in this instance group manager. */
  var size: Double
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[String] = js.undefined
}

object Anon_AltFieldsInstanceGroupManagerKeyOauthtokenPrettyPrintProjectQuotaUser {
  @scala.inline
  def apply(
    instanceGroupManager: String,
    project: String,
    region: String,
    size: Double,
    alt: String = null,
    fields: String = null,
    key: String = null,
    oauth_token: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    quotaUser: String = null,
    requestId: String = null,
    userIp: String = null
  ): Anon_AltFieldsInstanceGroupManagerKeyOauthtokenPrettyPrintProjectQuotaUser = {
    val __obj = js.Dynamic.literal(instanceGroupManager = instanceGroupManager, project = project, region = region, size = size)
    if (alt != null) __obj.updateDynamic("alt")(alt)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (key != null) __obj.updateDynamic("key")(key)
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token)
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint)
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser)
    if (requestId != null) __obj.updateDynamic("requestId")(requestId)
    if (userIp != null) __obj.updateDynamic("userIp")(userIp)
    __obj.asInstanceOf[Anon_AltFieldsInstanceGroupManagerKeyOauthtokenPrettyPrintProjectQuotaUser]
  }
}

