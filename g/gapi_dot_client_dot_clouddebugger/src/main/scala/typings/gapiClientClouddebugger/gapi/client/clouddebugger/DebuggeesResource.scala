package typings.gapiClientClouddebugger.gapi.client.clouddebugger

import typings.gapiClient.gapi.client.Request
import typings.gapiClientClouddebugger.anon.ClientVersion
import typings.gapiClientClouddebugger.anon.Fields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DebuggeesResource extends js.Object {
  var breakpoints: BreakpointsResource = js.native
  /** Lists all the debuggees that the user has access to. */
  def list(request: ClientVersion): Request[ListDebuggeesResponse] = js.native
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
  def register(request: Fields): Request[RegisterDebuggeeResponse] = js.native
}

object DebuggeesResource {
  @scala.inline
  def apply(
    breakpoints: BreakpointsResource,
    list: ClientVersion => Request[ListDebuggeesResponse],
    register: Fields => Request[RegisterDebuggeeResponse]
  ): DebuggeesResource = {
    val __obj = js.Dynamic.literal(breakpoints = breakpoints.asInstanceOf[js.Any], list = js.Any.fromFunction1(list), register = js.Any.fromFunction1(register))
    __obj.asInstanceOf[DebuggeesResource]
  }
  @scala.inline
  implicit class DebuggeesResourceOps[Self <: DebuggeesResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBreakpoints(value: BreakpointsResource): Self = this.set("breakpoints", value.asInstanceOf[js.Any])
    @scala.inline
    def setList(value: ClientVersion => Request[ListDebuggeesResponse]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setRegister(value: Fields => Request[RegisterDebuggeeResponse]): Self = this.set("register", js.Any.fromFunction1(value))
  }
  
}

