package typings
package gapiDotClientDotClouddebuggerLib.gapiNs.clientNs.clouddebuggerNs

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
  var nextWaitToken: js.UndefOr[java.lang.String] = js.undefined
}

