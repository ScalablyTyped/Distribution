package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An interaction during which services are provided to the patient
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ trait Encounter
  extends StObject
     with DomainResource {
  
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.undefined
  
  /**
    * The set of accounts that may be used for billing for this Encounter
    */
  var account: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * The appointment that scheduled this encounter
    */
  var appointment: js.UndefOr[Reference] = js.undefined
  
  /**
    * inpatient | outpatient | ambulatory | emergency +
    */
  var `class`: js.UndefOr[Coding] = js.undefined
  
  /**
    * List of past encounter classes
    */
  var classHistory: js.UndefOr[js.Array[EncounterClassHistory]] = js.undefined
  
  /**
    * The list of diagnosis relevant to this encounter
    */
  var diagnosis: js.UndefOr[js.Array[EncounterDiagnosis]] = js.undefined
  
  /**
    * Episode(s) of care that this encounter should be recorded against
    */
  var episodeOfCare: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Details about the admission to a healthcare service
    */
  var hospitalization: js.UndefOr[EncounterHospitalization] = js.undefined
  
  /**
    * Identifier(s) by which this encounter is known
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * The ReferralRequest that initiated this encounter
    */
  var incomingReferral: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Quantity of time the encounter lasted (less time absent)
    */
  var length: js.UndefOr[Duration] = js.undefined
  
  /**
    * List of locations where the patient has been
    */
  var location: js.UndefOr[js.Array[EncounterLocation]] = js.undefined
  
  /**
    * Another Encounter this encounter is part of
    */
  var partOf: js.UndefOr[Reference] = js.undefined
  
  /**
    * List of participants involved in the encounter
    */
  var participant: js.UndefOr[js.Array[EncounterParticipant]] = js.undefined
  
  /**
    * The start and end time of the encounter
    */
  var period: js.UndefOr[Period] = js.undefined
  
  /**
    * Indicates the urgency of the encounter
    */
  var priority: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Reason the encounter takes place (code)
    */
  var reason: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * The custodian organization of this Encounter record
    */
  var serviceProvider: js.UndefOr[Reference] = js.undefined
  
  /**
    * planned | arrived | triaged | in-progress | onleave | finished | cancelled +
    */
  var status: code
  
  /**
    * List of past encounter statuses
    */
  var statusHistory: js.UndefOr[js.Array[EncounterStatusHistory]] = js.undefined
  
  /**
    * The patient ro group present at the encounter
    */
  var subject: js.UndefOr[Reference] = js.undefined
  
  /**
    * Specific type of encounter
    */
  var `type`: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
}
object Encounter {
  
  inline def apply(status: code): Encounter = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Encounter]
  }
  
  extension [Self <: Encounter](x: Self) {
    
    inline def setAccount(value: js.Array[Reference]): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
    
    inline def setAccountUndefined: Self = StObject.set(x, "account", js.undefined)
    
    inline def setAccountVarargs(value: Reference*): Self = StObject.set(x, "account", js.Array(value :_*))
    
    inline def setAppointment(value: Reference): Self = StObject.set(x, "appointment", value.asInstanceOf[js.Any])
    
    inline def setAppointmentUndefined: Self = StObject.set(x, "appointment", js.undefined)
    
    inline def setClass(value: Coding): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
    
    inline def setClassHistory(value: js.Array[EncounterClassHistory]): Self = StObject.set(x, "classHistory", value.asInstanceOf[js.Any])
    
    inline def setClassHistoryUndefined: Self = StObject.set(x, "classHistory", js.undefined)
    
    inline def setClassHistoryVarargs(value: EncounterClassHistory*): Self = StObject.set(x, "classHistory", js.Array(value :_*))
    
    inline def setClassUndefined: Self = StObject.set(x, "class", js.undefined)
    
    inline def setDiagnosis(value: js.Array[EncounterDiagnosis]): Self = StObject.set(x, "diagnosis", value.asInstanceOf[js.Any])
    
    inline def setDiagnosisUndefined: Self = StObject.set(x, "diagnosis", js.undefined)
    
    inline def setDiagnosisVarargs(value: EncounterDiagnosis*): Self = StObject.set(x, "diagnosis", js.Array(value :_*))
    
    inline def setEpisodeOfCare(value: js.Array[Reference]): Self = StObject.set(x, "episodeOfCare", value.asInstanceOf[js.Any])
    
    inline def setEpisodeOfCareUndefined: Self = StObject.set(x, "episodeOfCare", js.undefined)
    
    inline def setEpisodeOfCareVarargs(value: Reference*): Self = StObject.set(x, "episodeOfCare", js.Array(value :_*))
    
    inline def setHospitalization(value: EncounterHospitalization): Self = StObject.set(x, "hospitalization", value.asInstanceOf[js.Any])
    
    inline def setHospitalizationUndefined: Self = StObject.set(x, "hospitalization", js.undefined)
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value :_*))
    
    inline def setIncomingReferral(value: js.Array[Reference]): Self = StObject.set(x, "incomingReferral", value.asInstanceOf[js.Any])
    
    inline def setIncomingReferralUndefined: Self = StObject.set(x, "incomingReferral", js.undefined)
    
    inline def setIncomingReferralVarargs(value: Reference*): Self = StObject.set(x, "incomingReferral", js.Array(value :_*))
    
    inline def setLength(value: Duration): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    inline def setLocation(value: js.Array[EncounterLocation]): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setLocationVarargs(value: EncounterLocation*): Self = StObject.set(x, "location", js.Array(value :_*))
    
    inline def setPartOf(value: Reference): Self = StObject.set(x, "partOf", value.asInstanceOf[js.Any])
    
    inline def setPartOfUndefined: Self = StObject.set(x, "partOf", js.undefined)
    
    inline def setParticipant(value: js.Array[EncounterParticipant]): Self = StObject.set(x, "participant", value.asInstanceOf[js.Any])
    
    inline def setParticipantUndefined: Self = StObject.set(x, "participant", js.undefined)
    
    inline def setParticipantVarargs(value: EncounterParticipant*): Self = StObject.set(x, "participant", js.Array(value :_*))
    
    inline def setPeriod(value: Period): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    inline def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
    
    inline def setPriority(value: CodeableConcept): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    inline def setReason(value: js.Array[CodeableConcept]): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    
    inline def setReasonVarargs(value: CodeableConcept*): Self = StObject.set(x, "reason", js.Array(value :_*))
    
    inline def setServiceProvider(value: Reference): Self = StObject.set(x, "serviceProvider", value.asInstanceOf[js.Any])
    
    inline def setServiceProviderUndefined: Self = StObject.set(x, "serviceProvider", js.undefined)
    
    inline def setStatus(value: code): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusHistory(value: js.Array[EncounterStatusHistory]): Self = StObject.set(x, "statusHistory", value.asInstanceOf[js.Any])
    
    inline def setStatusHistoryUndefined: Self = StObject.set(x, "statusHistory", js.undefined)
    
    inline def setStatusHistoryVarargs(value: EncounterStatusHistory*): Self = StObject.set(x, "statusHistory", js.Array(value :_*))
    
    inline def setSubject(value: Reference): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    
    inline def setType(value: js.Array[CodeableConcept]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setTypeVarargs(value: CodeableConcept*): Self = StObject.set(x, "type", js.Array(value :_*))
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
  }
}
