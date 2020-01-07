package typings.googleapis.buildSrcApisClouddebuggerV2Mod.clouddebugger_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response for setting a breakpoint.
  */
@js.native
trait Schema$SetBreakpointResponse extends js.Object {
  /**
    * Breakpoint resource. The field `id` is guaranteed to be set (in addition
    * to the echoed fileds).
    */
  var breakpoint: js.UndefOr[Schema$Breakpoint] = js.native
}

object Schema$SetBreakpointResponse {
  @scala.inline
  def apply(breakpoint: Schema$Breakpoint = null): Schema$SetBreakpointResponse = {
    val __obj = js.Dynamic.literal()
    if (breakpoint != null) __obj.updateDynamic("breakpoint")(breakpoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$SetBreakpointResponse]
  }
}

