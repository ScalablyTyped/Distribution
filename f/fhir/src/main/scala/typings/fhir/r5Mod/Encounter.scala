package typings.fhir.r5Mod

import typings.fhir.fhirStrings.`entered-in-error`
import typings.fhir.fhirStrings.`in-progress`
import typings.fhir.fhirStrings.cancelled
import typings.fhir.fhirStrings.completed
import typings.fhir.fhirStrings.onhold
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
    * The appointment that scheduled this encounter.
    */
  var appointment: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * The request this encounter satisfies (e.g. incoming referral or procedure request).
    */
  var basedOn: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Concepts representing classification of patient encounter such as ambulatory (outpatient), inpatient, emergency, home health or others due to local variations.
    */
  var `class`: Coding
  
  /**
    * The class history permits the tracking of the encounters transitions without needing to go  through the resource history.  This would be used for a case where an admission starts of as an emergency encounter, then transitions into an inpatient scenario. Doing this and not restarting a new encounter ensures that any lab/diagnostic results can more easily follow the patient and not require re-processing and not get lost or cancelled during a kind of discharge from emergency to inpatient.
    */
  var classHistory: js.UndefOr[js.Array[EncounterClassHistory]] = js.undefined
  
  /**
    * The list of diagnosis relevant to this encounter.
    */
  var diagnosis: js.UndefOr[js.Array[EncounterDiagnosis]] = js.undefined
  
  /**
    * Where a specific encounter should be classified as a part of a specific episode(s) of care this field should be used. This association can facilitate grouping of related encounters together for a specific purpose, such as government reporting, issue tracking, association via a common problem.  The association is recorded on the encounter as these are typically created after the episode of care and grouped on entry rather than editing the episode of care to append another encounter to it (the episode of care could span years).
    */
  var episodeOfCare: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * An Encounter may cover more than just the inpatient stay. Contexts such as outpatients, community clinics, and aged care facilities are also included.
    * The duration recorded in the period of this encounter covers the entire scope of this hospitalization record.
    */
  var hospitalization: js.UndefOr[EncounterHospitalization] = js.undefined
  
  /**
    * Identifier(s) by which this encounter is known.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * May differ from the time the Encounter.period lasted because of leave of absence.
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
    * The list of people responsible for providing the service.
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
    * For systems that need to know which was the primary diagnosis, these will be marked with the standard extension primaryDiagnosis (which is a sequence value rather than a flag, 1 = primary diagnosis).
    */
  var reason: js.UndefOr[js.Array[CodeableReference]] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_Encounter: typings.fhir.fhirStrings.Encounter
  
  /**
    * The organization that is primarily responsible for this Encounter's services. This MAY be the same as the organization on the Patient record, however it could be different, such as if the actor performing the services was from an external organization (which may be billed seperately) for an external consultation.  Refer to the example bundle showing an abbreviated set of Encounters for a colonoscopy.
    */
  var serviceProvider: js.UndefOr[Reference] = js.undefined
  
  /**
    * Broad categorization of the service that is to be provided (e.g. cardiology).
    */
  var serviceType: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Note that internal business rules will determine the appropriate transitions that may occur between statuses (and also classes).
    */
  var status: planned | `in-progress` | onhold | completed | cancelled | `entered-in-error` | unknown
  
  /**
    * The current status is always found in the current version of the resource, not the status history.
    */
  var statusHistory: js.UndefOr[js.Array[EncounterStatusHistory]] = js.undefined
  
  /**
    * While the encounter is always about the patient, the patient might not actually be known in all contexts of use, and there may be a group of patients that could be anonymous (such as in a group therapy for Alcoholics Anonymous - where the recording of the encounter could be used for billing on the number of people/staff and not important to the context of the specific patients) or alternately in veterinary care a herd of sheep receiving treatment (where the animals are not individually tracked).
    */
  var subject: js.UndefOr[Reference] = js.undefined
  
  /**
    * The subjectStatus value can be used to track the patient's status within the encounter. It details whether the patient has arrived or departed, has been triaged or is currently in a waiting status.
    */
  var subjectStatus: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Since there are many ways to further classify encounters, this element is 0..*.
    */
  var `type`: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
}
object Encounter {
  
  inline def apply(
    `class`: Coding,
    status: planned | `in-progress` | onhold | completed | cancelled | `entered-in-error` | unknown
  ): Encounter = {
    val __obj = js.Dynamic.literal(resourceType = "Encounter", status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Encounter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Encounter] (val x: Self) extends AnyVal {
    
    inline def setAccount(value: js.Array[Reference]): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
    
    inline def setAccountUndefined: Self = StObject.set(x, "account", js.undefined)
    
    inline def setAccountVarargs(value: Reference*): Self = StObject.set(x, "account", js.Array(value*))
    
    inline def setActualPeriod(value: Period): Self = StObject.set(x, "actualPeriod", value.asInstanceOf[js.Any])
    
    inline def setActualPeriodUndefined: Self = StObject.set(x, "actualPeriod", js.undefined)
    
    inline def setAppointment(value: js.Array[Reference]): Self = StObject.set(x, "appointment", value.asInstanceOf[js.Any])
    
    inline def setAppointmentUndefined: Self = StObject.set(x, "appointment", js.undefined)
    
    inline def setAppointmentVarargs(value: Reference*): Self = StObject.set(x, "appointment", js.Array(value*))
    
    inline def setBasedOn(value: js.Array[Reference]): Self = StObject.set(x, "basedOn", value.asInstanceOf[js.Any])
    
    inline def setBasedOnUndefined: Self = StObject.set(x, "basedOn", js.undefined)
    
    inline def setBasedOnVarargs(value: Reference*): Self = StObject.set(x, "basedOn", js.Array(value*))
    
    inline def setClass(value: Coding): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
    
    inline def setClassHistory(value: js.Array[EncounterClassHistory]): Self = StObject.set(x, "classHistory", value.asInstanceOf[js.Any])
    
    inline def setClassHistoryUndefined: Self = StObject.set(x, "classHistory", js.undefined)
    
    inline def setClassHistoryVarargs(value: EncounterClassHistory*): Self = StObject.set(x, "classHistory", js.Array(value*))
    
    inline def setDiagnosis(value: js.Array[EncounterDiagnosis]): Self = StObject.set(x, "diagnosis", value.asInstanceOf[js.Any])
    
    inline def setDiagnosisUndefined: Self = StObject.set(x, "diagnosis", js.undefined)
    
    inline def setDiagnosisVarargs(value: EncounterDiagnosis*): Self = StObject.set(x, "diagnosis", js.Array(value*))
    
    inline def setEpisodeOfCare(value: js.Array[Reference]): Self = StObject.set(x, "episodeOfCare", value.asInstanceOf[js.Any])
    
    inline def setEpisodeOfCareUndefined: Self = StObject.set(x, "episodeOfCare", js.undefined)
    
    inline def setEpisodeOfCareVarargs(value: Reference*): Self = StObject.set(x, "episodeOfCare", js.Array(value*))
    
    inline def setHospitalization(value: EncounterHospitalization): Self = StObject.set(x, "hospitalization", value.asInstanceOf[js.Any])
    
    inline def setHospitalizationUndefined: Self = StObject.set(x, "hospitalization", js.undefined)
    
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
    
    inline def setReason(value: js.Array[CodeableReference]): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    
    inline def setReasonVarargs(value: CodeableReference*): Self = StObject.set(x, "reason", js.Array(value*))
    
    inline def setResourceType(value: typings.fhir.fhirStrings.Encounter): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setServiceProvider(value: Reference): Self = StObject.set(x, "serviceProvider", value.asInstanceOf[js.Any])
    
    inline def setServiceProviderUndefined: Self = StObject.set(x, "serviceProvider", js.undefined)
    
    inline def setServiceType(value: CodeableConcept): Self = StObject.set(x, "serviceType", value.asInstanceOf[js.Any])
    
    inline def setServiceTypeUndefined: Self = StObject.set(x, "serviceType", js.undefined)
    
    inline def setStatus(value: planned | `in-progress` | onhold | completed | cancelled | `entered-in-error` | unknown): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusHistory(value: js.Array[EncounterStatusHistory]): Self = StObject.set(x, "statusHistory", value.asInstanceOf[js.Any])
    
    inline def setStatusHistoryUndefined: Self = StObject.set(x, "statusHistory", js.undefined)
    
    inline def setStatusHistoryVarargs(value: EncounterStatusHistory*): Self = StObject.set(x, "statusHistory", js.Array(value*))
    
    inline def setSubject(value: Reference): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setSubjectStatus(value: CodeableConcept): Self = StObject.set(x, "subjectStatus", value.asInstanceOf[js.Any])
    
    inline def setSubjectStatusUndefined: Self = StObject.set(x, "subjectStatus", js.undefined)
    
    inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    
    inline def setType(value: js.Array[CodeableConcept]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setTypeVarargs(value: CodeableConcept*): Self = StObject.set(x, "type", js.Array(value*))
    
    inline def set_plannedEndDate(value: Element): Self = StObject.set(x, "_plannedEndDate", value.asInstanceOf[js.Any])
    
    inline def set_plannedEndDateUndefined: Self = StObject.set(x, "_plannedEndDate", js.undefined)
    
    inline def set_plannedStartDate(value: Element): Self = StObject.set(x, "_plannedStartDate", value.asInstanceOf[js.Any])
    
    inline def set_plannedStartDateUndefined: Self = StObject.set(x, "_plannedStartDate", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
  }
}
