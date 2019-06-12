package typings
package atGoogleDashCloudTasksLib.atGoogleDashCloudTasksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateTaskRequest extends js.Object {
  var parent: java.lang.String
  var responseView: js.UndefOr[View] = js.undefined
  var task: stdLib.Partial[Task]
}

object CreateTaskRequest {
  @scala.inline
  def apply(parent: java.lang.String, task: stdLib.Partial[Task], responseView: View = null): CreateTaskRequest = {
    val __obj = js.Dynamic.literal(parent = parent, task = task)
    if (responseView != null) __obj.updateDynamic("responseView")(responseView)
    __obj.asInstanceOf[CreateTaskRequest]
  }
}

