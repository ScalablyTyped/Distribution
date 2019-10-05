package typings.gapiDotClientDotMonitoring.gapi.client.monitoring

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimeInterval extends js.Object {
  /** Required. The end of the time interval. */
  var endTime: js.UndefOr[String] = js.undefined
  /** Optional. The beginning of the time interval. The default value for the start time is the end time. The start time must not be later than the end time. */
  var startTime: js.UndefOr[String] = js.undefined
}

object TimeInterval {
  @scala.inline
  def apply(endTime: String = null, startTime: String = null): TimeInterval = {
    val __obj = js.Dynamic.literal()
    if (endTime != null) __obj.updateDynamic("endTime")(endTime)
    if (startTime != null) __obj.updateDynamic("startTime")(startTime)
    __obj.asInstanceOf[TimeInterval]
  }
}

