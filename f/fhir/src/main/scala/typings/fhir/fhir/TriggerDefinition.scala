package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines an expected trigger for a module
  */
@js.native
trait TriggerDefinition extends Element {
  /**
    * Contains extended information for property 'eventName'.
    */
  var _eventName: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'eventTimingDate'.
    */
  var _eventTimingDate: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'eventTimingDateTime'.
    */
  var _eventTimingDateTime: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'type'.
    */
  var _type: js.UndefOr[Element] = js.native
  /**
    * Triggering data of the event
    */
  var eventData: js.UndefOr[DataRequirement] = js.native
  /**
    * Triggering event name
    */
  var eventName: js.UndefOr[String] = js.native
  /**
    * Timing of the event
    */
  var eventTimingDate: js.UndefOr[date] = js.native
  /**
    * Timing of the event
    */
  var eventTimingDateTime: js.UndefOr[dateTime] = js.native
  /**
    * Timing of the event
    */
  var eventTimingReference: js.UndefOr[Reference] = js.native
  /**
    * Timing of the event
    */
  var eventTimingTiming: js.UndefOr[Timing] = js.native
  /**
    * named-event | periodic | data-added | data-modified | data-removed | data-accessed | data-access-ended
    */
  var `type`: code = js.native
}

object TriggerDefinition {
  @scala.inline
  def apply(`type`: code): TriggerDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TriggerDefinition]
  }
  @scala.inline
  implicit class TriggerDefinitionOps[Self <: TriggerDefinition] (val x: Self) extends AnyVal {
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
    def setType(value: code): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def set_eventName(value: Element): Self = this.set("_eventName", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_eventName: Self = this.set("_eventName", js.undefined)
    @scala.inline
    def set_eventTimingDate(value: Element): Self = this.set("_eventTimingDate", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_eventTimingDate: Self = this.set("_eventTimingDate", js.undefined)
    @scala.inline
    def set_eventTimingDateTime(value: Element): Self = this.set("_eventTimingDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_eventTimingDateTime: Self = this.set("_eventTimingDateTime", js.undefined)
    @scala.inline
    def set_type(value: Element): Self = this.set("_type", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_type: Self = this.set("_type", js.undefined)
    @scala.inline
    def setEventData(value: DataRequirement): Self = this.set("eventData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEventData: Self = this.set("eventData", js.undefined)
    @scala.inline
    def setEventName(value: String): Self = this.set("eventName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEventName: Self = this.set("eventName", js.undefined)
    @scala.inline
    def setEventTimingDate(value: date): Self = this.set("eventTimingDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEventTimingDate: Self = this.set("eventTimingDate", js.undefined)
    @scala.inline
    def setEventTimingDateTime(value: dateTime): Self = this.set("eventTimingDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEventTimingDateTime: Self = this.set("eventTimingDateTime", js.undefined)
    @scala.inline
    def setEventTimingReference(value: Reference): Self = this.set("eventTimingReference", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEventTimingReference: Self = this.set("eventTimingReference", js.undefined)
    @scala.inline
    def setEventTimingTiming(value: Timing): Self = this.set("eventTimingTiming", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEventTimingTiming: Self = this.set("eventTimingTiming", js.undefined)
  }
  
}

