package typings.gapiDotClientDotClouddebugger.gapi.client.clouddebugger

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBreakpointResponse extends js.Object {
  /**
    * Complete breakpoint state.
    * The fields `id` and `location` are guaranteed to be set.
    */
  var breakpoint: js.UndefOr[Breakpoint] = js.undefined
}

object GetBreakpointResponse {
  @scala.inline
  def apply(breakpoint: Breakpoint = null): GetBreakpointResponse = {
    val __obj = js.Dynamic.literal()
    if (breakpoint != null) __obj.updateDynamic("breakpoint")(breakpoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBreakpointResponse]
  }
}

