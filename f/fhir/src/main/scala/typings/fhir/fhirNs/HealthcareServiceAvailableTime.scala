package typings.fhir.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Times the Service Site is available
  */
trait HealthcareServiceAvailableTime extends BackboneElement {
  /**
    * Contains extended information for property 'allDay'.
    */
  var _allDay: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'availableEndTime'.
    */
  var _availableEndTime: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'availableStartTime'.
    */
  var _availableStartTime: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'daysOfWeek'.
    */
  var _daysOfWeek: js.UndefOr[js.Array[Element]] = js.undefined
  /**
    * Always available? e.g. 24 hour service
    */
  var allDay: js.UndefOr[Boolean] = js.undefined
  /**
    * Closing time of day (ignored if allDay = true)
    */
  var availableEndTime: js.UndefOr[time] = js.undefined
  /**
    * Opening time of day (ignored if allDay = true)
    */
  var availableStartTime: js.UndefOr[time] = js.undefined
  /**
    * mon | tue | wed | thu | fri | sat | sun
    */
  var daysOfWeek: js.UndefOr[js.Array[code]] = js.undefined
}

object HealthcareServiceAvailableTime {
  @scala.inline
  def apply(
    _allDay: Element = null,
    _availableEndTime: Element = null,
    _availableStartTime: Element = null,
    _daysOfWeek: js.Array[Element] = null,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    allDay: js.UndefOr[Boolean] = js.undefined,
    availableEndTime: time = null,
    availableStartTime: time = null,
    daysOfWeek: js.Array[code] = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    modifierExtension: js.Array[Extension] = null
  ): HealthcareServiceAvailableTime = {
    val __obj = js.Dynamic.literal()
    if (_allDay != null) __obj.updateDynamic("_allDay")(_allDay)
    if (_availableEndTime != null) __obj.updateDynamic("_availableEndTime")(_availableEndTime)
    if (_availableStartTime != null) __obj.updateDynamic("_availableStartTime")(_availableStartTime)
    if (_daysOfWeek != null) __obj.updateDynamic("_daysOfWeek")(_daysOfWeek)
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (!js.isUndefined(allDay)) __obj.updateDynamic("allDay")(allDay)
    if (availableEndTime != null) __obj.updateDynamic("availableEndTime")(availableEndTime)
    if (availableStartTime != null) __obj.updateDynamic("availableStartTime")(availableStartTime)
    if (daysOfWeek != null) __obj.updateDynamic("daysOfWeek")(daysOfWeek)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    __obj.asInstanceOf[HealthcareServiceAvailableTime]
  }
}

