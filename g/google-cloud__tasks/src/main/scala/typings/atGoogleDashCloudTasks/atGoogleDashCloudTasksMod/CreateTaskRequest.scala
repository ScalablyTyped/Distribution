package typings.atGoogleDashCloudTasks.atGoogleDashCloudTasksMod

import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateTaskRequest extends js.Object {
  var parent: String
  var responseView: js.UndefOr[View] = js.undefined
  var task: Partial[Task]
}

object CreateTaskRequest {
  @scala.inline
  def apply(parent: String, task: Partial[Task], responseView: View = null): CreateTaskRequest = {
    val __obj = js.Dynamic.literal(parent = parent, task = task)
    if (responseView != null) __obj.updateDynamic("responseView")(responseView)
    __obj.asInstanceOf[CreateTaskRequest]
  }
}

