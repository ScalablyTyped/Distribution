package typings
package gapiDotClientDotClouddebuggerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Accesstoken extends js.Object {
  /** V1 error format. */
  @JSName("$.xgafv")
  var `$.xgafv`: js.UndefOr[java.lang.String] = js.undefined
  /** OAuth access token. */
  var access_token: js.UndefOr[java.lang.String] = js.undefined
  /** Data format for response. */
  var alt: js.UndefOr[java.lang.String] = js.undefined
  /** OAuth bearer token. */
  var bearer_token: js.UndefOr[java.lang.String] = js.undefined
  /** JSONP */
  var callback: js.UndefOr[java.lang.String] = js.undefined
  /** Identifies the debuggee. */
  var debuggeeId: java.lang.String
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[java.lang.String] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[java.lang.String] = js.undefined
  /** Pretty-print response. */
  var pp: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[scala.Boolean] = js.undefined
  /** Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. */
  var quotaUser: js.UndefOr[java.lang.String] = js.undefined
  /**
    * If set to `true` (recommended), returns `google.rpc.Code.OK` status and
    * sets the `wait_expired` response field to `true` when the server-selected
    * timeout has expired.
    *
    * If set to `false` (deprecated), returns `google.rpc.Code.ABORTED` status
    * when the server-selected timeout has expired.
    */
  var successOnTimeout: js.UndefOr[scala.Boolean] = js.undefined
  /** Legacy upload protocol for media (e.g. "media", "multipart"). */
  var uploadType: js.UndefOr[java.lang.String] = js.undefined
  /** Upload protocol for media (e.g. "raw", "multipart"). */
  var upload_protocol: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A token that, if specified, blocks the method call until the list
    * of active breakpoints has changed, or a server-selected timeout has
    * expired. The value should be set from the `next_wait_token` field in
    * the last response. The initial value should be set to `"init"`.
    */
  var waitToken: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Accesstoken {
  @scala.inline
  def apply(
    debuggeeId: java.lang.String,
    `$.xgafv`: java.lang.String = null,
    access_token: java.lang.String = null,
    alt: java.lang.String = null,
    bearer_token: java.lang.String = null,
    callback: java.lang.String = null,
    fields: java.lang.String = null,
    key: java.lang.String = null,
    oauth_token: java.lang.String = null,
    pp: js.UndefOr[scala.Boolean] = js.undefined,
    prettyPrint: js.UndefOr[scala.Boolean] = js.undefined,
    quotaUser: java.lang.String = null,
    successOnTimeout: js.UndefOr[scala.Boolean] = js.undefined,
    uploadType: java.lang.String = null,
    upload_protocol: java.lang.String = null,
    waitToken: java.lang.String = null
  ): Anon_Accesstoken = {
    val __obj = js.Dynamic.literal(debuggeeId = debuggeeId)
    if (`$.xgafv` != null) __obj.updateDynamic("$.xgafv")(`$.xgafv`)
    if (access_token != null) __obj.updateDynamic("access_token")(access_token)
    if (alt != null) __obj.updateDynamic("alt")(alt)
    if (bearer_token != null) __obj.updateDynamic("bearer_token")(bearer_token)
    if (callback != null) __obj.updateDynamic("callback")(callback)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (key != null) __obj.updateDynamic("key")(key)
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token)
    if (!js.isUndefined(pp)) __obj.updateDynamic("pp")(pp)
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint)
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser)
    if (!js.isUndefined(successOnTimeout)) __obj.updateDynamic("successOnTimeout")(successOnTimeout)
    if (uploadType != null) __obj.updateDynamic("uploadType")(uploadType)
    if (upload_protocol != null) __obj.updateDynamic("upload_protocol")(upload_protocol)
    if (waitToken != null) __obj.updateDynamic("waitToken")(waitToken)
    __obj.asInstanceOf[Anon_Accesstoken]
  }
}

