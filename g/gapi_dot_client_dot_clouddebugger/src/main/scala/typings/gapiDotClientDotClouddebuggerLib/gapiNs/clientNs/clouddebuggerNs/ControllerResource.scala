package typings
package gapiDotClientDotClouddebuggerLib.gapiNs.clientNs.clouddebuggerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ControllerResource extends js.Object {
  var debuggees: DebuggeesResource
}

object ControllerResource {
  @scala.inline
  def apply(debuggees: DebuggeesResource): ControllerResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("debuggees")(debuggees)
    __obj.asInstanceOf[ControllerResource]
  }
}

