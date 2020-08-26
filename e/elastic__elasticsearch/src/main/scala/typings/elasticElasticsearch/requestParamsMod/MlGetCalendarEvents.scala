package typings.elasticElasticsearch.requestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MlGetCalendarEvents extends Generic {
  var calendar_id: String = js.native
  var end: js.UndefOr[String] = js.native
  var from: js.UndefOr[Double] = js.native
  var job_id: js.UndefOr[String] = js.native
  var size: js.UndefOr[Double] = js.native
  var start: js.UndefOr[String] = js.native
}

object MlGetCalendarEvents {
  @scala.inline
  def apply(calendar_id: String): MlGetCalendarEvents = {
    val __obj = js.Dynamic.literal(calendar_id = calendar_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlGetCalendarEvents]
  }
  @scala.inline
  implicit class MlGetCalendarEventsOps[Self <: MlGetCalendarEvents] (val x: Self) extends AnyVal {
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
    def setCalendar_id(value: String): Self = this.set("calendar_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnd(value: String): Self = this.set("end", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnd: Self = this.set("end", js.undefined)
    @scala.inline
    def setFrom(value: Double): Self = this.set("from", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrom: Self = this.set("from", js.undefined)
    @scala.inline
    def setJob_id(value: String): Self = this.set("job_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJob_id: Self = this.set("job_id", js.undefined)
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setStart(value: String): Self = this.set("start", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
  }
  
}

