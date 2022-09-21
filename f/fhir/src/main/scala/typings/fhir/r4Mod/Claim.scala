package typings.fhir.r4Mod

import typings.fhir.fhirStrings.`entered-in-error`
import typings.fhir.fhirStrings.active
import typings.fhir.fhirStrings.cancelled
import typings.fhir.fhirStrings.claim_
import typings.fhir.fhirStrings.draft
import typings.fhir.fhirStrings.preauthorization
import typings.fhir.fhirStrings.predetermination
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Claim
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _created: js.UndefOr[Element] = js.undefined
  
  var _status: js.UndefOr[Element] = js.undefined
  
  var _use: js.UndefOr[Element] = js.undefined
  
  /**
    * Details of an accident which resulted in injuries which required the products and services listed in the claim.
    */
  var accident: js.UndefOr[ClaimAccident] = js.undefined
  
  /**
    * Typically this would be today or in the past for a claim, and today or in the future for preauthorizations and predeterminations. Typically line item dates of service should fall within the billing period if one is specified.
    */
  var billablePeriod: js.UndefOr[Period] = js.undefined
  
  /**
    * The members of the team who provided the products and services.
    */
  var careTeam: js.UndefOr[js.Array[ClaimCareTeam]] = js.undefined
  
  /**
    * This field is independent of the date of creation of the resource as it may reflect the creation date of a source document prior to digitization. Typically for claims all services must be completed as of this date.
    */
  var created: String
  
  /**
    * Information about diagnoses relevant to the claim items.
    */
  var diagnosis: js.UndefOr[js.Array[ClaimDiagnosis]] = js.undefined
  
  /**
    * Individual who created the claim, predetermination or preauthorization.
    */
  var enterer: js.UndefOr[Reference] = js.undefined
  
  /**
    * Facility where the services were provided.
    */
  var facility: js.UndefOr[Reference] = js.undefined
  
  /**
    * This field is only used for preauthorizations.
    */
  var fundsReserve: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * A unique identifier assigned to this claim.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * All insurance coverages for the patient which may be applicable for reimbursement, of the products and services listed in the claim, are typically provided in the claim to allow insurers to confirm the ordering of the insurance coverages relative to local 'coordination of benefit' rules. One coverage (and only one) with 'focal=true' is to be used in the adjudication of this claim. Coverages appearing before the focal Coverage in the list, and where 'Coverage.subrogation=false', should provide a reference to the ClaimResponse containing the adjudication results of the prior claim.
    */
  var insurance: js.Array[ClaimInsurance]
  
  /**
    * The Insurer who is target of the request.
    */
  var insurer: js.UndefOr[Reference] = js.undefined
  
  /**
    * A claim line. Either a simple  product or service or a 'group' of details which can each be a simple items or groups of sub-details.
    */
  var item: js.UndefOr[js.Array[ClaimItem]] = js.undefined
  
  /**
    * For example, a physician may prescribe a medication which the pharmacy determines is contraindicated, or for which the patient has an intolerance, and therefore issues a new prescription for an alternate medication which has the same therapeutic intent. The prescription from the pharmacy becomes the 'prescription' and that from the physician becomes the 'original prescription'.
    */
  var originalPrescription: js.UndefOr[Reference] = js.undefined
  
  /**
    * The party to whom the professional services and/or products have been supplied or are being considered and for whom actual or forecast reimbursement is sought.
    */
  var patient: Reference
  
  /**
    * Often providers agree to receive the benefits payable to reduce the near-term costs to the patient. The insurer may decline to pay the provider and choose to pay the subscriber instead.
    */
  var payee: js.UndefOr[ClaimPayee] = js.undefined
  
  /**
    * Prescription to support the dispensing of pharmacy, device or vision products.
    */
  var prescription: js.UndefOr[Reference] = js.undefined
  
  /**
    * If a claim processor is unable to complete the processing as per the priority then they should generate and error and not process the request.
    */
  var priority: CodeableConcept
  
  /**
    * Procedures performed on the patient relevant to the billing items with the claim.
    */
  var procedure: js.UndefOr[js.Array[ClaimProcedure]] = js.undefined
  
  /**
    * Typically this field would be 1..1 where this party is responsible for the claim but not necessarily professionally responsible for the provision of the individual products and services listed below.
    */
  var provider: Reference
  
  /**
    * The referral resource which lists the date, practitioner, reason and other supporting information.
    */
  var referral: js.UndefOr[Reference] = js.undefined
  
  /**
    * For example,  for the original treatment and follow-up exams.
    */
  var related: js.UndefOr[js.Array[ClaimRelated]] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_Claim: typings.fhir.fhirStrings.Claim
  
  /**
    * This element is labeled as a modifier because the status contains codes that mark the resource as not currently valid.
    */
  var status: active | cancelled | draft | `entered-in-error`
  
  /**
    * This may contain the local bill type codes, for example the US UB-04 bill type code or the CMS bill type.
    */
  var subType: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Often there are multiple jurisdiction specific valuesets which are required.
    */
  var supportingInfo: js.UndefOr[js.Array[ClaimSupportingInfo]] = js.undefined
  
  /**
    * The total value of the all the items in the claim.
    */
  var total: js.UndefOr[Money] = js.undefined
  
  /**
    * The majority of jurisdictions use: oral, pharmacy, vision, professional and institutional, or variants on those terms, as the general styles of claims. The valueset is extensible to accommodate other jurisdictional requirements.
    */
  var `type`: CodeableConcept
  
  /**
    * A code to indicate whether the nature of the request is: to request adjudication of products and services previously rendered; or requesting authorization and adjudication for provision in the future; or requesting the non-binding adjudication of the listed products and services which could be provided in the future.
    */
  var use: claim_ | preauthorization | predetermination
}
object Claim {
  
  inline def apply(
    created: String,
    insurance: js.Array[ClaimInsurance],
    patient: Reference,
    priority: CodeableConcept,
    provider: Reference,
    status: active | cancelled | draft | `entered-in-error`,
    `type`: CodeableConcept,
    use: claim_ | preauthorization | predetermination
  ): Claim = {
    val __obj = js.Dynamic.literal(created = created.asInstanceOf[js.Any], insurance = insurance.asInstanceOf[js.Any], patient = patient.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any], resourceType = "Claim", status = status.asInstanceOf[js.Any], use = use.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Claim]
  }
  
  extension [Self <: Claim](x: Self) {
    
    inline def setAccident(value: ClaimAccident): Self = StObject.set(x, "accident", value.asInstanceOf[js.Any])
    
    inline def setAccidentUndefined: Self = StObject.set(x, "accident", js.undefined)
    
    inline def setBillablePeriod(value: Period): Self = StObject.set(x, "billablePeriod", value.asInstanceOf[js.Any])
    
    inline def setBillablePeriodUndefined: Self = StObject.set(x, "billablePeriod", js.undefined)
    
    inline def setCareTeam(value: js.Array[ClaimCareTeam]): Self = StObject.set(x, "careTeam", value.asInstanceOf[js.Any])
    
    inline def setCareTeamUndefined: Self = StObject.set(x, "careTeam", js.undefined)
    
    inline def setCareTeamVarargs(value: ClaimCareTeam*): Self = StObject.set(x, "careTeam", js.Array(value*))
    
    inline def setCreated(value: String): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setDiagnosis(value: js.Array[ClaimDiagnosis]): Self = StObject.set(x, "diagnosis", value.asInstanceOf[js.Any])
    
    inline def setDiagnosisUndefined: Self = StObject.set(x, "diagnosis", js.undefined)
    
    inline def setDiagnosisVarargs(value: ClaimDiagnosis*): Self = StObject.set(x, "diagnosis", js.Array(value*))
    
    inline def setEnterer(value: Reference): Self = StObject.set(x, "enterer", value.asInstanceOf[js.Any])
    
    inline def setEntererUndefined: Self = StObject.set(x, "enterer", js.undefined)
    
    inline def setFacility(value: Reference): Self = StObject.set(x, "facility", value.asInstanceOf[js.Any])
    
    inline def setFacilityUndefined: Self = StObject.set(x, "facility", js.undefined)
    
    inline def setFundsReserve(value: CodeableConcept): Self = StObject.set(x, "fundsReserve", value.asInstanceOf[js.Any])
    
    inline def setFundsReserveUndefined: Self = StObject.set(x, "fundsReserve", js.undefined)
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setInsurance(value: js.Array[ClaimInsurance]): Self = StObject.set(x, "insurance", value.asInstanceOf[js.Any])
    
    inline def setInsuranceVarargs(value: ClaimInsurance*): Self = StObject.set(x, "insurance", js.Array(value*))
    
    inline def setInsurer(value: Reference): Self = StObject.set(x, "insurer", value.asInstanceOf[js.Any])
    
    inline def setInsurerUndefined: Self = StObject.set(x, "insurer", js.undefined)
    
    inline def setItem(value: js.Array[ClaimItem]): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
    
    inline def setItemVarargs(value: ClaimItem*): Self = StObject.set(x, "item", js.Array(value*))
    
    inline def setOriginalPrescription(value: Reference): Self = StObject.set(x, "originalPrescription", value.asInstanceOf[js.Any])
    
    inline def setOriginalPrescriptionUndefined: Self = StObject.set(x, "originalPrescription", js.undefined)
    
    inline def setPatient(value: Reference): Self = StObject.set(x, "patient", value.asInstanceOf[js.Any])
    
    inline def setPayee(value: ClaimPayee): Self = StObject.set(x, "payee", value.asInstanceOf[js.Any])
    
    inline def setPayeeUndefined: Self = StObject.set(x, "payee", js.undefined)
    
    inline def setPrescription(value: Reference): Self = StObject.set(x, "prescription", value.asInstanceOf[js.Any])
    
    inline def setPrescriptionUndefined: Self = StObject.set(x, "prescription", js.undefined)
    
    inline def setPriority(value: CodeableConcept): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setProcedure(value: js.Array[ClaimProcedure]): Self = StObject.set(x, "procedure", value.asInstanceOf[js.Any])
    
    inline def setProcedureUndefined: Self = StObject.set(x, "procedure", js.undefined)
    
    inline def setProcedureVarargs(value: ClaimProcedure*): Self = StObject.set(x, "procedure", js.Array(value*))
    
    inline def setProvider(value: Reference): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    
    inline def setReferral(value: Reference): Self = StObject.set(x, "referral", value.asInstanceOf[js.Any])
    
    inline def setReferralUndefined: Self = StObject.set(x, "referral", js.undefined)
    
    inline def setRelated(value: js.Array[ClaimRelated]): Self = StObject.set(x, "related", value.asInstanceOf[js.Any])
    
    inline def setRelatedUndefined: Self = StObject.set(x, "related", js.undefined)
    
    inline def setRelatedVarargs(value: ClaimRelated*): Self = StObject.set(x, "related", js.Array(value*))
    
    inline def setResourceType(value: typings.fhir.fhirStrings.Claim): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: active | cancelled | draft | `entered-in-error`): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setSubType(value: CodeableConcept): Self = StObject.set(x, "subType", value.asInstanceOf[js.Any])
    
    inline def setSubTypeUndefined: Self = StObject.set(x, "subType", js.undefined)
    
    inline def setSupportingInfo(value: js.Array[ClaimSupportingInfo]): Self = StObject.set(x, "supportingInfo", value.asInstanceOf[js.Any])
    
    inline def setSupportingInfoUndefined: Self = StObject.set(x, "supportingInfo", js.undefined)
    
    inline def setSupportingInfoVarargs(value: ClaimSupportingInfo*): Self = StObject.set(x, "supportingInfo", js.Array(value*))
    
    inline def setTotal(value: Money): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    
    inline def setTotalUndefined: Self = StObject.set(x, "total", js.undefined)
    
    inline def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUse(value: claim_ | preauthorization | predetermination): Self = StObject.set(x, "use", value.asInstanceOf[js.Any])
    
    inline def set_created(value: Element): Self = StObject.set(x, "_created", value.asInstanceOf[js.Any])
    
    inline def set_createdUndefined: Self = StObject.set(x, "_created", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
    
    inline def set_use(value: Element): Self = StObject.set(x, "_use", value.asInstanceOf[js.Any])
    
    inline def set_useUndefined: Self = StObject.set(x, "_use", js.undefined)
  }
}
