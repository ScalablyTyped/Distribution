package typings.gaeaModel.FitGaea

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventData extends js.Object {
  var event: String = js.native
  var eventData: js.UndefOr[EventActionJumpUrl | EventActionCall | EventActionEvent] = js.native
  var eventIndex: Double = js.native
  var `type`: String = js.native
  var typeData: js.UndefOr[EventTriggerEvent] = js.native
  /**
    * 因为事件可能 type 相同，因此记录是第几个
    */
  var typeIndex: Double = js.native
}

object EventData {
  @scala.inline
  def apply(event: String, eventIndex: Double, `type`: String, typeIndex: Double): EventData = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], eventIndex = eventIndex.asInstanceOf[js.Any], typeIndex = typeIndex.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
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
    def setEvent(value: String): Self = this.set("event", value.asInstanceOf[js.Any])
    @scala.inline
    def setEventIndex(value: Double): Self = this.set("eventIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setTypeIndex(value: Double): Self = this.set("typeIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setEventData(value: EventActionJumpUrl | EventActionCall | EventActionEvent): Self = this.set("eventData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEventData: Self = this.set("eventData", js.undefined)
    @scala.inline
    def setTypeData(value: EventTriggerEvent): Self = this.set("typeData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTypeData: Self = this.set("typeData", js.undefined)
  }
  
}

