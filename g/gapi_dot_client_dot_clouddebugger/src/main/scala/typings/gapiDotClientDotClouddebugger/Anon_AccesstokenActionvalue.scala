package typings.gapiDotClientDotClouddebugger

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AccesstokenActionvalue extends js.Object {
  /** V1 error format. */
  @JSName("$.xgafv")
  var `$.xgafv`: js.UndefOr[String] = js.undefined
  /** OAuth access token. */
  var access_token: js.UndefOr[String] = js.undefined
  /** Only breakpoints with the specified action will pass the filter. */
  var `action.value`: js.UndefOr[String] = js.undefined
  /** Data format for response. */
  var alt: js.UndefOr[String] = js.undefined
  /** OAuth bearer token. */
  var bearer_token: js.UndefOr[String] = js.undefined
  /** JSONP */
  var callback: js.UndefOr[String] = js.undefined
  /**
    * The client version making the call.
    * Schema: `domain/type/version` (e.g., `google.com/intellij/v1`).
    */
  var clientVersion: js.UndefOr[String] = js.undefined
  /** ID of the debuggee whose breakpoints to list. */
  var debuggeeId: String
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.undefined
  /**
    * When set to `true`, the response includes the list of breakpoints set by
    * any user. Otherwise, it includes only breakpoints set by the caller.
    */
  var includeAllUsers: js.UndefOr[Boolean] = js.undefined
  /**
    * When set to `true`, the response includes active and inactive
    * breakpoints. Otherwise, it includes only active breakpoints.
    */
  var includeInactive: js.UndefOr[Boolean] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.undefined
  /** Pretty-print response. */
  var pp: js.UndefOr[Boolean] = js.undefined
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.undefined
  /** Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. */
  var quotaUser: js.UndefOr[String] = js.undefined
  /**
    * This field is deprecated. The following fields are always stripped out of
    * the result: `stack_frames`, `evaluated_expressions` and `variable_table`.
    */
  var stripResults: js.UndefOr[Boolean] = js.undefined
  /** Legacy upload protocol for media (e.g. "media", "multipart"). */
  var uploadType: js.UndefOr[String] = js.undefined
  /** Upload protocol for media (e.g. "raw", "multipart"). */
  var upload_protocol: js.UndefOr[String] = js.undefined
  /**
    * A wait token that, if specified, blocks the call until the breakpoints
    * list has changed, or a server selected timeout has expired.  The value
    * should be set from the last response. The error code
    * `google.rpc.Code.ABORTED` (RPC) is returned on wait timeout, which
    * should be called again with the same `wait_token`.
    */
  var waitToken: js.UndefOr[String] = js.undefined
}

object Anon_AccesstokenActionvalue {
  @scala.inline
  def apply(
    debuggeeId: String,
    `$.xgafv`: String = null,
    access_token: String = null,
    `action.value`: String = null,
    alt: String = null,
    bearer_token: String = null,
    callback: String = null,
    clientVersion: String = null,
    fields: String = null,
    includeAllUsers: js.UndefOr[Boolean] = js.undefined,
    includeInactive: js.UndefOr[Boolean] = js.undefined,
    key: String = null,
    oauth_token: String = null,
    pp: js.UndefOr[Boolean] = js.undefined,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    quotaUser: String = null,
    stripResults: js.UndefOr[Boolean] = js.undefined,
    uploadType: String = null,
    upload_protocol: String = null,
    waitToken: String = null
  ): Anon_AccesstokenActionvalue = {
    val __obj = js.Dynamic.literal(debuggeeId = debuggeeId)
    if (`$.xgafv` != null) __obj.updateDynamic("$.xgafv")(`$.xgafv`)
    if (access_token != null) __obj.updateDynamic("access_token")(access_token)
    if (`action.value` != null) __obj.updateDynamic("action.value")(`action.value`)
    if (alt != null) __obj.updateDynamic("alt")(alt)
    if (bearer_token != null) __obj.updateDynamic("bearer_token")(bearer_token)
    if (callback != null) __obj.updateDynamic("callback")(callback)
    if (clientVersion != null) __obj.updateDynamic("clientVersion")(clientVersion)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (!js.isUndefined(includeAllUsers)) __obj.updateDynamic("includeAllUsers")(includeAllUsers)
    if (!js.isUndefined(includeInactive)) __obj.updateDynamic("includeInactive")(includeInactive)
    if (key != null) __obj.updateDynamic("key")(key)
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token)
    if (!js.isUndefined(pp)) __obj.updateDynamic("pp")(pp)
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint)
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser)
    if (!js.isUndefined(stripResults)) __obj.updateDynamic("stripResults")(stripResults)
    if (uploadType != null) __obj.updateDynamic("uploadType")(uploadType)
    if (upload_protocol != null) __obj.updateDynamic("upload_protocol")(upload_protocol)
    if (waitToken != null) __obj.updateDynamic("waitToken")(waitToken)
    __obj.asInstanceOf[Anon_AccesstokenActionvalue]
  }
}

