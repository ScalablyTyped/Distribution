package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Explanation of Benefit resource
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ @js.native
trait ExplanationOfBenefit extends DomainResource {
  
  /**
    * Contains extended information for property 'created'.
    */
  var _created: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'disposition'.
    */
  var _disposition: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'precedence'.
    */
  var _precedence: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.native
  
  /**
    * Details of an accident
    */
  var accident: js.UndefOr[ExplanationOfBenefitAccident] = js.native
  
  /**
    * Insurer added line items
    */
  var addItem: js.UndefOr[js.Array[ExplanationOfBenefitAddItem]] = js.native
  
  /**
    * Balance by Benefit Category
    */
  var benefitBalance: js.UndefOr[js.Array[ExplanationOfBenefitBenefitBalance]] = js.native
  
  /**
    * Period for charge submission
    */
  var billablePeriod: js.UndefOr[Period] = js.native
  
  /**
    * Care Team members
    */
  var careTeam: js.UndefOr[js.Array[ExplanationOfBenefitCareTeam]] = js.native
  
  /**
    * Claim reference
    */
  var claim: js.UndefOr[Reference] = js.native
  
  /**
    * Claim response reference
    */
  var claimResponse: js.UndefOr[Reference] = js.native
  
  /**
    * Creation date
    */
  var created: js.UndefOr[dateTime] = js.native
  
  /**
    * List of Diagnosis
    */
  var diagnosis: js.UndefOr[js.Array[ExplanationOfBenefitDiagnosis]] = js.native
  
  /**
    * Disposition Message
    */
  var disposition: js.UndefOr[String] = js.native
  
  /**
    * Period unable to work
    */
  var employmentImpacted: js.UndefOr[Period] = js.native
  
  /**
    * Author
    */
  var enterer: js.UndefOr[Reference] = js.native
  
  /**
    * Servicing Facility
    */
  var facility: js.UndefOr[Reference] = js.native
  
  /**
    * Printed Form Identifier
    */
  var form: js.UndefOr[CodeableConcept] = js.native
  
  /**
    * Period in hospital
    */
  var hospitalization: js.UndefOr[Period] = js.native
  
  /**
    * Business Identifier
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.native
  
  /**
    * Exceptions, special considerations, the condition, situation, prior or concurrent issues
    */
  var information: js.UndefOr[js.Array[ExplanationOfBenefitInformation]] = js.native
  
  /**
    * Insurance or medical plan
    */
  var insurance: js.UndefOr[ExplanationOfBenefitInsurance] = js.native
  
  /**
    * Insurer responsible for the EOB
    */
  var insurer: js.UndefOr[Reference] = js.native
  
  /**
    * Goods and Services
    */
  var item: js.UndefOr[js.Array[ExplanationOfBenefitItem]] = js.native
  
  /**
    * Responsible organization for the claim
    */
  var organization: js.UndefOr[Reference] = js.native
  
  /**
    * Original prescription if superceded by fulfiller
    */
  var originalPrescription: js.UndefOr[Reference] = js.native
  
  /**
    * complete | error | partial
    */
  var outcome: js.UndefOr[CodeableConcept] = js.native
  
  /**
    * The subject of the Products and Services
    */
  var patient: js.UndefOr[Reference] = js.native
  
  /**
    * Party to be paid any benefits payable
    */
  var payee: js.UndefOr[ExplanationOfBenefitPayee] = js.native
  
  /**
    * Payment (if paid)
    */
  var payment: js.UndefOr[ExplanationOfBenefitPayment] = js.native
  
  /**
    * Precedence (primary, secondary, etc.)
    */
  var precedence: js.UndefOr[positiveInt] = js.native
  
  /**
    * Prescription authorizing services or products
    */
  var prescription: js.UndefOr[Reference] = js.native
  
  /**
    * Procedures performed
    */
  var procedure: js.UndefOr[js.Array[ExplanationOfBenefitProcedure]] = js.native
  
  /**
    * Processing notes
    */
  var processNote: js.UndefOr[js.Array[ExplanationOfBenefitProcessNote]] = js.native
  
  /**
    * Responsible provider for the claim
    */
  var provider: js.UndefOr[Reference] = js.native
  
  /**
    * Treatment Referral
    */
  var referral: js.UndefOr[Reference] = js.native
  
  /**
    * Related Claims which may be revelant to processing this claim
    */
  var related: js.UndefOr[js.Array[ExplanationOfBenefitRelated]] = js.native
  
  /**
    * active | cancelled | draft | entered-in-error
    */
  var status: js.UndefOr[code] = js.native
  
  /**
    * Finer grained claim type information
    */
  var subType: js.UndefOr[js.Array[CodeableConcept]] = js.native
  
  /**
    * Total benefit payable for the Claim
    */
  var totalBenefit: js.UndefOr[Money] = js.native
  
  /**
    * Total Cost of service from the Claim
    */
  var totalCost: js.UndefOr[Money] = js.native
  
  /**
    * Type or discipline
    */
  var `type`: js.UndefOr[CodeableConcept] = js.native
  
  /**
    * Unallocated deductable
    */
  var unallocDeductable: js.UndefOr[Money] = js.native
}
object ExplanationOfBenefit {
  
  @scala.inline
  def apply(): ExplanationOfBenefit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExplanationOfBenefit]
  }
  
  @scala.inline
  implicit class ExplanationOfBenefitMutableBuilder[Self <: ExplanationOfBenefit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccident(value: ExplanationOfBenefitAccident): Self = StObject.set(x, "accident", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccidentUndefined: Self = StObject.set(x, "accident", js.undefined)
    
    @scala.inline
    def setAddItem(value: js.Array[ExplanationOfBenefitAddItem]): Self = StObject.set(x, "addItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddItemUndefined: Self = StObject.set(x, "addItem", js.undefined)
    
    @scala.inline
    def setAddItemVarargs(value: ExplanationOfBenefitAddItem*): Self = StObject.set(x, "addItem", js.Array(value :_*))
    
    @scala.inline
    def setBenefitBalance(value: js.Array[ExplanationOfBenefitBenefitBalance]): Self = StObject.set(x, "benefitBalance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBenefitBalanceUndefined: Self = StObject.set(x, "benefitBalance", js.undefined)
    
    @scala.inline
    def setBenefitBalanceVarargs(value: ExplanationOfBenefitBenefitBalance*): Self = StObject.set(x, "benefitBalance", js.Array(value :_*))
    
    @scala.inline
    def setBillablePeriod(value: Period): Self = StObject.set(x, "billablePeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBillablePeriodUndefined: Self = StObject.set(x, "billablePeriod", js.undefined)
    
    @scala.inline
    def setCareTeam(value: js.Array[ExplanationOfBenefitCareTeam]): Self = StObject.set(x, "careTeam", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCareTeamUndefined: Self = StObject.set(x, "careTeam", js.undefined)
    
    @scala.inline
    def setCareTeamVarargs(value: ExplanationOfBenefitCareTeam*): Self = StObject.set(x, "careTeam", js.Array(value :_*))
    
    @scala.inline
    def setClaim(value: Reference): Self = StObject.set(x, "claim", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClaimResponse(value: Reference): Self = StObject.set(x, "claimResponse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClaimResponseUndefined: Self = StObject.set(x, "claimResponse", js.undefined)
    
    @scala.inline
    def setClaimUndefined: Self = StObject.set(x, "claim", js.undefined)
    
    @scala.inline
    def setCreated(value: dateTime): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
    
    @scala.inline
    def setDiagnosis(value: js.Array[ExplanationOfBenefitDiagnosis]): Self = StObject.set(x, "diagnosis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiagnosisUndefined: Self = StObject.set(x, "diagnosis", js.undefined)
    
    @scala.inline
    def setDiagnosisVarargs(value: ExplanationOfBenefitDiagnosis*): Self = StObject.set(x, "diagnosis", js.Array(value :_*))
    
    @scala.inline
    def setDisposition(value: String): Self = StObject.set(x, "disposition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDispositionUndefined: Self = StObject.set(x, "disposition", js.undefined)
    
    @scala.inline
    def setEmploymentImpacted(value: Period): Self = StObject.set(x, "employmentImpacted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmploymentImpactedUndefined: Self = StObject.set(x, "employmentImpacted", js.undefined)
    
    @scala.inline
    def setEnterer(value: Reference): Self = StObject.set(x, "enterer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntererUndefined: Self = StObject.set(x, "enterer", js.undefined)
    
    @scala.inline
    def setFacility(value: Reference): Self = StObject.set(x, "facility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFacilityUndefined: Self = StObject.set(x, "facility", js.undefined)
    
    @scala.inline
    def setForm(value: CodeableConcept): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
    
    @scala.inline
    def setHospitalization(value: Period): Self = StObject.set(x, "hospitalization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHospitalizationUndefined: Self = StObject.set(x, "hospitalization", js.undefined)
    
    @scala.inline
    def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    @scala.inline
    def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value :_*))
    
    @scala.inline
    def setInformation(value: js.Array[ExplanationOfBenefitInformation]): Self = StObject.set(x, "information", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInformationUndefined: Self = StObject.set(x, "information", js.undefined)
    
    @scala.inline
    def setInformationVarargs(value: ExplanationOfBenefitInformation*): Self = StObject.set(x, "information", js.Array(value :_*))
    
    @scala.inline
    def setInsurance(value: ExplanationOfBenefitInsurance): Self = StObject.set(x, "insurance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsuranceUndefined: Self = StObject.set(x, "insurance", js.undefined)
    
    @scala.inline
    def setInsurer(value: Reference): Self = StObject.set(x, "insurer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsurerUndefined: Self = StObject.set(x, "insurer", js.undefined)
    
    @scala.inline
    def setItem(value: js.Array[ExplanationOfBenefitItem]): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
    
    @scala.inline
    def setItemVarargs(value: ExplanationOfBenefitItem*): Self = StObject.set(x, "item", js.Array(value :_*))
    
    @scala.inline
    def setOrganization(value: Reference): Self = StObject.set(x, "organization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrganizationUndefined: Self = StObject.set(x, "organization", js.undefined)
    
    @scala.inline
    def setOriginalPrescription(value: Reference): Self = StObject.set(x, "originalPrescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalPrescriptionUndefined: Self = StObject.set(x, "originalPrescription", js.undefined)
    
    @scala.inline
    def setOutcome(value: CodeableConcept): Self = StObject.set(x, "outcome", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutcomeUndefined: Self = StObject.set(x, "outcome", js.undefined)
    
    @scala.inline
    def setPatient(value: Reference): Self = StObject.set(x, "patient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatientUndefined: Self = StObject.set(x, "patient", js.undefined)
    
    @scala.inline
    def setPayee(value: ExplanationOfBenefitPayee): Self = StObject.set(x, "payee", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayeeUndefined: Self = StObject.set(x, "payee", js.undefined)
    
    @scala.inline
    def setPayment(value: ExplanationOfBenefitPayment): Self = StObject.set(x, "payment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaymentUndefined: Self = StObject.set(x, "payment", js.undefined)
    
    @scala.inline
    def setPrecedence(value: positiveInt): Self = StObject.set(x, "precedence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrecedenceUndefined: Self = StObject.set(x, "precedence", js.undefined)
    
    @scala.inline
    def setPrescription(value: Reference): Self = StObject.set(x, "prescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrescriptionUndefined: Self = StObject.set(x, "prescription", js.undefined)
    
    @scala.inline
    def setProcedure(value: js.Array[ExplanationOfBenefitProcedure]): Self = StObject.set(x, "procedure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcedureUndefined: Self = StObject.set(x, "procedure", js.undefined)
    
    @scala.inline
    def setProcedureVarargs(value: ExplanationOfBenefitProcedure*): Self = StObject.set(x, "procedure", js.Array(value :_*))
    
    @scala.inline
    def setProcessNote(value: js.Array[ExplanationOfBenefitProcessNote]): Self = StObject.set(x, "processNote", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessNoteUndefined: Self = StObject.set(x, "processNote", js.undefined)
    
    @scala.inline
    def setProcessNoteVarargs(value: ExplanationOfBenefitProcessNote*): Self = StObject.set(x, "processNote", js.Array(value :_*))
    
    @scala.inline
    def setProvider(value: Reference): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProviderUndefined: Self = StObject.set(x, "provider", js.undefined)
    
    @scala.inline
    def setReferral(value: Reference): Self = StObject.set(x, "referral", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferralUndefined: Self = StObject.set(x, "referral", js.undefined)
    
    @scala.inline
    def setRelated(value: js.Array[ExplanationOfBenefitRelated]): Self = StObject.set(x, "related", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelatedUndefined: Self = StObject.set(x, "related", js.undefined)
    
    @scala.inline
    def setRelatedVarargs(value: ExplanationOfBenefitRelated*): Self = StObject.set(x, "related", js.Array(value :_*))
    
    @scala.inline
    def setStatus(value: code): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setSubType(value: js.Array[CodeableConcept]): Self = StObject.set(x, "subType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubTypeUndefined: Self = StObject.set(x, "subType", js.undefined)
    
    @scala.inline
    def setSubTypeVarargs(value: CodeableConcept*): Self = StObject.set(x, "subType", js.Array(value :_*))
    
    @scala.inline
    def setTotalBenefit(value: Money): Self = StObject.set(x, "totalBenefit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalBenefitUndefined: Self = StObject.set(x, "totalBenefit", js.undefined)
    
    @scala.inline
    def setTotalCost(value: Money): Self = StObject.set(x, "totalCost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalCostUndefined: Self = StObject.set(x, "totalCost", js.undefined)
    
    @scala.inline
    def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setUnallocDeductable(value: Money): Self = StObject.set(x, "unallocDeductable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnallocDeductableUndefined: Self = StObject.set(x, "unallocDeductable", js.undefined)
    
    @scala.inline
    def set_created(value: Element): Self = StObject.set(x, "_created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_createdUndefined: Self = StObject.set(x, "_created", js.undefined)
    
    @scala.inline
    def set_disposition(value: Element): Self = StObject.set(x, "_disposition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_dispositionUndefined: Self = StObject.set(x, "_disposition", js.undefined)
    
    @scala.inline
    def set_precedence(value: Element): Self = StObject.set(x, "_precedence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_precedenceUndefined: Self = StObject.set(x, "_precedence", js.undefined)
    
    @scala.inline
    def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
  }
}
