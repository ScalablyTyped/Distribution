package typings.googleCloudTasks.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Attempt extends js.Object {
  var dispatchTime: String
  var responseStatus: Status
  var responseTime: String
  var scheduleTime: String
}

object Attempt {
  @scala.inline
  def apply(dispatchTime: String, responseStatus: Status, responseTime: String, scheduleTime: String): Attempt = {
    val __obj = js.Dynamic.literal(dispatchTime = dispatchTime.asInstanceOf[js.Any], responseStatus = responseStatus.asInstanceOf[js.Any], responseTime = responseTime.asInstanceOf[js.Any], scheduleTime = scheduleTime.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Attempt]
  }
}

