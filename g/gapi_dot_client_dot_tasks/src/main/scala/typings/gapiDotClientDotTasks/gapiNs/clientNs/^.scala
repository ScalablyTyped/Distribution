package typings.gapiDotClientDotTasks.gapiNs.clientNs

import typings.gapiDotClientDotTasks.gapiDotClientDotTasksStrings.v1
import typings.gapiDotClientDotTasks.gapiNs.clientNs.tasksNs.TasklistsResource
import typings.gapiDotClientDotTasks.gapiNs.clientNs.tasksNs.TasksResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object ^ extends js.Object {
  val tasklists: TasklistsResource = js.native
  val tasks: TasksResource = js.native
  /** Load Tasks API v1 */
  def load(name: typings.gapiDotClientDotTasks.gapiDotClientDotTasksStrings.tasks, version: v1): js.Thenable[Unit] = js.native
  def load(
    name: typings.gapiDotClientDotTasks.gapiDotClientDotTasksStrings.tasks,
    version: v1,
    callback: js.Function0[_]
  ): Unit = js.native
}

