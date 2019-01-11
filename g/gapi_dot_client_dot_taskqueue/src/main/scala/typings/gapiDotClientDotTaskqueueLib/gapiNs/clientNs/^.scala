package typings
package gapiDotClientDotTaskqueueLib.gapiNs.clientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object ^ extends js.Object {
  val taskqueues: gapiDotClientDotTaskqueueLib.gapiNs.clientNs.taskqueueNs.TaskqueuesResource = js.native
  val tasks: gapiDotClientDotTaskqueueLib.gapiNs.clientNs.taskqueueNs.TasksResource = js.native
  /** Load TaskQueue API v1beta2 */
  def load(
    name: gapiDotClientDotTaskqueueLib.gapiDotClientDotTaskqueueLibStrings.taskqueue,
    version: gapiDotClientDotTaskqueueLib.gapiDotClientDotTaskqueueLibStrings.v1beta2
  ): js.Thenable[scala.Unit] = js.native
  def load(
    name: gapiDotClientDotTaskqueueLib.gapiDotClientDotTaskqueueLibStrings.taskqueue,
    version: gapiDotClientDotTaskqueueLib.gapiDotClientDotTaskqueueLibStrings.v1beta2,
    callback: js.Function0[_]
  ): scala.Unit = js.native
}

