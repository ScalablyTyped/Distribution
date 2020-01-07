package typings.googleapis.buildSrcApisClouddebuggerV2Mod.clouddebugger_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request to update an active breakpoint.
  */
@js.native
trait Schema$UpdateActiveBreakpointRequest extends js.Object {
  /**
    * Updated breakpoint information. The field `id` must be set. The agent
    * must echo all Breakpoint specification fields in the update.
    */
  var breakpoint: js.UndefOr[Schema$Breakpoint] = js.native
}

object Schema$UpdateActiveBreakpointRequest {
  @scala.inline
  def apply(breakpoint: Schema$Breakpoint = null): Schema$UpdateActiveBreakpointRequest = {
    val __obj = js.Dynamic.literal()
    if (breakpoint != null) __obj.updateDynamic("breakpoint")(breakpoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$UpdateActiveBreakpointRequest]
  }
}

