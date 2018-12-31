package typings
package gapiDotClientDotClouddebuggerLib.gapiNs.clientNs.clouddebuggerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListActiveBreakpointsResponse extends js.Object {
  /**
    * List of all active breakpoints.
    * The fields `id` and `location` are guaranteed to be set on each breakpoint.
    */
  var breakpoints: js.UndefOr[js.Array[Breakpoint]] = js.undefined
  /**
    * A token that can be used in the next method call to block until
    * the list of breakpoints changes.
    */
  var nextWaitToken: js.UndefOr[java.lang.String] = js.undefined
  /**
    * If set to `true`, indicates that there is no change to the
    * list of active breakpoints and the server-selected timeout has expired.
    * The `breakpoints` field would be empty and should be ignored.
    */
  var waitExpired: js.UndefOr[scala.Boolean] = js.undefined
}

