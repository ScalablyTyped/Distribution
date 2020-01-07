package typings.googleapis.buildSrcApisClouddebuggerV2Mod.clouddebugger_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request to register a debuggee.
  */
@js.native
trait Schema$RegisterDebuggeeRequest extends js.Object {
  /**
    * Debuggee information to register. The fields `project`, `uniquifier`,
    * `description` and `agent_version` of the debuggee must be set.
    */
  var debuggee: js.UndefOr[Schema$Debuggee] = js.native
}

object Schema$RegisterDebuggeeRequest {
  @scala.inline
  def apply(debuggee: Schema$Debuggee = null): Schema$RegisterDebuggeeRequest = {
    val __obj = js.Dynamic.literal()
    if (debuggee != null) __obj.updateDynamic("debuggee")(debuggee.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$RegisterDebuggeeRequest]
  }
}

