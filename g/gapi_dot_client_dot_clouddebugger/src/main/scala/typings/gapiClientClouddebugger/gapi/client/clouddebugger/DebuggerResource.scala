package typings.gapiClientClouddebugger.gapi.client.clouddebugger

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DebuggerResource extends js.Object {
  var debuggees: DebuggeesResource
}

object DebuggerResource {
  @scala.inline
  def apply(debuggees: DebuggeesResource): DebuggerResource = {
    val __obj = js.Dynamic.literal(debuggees = debuggees.asInstanceOf[js.Any])
    __obj.asInstanceOf[DebuggerResource]
  }
}

