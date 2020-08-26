package typings.gapiClientClouddebugger.gapi.client.clouddebugger

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegisterDebuggeeRequest extends js.Object {
  /**
    * Debuggee information to register.
    * The fields `project`, `uniquifier`, `description` and `agent_version`
    * of the debuggee must be set.
    */
  var debuggee: js.UndefOr[Debuggee] = js.native
}

object RegisterDebuggeeRequest {
  @scala.inline
  def apply(): RegisterDebuggeeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegisterDebuggeeRequest]
  }
  @scala.inline
  implicit class RegisterDebuggeeRequestOps[Self <: RegisterDebuggeeRequest] (val x: Self) extends AnyVal {
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
    def setDebuggee(value: Debuggee): Self = this.set("debuggee", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDebuggee: Self = this.set("debuggee", js.undefined)
  }
  
}

