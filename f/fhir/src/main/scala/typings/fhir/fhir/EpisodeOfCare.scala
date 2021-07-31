package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An association of a Patient with an Organization and  Healthcare Provider(s) for a period of time that the Organization assumes some level of responsibility
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ trait EpisodeOfCare
  extends StObject
     with DomainResource {
  
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.undefined
  
  /**
    * The set of accounts that may be used for billing for this EpisodeOfCare
    */
  var account: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Care manager/care co-ordinator for the patient
    */
  var careManager: js.UndefOr[Reference] = js.undefined
  
  /**
    * The list of diagnosis relevant to this episode of care
    */
  var diagnosis: js.UndefOr[js.Array[EpisodeOfCareDiagnosis]] = js.undefined
  
  /**
    * Business Identifier(s) relevant for this EpisodeOfCare
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * Organization that assumes care
    */
  var managingOrganization: js.UndefOr[Reference] = js.undefined
  
  /**
    * The patient who is the focus of this episode of care
    */
  var patient: Reference
  
  /**
    * Interval during responsibility is assumed
    */
  var period: js.UndefOr[Period] = js.undefined
  
  /**
    * Originating Referral Request(s)
    */
  var referralRequest: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * planned | waitlist | active | onhold | finished | cancelled | entered-in-error
    */
  var status: code
  
  /**
    * Past list of status codes (the current status may be included to cover the start date of the status)
    */
  var statusHistory: js.UndefOr[js.Array[EpisodeOfCareStatusHistory]] = js.undefined
  
  /**
    * Other practitioners facilitating this episode of care
    */
  var team: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Type/class  - e.g. specialist referral, disease management
    */
  var `type`: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
}
object EpisodeOfCare {
  
  @scala.inline
  def apply(patient: Reference, status: code): EpisodeOfCare = {
    val __obj = js.Dynamic.literal(patient = patient.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[EpisodeOfCare]
  }
  
  @scala.inline
  implicit class EpisodeOfCareMutableBuilder[Self <: EpisodeOfCare] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccount(value: js.Array[Reference]): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountUndefined: Self = StObject.set(x, "account", js.undefined)
    
    @scala.inline
    def setAccountVarargs(value: Reference*): Self = StObject.set(x, "account", js.Array(value :_*))
    
    @scala.inline
    def setCareManager(value: Reference): Self = StObject.set(x, "careManager", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCareManagerUndefined: Self = StObject.set(x, "careManager", js.undefined)
    
    @scala.inline
    def setDiagnosis(value: js.Array[EpisodeOfCareDiagnosis]): Self = StObject.set(x, "diagnosis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiagnosisUndefined: Self = StObject.set(x, "diagnosis", js.undefined)
    
    @scala.inline
    def setDiagnosisVarargs(value: EpisodeOfCareDiagnosis*): Self = StObject.set(x, "diagnosis", js.Array(value :_*))
    
    @scala.inline
    def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    @scala.inline
    def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value :_*))
    
    @scala.inline
    def setManagingOrganization(value: Reference): Self = StObject.set(x, "managingOrganization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManagingOrganizationUndefined: Self = StObject.set(x, "managingOrganization", js.undefined)
    
    @scala.inline
    def setPatient(value: Reference): Self = StObject.set(x, "patient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeriod(value: Period): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
    
    @scala.inline
    def setReferralRequest(value: js.Array[Reference]): Self = StObject.set(x, "referralRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferralRequestUndefined: Self = StObject.set(x, "referralRequest", js.undefined)
    
    @scala.inline
    def setReferralRequestVarargs(value: Reference*): Self = StObject.set(x, "referralRequest", js.Array(value :_*))
    
    @scala.inline
    def setStatus(value: code): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusHistory(value: js.Array[EpisodeOfCareStatusHistory]): Self = StObject.set(x, "statusHistory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusHistoryUndefined: Self = StObject.set(x, "statusHistory", js.undefined)
    
    @scala.inline
    def setStatusHistoryVarargs(value: EpisodeOfCareStatusHistory*): Self = StObject.set(x, "statusHistory", js.Array(value :_*))
    
    @scala.inline
    def setTeam(value: js.Array[Reference]): Self = StObject.set(x, "team", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeamUndefined: Self = StObject.set(x, "team", js.undefined)
    
    @scala.inline
    def setTeamVarargs(value: Reference*): Self = StObject.set(x, "team", js.Array(value :_*))
    
    @scala.inline
    def setType(value: js.Array[CodeableConcept]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setTypeVarargs(value: CodeableConcept*): Self = StObject.set(x, "type", js.Array(value :_*))
    
    @scala.inline
    def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
  }
}
