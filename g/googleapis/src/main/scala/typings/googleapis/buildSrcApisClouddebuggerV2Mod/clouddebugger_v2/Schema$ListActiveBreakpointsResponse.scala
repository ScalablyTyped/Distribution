package typings.googleapis.buildSrcApisClouddebuggerV2Mod.clouddebugger_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response for listing active breakpoints.
  */
@js.native
trait Schema$ListActiveBreakpointsResponse extends js.Object {
  /**
    * List of all active breakpoints. The fields `id` and `location` are
    * guaranteed to be set on each breakpoint.
    */
  var breakpoints: js.UndefOr[js.Array[Schema$Breakpoint]] = js.native
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

object Schema$ListActiveBreakpointsResponse {
  @scala.inline
  def apply(
    breakpoints: js.Array[Schema$Breakpoint] = null,
    nextWaitToken: String = null,
    waitExpired: js.UndefOr[Boolean] = js.undefined
  ): Schema$ListActiveBreakpointsResponse = {
    val __obj = js.Dynamic.literal()
    if (breakpoints != null) __obj.updateDynamic("breakpoints")(breakpoints.asInstanceOf[js.Any])
    if (nextWaitToken != null) __obj.updateDynamic("nextWaitToken")(nextWaitToken.asInstanceOf[js.Any])
    if (!js.isUndefined(waitExpired)) __obj.updateDynamic("waitExpired")(waitExpired.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListActiveBreakpointsResponse]
  }
}

