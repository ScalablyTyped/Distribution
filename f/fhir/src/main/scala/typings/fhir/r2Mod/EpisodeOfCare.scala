package typings.fhir.r2Mod

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
    * The practitioner that is the care manager/care co-ordinator for this patient.
    */
  var careManager: js.UndefOr[Reference] = js.undefined
  
  /**
    * The list of practitioners that may be facilitating this episode of care for specific purposes.
    */
  var careTeam: js.UndefOr[js.Array[EpisodeOfCareCareTeam]] = js.undefined
  
  /**
    * A list of conditions/problems/diagnoses that this episode of care is intended to be providing care for.
    */
  var condition: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Identifier(s) by which this EpisodeOfCare is known.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * The organization that has assumed the specific responsibilities for the specified duration.
    */
  var managingOrganization: js.UndefOr[Reference] = js.undefined
  
  /**
    * The patient that this EpisodeOfCare applies to.
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
    * planned | waitlist | active | onhold | finished | cancelled.
    */
  var status: planned | waitlist | active | onhold | finished | cancelled
  
  /**
    * The history of statuses that the EpisodeOfCare has been through (without requiring processing the history of the resource).
    */
  var statusHistory: js.UndefOr[js.Array[EpisodeOfCareStatusHistory]] = js.undefined
  
  /**
    * A classification of the type of encounter; e.g. specialist referral, disease management, type of funded care.
    */
  var `type`: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
}
object EpisodeOfCare {
  
  inline def apply(patient: Reference, status: planned | waitlist | active | onhold | finished | cancelled): EpisodeOfCare = {
    val __obj = js.Dynamic.literal(patient = patient.asInstanceOf[js.Any], resourceType = "EpisodeOfCare", status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[EpisodeOfCare]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EpisodeOfCare] (val x: Self) extends AnyVal {
    
    inline def setCareManager(value: Reference): Self = StObject.set(x, "careManager", value.asInstanceOf[js.Any])
    
    inline def setCareManagerUndefined: Self = StObject.set(x, "careManager", js.undefined)
    
    inline def setCareTeam(value: js.Array[EpisodeOfCareCareTeam]): Self = StObject.set(x, "careTeam", value.asInstanceOf[js.Any])
    
    inline def setCareTeamUndefined: Self = StObject.set(x, "careTeam", js.undefined)
    
    inline def setCareTeamVarargs(value: EpisodeOfCareCareTeam*): Self = StObject.set(x, "careTeam", js.Array(value*))
    
    inline def setCondition(value: js.Array[Reference]): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    inline def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
    
    inline def setConditionVarargs(value: Reference*): Self = StObject.set(x, "condition", js.Array(value*))
    
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
    
    inline def setStatus(value: planned | waitlist | active | onhold | finished | cancelled): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
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
