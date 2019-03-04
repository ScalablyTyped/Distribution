package typings
package atGoogleDashCloudTasksLib.atGoogleDashCloudTasksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Task extends js.Object {
  var appEngineHttpRequest: AppEngineHttpRequest
  var createTime: java.lang.String
  var dispatchCount: scala.Double
  var firstAttempt: Attempt
  var lastAttempt: Attempt
  var name: java.lang.String
  var responseCount: scala.Double
  var scheduleTime: java.lang.String
  var view: View
}

object Task {
  @scala.inline
  def apply(
    appEngineHttpRequest: AppEngineHttpRequest,
    createTime: java.lang.String,
    dispatchCount: scala.Double,
    firstAttempt: Attempt,
    lastAttempt: Attempt,
    name: java.lang.String,
    responseCount: scala.Double,
    scheduleTime: java.lang.String,
    view: View
  ): Task = {
    val __obj = js.Dynamic.literal(appEngineHttpRequest = appEngineHttpRequest, createTime = createTime, dispatchCount = dispatchCount, firstAttempt = firstAttempt, lastAttempt = lastAttempt, name = name, responseCount = responseCount, scheduleTime = scheduleTime, view = view)
  
    __obj.asInstanceOf[Task]
  }
}

