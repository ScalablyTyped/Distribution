package typings.fhir.r5Mod

import typings.fhir.fhirStrings.`entered-in-error`
import typings.fhir.fhirStrings.`in-progress`
import typings.fhir.fhirStrings.`on-hold`
import typings.fhir.fhirStrings.cancelled
import typings.fhir.fhirStrings.completed
import typings.fhir.fhirStrings.discharged
import typings.fhir.fhirStrings.discontinued
import typings.fhir.fhirStrings.planned
import typings.fhir.fhirStrings.unknown
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Encounter
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _plannedEndDate: js.UndefOr[Element] = js.undefined
  
  var _plannedStartDate: js.UndefOr[Element] = js.undefined
  
  var _status: js.UndefOr[Element] = js.undefined
  
  /**
    * The billing system may choose to allocate billable items associated with the Encounter to different referenced Accounts based on internal business rules.
    */
  var account: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * If not (yet) known, the end of the Period may be omitted.
    */
  var actualPeriod: js.UndefOr[Period] = js.undefined
  
  /**
    * An Encounter may cover more than just the inpatient stay. Contexts such as outpatients, community clinics, and aged care facilities are also included.
    * The duration recorded in the period of this encounter covers the entire scope of this admission record.
    */
  var admission: js.UndefOr[EncounterAdmission] = js.undefined
  
  /**
    * The appointment that scheduled this encounter.
    */
  var appointment: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * The request this encounter satisfies (e.g. incoming referral or procedure request).
    */
  var basedOn: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * The group(s) of individuals, organizations that are allocated to participate in this encounter. The participants backbone will record the actuals of when these individuals participated during the encounter.
    */
  var careTeam: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Concepts representing classification of patient encounter such as ambulatory (outpatient), inpatient, emergency, home health or others due to local variations.
    */
  var `class`: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Also note that for the purpose of billing, the diagnoses are recorded in the account where they can be ranked appropriately for how the invoicing/claiming documentation needs to be prepared.
    */
  var diagnosis: js.UndefOr[js.Array[EncounterDiagnosis]] = js.undefined
  
  /**
    * For example, a patient may request both a dairy-free and nut-free diet preference (not mutually exclusive).
    */
  var dietPreference: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Where a specific encounter should be classified as a part of a specific episode(s) of care this field should be used. This association can facilitate grouping of related encounters together for a specific purpose, such as government reporting, issue tracking, association via a common problem.  The association is recorded on the encounter as these are typically created after the episode of care and grouped on entry rather than editing the episode of care to append another encounter to it (the episode of care could span years).
    */
  var episodeOfCare: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Identifier(s) by which this encounter is known.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * If the precision on these values is low (e.g. to the day only) then this may be considered was an all day (or multi-day) encounter, unless the duration is included, where that amount of time occurred sometime during the interval.
    * May differ from the time in `Encounter.period` due to leave of absence(s).
    */
  var length: js.UndefOr[Duration] = js.undefined
  
  /**
    * Virtual encounters can be recorded in the Encounter by specifying a location reference to a location of type "kind" such as "client's home" and an encounter.class = "virtual".
    */
  var location: js.UndefOr[js.Array[EncounterLocation]] = js.undefined
  
  /**
    * This is also used for associating a child's encounter back to the mother's encounter.
    * Refer to the Notes section in the Patient resource for further details.
    */
  var partOf: js.UndefOr[Reference] = js.undefined
  
  /**
    * Any Patient or Group present in the participation.actor must also be the subject, though the subject may be absent from the participation.actor for cases where the patient (or group) is not present, such as during a case review conference.
    */
  var participant: js.UndefOr[js.Array[EncounterParticipant]] = js.undefined
  
  /**
    * The planned end date/time (or discharge date) of the encounter.
    */
  var plannedEndDate: js.UndefOr[String] = js.undefined
  
  /**
    * The planned start date/time (or admission date) of the encounter.
    */
  var plannedStartDate: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates the urgency of the encounter.
    */
  var priority: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The reason communicates what medical problem the patient has that should be addressed during the episode of care.  This reason could be patient reported complaint, a clinical indication that was determined in a previous encounter or episode of care, or some planned care such as an immunization recommendation.  In the case where you have a primary reason, but are expecting to also address other problems, you can list the primary reason with a use code of 'Chief Complaint', while the other problems being addressed would have a use code of 'Reason for Visit'.
    * Examples:
    *  * pregnancy would use HealthcareService or a coding as the reason
    *  * patient home monitoring could use Condition as the reason
    */
  var reason: js.UndefOr[js.Array[EncounterReason]] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_Encounter: typings.fhir.fhirStrings.Encounter
  
  /**
    * The organization that is primarily responsible for this Encounter's services. This MAY be the same as the organization on the Patient record, however it could be different, such as if the actor performing the services was from an external organization (which may be billed seperately) for an external consultation.  Refer to the colonoscopy example on the Encounter examples tab.
    */
  var serviceProvider: js.UndefOr[Reference] = js.undefined
  
  /**
    * Broad categorization of the service that is to be provided (e.g. cardiology).
    */
  var serviceType: js.UndefOr[js.Array[CodeableReference]] = js.undefined
  
  /**
    * Any special requests that have been made for this encounter, such as the provision of specific equipment or other things.
    */
  var specialArrangement: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Although the specialCourtesy property can contain values like VIP, the purpose of this field is intended to be used for flagging additional `benefits` that might occur for the patient during the encounter.
    * It could include things like the patient is to have a private room, special room features, receive a friendly visit from hospital adminisitration, or should be briefed on treatment by senior staff during the stay.
    * It is not specifically intended to be used for securing the specific record - that is the purpose of the security meta tag, and where appropriate, both fields could be used.
    */
  var specialCourtesy: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Note that internal business rules will determine the appropriate transitions that may occur between statuses (and also classes).
    */
  var status: planned | `in-progress` | `on-hold` | discharged | completed | cancelled | discontinued | `entered-in-error` | unknown
  
  /**
    * While the encounter is always about the patient, the patient might not actually be known in all contexts of use, and there may be a group of patients that could be anonymous (such as in a group therapy for Alcoholics Anonymous - where the recording of the encounter could be used for billing on the number of people/staff and not important to the context of the specific patients) or alternately in veterinary care a herd of sheep receiving treatment (where the animals are not individually tracked).
    */
  var subject: js.UndefOr[Reference] = js.undefined
  
  /**
    * Different use-cases are likely to have different permitted transitions between states, such as an Emergency department could use `arrived` when the patient first presents, then `triaged` once has been assessed by a nurse, then `receiving-care` once treatment begins, however other sectors may use a different set of these values, or their own custom set in place of this example valueset provided.
    */
  var subjectStatus: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Since there are many ways to further classify encounters, this element is 0..*.
    */
  var `type`: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * There are two types of virtual meetings that often exist:
    * * a persistent, virtual meeting room that can only be used for a single purpose at a time,
    * * and a dynamic virtual meeting room that is generated on demand for a specific purpose.
    * Implementers may consider using Location.virtualService for persistent meeting rooms.
    * If each participant would have a different meeting link, an extension using the VirtualServiceContactDetail  can be applied to the Encounter.participant BackboneElement.
    */
  var virtualService: js.UndefOr[js.Array[VirtualServiceDetail]] = js.undefined
}
object Encounter {
  
  inline def apply(
    status: planned | `in-progress` | `on-hold` | discharged | completed | cancelled | discontinued | `entered-in-error` | unknown
  ): Encounter = {
    val __obj = js.Dynamic.literal(resourceType = "Encounter", status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Encounter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Encounter] (val x: Self) extends AnyVal {
    
    inline def setAccount(value: js.Array[Reference]): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
    
    inline def setAccountUndefined: Self = StObject.set(x, "account", js.undefined)
    
    inline def setAccountVarargs(value: Reference*): Self = StObject.set(x, "account", js.Array(value*))
    
    inline def setActualPeriod(value: Period): Self = StObject.set(x, "actualPeriod", value.asInstanceOf[js.Any])
    
    inline def setActualPeriodUndefined: Self = StObject.set(x, "actualPeriod", js.undefined)
    
    inline def setAdmission(value: EncounterAdmission): Self = StObject.set(x, "admission", value.asInstanceOf[js.Any])
    
    inline def setAdmissionUndefined: Self = StObject.set(x, "admission", js.undefined)
    
    inline def setAppointment(value: js.Array[Reference]): Self = StObject.set(x, "appointment", value.asInstanceOf[js.Any])
    
    inline def setAppointmentUndefined: Self = StObject.set(x, "appointment", js.undefined)
    
    inline def setAppointmentVarargs(value: Reference*): Self = StObject.set(x, "appointment", js.Array(value*))
    
    inline def setBasedOn(value: js.Array[Reference]): Self = StObject.set(x, "basedOn", value.asInstanceOf[js.Any])
    
    inline def setBasedOnUndefined: Self = StObject.set(x, "basedOn", js.undefined)
    
    inline def setBasedOnVarargs(value: Reference*): Self = StObject.set(x, "basedOn", js.Array(value*))
    
    inline def setCareTeam(value: js.Array[Reference]): Self = StObject.set(x, "careTeam", value.asInstanceOf[js.Any])
    
    inline def setCareTeamUndefined: Self = StObject.set(x, "careTeam", js.undefined)
    
    inline def setCareTeamVarargs(value: Reference*): Self = StObject.set(x, "careTeam", js.Array(value*))
    
    inline def setClass(value: js.Array[CodeableConcept]): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
    
    inline def setClassUndefined: Self = StObject.set(x, "class", js.undefined)
    
    inline def setClassVarargs(value: CodeableConcept*): Self = StObject.set(x, "class", js.Array(value*))
    
    inline def setDiagnosis(value: js.Array[EncounterDiagnosis]): Self = StObject.set(x, "diagnosis", value.asInstanceOf[js.Any])
    
    inline def setDiagnosisUndefined: Self = StObject.set(x, "diagnosis", js.undefined)
    
    inline def setDiagnosisVarargs(value: EncounterDiagnosis*): Self = StObject.set(x, "diagnosis", js.Array(value*))
    
    inline def setDietPreference(value: js.Array[CodeableConcept]): Self = StObject.set(x, "dietPreference", value.asInstanceOf[js.Any])
    
    inline def setDietPreferenceUndefined: Self = StObject.set(x, "dietPreference", js.undefined)
    
    inline def setDietPreferenceVarargs(value: CodeableConcept*): Self = StObject.set(x, "dietPreference", js.Array(value*))
    
    inline def setEpisodeOfCare(value: js.Array[Reference]): Self = StObject.set(x, "episodeOfCare", value.asInstanceOf[js.Any])
    
    inline def setEpisodeOfCareUndefined: Self = StObject.set(x, "episodeOfCare", js.undefined)
    
    inline def setEpisodeOfCareVarargs(value: Reference*): Self = StObject.set(x, "episodeOfCare", js.Array(value*))
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setLength(value: Duration): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    inline def setLocation(value: js.Array[EncounterLocation]): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setLocationVarargs(value: EncounterLocation*): Self = StObject.set(x, "location", js.Array(value*))
    
    inline def setPartOf(value: Reference): Self = StObject.set(x, "partOf", value.asInstanceOf[js.Any])
    
    inline def setPartOfUndefined: Self = StObject.set(x, "partOf", js.undefined)
    
    inline def setParticipant(value: js.Array[EncounterParticipant]): Self = StObject.set(x, "participant", value.asInstanceOf[js.Any])
    
    inline def setParticipantUndefined: Self = StObject.set(x, "participant", js.undefined)
    
    inline def setParticipantVarargs(value: EncounterParticipant*): Self = StObject.set(x, "participant", js.Array(value*))
    
    inline def setPlannedEndDate(value: String): Self = StObject.set(x, "plannedEndDate", value.asInstanceOf[js.Any])
    
    inline def setPlannedEndDateUndefined: Self = StObject.set(x, "plannedEndDate", js.undefined)
    
    inline def setPlannedStartDate(value: String): Self = StObject.set(x, "plannedStartDate", value.asInstanceOf[js.Any])
    
    inline def setPlannedStartDateUndefined: Self = StObject.set(x, "plannedStartDate", js.undefined)
    
    inline def setPriority(value: CodeableConcept): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    inline def setReason(value: js.Array[EncounterReason]): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    
    inline def setReasonVarargs(value: EncounterReason*): Self = StObject.set(x, "reason", js.Array(value*))
    
    inline def setResourceType(value: typings.fhir.fhirStrings.Encounter): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setServiceProvider(value: Reference): Self = StObject.set(x, "serviceProvider", value.asInstanceOf[js.Any])
    
    inline def setServiceProviderUndefined: Self = StObject.set(x, "serviceProvider", js.undefined)
    
    inline def setServiceType(value: js.Array[CodeableReference]): Self = StObject.set(x, "serviceType", value.asInstanceOf[js.Any])
    
    inline def setServiceTypeUndefined: Self = StObject.set(x, "serviceType", js.undefined)
    
    inline def setServiceTypeVarargs(value: CodeableReference*): Self = StObject.set(x, "serviceType", js.Array(value*))
    
    inline def setSpecialArrangement(value: js.Array[CodeableConcept]): Self = StObject.set(x, "specialArrangement", value.asInstanceOf[js.Any])
    
    inline def setSpecialArrangementUndefined: Self = StObject.set(x, "specialArrangement", js.undefined)
    
    inline def setSpecialArrangementVarargs(value: CodeableConcept*): Self = StObject.set(x, "specialArrangement", js.Array(value*))
    
    inline def setSpecialCourtesy(value: js.Array[CodeableConcept]): Self = StObject.set(x, "specialCourtesy", value.asInstanceOf[js.Any])
    
    inline def setSpecialCourtesyUndefined: Self = StObject.set(x, "specialCourtesy", js.undefined)
    
    inline def setSpecialCourtesyVarargs(value: CodeableConcept*): Self = StObject.set(x, "specialCourtesy", js.Array(value*))
    
    inline def setStatus(
      value: planned | `in-progress` | `on-hold` | discharged | completed | cancelled | discontinued | `entered-in-error` | unknown
    ): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setSubject(value: Reference): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setSubjectStatus(value: CodeableConcept): Self = StObject.set(x, "subjectStatus", value.asInstanceOf[js.Any])
    
    inline def setSubjectStatusUndefined: Self = StObject.set(x, "subjectStatus", js.undefined)
    
    inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    
    inline def setType(value: js.Array[CodeableConcept]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setTypeVarargs(value: CodeableConcept*): Self = StObject.set(x, "type", js.Array(value*))
    
    inline def setVirtualService(value: js.Array[VirtualServiceDetail]): Self = StObject.set(x, "virtualService", value.asInstanceOf[js.Any])
    
    inline def setVirtualServiceUndefined: Self = StObject.set(x, "virtualService", js.undefined)
    
    inline def setVirtualServiceVarargs(value: VirtualServiceDetail*): Self = StObject.set(x, "virtualService", js.Array(value*))
    
    inline def set_plannedEndDate(value: Element): Self = StObject.set(x, "_plannedEndDate", value.asInstanceOf[js.Any])
    
    inline def set_plannedEndDateUndefined: Self = StObject.set(x, "_plannedEndDate", js.undefined)
    
    inline def set_plannedStartDate(value: Element): Self = StObject.set(x, "_plannedStartDate", value.asInstanceOf[js.Any])
    
    inline def set_plannedStartDateUndefined: Self = StObject.set(x, "_plannedStartDate", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
  }
}
