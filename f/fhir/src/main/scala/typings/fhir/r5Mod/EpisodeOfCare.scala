package typings.fhir.r5Mod

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
    * The practitioner that is the care manager/care coordinator for this patient.
    */
  var careManager: js.UndefOr[Reference] = js.undefined
  
  /**
    * The list of practitioners that may be facilitating this episode of care for specific purposes.
    */
  var careTeam: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * The diagnosis communicates what medical conditions were actually addressed during the episode of care.  If a diagnosis was provided as a reason, and was treated during the episode of care, it may be listed in both EpisodeOfCare.reason and EpisodeOfCare.diagnosis.
    * Diagnoses related to billing can be documented on the Account resources which supports ranking for the purpose of reimbursement.
    */
  var diagnosis: js.UndefOr[js.Array[EpisodeOfCareDiagnosis]] = js.undefined
  
  /**
    * The EpisodeOfCare may be known by different identifiers for different contexts of use, such as when an external agency is tracking the Episode for funding purposes.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * If multiple organizations are involved in care delivery, the care teams from those organizations would be represented in EpisodeOfCare.team, while the primary organization managing the care would be listed in EpisodeOfCare.managingOrganization.   Other organizations may have their own EpisodeOfCare for tracking their activities.
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
    * The reason communicates what medical problem the patient has that should be addressed during the episode of care.  This reason could be patient reported complaint, a clinical indication that was determined in a previous encounter or episode of care, or some planned care such as an immunization recommendation.  In the case where you have a primary reason, but are expecting to also address other problems, you can list the primary reason with a use code of 'Chief Complaint', while the other problems being addressed would have a use code of 'Reason for Visit'.
    * Examples:
    *  * pregnancy would use HealthcareService or a coding as the reason
    *  * patient home monitoring could use Condition as the reason
    */
  var reason: js.UndefOr[js.Array[EpisodeOfCareReason]] = js.undefined
  
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EpisodeOfCare] (val x: Self) extends AnyVal {
    
    inline def setAccount(value: js.Array[Reference]): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
    
    inline def setAccountUndefined: Self = StObject.set(x, "account", js.undefined)
    
    inline def setAccountVarargs(value: Reference*): Self = StObject.set(x, "account", js.Array(value*))
    
    inline def setCareManager(value: Reference): Self = StObject.set(x, "careManager", value.asInstanceOf[js.Any])
    
    inline def setCareManagerUndefined: Self = StObject.set(x, "careManager", js.undefined)
    
    inline def setCareTeam(value: js.Array[Reference]): Self = StObject.set(x, "careTeam", value.asInstanceOf[js.Any])
    
    inline def setCareTeamUndefined: Self = StObject.set(x, "careTeam", js.undefined)
    
    inline def setCareTeamVarargs(value: Reference*): Self = StObject.set(x, "careTeam", js.Array(value*))
    
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
    
    inline def setReason(value: js.Array[EpisodeOfCareReason]): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    
    inline def setReasonVarargs(value: EpisodeOfCareReason*): Self = StObject.set(x, "reason", js.Array(value*))
    
    inline def setReferralRequest(value: js.Array[Reference]): Self = StObject.set(x, "referralRequest", value.asInstanceOf[js.Any])
    
    inline def setReferralRequestUndefined: Self = StObject.set(x, "referralRequest", js.undefined)
    
    inline def setReferralRequestVarargs(value: Reference*): Self = StObject.set(x, "referralRequest", js.Array(value*))
    
    inline def setResourceType(value: typings.fhir.fhirStrings.EpisodeOfCare): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: planned | waitlist | active | onhold | finished | cancelled | `entered-in-error`): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusHistory(value: js.Array[EpisodeOfCareStatusHistory]): Self = StObject.set(x, "statusHistory", value.asInstanceOf[js.Any])
    
    inline def setStatusHistoryUndefined: Self = StObject.set(x, "statusHistory", js.undefined)
    
    inline def setStatusHistoryVarargs(value: EpisodeOfCareStatusHistory*): Self = StObject.set(x, "statusHistory", js.Array(value*))
    
    inline def setType(value: js.Array[CodeableConcept]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setTypeVarargs(value: CodeableConcept*): Self = StObject.set(x, "type", js.Array(value*))
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
  }
}
