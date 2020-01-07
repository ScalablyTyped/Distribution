package typings.googleapis.buildSrcApisClouddebuggerV2Mod.clouddebugger_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response for getting breakpoint information.
  */
@js.native
trait Schema$GetBreakpointResponse extends js.Object {
  /**
    * Complete breakpoint state. The fields `id` and `location` are guaranteed
    * to be set.
    */
  var breakpoint: js.UndefOr[Schema$Breakpoint] = js.native
}

object Schema$GetBreakpointResponse {
  @scala.inline
  def apply(breakpoint: Schema$Breakpoint = null): Schema$GetBreakpointResponse = {
    val __obj = js.Dynamic.literal()
    if (breakpoint != null) __obj.updateDynamic("breakpoint")(breakpoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GetBreakpointResponse]
  }
}

