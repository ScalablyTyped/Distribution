package typings.fhir.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines an expected trigger for a module
  */
trait TriggerDefinition extends Element {
  /**
    * Contains extended information for property 'eventName'.
    */
  var _eventName: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'eventTimingDate'.
    */
  var _eventTimingDate: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'eventTimingDateTime'.
    */
  var _eventTimingDateTime: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'type'.
    */
  var _type: js.UndefOr[Element] = js.undefined
  /**
    * Triggering data of the event
    */
  var eventData: js.UndefOr[DataRequirement] = js.undefined
  /**
    * Triggering event name
    */
  var eventName: js.UndefOr[String] = js.undefined
  /**
    * Timing of the event
    */
  var eventTimingDate: js.UndefOr[date] = js.undefined
  /**
    * Timing of the event
    */
  var eventTimingDateTime: js.UndefOr[dateTime] = js.undefined
  /**
    * Timing of the event
    */
  var eventTimingReference: js.UndefOr[Reference] = js.undefined
  /**
    * Timing of the event
    */
  var eventTimingTiming: js.UndefOr[Timing] = js.undefined
  /**
    * named-event | periodic | data-added | data-modified | data-removed | data-accessed | data-access-ended
    */
  var `type`: code
}

object TriggerDefinition {
  @scala.inline
  def apply(
    `type`: code,
    _eventName: Element = null,
    _eventTimingDate: Element = null,
    _eventTimingDateTime: Element = null,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _type: Element = null,
    eventData: DataRequirement = null,
    eventName: String = null,
    eventTimingDate: date = null,
    eventTimingDateTime: dateTime = null,
    eventTimingReference: Reference = null,
    eventTimingTiming: Timing = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null
  ): TriggerDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (_eventName != null) __obj.updateDynamic("_eventName")(_eventName)
    if (_eventTimingDate != null) __obj.updateDynamic("_eventTimingDate")(_eventTimingDate)
    if (_eventTimingDateTime != null) __obj.updateDynamic("_eventTimingDateTime")(_eventTimingDateTime)
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_type != null) __obj.updateDynamic("_type")(_type)
    if (eventData != null) __obj.updateDynamic("eventData")(eventData)
    if (eventName != null) __obj.updateDynamic("eventName")(eventName)
    if (eventTimingDate != null) __obj.updateDynamic("eventTimingDate")(eventTimingDate)
    if (eventTimingDateTime != null) __obj.updateDynamic("eventTimingDateTime")(eventTimingDateTime)
    if (eventTimingReference != null) __obj.updateDynamic("eventTimingReference")(eventTimingReference)
    if (eventTimingTiming != null) __obj.updateDynamic("eventTimingTiming")(eventTimingTiming)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[TriggerDefinition]
  }
}

