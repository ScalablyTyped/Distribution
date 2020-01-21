package typings.googleapis.clouddebuggerV2Mod.clouddebuggerV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response for setting a breakpoint.
  */
@js.native
trait SchemaSetBreakpointResponse extends js.Object {
  /**
    * Breakpoint resource. The field `id` is guaranteed to be set (in addition
    * to the echoed fileds).
    */
  var breakpoint: js.UndefOr[SchemaBreakpoint] = js.native
}

object SchemaSetBreakpointResponse {
  @scala.inline
  def apply(breakpoint: SchemaBreakpoint = null): SchemaSetBreakpointResponse = {
    val __obj = js.Dynamic.literal()
    if (breakpoint != null) __obj.updateDynamic("breakpoint")(breakpoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSetBreakpointResponse]
  }
}

