package typings.gapiClientClouddebugger.gapi.client.clouddebugger

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientClouddebugger.AnonAccesstokenAltBearertokenCallbackClientVersion
import typings.gapiClientClouddebugger.AnonAccesstokenAltBearertokenCallbackFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DebuggeesResource extends js.Object {
  var breakpoints: BreakpointsResource
  /** Lists all the debuggees that the user has access to. */
  def list(request: AnonAccesstokenAltBearertokenCallbackClientVersion): Request_[ListDebuggeesResponse]
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
  def register(request: AnonAccesstokenAltBearertokenCallbackFields): Request_[RegisterDebuggeeResponse]
}

object DebuggeesResource {
  @scala.inline
  def apply(
    breakpoints: BreakpointsResource,
    list: AnonAccesstokenAltBearertokenCallbackClientVersion => Request_[ListDebuggeesResponse],
    register: AnonAccesstokenAltBearertokenCallbackFields => Request_[RegisterDebuggeeResponse]
  ): DebuggeesResource = {
    val __obj = js.Dynamic.literal(breakpoints = breakpoints.asInstanceOf[js.Any], list = js.Any.fromFunction1(list), register = js.Any.fromFunction1(register))
  
    __obj.asInstanceOf[DebuggeesResource]
  }
}

