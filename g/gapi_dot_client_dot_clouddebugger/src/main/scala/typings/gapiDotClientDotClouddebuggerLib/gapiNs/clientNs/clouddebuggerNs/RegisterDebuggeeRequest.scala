package typings
package gapiDotClientDotClouddebuggerLib.gapiNs.clientNs.clouddebuggerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegisterDebuggeeRequest extends js.Object {
  /**
    * Debuggee information to register.
    * The fields `project`, `uniquifier`, `description` and `agent_version`
    * of the debuggee must be set.
    */
  var debuggee: js.UndefOr[Debuggee] = js.undefined
}

