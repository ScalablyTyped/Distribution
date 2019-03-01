package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A slot of time on a schedule that may be available for booking appointments
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- fhirLib.fhirNs.Resource because Already inherited */ trait Slot extends DomainResource {
  /**
    * Contains extended information for property 'comment'.
    */
  var _comment: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'end'.
    */
  var _end: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'overbooked'.
    */
  var _overbooked: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'start'.
    */
  var _start: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.undefined
  /**
    * The style of appointment or patient that may be booked in the slot (not service type)
    */
  var appointmentType: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * Comments on the slot to describe any extended information. Such as custom constraints on the slot
    */
  var comment: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Date/Time that the slot is to conclude
    */
  var end: instant
  /**
    * External Ids for this item
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  /**
    * This slot has already been overbooked, appointments are unlikely to be accepted for this time
    */
  var overbooked: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The schedule resource that this slot defines an interval of status information
    */
  var schedule: Reference
  /**
    * A broad categorisation of the service that is to be performed during this appointment
    */
  var serviceCategory: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * The type of appointments that can be booked into this slot (ideally this would be an identifiable service - which is at a location, rather than the location itself). If provided then this overrides the value provided on the availability resource
    */
  var serviceType: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
    * The specialty of a practitioner that would be required to perform the service requested in this appointment
    */
  var specialty: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
    * Date/Time that the slot is to begin
    */
  var start: instant
  /**
    * busy | free | busy-unavailable | busy-tentative | entered-in-error
    */
  var status: code
}

object Slot {
  @scala.inline
  def apply(
    end: instant,
    schedule: Reference,
    start: instant,
    status: code,
    _comment: Element = null,
    _end: Element = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _overbooked: Element = null,
    _resourceType: Element = null,
    _start: Element = null,
    _status: Element = null,
    appointmentType: CodeableConcept = null,
    comment: java.lang.String = null,
    contained: js.Array[Resource] = null,
    extension: js.Array[Extension] = null,
    id: id = null,
    identifier: js.Array[Identifier] = null,
    implicitRules: uri = null,
    language: code = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    overbooked: js.UndefOr[scala.Boolean] = js.undefined,
    resourceType: code = null,
    serviceCategory: CodeableConcept = null,
    serviceType: js.Array[CodeableConcept] = null,
    specialty: js.Array[CodeableConcept] = null,
    text: Narrative = null
  ): Slot = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("end")(end)
    __obj.updateDynamic("schedule")(schedule)
    __obj.updateDynamic("start")(start)
    __obj.updateDynamic("status")(status)
    if (_comment != null) __obj.updateDynamic("_comment")(_comment)
    if (_end != null) __obj.updateDynamic("_end")(_end)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules)
    if (_language != null) __obj.updateDynamic("_language")(_language)
    if (_overbooked != null) __obj.updateDynamic("_overbooked")(_overbooked)
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType)
    if (_start != null) __obj.updateDynamic("_start")(_start)
    if (_status != null) __obj.updateDynamic("_status")(_status)
    if (appointmentType != null) __obj.updateDynamic("appointmentType")(appointmentType)
    if (comment != null) __obj.updateDynamic("comment")(comment)
    if (contained != null) __obj.updateDynamic("contained")(contained)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (id != null) __obj.updateDynamic("id")(id)
    if (identifier != null) __obj.updateDynamic("identifier")(identifier)
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules)
    if (language != null) __obj.updateDynamic("language")(language)
    if (meta != null) __obj.updateDynamic("meta")(meta)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (!js.isUndefined(overbooked)) __obj.updateDynamic("overbooked")(overbooked)
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType)
    if (serviceCategory != null) __obj.updateDynamic("serviceCategory")(serviceCategory)
    if (serviceType != null) __obj.updateDynamic("serviceType")(serviceType)
    if (specialty != null) __obj.updateDynamic("specialty")(specialty)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[Slot]
  }
}

