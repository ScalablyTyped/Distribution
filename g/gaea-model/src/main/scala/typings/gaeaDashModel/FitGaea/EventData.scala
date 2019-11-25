package typings.gaeaDashModel.FitGaea

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventData extends js.Object {
  var event: String
  var eventData: js.UndefOr[EventActionJumpUrl | EventActionCall | EventActionEvent] = js.undefined
  var eventIndex: Double
  var `type`: String
  var typeData: js.UndefOr[EventTriggerEvent] = js.undefined
  /**
    * 因为事件可能 type 相同，因此记录是第几个
    */
  var typeIndex: Double
}

object EventData {
  @scala.inline
  def apply(
    event: String,
    eventIndex: Double,
    `type`: String,
    typeIndex: Double,
    eventData: EventActionJumpUrl | EventActionCall | EventActionEvent = null,
    typeData: EventTriggerEvent = null
  ): EventData = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], eventIndex = eventIndex.asInstanceOf[js.Any], typeIndex = typeIndex.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (eventData != null) __obj.updateDynamic("eventData")(eventData.asInstanceOf[js.Any])
    if (typeData != null) __obj.updateDynamic("typeData")(typeData.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventData]
  }
}

