package typings.gapiDotClientDotClouddebugger.gapi.client.clouddebugger

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetBreakpointResponse extends js.Object {
  /**
    * Breakpoint resource.
    * The field `id` is guaranteed to be set (in addition to the echoed fileds).
    */
  var breakpoint: js.UndefOr[Breakpoint] = js.undefined
}

object SetBreakpointResponse {
  @scala.inline
  def apply(breakpoint: Breakpoint = null): SetBreakpointResponse = {
    val __obj = js.Dynamic.literal()
    if (breakpoint != null) __obj.updateDynamic("breakpoint")(breakpoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetBreakpointResponse]
  }
}

