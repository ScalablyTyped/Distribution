package typings
package gapiDotClientDotClouddebuggerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_WaitTokenIncludeAllUsers extends js.Object {
  /** V1 error format. */
  @JSName("$.xgafv")
  var `$.xgafv`: js.UndefOr[java.lang.String] = js.undefined
  /** OAuth access token. */
  var access_token: js.UndefOr[java.lang.String] = js.undefined
  /** Only breakpoints with the specified action will pass the filter. */
  var `action.value`: js.UndefOr[java.lang.String] = js.undefined
  /** Data format for response. */
  var alt: js.UndefOr[java.lang.String] = js.undefined
  /** OAuth bearer token. */
  var bearer_token: js.UndefOr[java.lang.String] = js.undefined
  /** JSONP */
  var callback: js.UndefOr[java.lang.String] = js.undefined
  /**
                   * The client version making the call.
                   * Schema: `domain/type/version` (e.g., `google.com/intellij/v1`).
                   */
  var clientVersion: js.UndefOr[java.lang.String] = js.undefined
  /** ID of the debuggee whose breakpoints to list. */
  var debuggeeId: java.lang.String
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[java.lang.String] = js.undefined
  /**
                   * When set to `true`, the response includes the list of breakpoints set by
                   * any user. Otherwise, it includes only breakpoints set by the caller.
                   */
  var includeAllUsers: js.UndefOr[scala.Boolean] = js.undefined
  /**
                   * When set to `true`, the response includes active and inactive
                   * breakpoints. Otherwise, it includes only active breakpoints.
                   */
  var includeInactive: js.UndefOr[scala.Boolean] = js.undefined
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
                   * This field is deprecated. The following fields are always stripped out of
                   * the result: `stack_frames`, `evaluated_expressions` and `variable_table`.
                   */
  var stripResults: js.UndefOr[scala.Boolean] = js.undefined
  /** Legacy upload protocol for media (e.g. "media", "multipart"). */
  var uploadType: js.UndefOr[java.lang.String] = js.undefined
  /** Upload protocol for media (e.g. "raw", "multipart"). */
  var upload_protocol: js.UndefOr[java.lang.String] = js.undefined
  /**
                   * A wait token that, if specified, blocks the call until the breakpoints
                   * list has changed, or a server selected timeout has expired.  The value
                   * should be set from the last response. The error code
                   * `google.rpc.Code.ABORTED` (RPC) is returned on wait timeout, which
                   * should be called again with the same `wait_token`.
                   */
  var waitToken: js.UndefOr[java.lang.String] = js.undefined
}

