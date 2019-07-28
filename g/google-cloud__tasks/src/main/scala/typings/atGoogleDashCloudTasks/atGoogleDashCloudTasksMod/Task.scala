package typings.atGoogleDashCloudTasks.atGoogleDashCloudTasksMod

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
    val __obj = js.Dynamic.literal(appEngineHttpRequest = appEngineHttpRequest, createTime = createTime, dispatchCount = dispatchCount, firstAttempt = firstAttempt, lastAttempt = lastAttempt, name = name, responseCount = responseCount, scheduleTime = scheduleTime, view = view)
  
    __obj.asInstanceOf[Task]
  }
}

