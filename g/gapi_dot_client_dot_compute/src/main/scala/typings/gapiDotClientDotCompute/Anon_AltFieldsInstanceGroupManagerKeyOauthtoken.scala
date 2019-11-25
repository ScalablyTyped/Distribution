package typings.gapiDotClientDotCompute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AltFieldsInstanceGroupManagerKeyOauthtoken extends js.Object {
  /** Data format for the response. */
  var alt: js.UndefOr[String] = js.undefined
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.undefined
  /** The name of the managed instance group. */
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
  /**
    * The number of running instances that the managed instance group should maintain at any given time. The group automatically adds or removes instances to
    * maintain the number of instances specified by this parameter.
    */
  var size: Double
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[String] = js.undefined
  /** The name of the zone where the managed instance group is located. */
  var zone: String
}

object Anon_AltFieldsInstanceGroupManagerKeyOauthtoken {
  @scala.inline
  def apply(
    instanceGroupManager: String,
    project: String,
    size: Double,
    zone: String,
    alt: String = null,
    fields: String = null,
    key: String = null,
    oauth_token: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    quotaUser: String = null,
    requestId: String = null,
    userIp: String = null
  ): Anon_AltFieldsInstanceGroupManagerKeyOauthtoken = {
    val __obj = js.Dynamic.literal(instanceGroupManager = instanceGroupManager.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], zone = zone.asInstanceOf[js.Any])
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (requestId != null) __obj.updateDynamic("requestId")(requestId.asInstanceOf[js.Any])
    if (userIp != null) __obj.updateDynamic("userIp")(userIp.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AltFieldsInstanceGroupManagerKeyOauthtoken]
  }
}

