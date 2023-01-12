package typings.fhir.r2Mod

import typings.fhir.fhirStrings.`in-progress`
import typings.fhir.fhirStrings.ambulatory
import typings.fhir.fhirStrings.arrived
import typings.fhir.fhirStrings.cancelled
import typings.fhir.fhirStrings.daytime
import typings.fhir.fhirStrings.emergency
import typings.fhir.fhirStrings.field
import typings.fhir.fhirStrings.finished
import typings.fhir.fhirStrings.home
import typings.fhir.fhirStrings.inpatient
import typings.fhir.fhirStrings.onleave
import typings.fhir.fhirStrings.other
import typings.fhir.fhirStrings.outpatient
import typings.fhir.fhirStrings.planned
import typings.fhir.fhirStrings.virtual
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Encounter
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _class: js.UndefOr[Element] = js.undefined
  
  var _status: js.UndefOr[Element] = js.undefined
  
  /**
    * The appointment that scheduled this encounter.
    */
  var appointment: js.UndefOr[Reference] = js.undefined
  
  /**
    * inpatient | outpatient | ambulatory | emergency +.
    */
  var `class`: js.UndefOr[
    inpatient | outpatient | ambulatory | emergency | home | field | daytime | virtual | other
  ] = js.undefined
  
  /**
    * Where a specific encounter should be classified as a part of a specific episode(s) of care this field should be used. This association can facilitate grouping of related encounters together for a specific purpose, such as government reporting, issue tracking, association via a common problem.  The association is recorded on the encounter as these are typically created after the episode of care, and grouped on entry rather than editing the episode of care to append another encounter to it (the episode of care could span years).
    */
  var episodeOfCare: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Details about the admission to a healthcare service.
    */
  var hospitalization: js.UndefOr[EncounterHospitalization] = js.undefined
  
  /**
    * Identifier(s) by which this encounter is known.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * The referral request this encounter satisfies (incoming referral).
    */
  var incomingReferral: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Reason the encounter takes place, as specified using information from another resource. For admissions, this is the admission diagnosis. The indication will typically be a Condition (with other resources referenced in the evidence.detail), or a Procedure.
    */
  var indication: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Quantity of time the encounter lasted. This excludes the time during leaves of absence.
    */
  var length: js.UndefOr[Quantity] = js.undefined
  
  /**
    * List of locations where  the patient has been during this encounter.
    */
  var location: js.UndefOr[js.Array[EncounterLocation]] = js.undefined
  
  /**
    * Another Encounter of which this encounter is a part of (administratively or in time).
    */
  var partOf: js.UndefOr[Reference] = js.undefined
  
  /**
    * The list of people responsible for providing the service.
    */
  var participant: js.UndefOr[js.Array[EncounterParticipant]] = js.undefined
  
  /**
    * The patient present at the encounter.
    */
  var patient: js.UndefOr[Reference] = js.undefined
  
  /**
    * The start and end time of the encounter.
    */
  var period: js.UndefOr[Period] = js.undefined
  
  /**
    * Indicates the urgency of the encounter.
    */
  var priority: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Reason the encounter takes place, expressed as a code. For admissions, this can be used for a coded admission diagnosis.
    */
  var reason: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_Encounter: typings.fhir.fhirStrings.Encounter
  
  /**
    * An organization that is in charge of maintaining the information of this Encounter (e.g. who maintains the report or the master service catalog item, etc.). This MAY be the same as the organization on the Patient record, however it could be different. This MAY not be not the Service Delivery Location's Organization.
    */
  var serviceProvider: js.UndefOr[Reference] = js.undefined
  
  /**
    * planned | arrived | in-progress | onleave | finished | cancelled.
    */
  var status: planned | arrived | `in-progress` | onleave | finished | cancelled
  
  /**
    * The status history permits the encounter resource to contain the status history without needing to read through the historical versions of the resource, or even have the server store them.
    */
  var statusHistory: js.UndefOr[js.Array[EncounterStatusHistory]] = js.undefined
  
  /**
    * Specific type of encounter (e.g. e-mail consultation, surgical day-care, skilled nursing, rehabilitation).
    */
  var `type`: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
}
object Encounter {
  
  inline def apply(status: planned | arrived | `in-progress` | onleave | finished | cancelled): Encounter = {
    val __obj = js.Dynamic.literal(resourceType = "Encounter", status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Encounter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Encounter] (val x: Self) extends AnyVal {
    
    inline def setAppointment(value: Reference): Self = StObject.set(x, "appointment", value.asInstanceOf[js.Any])
    
    inline def setAppointmentUndefined: Self = StObject.set(x, "appointment", js.undefined)
    
    inline def setClass(value: inpatient | outpatient | ambulatory | emergency | home | field | daytime | virtual | other): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
    
    inline def setClassUndefined: Self = StObject.set(x, "class", js.undefined)
    
    inline def setEpisodeOfCare(value: js.Array[Reference]): Self = StObject.set(x, "episodeOfCare", value.asInstanceOf[js.Any])
    
    inline def setEpisodeOfCareUndefined: Self = StObject.set(x, "episodeOfCare", js.undefined)
    
    inline def setEpisodeOfCareVarargs(value: Reference*): Self = StObject.set(x, "episodeOfCare", js.Array(value*))
    
    inline def setHospitalization(value: EncounterHospitalization): Self = StObject.set(x, "hospitalization", value.asInstanceOf[js.Any])
    
    inline def setHospitalizationUndefined: Self = StObject.set(x, "hospitalization", js.undefined)
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setIncomingReferral(value: js.Array[Reference]): Self = StObject.set(x, "incomingReferral", value.asInstanceOf[js.Any])
    
    inline def setIncomingReferralUndefined: Self = StObject.set(x, "incomingReferral", js.undefined)
    
    inline def setIncomingReferralVarargs(value: Reference*): Self = StObject.set(x, "incomingReferral", js.Array(value*))
    
    inline def setIndication(value: js.Array[Reference]): Self = StObject.set(x, "indication", value.asInstanceOf[js.Any])
    
    inline def setIndicationUndefined: Self = StObject.set(x, "indication", js.undefined)
    
    inline def setIndicationVarargs(value: Reference*): Self = StObject.set(x, "indication", js.Array(value*))
    
    inline def setLength(value: Quantity): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    inline def setLocation(value: js.Array[EncounterLocation]): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setLocationVarargs(value: EncounterLocation*): Self = StObject.set(x, "location", js.Array(value*))
    
    inline def setPartOf(value: Reference): Self = StObject.set(x, "partOf", value.asInstanceOf[js.Any])
    
    inline def setPartOfUndefined: Self = StObject.set(x, "partOf", js.undefined)
    
    inline def setParticipant(value: js.Array[EncounterParticipant]): Self = StObject.set(x, "participant", value.asInstanceOf[js.Any])
    
    inline def setParticipantUndefined: Self = StObject.set(x, "participant", js.undefined)
    
    inline def setParticipantVarargs(value: EncounterParticipant*): Self = StObject.set(x, "participant", js.Array(value*))
    
    inline def setPatient(value: Reference): Self = StObject.set(x, "patient", value.asInstanceOf[js.Any])
    
    inline def setPatientUndefined: Self = StObject.set(x, "patient", js.undefined)
    
    inline def setPeriod(value: Period): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    inline def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
    
    inline def setPriority(value: CodeableConcept): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    inline def setReason(value: js.Array[CodeableConcept]): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    
    inline def setReasonVarargs(value: CodeableConcept*): Self = StObject.set(x, "reason", js.Array(value*))
    
    inline def setResourceType(value: typings.fhir.fhirStrings.Encounter): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setServiceProvider(value: Reference): Self = StObject.set(x, "serviceProvider", value.asInstanceOf[js.Any])
    
    inline def setServiceProviderUndefined: Self = StObject.set(x, "serviceProvider", js.undefined)
    
    inline def setStatus(value: planned | arrived | `in-progress` | onleave | finished | cancelled): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusHistory(value: js.Array[EncounterStatusHistory]): Self = StObject.set(x, "statusHistory", value.asInstanceOf[js.Any])
    
    inline def setStatusHistoryUndefined: Self = StObject.set(x, "statusHistory", js.undefined)
    
    inline def setStatusHistoryVarargs(value: EncounterStatusHistory*): Self = StObject.set(x, "statusHistory", js.Array(value*))
    
    inline def setType(value: js.Array[CodeableConcept]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setTypeVarargs(value: CodeableConcept*): Self = StObject.set(x, "type", js.Array(value*))
    
    inline def set_class(value: Element): Self = StObject.set(x, "_class", value.asInstanceOf[js.Any])
    
    inline def set_classUndefined: Self = StObject.set(x, "_class", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
  }
}
