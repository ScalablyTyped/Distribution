package typings.gapiDotClientDotClouddebugger.gapiNs.clientNs

import typings.gapiDotClientDotClouddebugger.gapiDotClientDotClouddebuggerStrings.clouddebugger
import typings.gapiDotClientDotClouddebugger.gapiDotClientDotClouddebuggerStrings.v2
import typings.gapiDotClientDotClouddebugger.gapiNs.clientNs.clouddebuggerNs.ControllerResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object ^ extends js.Object {
  val controller: ControllerResource = js.native
  /** Load Stackdriver Debugger API v2 */
  def load(name: clouddebugger, version: v2): js.Thenable[Unit] = js.native
  def load(name: clouddebugger, version: v2, callback: js.Function0[_]): Unit = js.native
}

