package typings
package gaeaDashModelLib.FitGaeaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventData extends js.Object {
  var event: java.lang.String
  var eventData: js.UndefOr[EventActionJumpUrl | EventActionCall | EventActionEvent] = js.undefined
  var eventIndex: scala.Double
  var `type`: java.lang.String
  var typeData: js.UndefOr[EventTriggerEvent] = js.undefined
  /**
    * 因为事件可能 type 相同，因此记录是第几个
    */
  var typeIndex: scala.Double
}

object EventData {
  @scala.inline
  def apply(
    event: java.lang.String,
    eventIndex: scala.Double,
    `type`: java.lang.String,
    typeIndex: scala.Double,
    eventData: EventActionJumpUrl | EventActionCall | EventActionEvent = null,
    typeData: EventTriggerEvent = null
  ): EventData = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("event")(event)
    __obj.updateDynamic("eventIndex")(eventIndex)
    __obj.updateDynamic("typeIndex")(typeIndex)
    if (eventData != null) __obj.updateDynamic("eventData")(eventData.asInstanceOf[js.Any])
    if (typeData != null) __obj.updateDynamic("typeData")(typeData)
    __obj.asInstanceOf[EventData]
  }
}

