package typings
package gapiDotClientDotTasksLib.gapiNs.clientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object ^ extends js.Object {
  val tasklists: gapiDotClientDotTasksLib.gapiNs.clientNs.tasksNs.TasklistsResource = js.native
  val tasks: gapiDotClientDotTasksLib.gapiNs.clientNs.tasksNs.TasksResource = js.native
  /** Load Tasks API v1 */
  def load(
    name: gapiDotClientDotTasksLib.gapiDotClientDotTasksLibStrings.tasks,
    version: gapiDotClientDotTasksLib.gapiDotClientDotTasksLibStrings.v1
  ): js.Thenable[scala.Unit] = js.native
  def load(
    name: gapiDotClientDotTasksLib.gapiDotClientDotTasksLibStrings.tasks,
    version: gapiDotClientDotTasksLib.gapiDotClientDotTasksLibStrings.v1,
    callback: js.Function0[_]
  ): scala.Unit = js.native
}

