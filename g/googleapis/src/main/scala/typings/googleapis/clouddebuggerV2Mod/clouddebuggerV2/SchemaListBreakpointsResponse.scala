package typings.googleapis.clouddebuggerV2Mod.clouddebuggerV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response for listing breakpoints.
  */
@js.native
trait SchemaListBreakpointsResponse extends js.Object {
  /**
    * List of breakpoints matching the request. The fields `id` and `location`
    * are guaranteed to be set on each breakpoint. The fields: `stack_frames`,
    * `evaluated_expressions` and `variable_table` are cleared on each
    * breakpoint regardless of its status.
    */
  var breakpoints: js.UndefOr[js.Array[SchemaBreakpoint]] = js.native
  /**
    * A wait token that can be used in the next call to `list` (REST) or
    * `ListBreakpoints` (RPC) to block until the list of breakpoints has
    * changes.
    */
  var nextWaitToken: js.UndefOr[String] = js.native
}

object SchemaListBreakpointsResponse {
  @scala.inline
  def apply(breakpoints: js.Array[SchemaBreakpoint] = null, nextWaitToken: String = null): SchemaListBreakpointsResponse = {
    val __obj = js.Dynamic.literal()
    if (breakpoints != null) __obj.updateDynamic("breakpoints")(breakpoints.asInstanceOf[js.Any])
    if (nextWaitToken != null) __obj.updateDynamic("nextWaitToken")(nextWaitToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListBreakpointsResponse]
  }
}

