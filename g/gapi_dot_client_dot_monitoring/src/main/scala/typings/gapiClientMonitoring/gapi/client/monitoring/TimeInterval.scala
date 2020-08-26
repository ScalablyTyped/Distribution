package typings.gapiClientMonitoring.gapi.client.monitoring

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimeInterval extends js.Object {
  /** Required. The end of the time interval. */
  var endTime: js.UndefOr[String] = js.native
  /** Optional. The beginning of the time interval. The default value for the start time is the end time. The start time must not be later than the end time. */
  var startTime: js.UndefOr[String] = js.native
}

object TimeInterval {
  @scala.inline
  def apply(): TimeInterval = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeInterval]
  }
  @scala.inline
  implicit class TimeIntervalOps[Self <: TimeInterval] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEndTime(value: String): Self = this.set("endTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndTime: Self = this.set("endTime", js.undefined)
    @scala.inline
    def setStartTime(value: String): Self = this.set("startTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartTime: Self = this.set("startTime", js.undefined)
  }
  
}

