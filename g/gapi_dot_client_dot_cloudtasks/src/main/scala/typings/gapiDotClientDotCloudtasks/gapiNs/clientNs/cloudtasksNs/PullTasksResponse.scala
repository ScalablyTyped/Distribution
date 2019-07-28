package typings.gapiDotClientDotCloudtasks.gapiNs.clientNs.cloudtasksNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullTasksResponse extends js.Object {
  /** The leased tasks. */
  var tasks: js.UndefOr[js.Array[Task]] = js.undefined
}

object PullTasksResponse {
  @scala.inline
  def apply(tasks: js.Array[Task] = null): PullTasksResponse = {
    val __obj = js.Dynamic.literal()
    if (tasks != null) __obj.updateDynamic("tasks")(tasks)
    __obj.asInstanceOf[PullTasksResponse]
  }
}

