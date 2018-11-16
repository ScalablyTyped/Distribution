package typings
package gapiDotClientDotClouddebuggerLib.gapiNs.clientNs.clouddebuggerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait DebuggeesResource extends js.Object {
  var breakpoints: BreakpointsResource
  /** Lists all the debuggees that the user has access to. */
  def list(request: gapiDotClientDotClouddebuggerLib.Anon_AccesstokenProject): gapiDotClientLib.gapiNs.clientNs.Request[ListDebuggeesResponse]
  /**
               * Registers the debuggee with the controller service.
               *
               * All agents attached to the same application must call this method with
               * exactly the same request content to get back the same stable `debuggee_id`.
               * Agents should call this method again whenever `google.rpc.Code.NOT_FOUND`
               * is returned from any controller method.
               *
               * This protocol allows the controller service to disable debuggees, recover
               * from data loss, or change the `debuggee_id` format. Agents must handle
               * `debuggee_id` value changing upon re-registration.
               */
  def register(request: gapiDotClientDotClouddebuggerLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[RegisterDebuggeeResponse]
}

