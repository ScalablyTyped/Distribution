package typings.gapiDotClientDotClouddebugger.gapi.client.clouddebugger

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateActiveBreakpointRequest extends js.Object {
  /**
    * Updated breakpoint information.
    * The field `id` must be set.
    * The agent must echo all Breakpoint specification fields in the update.
    */
  var breakpoint: js.UndefOr[Breakpoint] = js.undefined
}

object UpdateActiveBreakpointRequest {
  @scala.inline
  def apply(breakpoint: Breakpoint = null): UpdateActiveBreakpointRequest = {
    val __obj = js.Dynamic.literal()
    if (breakpoint != null) __obj.updateDynamic("breakpoint")(breakpoint)
    __obj.asInstanceOf[UpdateActiveBreakpointRequest]
  }
}

