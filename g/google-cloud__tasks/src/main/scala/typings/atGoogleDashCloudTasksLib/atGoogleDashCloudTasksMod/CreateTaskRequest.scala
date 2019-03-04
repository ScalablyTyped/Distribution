package typings
package atGoogleDashCloudTasksLib.atGoogleDashCloudTasksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateTaskRequest extends js.Object {
  var responseView: View
  var task: stdLib.Partial[Task]
}

object CreateTaskRequest {
  @scala.inline
  def apply(responseView: View, task: stdLib.Partial[Task]): CreateTaskRequest = {
    val __obj = js.Dynamic.literal(responseView = responseView, task = task)
  
    __obj.asInstanceOf[CreateTaskRequest]
  }
}

