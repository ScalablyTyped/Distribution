package typings.gapiClientSpectrum.gapi.client.spectrum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventTime extends js.Object {
  /** The inclusive start of the event. It will be present. */
  var startTime: js.UndefOr[String] = js.native
  /** The exclusive end of the event. It will be present. */
  var stopTime: js.UndefOr[String] = js.native
}

object EventTime {
  @scala.inline
  def apply(): EventTime = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventTime]
  }
  @scala.inline
  implicit class EventTimeOps[Self <: EventTime] (val x: Self) extends AnyVal {
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
    def setStartTime(value: String): Self = this.set("startTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartTime: Self = this.set("startTime", js.undefined)
    @scala.inline
    def setStopTime(value: String): Self = this.set("stopTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStopTime: Self = this.set("stopTime", js.undefined)
  }
  
}

