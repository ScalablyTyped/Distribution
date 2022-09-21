package typings.fhir.r4Mod

import typings.fhir.fhirStrings.`checked-in`
import typings.fhir.fhirStrings.`entered-in-error`
import typings.fhir.fhirStrings.arrived
import typings.fhir.fhirStrings.booked
import typings.fhir.fhirStrings.cancelled
import typings.fhir.fhirStrings.fulfilled
import typings.fhir.fhirStrings.noshow
import typings.fhir.fhirStrings.pending
import typings.fhir.fhirStrings.proposed
import typings.fhir.fhirStrings.waitlist
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Appointment
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _comment: js.UndefOr[Element] = js.undefined
  
  var _created: js.UndefOr[Element] = js.undefined
  
  var _description: js.UndefOr[Element] = js.undefined
  
  var _end: js.UndefOr[Element] = js.undefined
  
  var _patientInstruction: js.UndefOr[Element] = js.undefined
  
  var _start: js.UndefOr[Element] = js.undefined
  
  var _status: js.UndefOr[Element] = js.undefined
  
  /**
    * The style of appointment or patient that has been booked in the slot (not service type).
    */
  var appointmentType: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The service request this appointment is allocated to assess (e.g. incoming referral or procedure request).
    */
  var basedOn: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * The coded reason for the appointment being cancelled. This is often used in reporting/billing/futher processing to determine if further actions are required, or specific fees apply.
    */
  var cancelationReason: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Additional text to aid in facilitating the appointment. For instance, a comment might be, "patient should proceed immediately to infusion room upon arrival"
    * Where this is a planned appointment and the start/end dates are not set then this field can be used to provide additional guidance on the details of the appointment request, including any restrictions on when to book it.
    */
  var comment: js.UndefOr[String] = js.undefined
  
  /**
    * This property is required for many use cases where the age of an appointment is considered in processing workflows for scheduling and billing of appointments.
    */
  var created: js.UndefOr[String] = js.undefined
  
  /**
    * The brief description of the appointment as would be shown on a subject line in a meeting request, or appointment list. Detailed or expanded information should be put in the comment field.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Date/Time that the appointment is to conclude.
    */
  var end: js.UndefOr[String] = js.undefined
  
  /**
    * This records identifiers associated with this appointment concern that are defined by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate (e.g. in CDA documents, or in written / printed documentation).
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * Number of minutes that the appointment is to take. This can be less than the duration between the start and end times.  For example, where the actual time of appointment is only an estimate or if a 30 minute appointment is being requested, but any time would work.  Also, if there is, for example, a planned 15 minute break in the middle of a long appointment, the duration may be 15 minutes less than the difference between the start and end.
    */
  var minutesDuration: js.UndefOr[Double] = js.undefined
  
  /**
    * List of participants involved in the appointment.
    */
  var participant: js.Array[AppointmentParticipant]
  
  /**
    * While Appointment.comment contains information for internal use, Appointment.patientInstructions is used to capture patient facing information about the Appointment (e.g. please bring your referral or fast from 8pm night before).
    */
  var patientInstruction: js.UndefOr[String] = js.undefined
  
  /**
    * Seeking implementer feedback on this property and how interoperable it is.
    * Using an extension to record a CodeableConcept for named values may be tested at a future connectathon.
    */
  var priority: js.UndefOr[Double] = js.undefined
  
  /**
    * The coded reason that this appointment is being scheduled. This is more clinical than administrative.
    */
  var reasonCode: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Reason the appointment has been scheduled to take place, as specified using information from another resource. When the patient arrives and the encounter begins it may be used as the admission diagnosis. The indication will typically be a Condition (with other resources referenced in the evidence.detail), or a Procedure.
    */
  var reasonReference: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * This does not introduce a capacity for recurring appointments.
    */
  var requestedPeriod: js.UndefOr[js.Array[Period]] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_Appointment: typings.fhir.fhirStrings.Appointment
  
  /**
    * A broad categorization of the service that is to be performed during this appointment.
    */
  var serviceCategory: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * For a provider to provider appointment the code "FOLLOWUP" may be appropriate, as this is expected to be discussing some patient that was seen in the past.
    */
  var serviceType: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * The slots from the participants' schedules that will be filled by the appointment.
    */
  var slot: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * The specialty of a practitioner that would be required to perform the service requested in this appointment.
    */
  var specialty: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Date/Time that the appointment is to take place.
    */
  var start: js.UndefOr[String] = js.undefined
  
  /**
    * If the Appointment's status is "cancelled" then all participants are expected to have their calendars released for the appointment period, and as such any Slots that were marked as BUSY can be re-set to FREE.
    * This element is labeled as a modifier because the status contains the code entered-in-error that mark the Appointment as not currently valid.
    */
  var status: proposed | pending | booked | arrived | fulfilled | cancelled | noshow | `entered-in-error` | `checked-in` | waitlist
  
  /**
    * Additional information to support the appointment provided when making the appointment.
    */
  var supportingInformation: js.UndefOr[js.Array[Reference]] = js.undefined
}
object Appointment {
  
  inline def apply(
    participant: js.Array[AppointmentParticipant],
    status: proposed | pending | booked | arrived | fulfilled | cancelled | noshow | `entered-in-error` | `checked-in` | waitlist
  ): Appointment = {
    val __obj = js.Dynamic.literal(participant = participant.asInstanceOf[js.Any], resourceType = "Appointment", status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Appointment]
  }
  
  extension [Self <: Appointment](x: Self) {
    
    inline def setAppointmentType(value: CodeableConcept): Self = StObject.set(x, "appointmentType", value.asInstanceOf[js.Any])
    
    inline def setAppointmentTypeUndefined: Self = StObject.set(x, "appointmentType", js.undefined)
    
    inline def setBasedOn(value: js.Array[Reference]): Self = StObject.set(x, "basedOn", value.asInstanceOf[js.Any])
    
    inline def setBasedOnUndefined: Self = StObject.set(x, "basedOn", js.undefined)
    
    inline def setBasedOnVarargs(value: Reference*): Self = StObject.set(x, "basedOn", js.Array(value*))
    
    inline def setCancelationReason(value: CodeableConcept): Self = StObject.set(x, "cancelationReason", value.asInstanceOf[js.Any])
    
    inline def setCancelationReasonUndefined: Self = StObject.set(x, "cancelationReason", js.undefined)
    
    inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
    
    inline def setCreated(value: String): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEnd(value: String): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setMinutesDuration(value: Double): Self = StObject.set(x, "minutesDuration", value.asInstanceOf[js.Any])
    
    inline def setMinutesDurationUndefined: Self = StObject.set(x, "minutesDuration", js.undefined)
    
    inline def setParticipant(value: js.Array[AppointmentParticipant]): Self = StObject.set(x, "participant", value.asInstanceOf[js.Any])
    
    inline def setParticipantVarargs(value: AppointmentParticipant*): Self = StObject.set(x, "participant", js.Array(value*))
    
    inline def setPatientInstruction(value: String): Self = StObject.set(x, "patientInstruction", value.asInstanceOf[js.Any])
    
    inline def setPatientInstructionUndefined: Self = StObject.set(x, "patientInstruction", js.undefined)
    
    inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    inline def setReasonCode(value: js.Array[CodeableConcept]): Self = StObject.set(x, "reasonCode", value.asInstanceOf[js.Any])
    
    inline def setReasonCodeUndefined: Self = StObject.set(x, "reasonCode", js.undefined)
    
    inline def setReasonCodeVarargs(value: CodeableConcept*): Self = StObject.set(x, "reasonCode", js.Array(value*))
    
    inline def setReasonReference(value: js.Array[Reference]): Self = StObject.set(x, "reasonReference", value.asInstanceOf[js.Any])
    
    inline def setReasonReferenceUndefined: Self = StObject.set(x, "reasonReference", js.undefined)
    
    inline def setReasonReferenceVarargs(value: Reference*): Self = StObject.set(x, "reasonReference", js.Array(value*))
    
    inline def setRequestedPeriod(value: js.Array[Period]): Self = StObject.set(x, "requestedPeriod", value.asInstanceOf[js.Any])
    
    inline def setRequestedPeriodUndefined: Self = StObject.set(x, "requestedPeriod", js.undefined)
    
    inline def setRequestedPeriodVarargs(value: Period*): Self = StObject.set(x, "requestedPeriod", js.Array(value*))
    
    inline def setResourceType(value: typings.fhir.fhirStrings.Appointment): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setServiceCategory(value: js.Array[CodeableConcept]): Self = StObject.set(x, "serviceCategory", value.asInstanceOf[js.Any])
    
    inline def setServiceCategoryUndefined: Self = StObject.set(x, "serviceCategory", js.undefined)
    
    inline def setServiceCategoryVarargs(value: CodeableConcept*): Self = StObject.set(x, "serviceCategory", js.Array(value*))
    
    inline def setServiceType(value: js.Array[CodeableConcept]): Self = StObject.set(x, "serviceType", value.asInstanceOf[js.Any])
    
    inline def setServiceTypeUndefined: Self = StObject.set(x, "serviceType", js.undefined)
    
    inline def setServiceTypeVarargs(value: CodeableConcept*): Self = StObject.set(x, "serviceType", js.Array(value*))
    
    inline def setSlot(value: js.Array[Reference]): Self = StObject.set(x, "slot", value.asInstanceOf[js.Any])
    
    inline def setSlotUndefined: Self = StObject.set(x, "slot", js.undefined)
    
    inline def setSlotVarargs(value: Reference*): Self = StObject.set(x, "slot", js.Array(value*))
    
    inline def setSpecialty(value: js.Array[CodeableConcept]): Self = StObject.set(x, "specialty", value.asInstanceOf[js.Any])
    
    inline def setSpecialtyUndefined: Self = StObject.set(x, "specialty", js.undefined)
    
    inline def setSpecialtyVarargs(value: CodeableConcept*): Self = StObject.set(x, "specialty", js.Array(value*))
    
    inline def setStart(value: String): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    inline def setStatus(
      value: proposed | pending | booked | arrived | fulfilled | cancelled | noshow | `entered-in-error` | `checked-in` | waitlist
    ): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setSupportingInformation(value: js.Array[Reference]): Self = StObject.set(x, "supportingInformation", value.asInstanceOf[js.Any])
    
    inline def setSupportingInformationUndefined: Self = StObject.set(x, "supportingInformation", js.undefined)
    
    inline def setSupportingInformationVarargs(value: Reference*): Self = StObject.set(x, "supportingInformation", js.Array(value*))
    
    inline def set_comment(value: Element): Self = StObject.set(x, "_comment", value.asInstanceOf[js.Any])
    
    inline def set_commentUndefined: Self = StObject.set(x, "_comment", js.undefined)
    
    inline def set_created(value: Element): Self = StObject.set(x, "_created", value.asInstanceOf[js.Any])
    
    inline def set_createdUndefined: Self = StObject.set(x, "_created", js.undefined)
    
    inline def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    inline def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
    
    inline def set_end(value: Element): Self = StObject.set(x, "_end", value.asInstanceOf[js.Any])
    
    inline def set_endUndefined: Self = StObject.set(x, "_end", js.undefined)
    
    inline def set_patientInstruction(value: Element): Self = StObject.set(x, "_patientInstruction", value.asInstanceOf[js.Any])
    
    inline def set_patientInstructionUndefined: Self = StObject.set(x, "_patientInstruction", js.undefined)
    
    inline def set_start(value: Element): Self = StObject.set(x, "_start", value.asInstanceOf[js.Any])
    
    inline def set_startUndefined: Self = StObject.set(x, "_start", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
  }
}
