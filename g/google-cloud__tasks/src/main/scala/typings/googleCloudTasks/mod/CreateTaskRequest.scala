package typings.googleCloudTasks.mod

import typings.googleCloudTasks.PartialTask
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateTaskRequest extends js.Object {
  var parent: String
  var responseView: js.UndefOr[View] = js.undefined
  var task: PartialTask
}

object CreateTaskRequest {
  @scala.inline
  def apply(parent: String, task: PartialTask, responseView: View = null): CreateTaskRequest = {
    val __obj = js.Dynamic.literal(parent = parent.asInstanceOf[js.Any], task = task.asInstanceOf[js.Any])
    if (responseView != null) __obj.updateDynamic("responseView")(responseView.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTaskRequest]
  }
}

