package typings.googleapis.clouddebuggerV2Mod.clouddebuggerV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request to update an active breakpoint.
  */
@js.native
trait SchemaUpdateActiveBreakpointRequest extends js.Object {
  /**
    * Updated breakpoint information. The field `id` must be set. The agent
    * must echo all Breakpoint specification fields in the update.
    */
  var breakpoint: js.UndefOr[SchemaBreakpoint] = js.native
}

object SchemaUpdateActiveBreakpointRequest {
  @scala.inline
  def apply(breakpoint: SchemaBreakpoint = null): SchemaUpdateActiveBreakpointRequest = {
    val __obj = js.Dynamic.literal()
    if (breakpoint != null) __obj.updateDynamic("breakpoint")(breakpoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaUpdateActiveBreakpointRequest]
  }
}

