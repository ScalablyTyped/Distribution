package typings.gapiDotClientDotClouddebugger.gapiNs.clientNs.clouddebuggerNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotClouddebugger.Anon_AccesstokenAltBearertokenCallbackClientVersion
import typings.gapiDotClientDotClouddebugger.Anon_AccesstokenAltBearertokenCallbackFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DebuggeesResource extends js.Object {
  var breakpoints: BreakpointsResource
  /** Lists all the debuggees that the user has access to. */
  def list(request: Anon_AccesstokenAltBearertokenCallbackClientVersion): Request[ListDebuggeesResponse]
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
  def register(request: Anon_AccesstokenAltBearertokenCallbackFields): Request[RegisterDebuggeeResponse]
}

object DebuggeesResource {
  @scala.inline
  def apply(
    breakpoints: BreakpointsResource,
    list: Anon_AccesstokenAltBearertokenCallbackClientVersion => Request[ListDebuggeesResponse],
    register: Anon_AccesstokenAltBearertokenCallbackFields => Request[RegisterDebuggeeResponse]
  ): DebuggeesResource = {
    val __obj = js.Dynamic.literal(breakpoints = breakpoints, list = js.Any.fromFunction1(list), register = js.Any.fromFunction1(register))
  
    __obj.asInstanceOf[DebuggeesResource]
  }
}

