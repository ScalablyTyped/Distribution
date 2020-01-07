package typings.googleapis.buildSrcApisCloudtasksV2beta2Mod.cloudtasks_v2beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for leasing tasks using LeaseTasks.
  */
@js.native
trait Schema$LeaseTasksResponse extends js.Object {
  /**
    * The leased tasks.
    */
  var tasks: js.UndefOr[js.Array[Schema$Task]] = js.native
}

object Schema$LeaseTasksResponse {
  @scala.inline
  def apply(tasks: js.Array[Schema$Task] = null): Schema$LeaseTasksResponse = {
    val __obj = js.Dynamic.literal()
    if (tasks != null) __obj.updateDynamic("tasks")(tasks.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$LeaseTasksResponse]
  }
}

