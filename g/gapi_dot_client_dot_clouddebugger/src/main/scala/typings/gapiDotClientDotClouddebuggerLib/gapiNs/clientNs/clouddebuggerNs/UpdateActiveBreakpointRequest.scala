package typings
package gapiDotClientDotClouddebuggerLib.gapiNs.clientNs.clouddebuggerNs

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

