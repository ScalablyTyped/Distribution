package typings.fhir.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A booking of a healthcare event among patient(s), practitioner(s), related person(s) and/or device(s) for a specific date/time. This may result in one or more Encounter(s)
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.fhir.fhirNs.Resource because Already inherited */ trait Appointment extends DomainResource {
  /**
    * Contains extended information for property 'comment'.
    */
  var _comment: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'created'.
    */
  var _created: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'end'.
    */
  var _end: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'minutesDuration'.
    */
  var _minutesDuration: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'priority'.
    */
  var _priority: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'start'.
    */
  var _start: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.undefined
  /**
    * The style of appointment or patient that has been booked in the slot (not service type)
    */
  var appointmentType: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * Additional comments
    */
  var comment: js.UndefOr[String] = js.undefined
  /**
    * The date that this appointment was initially created
    */
  var created: js.UndefOr[dateTime] = js.undefined
  /**
    * Shown on a subject line in a meeting request, or appointment list
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * When appointment is to conclude
    */
  var end: js.UndefOr[instant] = js.undefined
  /**
    * External Ids for this item
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  /**
    * The ReferralRequest provided as information to allocate to the Encounter
    */
  var incomingReferral: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
    * Reason the appointment is to takes place (resource)
    */
  var indication: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
    * Can be less than start/end (e.g. estimate)
    */
  var minutesDuration: js.UndefOr[positiveInt] = js.undefined
  /**
    * Participants involved in appointment
    */
  var participant: js.Array[AppointmentParticipant]
  /**
    * Used to make informed decisions if needing to re-prioritize
    */
  var priority: js.UndefOr[unsignedInt] = js.undefined
  /**
    * Reason this appointment is scheduled
    */
  var reason: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
    * Potential date/time interval(s) requested to allocate the appointment within
    */
  var requestedPeriod: js.UndefOr[js.Array[Period]] = js.undefined
  /**
    * A broad categorisation of the service that is to be performed during this appointment
    */
  var serviceCategory: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * The specific service that is to be performed during this appointment
    */
  var serviceType: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
    * The slots that this appointment is filling
    */
  var slot: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
    * The specialty of a practitioner that would be required to perform the service requested in this appointment
    */
  var specialty: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
    * When appointment is to take place
    */
  var start: js.UndefOr[instant] = js.undefined
  /**
    * proposed | pending | booked | arrived | fulfilled | cancelled | noshow | entered-in-error
    */
  var status: code
  /**
    * Additional information to support the appointment
    */
  var supportingInformation: js.UndefOr[js.Array[Reference]] = js.undefined
}

object Appointment {
  @scala.inline
  def apply(
    participant: js.Array[AppointmentParticipant],
    status: code,
    _comment: Element = null,
    _created: Element = null,
    _description: Element = null,
    _end: Element = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _minutesDuration: Element = null,
    _priority: Element = null,
    _resourceType: Element = null,
    _start: Element = null,
    _status: Element = null,
    appointmentType: CodeableConcept = null,
    comment: String = null,
    contained: js.Array[Resource] = null,
    created: dateTime = null,
    description: String = null,
    end: instant = null,
    extension: js.Array[Extension] = null,
    id: id = null,
    identifier: js.Array[Identifier] = null,
    implicitRules: uri = null,
    incomingReferral: js.Array[Reference] = null,
    indication: js.Array[Reference] = null,
    language: code = null,
    meta: Meta = null,
    minutesDuration: js.UndefOr[positiveInt] = js.undefined,
    modifierExtension: js.Array[Extension] = null,
    priority: js.UndefOr[unsignedInt] = js.undefined,
    reason: js.Array[CodeableConcept] = null,
    requestedPeriod: js.Array[Period] = null,
    resourceType: code = null,
    serviceCategory: CodeableConcept = null,
    serviceType: js.Array[CodeableConcept] = null,
    slot: js.Array[Reference] = null,
    specialty: js.Array[CodeableConcept] = null,
    start: instant = null,
    supportingInformation: js.Array[Reference] = null,
    text: Narrative = null
  ): Appointment = {
    val __obj = js.Dynamic.literal(participant = participant, status = status)
    if (_comment != null) __obj.updateDynamic("_comment")(_comment)
    if (_created != null) __obj.updateDynamic("_created")(_created)
    if (_description != null) __obj.updateDynamic("_description")(_description)
    if (_end != null) __obj.updateDynamic("_end")(_end)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules)
    if (_language != null) __obj.updateDynamic("_language")(_language)
    if (_minutesDuration != null) __obj.updateDynamic("_minutesDuration")(_minutesDuration)
    if (_priority != null) __obj.updateDynamic("_priority")(_priority)
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType)
    if (_start != null) __obj.updateDynamic("_start")(_start)
    if (_status != null) __obj.updateDynamic("_status")(_status)
    if (appointmentType != null) __obj.updateDynamic("appointmentType")(appointmentType)
    if (comment != null) __obj.updateDynamic("comment")(comment)
    if (contained != null) __obj.updateDynamic("contained")(contained)
    if (created != null) __obj.updateDynamic("created")(created)
    if (description != null) __obj.updateDynamic("description")(description)
    if (end != null) __obj.updateDynamic("end")(end)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (id != null) __obj.updateDynamic("id")(id)
    if (identifier != null) __obj.updateDynamic("identifier")(identifier)
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules)
    if (incomingReferral != null) __obj.updateDynamic("incomingReferral")(incomingReferral)
    if (indication != null) __obj.updateDynamic("indication")(indication)
    if (language != null) __obj.updateDynamic("language")(language)
    if (meta != null) __obj.updateDynamic("meta")(meta)
    if (!js.isUndefined(minutesDuration)) __obj.updateDynamic("minutesDuration")(minutesDuration)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (!js.isUndefined(priority)) __obj.updateDynamic("priority")(priority)
    if (reason != null) __obj.updateDynamic("reason")(reason)
    if (requestedPeriod != null) __obj.updateDynamic("requestedPeriod")(requestedPeriod)
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType)
    if (serviceCategory != null) __obj.updateDynamic("serviceCategory")(serviceCategory)
    if (serviceType != null) __obj.updateDynamic("serviceType")(serviceType)
    if (slot != null) __obj.updateDynamic("slot")(slot)
    if (specialty != null) __obj.updateDynamic("specialty")(specialty)
    if (start != null) __obj.updateDynamic("start")(start)
    if (supportingInformation != null) __obj.updateDynamic("supportingInformation")(supportingInformation)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[Appointment]
  }
}

