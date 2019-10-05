package typings.gapiDotClientDotDataproc.gapi.client.dataproc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobScheduling extends js.Object {
  /**
    * Optional. Maximum number of times per hour a driver may be restarted as a result of driver terminating with non-zero code before job is reported
    * failed.A job may be reported as thrashing if driver exits with non-zero code 4 times within 10 minute window.Maximum value is 10.
    */
  var maxFailuresPerHour: js.UndefOr[Double] = js.undefined
}

object JobScheduling {
  @scala.inline
  def apply(maxFailuresPerHour: Int | Double = null): JobScheduling = {
    val __obj = js.Dynamic.literal()
    if (maxFailuresPerHour != null) __obj.updateDynamic("maxFailuresPerHour")(maxFailuresPerHour.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobScheduling]
  }
}

