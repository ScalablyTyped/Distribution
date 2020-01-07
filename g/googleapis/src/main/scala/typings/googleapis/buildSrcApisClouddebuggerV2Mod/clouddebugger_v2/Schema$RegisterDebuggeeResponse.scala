package typings.googleapis.buildSrcApisClouddebuggerV2Mod.clouddebugger_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response for registering a debuggee.
  */
@js.native
trait Schema$RegisterDebuggeeResponse extends js.Object {
  /**
    * Debuggee resource. The field `id` is guaranteed to be set (in addition to
    * the echoed fields). If the field `is_disabled` is set to `true`, the
    * agent should disable itself by removing all breakpoints and detaching
    * from the application. It should however continue to poll
    * `RegisterDebuggee` until reenabled.
    */
  var debuggee: js.UndefOr[Schema$Debuggee] = js.native
}

object Schema$RegisterDebuggeeResponse {
  @scala.inline
  def apply(debuggee: Schema$Debuggee = null): Schema$RegisterDebuggeeResponse = {
    val __obj = js.Dynamic.literal()
    if (debuggee != null) __obj.updateDynamic("debuggee")(debuggee.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$RegisterDebuggeeResponse]
  }
}

