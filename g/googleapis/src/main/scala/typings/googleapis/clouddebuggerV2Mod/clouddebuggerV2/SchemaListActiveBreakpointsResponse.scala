package typings.googleapis.clouddebuggerV2Mod.clouddebuggerV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response for listing active breakpoints.
  */
@js.native
trait SchemaListActiveBreakpointsResponse extends js.Object {
  /**
    * List of all active breakpoints. The fields `id` and `location` are
    * guaranteed to be set on each breakpoint.
    */
  var breakpoints: js.UndefOr[js.Array[SchemaBreakpoint]] = js.native
  /**
    * A token that can be used in the next method call to block until the list
    * of breakpoints changes.
    */
  var nextWaitToken: js.UndefOr[String] = js.native
  /**
    * If set to `true`, indicates that there is no change to the list of active
    * breakpoints and the server-selected timeout has expired. The
    * `breakpoints` field would be empty and should be ignored.
    */
  var waitExpired: js.UndefOr[Boolean] = js.native
}

object SchemaListActiveBreakpointsResponse {
  @scala.inline
  def apply(
    breakpoints: js.Array[SchemaBreakpoint] = null,
    nextWaitToken: String = null,
    waitExpired: js.UndefOr[Boolean] = js.undefined
  ): SchemaListActiveBreakpointsResponse = {
    val __obj = js.Dynamic.literal()
    if (breakpoints != null) __obj.updateDynamic("breakpoints")(breakpoints.asInstanceOf[js.Any])
    if (nextWaitToken != null) __obj.updateDynamic("nextWaitToken")(nextWaitToken.asInstanceOf[js.Any])
    if (!js.isUndefined(waitExpired)) __obj.updateDynamic("waitExpired")(waitExpired.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListActiveBreakpointsResponse]
  }
}

