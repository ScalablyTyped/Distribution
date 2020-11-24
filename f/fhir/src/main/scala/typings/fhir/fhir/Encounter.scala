package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An interaction during which services are provided to the patient
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ @js.native
trait Encounter extends DomainResource {
  
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.native
  
  /**
    * The set of accounts that may be used for billing for this Encounter
    */
  var account: js.UndefOr[js.Array[Reference]] = js.native
  
  /**
    * The appointment that scheduled this encounter
    */
  var appointment: js.UndefOr[Reference] = js.native
  
  /**
    * inpatient | outpatient | ambulatory | emergency +
    */
  var `class`: js.UndefOr[Coding] = js.native
  
  /**
    * List of past encounter classes
    */
  var classHistory: js.UndefOr[js.Array[EncounterClassHistory]] = js.native
  
  /**
    * The list of diagnosis relevant to this encounter
    */
  var diagnosis: js.UndefOr[js.Array[EncounterDiagnosis]] = js.native
  
  /**
    * Episode(s) of care that this encounter should be recorded against
    */
  var episodeOfCare: js.UndefOr[js.Array[Reference]] = js.native
  
  /**
    * Details about the admission to a healthcare service
    */
  var hospitalization: js.UndefOr[EncounterHospitalization] = js.native
  
  /**
    * Identifier(s) by which this encounter is known
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.native
  
  /**
    * The ReferralRequest that initiated this encounter
    */
  var incomingReferral: js.UndefOr[js.Array[Reference]] = js.native
  
  /**
    * Quantity of time the encounter lasted (less time absent)
    */
  var length: js.UndefOr[Duration] = js.native
  
  /**
    * List of locations where the patient has been
    */
  var location: js.UndefOr[js.Array[EncounterLocation]] = js.native
  
  /**
    * Another Encounter this encounter is part of
    */
  var partOf: js.UndefOr[Reference] = js.native
  
  /**
    * List of participants involved in the encounter
    */
  var participant: js.UndefOr[js.Array[EncounterParticipant]] = js.native
  
  /**
    * The start and end time of the encounter
    */
  var period: js.UndefOr[Period] = js.native
  
  /**
    * Indicates the urgency of the encounter
    */
  var priority: js.UndefOr[CodeableConcept] = js.native
  
  /**
    * Reason the encounter takes place (code)
    */
  var reason: js.UndefOr[js.Array[CodeableConcept]] = js.native
  
  /**
    * The custodian organization of this Encounter record
    */
  var serviceProvider: js.UndefOr[Reference] = js.native
  
  /**
    * planned | arrived | triaged | in-progress | onleave | finished | cancelled +
    */
  var status: code = js.native
  
  /**
    * List of past encounter statuses
    */
  var statusHistory: js.UndefOr[js.Array[EncounterStatusHistory]] = js.native
  
  /**
    * The patient ro group present at the encounter
    */
  var subject: js.UndefOr[Reference] = js.native
  
  /**
    * Specific type of encounter
    */
  var `type`: js.UndefOr[js.Array[CodeableConcept]] = js.native
}
object Encounter {
  
  @scala.inline
  def apply(status: code): Encounter = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Encounter]
  }
  
  @scala.inline
  implicit class EncounterOps[Self <: Encounter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setStatus(value: code): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_status(value: Element): Self = this.set("_status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_status: Self = this.set("_status", js.undefined)
    
    @scala.inline
    def setAccountVarargs(value: Reference*): Self = this.set("account", js.Array(value :_*))
    
    @scala.inline
    def setAccount(value: js.Array[Reference]): Self = this.set("account", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccount: Self = this.set("account", js.undefined)
    
    @scala.inline
    def setAppointment(value: Reference): Self = this.set("appointment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppointment: Self = this.set("appointment", js.undefined)
    
    @scala.inline
    def setClass(value: Coding): Self = this.set("class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClass: Self = this.set("class", js.undefined)
    
    @scala.inline
    def setClassHistoryVarargs(value: EncounterClassHistory*): Self = this.set("classHistory", js.Array(value :_*))
    
    @scala.inline
    def setClassHistory(value: js.Array[EncounterClassHistory]): Self = this.set("classHistory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassHistory: Self = this.set("classHistory", js.undefined)
    
    @scala.inline
    def setDiagnosisVarargs(value: EncounterDiagnosis*): Self = this.set("diagnosis", js.Array(value :_*))
    
    @scala.inline
    def setDiagnosis(value: js.Array[EncounterDiagnosis]): Self = this.set("diagnosis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDiagnosis: Self = this.set("diagnosis", js.undefined)
    
    @scala.inline
    def setEpisodeOfCareVarargs(value: Reference*): Self = this.set("episodeOfCare", js.Array(value :_*))
    
    @scala.inline
    def setEpisodeOfCare(value: js.Array[Reference]): Self = this.set("episodeOfCare", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEpisodeOfCare: Self = this.set("episodeOfCare", js.undefined)
    
    @scala.inline
    def setHospitalization(value: EncounterHospitalization): Self = this.set("hospitalization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHospitalization: Self = this.set("hospitalization", js.undefined)
    
    @scala.inline
    def setIdentifierVarargs(value: Identifier*): Self = this.set("identifier", js.Array(value :_*))
    
    @scala.inline
    def setIdentifier(value: js.Array[Identifier]): Self = this.set("identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdentifier: Self = this.set("identifier", js.undefined)
    
    @scala.inline
    def setIncomingReferralVarargs(value: Reference*): Self = this.set("incomingReferral", js.Array(value :_*))
    
    @scala.inline
    def setIncomingReferral(value: js.Array[Reference]): Self = this.set("incomingReferral", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncomingReferral: Self = this.set("incomingReferral", js.undefined)
    
    @scala.inline
    def setLength(value: Duration): Self = this.set("length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLength: Self = this.set("length", js.undefined)
    
    @scala.inline
    def setLocationVarargs(value: EncounterLocation*): Self = this.set("location", js.Array(value :_*))
    
    @scala.inline
    def setLocation(value: js.Array[EncounterLocation]): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    
    @scala.inline
    def setPartOf(value: Reference): Self = this.set("partOf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePartOf: Self = this.set("partOf", js.undefined)
    
    @scala.inline
    def setParticipantVarargs(value: EncounterParticipant*): Self = this.set("participant", js.Array(value :_*))
    
    @scala.inline
    def setParticipant(value: js.Array[EncounterParticipant]): Self = this.set("participant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParticipant: Self = this.set("participant", js.undefined)
    
    @scala.inline
    def setPeriod(value: Period): Self = this.set("period", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePeriod: Self = this.set("period", js.undefined)
    
    @scala.inline
    def setPriority(value: CodeableConcept): Self = this.set("priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePriority: Self = this.set("priority", js.undefined)
    
    @scala.inline
    def setReasonVarargs(value: CodeableConcept*): Self = this.set("reason", js.Array(value :_*))
    
    @scala.inline
    def setReason(value: js.Array[CodeableConcept]): Self = this.set("reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReason: Self = this.set("reason", js.undefined)
    
    @scala.inline
    def setServiceProvider(value: Reference): Self = this.set("serviceProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceProvider: Self = this.set("serviceProvider", js.undefined)
    
    @scala.inline
    def setStatusHistoryVarargs(value: EncounterStatusHistory*): Self = this.set("statusHistory", js.Array(value :_*))
    
    @scala.inline
    def setStatusHistory(value: js.Array[EncounterStatusHistory]): Self = this.set("statusHistory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatusHistory: Self = this.set("statusHistory", js.undefined)
    
    @scala.inline
    def setSubject(value: Reference): Self = this.set("subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubject: Self = this.set("subject", js.undefined)
    
    @scala.inline
    def setTypeVarargs(value: CodeableConcept*): Self = this.set("type", js.Array(value :_*))
    
    @scala.inline
    def setType(value: js.Array[CodeableConcept]): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
