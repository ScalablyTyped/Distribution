package typings.fhir.r3Mod

import typings.fhir.fhirStrings.`entered-in-error`
import typings.fhir.fhirStrings.active
import typings.fhir.fhirStrings.cancelled
import typings.fhir.fhirStrings.finished
import typings.fhir.fhirStrings.onhold
import typings.fhir.fhirStrings.planned
import typings.fhir.fhirStrings.waitlist
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EpisodeOfCare
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _status: js.UndefOr[Element] = js.undefined
  
  /**
    * The billing system may choose to allocate billable items associated with the EpisodeOfCare to different referenced Accounts based on internal business rules.
    */
  var account: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * The practitioner that is the care manager/care co-ordinator for this patient.
    */
  var careManager: js.UndefOr[Reference] = js.undefined
  
  /**
    * The list of diagnosis relevant to this episode of care.
    */
  var diagnosis: js.UndefOr[js.Array[EpisodeOfCareDiagnosis]] = js.undefined
  
  /**
    * The EpisodeOfCare may be known by different identifiers for different contexts of use, such as when an external agency is tracking the Episode for funding purposes.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * The organization that has assumed the specific responsibilities for the specified duration.
    */
  var managingOrganization: js.UndefOr[Reference] = js.undefined
  
  /**
    * The patient who is the focus of this episode of care.
    */
  var patient: Reference
  
  /**
    * The interval during which the managing organization assumes the defined responsibility.
    */
  var period: js.UndefOr[Period] = js.undefined
  
  /**
    * Referral Request(s) that are fulfilled by this EpisodeOfCare, incoming referrals.
    */
  var referralRequest: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_EpisodeOfCare: typings.fhir.fhirStrings.EpisodeOfCare
  
  /**
    * This element is labeled as a modifier because the status contains codes that mark the episode as not currently valid.
    */
  var status: planned | waitlist | active | onhold | finished | cancelled | `entered-in-error`
  
  /**
    * The history of statuses that the EpisodeOfCare has been through (without requiring processing the history of the resource).
    */
  var statusHistory: js.UndefOr[js.Array[EpisodeOfCareStatusHistory]] = js.undefined
  
  /**
    * The list of practitioners that may be facilitating this episode of care for specific purposes.
    */
  var team: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * The type can be very important in processing as this could be used in determining if the EpisodeOfCare is relevant to specific government reporting, or other types of classifications.
    */
  var `type`: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
}
object EpisodeOfCare {
  
  inline def apply(
    patient: Reference,
    status: planned | waitlist | active | onhold | finished | cancelled | `entered-in-error`
  ): EpisodeOfCare = {
    val __obj = js.Dynamic.literal(patient = patient.asInstanceOf[js.Any], resourceType = "EpisodeOfCare", status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[EpisodeOfCare]
  }
  
  extension [Self <: EpisodeOfCare](x: Self) {
    
    inline def setAccount(value: js.Array[Reference]): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
    
    inline def setAccountUndefined: Self = StObject.set(x, "account", js.undefined)
    
    inline def setAccountVarargs(value: Reference*): Self = StObject.set(x, "account", js.Array(value*))
    
    inline def setCareManager(value: Reference): Self = StObject.set(x, "careManager", value.asInstanceOf[js.Any])
    
    inline def setCareManagerUndefined: Self = StObject.set(x, "careManager", js.undefined)
    
    inline def setDiagnosis(value: js.Array[EpisodeOfCareDiagnosis]): Self = StObject.set(x, "diagnosis", value.asInstanceOf[js.Any])
    
    inline def setDiagnosisUndefined: Self = StObject.set(x, "diagnosis", js.undefined)
    
    inline def setDiagnosisVarargs(value: EpisodeOfCareDiagnosis*): Self = StObject.set(x, "diagnosis", js.Array(value*))
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setManagingOrganization(value: Reference): Self = StObject.set(x, "managingOrganization", value.asInstanceOf[js.Any])
    
    inline def setManagingOrganizationUndefined: Self = StObject.set(x, "managingOrganization", js.undefined)
    
    inline def setPatient(value: Reference): Self = StObject.set(x, "patient", value.asInstanceOf[js.Any])
    
    inline def setPeriod(value: Period): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    inline def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
    
    inline def setReferralRequest(value: js.Array[Reference]): Self = StObject.set(x, "referralRequest", value.asInstanceOf[js.Any])
    
    inline def setReferralRequestUndefined: Self = StObject.set(x, "referralRequest", js.undefined)
    
    inline def setReferralRequestVarargs(value: Reference*): Self = StObject.set(x, "referralRequest", js.Array(value*))
    
    inline def setResourceType(value: typings.fhir.fhirStrings.EpisodeOfCare): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: planned | waitlist | active | onhold | finished | cancelled | `entered-in-error`): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusHistory(value: js.Array[EpisodeOfCareStatusHistory]): Self = StObject.set(x, "statusHistory", value.asInstanceOf[js.Any])
    
    inline def setStatusHistoryUndefined: Self = StObject.set(x, "statusHistory", js.undefined)
    
    inline def setStatusHistoryVarargs(value: EpisodeOfCareStatusHistory*): Self = StObject.set(x, "statusHistory", js.Array(value*))
    
    inline def setTeam(value: js.Array[Reference]): Self = StObject.set(x, "team", value.asInstanceOf[js.Any])
    
    inline def setTeamUndefined: Self = StObject.set(x, "team", js.undefined)
    
    inline def setTeamVarargs(value: Reference*): Self = StObject.set(x, "team", js.Array(value*))
    
    inline def setType(value: js.Array[CodeableConcept]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setTypeVarargs(value: CodeableConcept*): Self = StObject.set(x, "type", js.Array(value*))
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
  }
}
