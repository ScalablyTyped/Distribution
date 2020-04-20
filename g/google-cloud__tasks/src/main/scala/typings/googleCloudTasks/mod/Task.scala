package typings.googleCloudTasks.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Task extends js.Object {
  var appEngineHttpRequest: AppEngineHttpRequest
  var createTime: String
  var dispatchCount: Double
  var firstAttempt: Attempt
  var lastAttempt: Attempt
  var name: String
  var responseCount: Double
  var scheduleTime: String
  var view: View
}

object Task {
  @scala.inline
  def apply(
    appEngineHttpRequest: AppEngineHttpRequest,
    createTime: String,
    dispatchCount: Double,
    firstAttempt: Attempt,
    lastAttempt: Attempt,
    name: String,
    responseCount: Double,
    scheduleTime: String,
    view: View
  ): Task = {
    val __obj = js.Dynamic.literal(appEngineHttpRequest = appEngineHttpRequest.asInstanceOf[js.Any], createTime = createTime.asInstanceOf[js.Any], dispatchCount = dispatchCount.asInstanceOf[js.Any], firstAttempt = firstAttempt.asInstanceOf[js.Any], lastAttempt = lastAttempt.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], responseCount = responseCount.asInstanceOf[js.Any], scheduleTime = scheduleTime.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[Task]
  }
}

