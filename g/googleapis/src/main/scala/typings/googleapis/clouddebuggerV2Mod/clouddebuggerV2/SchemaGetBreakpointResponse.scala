package typings.googleapis.clouddebuggerV2Mod.clouddebuggerV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response for getting breakpoint information.
  */
@js.native
trait SchemaGetBreakpointResponse extends js.Object {
  /**
    * Complete breakpoint state. The fields `id` and `location` are guaranteed
    * to be set.
    */
  var breakpoint: js.UndefOr[SchemaBreakpoint] = js.native
}

object SchemaGetBreakpointResponse {
  @scala.inline
  def apply(breakpoint: SchemaBreakpoint = null): SchemaGetBreakpointResponse = {
    val __obj = js.Dynamic.literal()
    if (breakpoint != null) __obj.updateDynamic("breakpoint")(breakpoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGetBreakpointResponse]
  }
}

