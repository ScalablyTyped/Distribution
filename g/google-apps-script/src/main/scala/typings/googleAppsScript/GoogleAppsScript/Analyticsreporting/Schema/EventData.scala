package typings.googleAppsScript.GoogleAppsScript.Analyticsreporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventData extends js.Object {
  var eventAction: js.UndefOr[String] = js.native
  var eventCategory: js.UndefOr[String] = js.native
  var eventCount: js.UndefOr[String] = js.native
  var eventLabel: js.UndefOr[String] = js.native
  var eventValue: js.UndefOr[String] = js.native
}

object EventData {
  @scala.inline
  def apply(): EventData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventData]
  }
  @scala.inline
  implicit class EventDataOps[Self <: EventData] (val x: Self) extends AnyVal {
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
    def setEventAction(value: String): Self = this.set("eventAction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEventAction: Self = this.set("eventAction", js.undefined)
    @scala.inline
    def setEventCategory(value: String): Self = this.set("eventCategory", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEventCategory: Self = this.set("eventCategory", js.undefined)
    @scala.inline
    def setEventCount(value: String): Self = this.set("eventCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEventCount: Self = this.set("eventCount", js.undefined)
    @scala.inline
    def setEventLabel(value: String): Self = this.set("eventLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEventLabel: Self = this.set("eventLabel", js.undefined)
    @scala.inline
    def setEventValue(value: String): Self = this.set("eventValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEventValue: Self = this.set("eventValue", js.undefined)
  }
  
}

