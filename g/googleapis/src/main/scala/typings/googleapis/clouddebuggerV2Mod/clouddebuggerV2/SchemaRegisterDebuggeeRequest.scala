package typings.googleapis.clouddebuggerV2Mod.clouddebuggerV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request to register a debuggee.
  */
@js.native
trait SchemaRegisterDebuggeeRequest extends js.Object {
  /**
    * Debuggee information to register. The fields `project`, `uniquifier`,
    * `description` and `agent_version` of the debuggee must be set.
    */
  var debuggee: js.UndefOr[SchemaDebuggee] = js.native
}

object SchemaRegisterDebuggeeRequest {
  @scala.inline
  def apply(debuggee: SchemaDebuggee = null): SchemaRegisterDebuggeeRequest = {
    val __obj = js.Dynamic.literal()
    if (debuggee != null) __obj.updateDynamic("debuggee")(debuggee.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaRegisterDebuggeeRequest]
  }
}

