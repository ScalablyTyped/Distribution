package typings.gapiDotClientDotClouddebugger.gapiNs.clientNs.clouddebuggerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListBreakpointsResponse extends js.Object {
  /**
    * List of breakpoints matching the request.
    * The fields `id` and `location` are guaranteed to be set on each breakpoint.
    * The fields: `stack_frames`, `evaluated_expressions` and `variable_table`
    * are cleared on each breakpoint regardless of its status.
    */
  var breakpoints: js.UndefOr[js.Array[Breakpoint]] = js.undefined
  /**
    * A wait token that can be used in the next call to `list` (REST) or
    * `ListBreakpoints` (RPC) to block until the list of breakpoints has changes.
    */
  var nextWaitToken: js.UndefOr[String] = js.undefined
}

object ListBreakpointsResponse {
  @scala.inline
  def apply(breakpoints: js.Array[Breakpoint] = null, nextWaitToken: String = null): ListBreakpointsResponse = {
    val __obj = js.Dynamic.literal()
    if (breakpoints != null) __obj.updateDynamic("breakpoints")(breakpoints)
    if (nextWaitToken != null) __obj.updateDynamic("nextWaitToken")(nextWaitToken)
    __obj.asInstanceOf[ListBreakpointsResponse]
  }
}

