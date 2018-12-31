package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A booking of a healthcare event among patient(s), practitioner(s), related person(s) and/or device(s) for a specific date/time. This may result in one or more Encounter(s)
  */
trait Appointment extends DomainResource {
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
  var comment: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The date that this appointment was initially created
    */
  var created: js.UndefOr[dateTime] = js.undefined
  /**
    * Shown on a subject line in a meeting request, or appointment list
    */
  var description: js.UndefOr[java.lang.String] = js.undefined
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

