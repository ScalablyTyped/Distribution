package typings.gapiDotClientDotTaskqueue.gapiNs.clientNs

import typings.gapiDotClientDotTaskqueue.gapiDotClientDotTaskqueueStrings.taskqueue
import typings.gapiDotClientDotTaskqueue.gapiDotClientDotTaskqueueStrings.v1beta2
import typings.gapiDotClientDotTaskqueue.gapiNs.clientNs.taskqueueNs.TaskqueuesResource
import typings.gapiDotClientDotTaskqueue.gapiNs.clientNs.taskqueueNs.TasksResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object ^ extends js.Object {
  val taskqueues: TaskqueuesResource = js.native
  val tasks: TasksResource = js.native
  /** Load TaskQueue API v1beta2 */
  def load(name: taskqueue, version: v1beta2): js.Thenable[Unit] = js.native
  def load(name: taskqueue, version: v1beta2, callback: js.Function0[_]): Unit = js.native
}

