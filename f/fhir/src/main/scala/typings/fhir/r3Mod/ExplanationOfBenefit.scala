package typings.fhir.r3Mod

import typings.fhir.fhirStrings.`entered-in-error`
import typings.fhir.fhirStrings.active
import typings.fhir.fhirStrings.cancelled
import typings.fhir.fhirStrings.draft
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExplanationOfBenefit
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _created: js.UndefOr[Element] = js.undefined
  
  var _disposition: js.UndefOr[Element] = js.undefined
  
  var _status: js.UndefOr[Element] = js.undefined
  
  /**
    * An accident which resulted in the need for healthcare services.
    */
  var accident: js.UndefOr[ExplanationOfBenefitAccident] = js.undefined
  
  /**
    * The first tier service adjudications for payor added services.
    */
  var addItem: js.UndefOr[js.Array[ExplanationOfBenefitAddItem]] = js.undefined
  
  /**
    * Balance by Benefit Category.
    */
  var benefitBalance: js.UndefOr[js.Array[ExplanationOfBenefitBenefitBalance]] = js.undefined
  
  /**
    * The billable period for which charges are being submitted.
    */
  var billablePeriod: js.UndefOr[Period] = js.undefined
  
  /**
    * The members of the team who provided the overall service as well as their role and whether responsible and qualifications.
    */
  var careTeam: js.UndefOr[js.Array[ExplanationOfBenefitCareTeam]] = js.undefined
  
  /**
    * The business identifier for the instance: invoice number, claim number, pre-determination or pre-authorization number.
    */
  var claim: js.UndefOr[Reference] = js.undefined
  
  /**
    * The business identifier for the instance: invoice number, claim number, pre-determination or pre-authorization number.
    */
  var claimResponse: js.UndefOr[Reference] = js.undefined
  
  /**
    * The date when the EOB was created.
    */
  var created: js.UndefOr[String] = js.undefined
  
  /**
    * Ordered list of patient diagnosis for which care is sought.
    */
  var diagnosis: js.UndefOr[js.Array[ExplanationOfBenefitDiagnosis]] = js.undefined
  
  /**
    * Do we need a disposition code?
    */
  var disposition: js.UndefOr[String] = js.undefined
  
  /**
    * The start and optional end dates of when the patient was precluded from working due to the treatable condition(s).
    */
  var employmentImpacted: js.UndefOr[Period] = js.undefined
  
  /**
    * The person who created the explanation of benefit.
    */
  var enterer: js.UndefOr[Reference] = js.undefined
  
  /**
    * Facility where the services were provided.
    */
  var facility: js.UndefOr[Reference] = js.undefined
  
  /**
    * The form to be used for printing the content.
    */
  var form: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The start and optional end dates of when the patient was confined to a treatment center.
    */
  var hospitalization: js.UndefOr[Period] = js.undefined
  
  /**
    * The EOB Business Identifier.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * Additional information codes regarding exceptions, special considerations, the condition, situation, prior or concurrent issues. Often there are mutiple jurisdiction specific valuesets which are required.
    */
  var information: js.UndefOr[js.Array[ExplanationOfBenefitInformation]] = js.undefined
  
  /**
    * Financial instrument by which payment information for health care.
    */
  var insurance: js.UndefOr[ExplanationOfBenefitInsurance] = js.undefined
  
  /**
    * The insurer which is responsible for the explanation of benefit.
    */
  var insurer: js.UndefOr[Reference] = js.undefined
  
  /**
    * First tier of goods and services.
    */
  var item: js.UndefOr[js.Array[ExplanationOfBenefitItem]] = js.undefined
  
  /**
    * The provider which is responsible for the claim.
    */
  var organization: js.UndefOr[Reference] = js.undefined
  
  /**
    * Original prescription which has been superceded by this prescription to support the dispensing of pharmacy services, medications or products. For example, a physician may prescribe a medication which the pharmacy determines is contraindicated, or for which the patient has an intolerance, and therefor issues a new precription for an alternate medication which has the same theraputic intent. The prescription from the pharmacy becomes the 'prescription' and that from the physician becomes the 'original prescription'.
    */
  var originalPrescription: js.UndefOr[Reference] = js.undefined
  
  /**
    * Processing outcome errror, partial or complete processing.
    */
  var outcome: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Patient Resource.
    */
  var patient: js.UndefOr[Reference] = js.undefined
  
  /**
    * The party to be reimbursed for the services.
    */
  var payee: js.UndefOr[ExplanationOfBenefitPayee] = js.undefined
  
  /**
    * Payment details for the claim if the claim has been paid.
    */
  var payment: js.UndefOr[ExplanationOfBenefitPayment] = js.undefined
  
  /**
    * Precedence (primary, secondary, etc.).
    */
  var precedence: js.UndefOr[Double] = js.undefined
  
  /**
    * Prescription to support the dispensing of Pharmacy or Vision products.
    */
  var prescription: js.UndefOr[Reference] = js.undefined
  
  /**
    * Ordered list of patient procedures performed to support the adjudication.
    */
  var procedure: js.UndefOr[js.Array[ExplanationOfBenefitProcedure]] = js.undefined
  
  /**
    * Note text.
    */
  var processNote: js.UndefOr[js.Array[ExplanationOfBenefitProcessNote]] = js.undefined
  
  /**
    * The provider which is responsible for the claim.
    */
  var provider: js.UndefOr[Reference] = js.undefined
  
  /**
    * The referral resource which lists the date, practitioner, reason and other supporting information.
    */
  var referral: js.UndefOr[Reference] = js.undefined
  
  /**
    * Other claims which are related to this claim such as prior claim versions or for related services.
    */
  var related: js.UndefOr[js.Array[ExplanationOfBenefitRelated]] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_ExplanationOfBenefit: typings.fhir.fhirStrings.ExplanationOfBenefit
  
  /**
    * This element is labeled as a modifier because the status contains codes that mark the resource as not currently valid.
    */
  var status: js.UndefOr[active | cancelled | draft | `entered-in-error`] = js.undefined
  
  /**
    * This may contain the local bill type codes such as the US UB-04 bill type code.
    */
  var subType: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Total amount of benefit payable (Equal to sum of the Benefit amounts from all detail lines and additions less the Unallocated Deductable).
    */
  var totalBenefit: js.UndefOr[Money] = js.undefined
  
  /**
    * The total cost of the services reported.
    */
  var totalCost: js.UndefOr[Money] = js.undefined
  
  /**
    * Affects which fields and value sets are used.
    */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The amount of deductable applied which was not allocated to any particular service line.
    */
  var unallocDeductable: js.UndefOr[Money] = js.undefined
}
object ExplanationOfBenefit {
  
  inline def apply(): ExplanationOfBenefit = {
    val __obj = js.Dynamic.literal(resourceType = "ExplanationOfBenefit")
    __obj.asInstanceOf[ExplanationOfBenefit]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExplanationOfBenefit] (val x: Self) extends AnyVal {
    
    inline def setAccident(value: ExplanationOfBenefitAccident): Self = StObject.set(x, "accident", value.asInstanceOf[js.Any])
    
    inline def setAccidentUndefined: Self = StObject.set(x, "accident", js.undefined)
    
    inline def setAddItem(value: js.Array[ExplanationOfBenefitAddItem]): Self = StObject.set(x, "addItem", value.asInstanceOf[js.Any])
    
    inline def setAddItemUndefined: Self = StObject.set(x, "addItem", js.undefined)
    
    inline def setAddItemVarargs(value: ExplanationOfBenefitAddItem*): Self = StObject.set(x, "addItem", js.Array(value*))
    
    inline def setBenefitBalance(value: js.Array[ExplanationOfBenefitBenefitBalance]): Self = StObject.set(x, "benefitBalance", value.asInstanceOf[js.Any])
    
    inline def setBenefitBalanceUndefined: Self = StObject.set(x, "benefitBalance", js.undefined)
    
    inline def setBenefitBalanceVarargs(value: ExplanationOfBenefitBenefitBalance*): Self = StObject.set(x, "benefitBalance", js.Array(value*))
    
    inline def setBillablePeriod(value: Period): Self = StObject.set(x, "billablePeriod", value.asInstanceOf[js.Any])
    
    inline def setBillablePeriodUndefined: Self = StObject.set(x, "billablePeriod", js.undefined)
    
    inline def setCareTeam(value: js.Array[ExplanationOfBenefitCareTeam]): Self = StObject.set(x, "careTeam", value.asInstanceOf[js.Any])
    
    inline def setCareTeamUndefined: Self = StObject.set(x, "careTeam", js.undefined)
    
    inline def setCareTeamVarargs(value: ExplanationOfBenefitCareTeam*): Self = StObject.set(x, "careTeam", js.Array(value*))
    
    inline def setClaim(value: Reference): Self = StObject.set(x, "claim", value.asInstanceOf[js.Any])
    
    inline def setClaimResponse(value: Reference): Self = StObject.set(x, "claimResponse", value.asInstanceOf[js.Any])
    
    inline def setClaimResponseUndefined: Self = StObject.set(x, "claimResponse", js.undefined)
    
    inline def setClaimUndefined: Self = StObject.set(x, "claim", js.undefined)
    
    inline def setCreated(value: String): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
    
    inline def setDiagnosis(value: js.Array[ExplanationOfBenefitDiagnosis]): Self = StObject.set(x, "diagnosis", value.asInstanceOf[js.Any])
    
    inline def setDiagnosisUndefined: Self = StObject.set(x, "diagnosis", js.undefined)
    
    inline def setDiagnosisVarargs(value: ExplanationOfBenefitDiagnosis*): Self = StObject.set(x, "diagnosis", js.Array(value*))
    
    inline def setDisposition(value: String): Self = StObject.set(x, "disposition", value.asInstanceOf[js.Any])
    
    inline def setDispositionUndefined: Self = StObject.set(x, "disposition", js.undefined)
    
    inline def setEmploymentImpacted(value: Period): Self = StObject.set(x, "employmentImpacted", value.asInstanceOf[js.Any])
    
    inline def setEmploymentImpactedUndefined: Self = StObject.set(x, "employmentImpacted", js.undefined)
    
    inline def setEnterer(value: Reference): Self = StObject.set(x, "enterer", value.asInstanceOf[js.Any])
    
    inline def setEntererUndefined: Self = StObject.set(x, "enterer", js.undefined)
    
    inline def setFacility(value: Reference): Self = StObject.set(x, "facility", value.asInstanceOf[js.Any])
    
    inline def setFacilityUndefined: Self = StObject.set(x, "facility", js.undefined)
    
    inline def setForm(value: CodeableConcept): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
    
    inline def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
    
    inline def setHospitalization(value: Period): Self = StObject.set(x, "hospitalization", value.asInstanceOf[js.Any])
    
    inline def setHospitalizationUndefined: Self = StObject.set(x, "hospitalization", js.undefined)
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setInformation(value: js.Array[ExplanationOfBenefitInformation]): Self = StObject.set(x, "information", value.asInstanceOf[js.Any])
    
    inline def setInformationUndefined: Self = StObject.set(x, "information", js.undefined)
    
    inline def setInformationVarargs(value: ExplanationOfBenefitInformation*): Self = StObject.set(x, "information", js.Array(value*))
    
    inline def setInsurance(value: ExplanationOfBenefitInsurance): Self = StObject.set(x, "insurance", value.asInstanceOf[js.Any])
    
    inline def setInsuranceUndefined: Self = StObject.set(x, "insurance", js.undefined)
    
    inline def setInsurer(value: Reference): Self = StObject.set(x, "insurer", value.asInstanceOf[js.Any])
    
    inline def setInsurerUndefined: Self = StObject.set(x, "insurer", js.undefined)
    
    inline def setItem(value: js.Array[ExplanationOfBenefitItem]): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
    
    inline def setItemVarargs(value: ExplanationOfBenefitItem*): Self = StObject.set(x, "item", js.Array(value*))
    
    inline def setOrganization(value: Reference): Self = StObject.set(x, "organization", value.asInstanceOf[js.Any])
    
    inline def setOrganizationUndefined: Self = StObject.set(x, "organization", js.undefined)
    
    inline def setOriginalPrescription(value: Reference): Self = StObject.set(x, "originalPrescription", value.asInstanceOf[js.Any])
    
    inline def setOriginalPrescriptionUndefined: Self = StObject.set(x, "originalPrescription", js.undefined)
    
    inline def setOutcome(value: CodeableConcept): Self = StObject.set(x, "outcome", value.asInstanceOf[js.Any])
    
    inline def setOutcomeUndefined: Self = StObject.set(x, "outcome", js.undefined)
    
    inline def setPatient(value: Reference): Self = StObject.set(x, "patient", value.asInstanceOf[js.Any])
    
    inline def setPatientUndefined: Self = StObject.set(x, "patient", js.undefined)
    
    inline def setPayee(value: ExplanationOfBenefitPayee): Self = StObject.set(x, "payee", value.asInstanceOf[js.Any])
    
    inline def setPayeeUndefined: Self = StObject.set(x, "payee", js.undefined)
    
    inline def setPayment(value: ExplanationOfBenefitPayment): Self = StObject.set(x, "payment", value.asInstanceOf[js.Any])
    
    inline def setPaymentUndefined: Self = StObject.set(x, "payment", js.undefined)
    
    inline def setPrecedence(value: Double): Self = StObject.set(x, "precedence", value.asInstanceOf[js.Any])
    
    inline def setPrecedenceUndefined: Self = StObject.set(x, "precedence", js.undefined)
    
    inline def setPrescription(value: Reference): Self = StObject.set(x, "prescription", value.asInstanceOf[js.Any])
    
    inline def setPrescriptionUndefined: Self = StObject.set(x, "prescription", js.undefined)
    
    inline def setProcedure(value: js.Array[ExplanationOfBenefitProcedure]): Self = StObject.set(x, "procedure", value.asInstanceOf[js.Any])
    
    inline def setProcedureUndefined: Self = StObject.set(x, "procedure", js.undefined)
    
    inline def setProcedureVarargs(value: ExplanationOfBenefitProcedure*): Self = StObject.set(x, "procedure", js.Array(value*))
    
    inline def setProcessNote(value: js.Array[ExplanationOfBenefitProcessNote]): Self = StObject.set(x, "processNote", value.asInstanceOf[js.Any])
    
    inline def setProcessNoteUndefined: Self = StObject.set(x, "processNote", js.undefined)
    
    inline def setProcessNoteVarargs(value: ExplanationOfBenefitProcessNote*): Self = StObject.set(x, "processNote", js.Array(value*))
    
    inline def setProvider(value: Reference): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    
    inline def setProviderUndefined: Self = StObject.set(x, "provider", js.undefined)
    
    inline def setReferral(value: Reference): Self = StObject.set(x, "referral", value.asInstanceOf[js.Any])
    
    inline def setReferralUndefined: Self = StObject.set(x, "referral", js.undefined)
    
    inline def setRelated(value: js.Array[ExplanationOfBenefitRelated]): Self = StObject.set(x, "related", value.asInstanceOf[js.Any])
    
    inline def setRelatedUndefined: Self = StObject.set(x, "related", js.undefined)
    
    inline def setRelatedVarargs(value: ExplanationOfBenefitRelated*): Self = StObject.set(x, "related", js.Array(value*))
    
    inline def setResourceType(value: typings.fhir.fhirStrings.ExplanationOfBenefit): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: active | cancelled | draft | `entered-in-error`): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setSubType(value: js.Array[CodeableConcept]): Self = StObject.set(x, "subType", value.asInstanceOf[js.Any])
    
    inline def setSubTypeUndefined: Self = StObject.set(x, "subType", js.undefined)
    
    inline def setSubTypeVarargs(value: CodeableConcept*): Self = StObject.set(x, "subType", js.Array(value*))
    
    inline def setTotalBenefit(value: Money): Self = StObject.set(x, "totalBenefit", value.asInstanceOf[js.Any])
    
    inline def setTotalBenefitUndefined: Self = StObject.set(x, "totalBenefit", js.undefined)
    
    inline def setTotalCost(value: Money): Self = StObject.set(x, "totalCost", value.asInstanceOf[js.Any])
    
    inline def setTotalCostUndefined: Self = StObject.set(x, "totalCost", js.undefined)
    
    inline def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUnallocDeductable(value: Money): Self = StObject.set(x, "unallocDeductable", value.asInstanceOf[js.Any])
    
    inline def setUnallocDeductableUndefined: Self = StObject.set(x, "unallocDeductable", js.undefined)
    
    inline def set_created(value: Element): Self = StObject.set(x, "_created", value.asInstanceOf[js.Any])
    
    inline def set_createdUndefined: Self = StObject.set(x, "_created", js.undefined)
    
    inline def set_disposition(value: Element): Self = StObject.set(x, "_disposition", value.asInstanceOf[js.Any])
    
    inline def set_dispositionUndefined: Self = StObject.set(x, "_disposition", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
  }
}
