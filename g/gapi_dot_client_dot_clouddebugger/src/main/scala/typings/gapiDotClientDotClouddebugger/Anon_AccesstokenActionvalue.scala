package typings.gapiDotClientDotClouddebugger

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_AccesstokenActionvalue extends js.Object {
  /** V1 error format. */
  @JSName("$.xgafv")
  var $Dotxgafv: js.UndefOr[String] = js.native
  /** OAuth access token. */
  var access_token: js.UndefOr[String] = js.native
  /** Only breakpoints with the specified action will pass the filter. */
  @JSName("action.value")
  var actionDotvalue: js.UndefOr[String] = js.native
  /** Data format for response. */
  var alt: js.UndefOr[String] = js.native
  /** OAuth bearer token. */
  var bearer_token: js.UndefOr[String] = js.native
  /** JSONP */
  var callback: js.UndefOr[String] = js.native
  /**
    * The client version making the call.
    * Schema: `domain/type/version` (e.g., `google.com/intellij/v1`).
    */
  var clientVersion: js.UndefOr[String] = js.native
  /** ID of the debuggee whose breakpoints to list. */
  var debuggeeId: String = js.native
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.native
  /**
    * When set to `true`, the response includes the list of breakpoints set by
    * any user. Otherwise, it includes only breakpoints set by the caller.
    */
  var includeAllUsers: js.UndefOr[Boolean] = js.native
  /**
    * When set to `true`, the response includes active and inactive
    * breakpoints. Otherwise, it includes only active breakpoints.
    */
  var includeInactive: js.UndefOr[Boolean] = js.native
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.native
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.native
  /** Pretty-print response. */
  var pp: js.UndefOr[Boolean] = js.native
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.native
  /** Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. */
  var quotaUser: js.UndefOr[String] = js.native
  /**
    * This field is deprecated. The following fields are always stripped out of
    * the result: `stack_frames`, `evaluated_expressions` and `variable_table`.
    */
  var stripResults: js.UndefOr[Boolean] = js.native
  /** Legacy upload protocol for media (e.g. "media", "multipart"). */
  var uploadType: js.UndefOr[String] = js.native
  /** Upload protocol for media (e.g. "raw", "multipart"). */
  var upload_protocol: js.UndefOr[String] = js.native
  /**
    * A wait token that, if specified, blocks the call until the breakpoints
    * list has changed, or a server selected timeout has expired.  The value
    * should be set from the last response. The error code
    * `google.rpc.Code.ABORTED` (RPC) is returned on wait timeout, which
    * should be called again with the same `wait_token`.
    */
  var waitToken: js.UndefOr[String] = js.native
}

