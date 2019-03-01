package typings
package atGoogleDashCloudTasksLib.atGoogleDashCloudTasksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Attempt extends js.Object {
  var dispatchTime: java.lang.String
  var responseStatus: Status
  var responseTime: java.lang.String
  var scheduleTime: java.lang.String
}

object Attempt {
  @scala.inline
  def apply(
    dispatchTime: java.lang.String,
    responseStatus: Status,
    responseTime: java.lang.String,
    scheduleTime: java.lang.String
  ): Attempt = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dispatchTime")(dispatchTime)
    __obj.updateDynamic("responseStatus")(responseStatus)
    __obj.updateDynamic("responseTime")(responseTime)
    __obj.updateDynamic("scheduleTime")(scheduleTime)
    __obj.asInstanceOf[Attempt]
  }
}

