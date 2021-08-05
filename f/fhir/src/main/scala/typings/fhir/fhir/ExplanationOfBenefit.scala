package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Explanation of Benefit resource
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ trait ExplanationOfBenefit
  extends StObject
     with DomainResource {
  
  /**
    * Contains extended information for property 'created'.
    */
  var _created: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'disposition'.
    */
  var _disposition: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'precedence'.
    */
  var _precedence: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.undefined
  
  /**
    * Details of an accident
    */
  var accident: js.UndefOr[ExplanationOfBenefitAccident] = js.undefined
  
  /**
    * Insurer added line items
    */
  var addItem: js.UndefOr[js.Array[ExplanationOfBenefitAddItem]] = js.undefined
  
  /**
    * Balance by Benefit Category
    */
  var benefitBalance: js.UndefOr[js.Array[ExplanationOfBenefitBenefitBalance]] = js.undefined
  
  /**
    * Period for charge submission
    */
  var billablePeriod: js.UndefOr[Period] = js.undefined
  
  /**
    * Care Team members
    */
  var careTeam: js.UndefOr[js.Array[ExplanationOfBenefitCareTeam]] = js.undefined
  
  /**
    * Claim reference
    */
  var claim: js.UndefOr[Reference] = js.undefined
  
  /**
    * Claim response reference
    */
  var claimResponse: js.UndefOr[Reference] = js.undefined
  
  /**
    * Creation date
    */
  var created: js.UndefOr[dateTime] = js.undefined
  
  /**
    * List of Diagnosis
    */
  var diagnosis: js.UndefOr[js.Array[ExplanationOfBenefitDiagnosis]] = js.undefined
  
  /**
    * Disposition Message
    */
  var disposition: js.UndefOr[String] = js.undefined
  
  /**
    * Period unable to work
    */
  var employmentImpacted: js.UndefOr[Period] = js.undefined
  
  /**
    * Author
    */
  var enterer: js.UndefOr[Reference] = js.undefined
  
  /**
    * Servicing Facility
    */
  var facility: js.UndefOr[Reference] = js.undefined
  
  /**
    * Printed Form Identifier
    */
  var form: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Period in hospital
    */
  var hospitalization: js.UndefOr[Period] = js.undefined
  
  /**
    * Business Identifier
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * Exceptions, special considerations, the condition, situation, prior or concurrent issues
    */
  var information: js.UndefOr[js.Array[ExplanationOfBenefitInformation]] = js.undefined
  
  /**
    * Insurance or medical plan
    */
  var insurance: js.UndefOr[ExplanationOfBenefitInsurance] = js.undefined
  
  /**
    * Insurer responsible for the EOB
    */
  var insurer: js.UndefOr[Reference] = js.undefined
  
  /**
    * Goods and Services
    */
  var item: js.UndefOr[js.Array[ExplanationOfBenefitItem]] = js.undefined
  
  /**
    * Responsible organization for the claim
    */
  var organization: js.UndefOr[Reference] = js.undefined
  
  /**
    * Original prescription if superceded by fulfiller
    */
  var originalPrescription: js.UndefOr[Reference] = js.undefined
  
  /**
    * complete | error | partial
    */
  var outcome: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The subject of the Products and Services
    */
  var patient: js.UndefOr[Reference] = js.undefined
  
  /**
    * Party to be paid any benefits payable
    */
  var payee: js.UndefOr[ExplanationOfBenefitPayee] = js.undefined
  
  /**
    * Payment (if paid)
    */
  var payment: js.UndefOr[ExplanationOfBenefitPayment] = js.undefined
  
  /**
    * Precedence (primary, secondary, etc.)
    */
  var precedence: js.UndefOr[positiveInt] = js.undefined
  
  /**
    * Prescription authorizing services or products
    */
  var prescription: js.UndefOr[Reference] = js.undefined
  
  /**
    * Procedures performed
    */
  var procedure: js.UndefOr[js.Array[ExplanationOfBenefitProcedure]] = js.undefined
  
  /**
    * Processing notes
    */
  var processNote: js.UndefOr[js.Array[ExplanationOfBenefitProcessNote]] = js.undefined
  
  /**
    * Responsible provider for the claim
    */
  var provider: js.UndefOr[Reference] = js.undefined
  
  /**
    * Treatment Referral
    */
  var referral: js.UndefOr[Reference] = js.undefined
  
  /**
    * Related Claims which may be revelant to processing this claim
    */
  var related: js.UndefOr[js.Array[ExplanationOfBenefitRelated]] = js.undefined
  
  /**
    * active | cancelled | draft | entered-in-error
    */
  var status: js.UndefOr[code] = js.undefined
  
  /**
    * Finer grained claim type information
    */
  var subType: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Total benefit payable for the Claim
    */
  var totalBenefit: js.UndefOr[Money] = js.undefined
  
  /**
    * Total Cost of service from the Claim
    */
  var totalCost: js.UndefOr[Money] = js.undefined
  
  /**
    * Type or discipline
    */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Unallocated deductable
    */
  var unallocDeductable: js.UndefOr[Money] = js.undefined
}
object ExplanationOfBenefit {
  
  inline def apply(): ExplanationOfBenefit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExplanationOfBenefit]
  }
  
  extension [Self <: ExplanationOfBenefit](x: Self) {
    
    inline def setAccident(value: ExplanationOfBenefitAccident): Self = StObject.set(x, "accident", value.asInstanceOf[js.Any])
    
    inline def setAccidentUndefined: Self = StObject.set(x, "accident", js.undefined)
    
    inline def setAddItem(value: js.Array[ExplanationOfBenefitAddItem]): Self = StObject.set(x, "addItem", value.asInstanceOf[js.Any])
    
    inline def setAddItemUndefined: Self = StObject.set(x, "addItem", js.undefined)
    
    inline def setAddItemVarargs(value: ExplanationOfBenefitAddItem*): Self = StObject.set(x, "addItem", js.Array(value :_*))
    
    inline def setBenefitBalance(value: js.Array[ExplanationOfBenefitBenefitBalance]): Self = StObject.set(x, "benefitBalance", value.asInstanceOf[js.Any])
    
    inline def setBenefitBalanceUndefined: Self = StObject.set(x, "benefitBalance", js.undefined)
    
    inline def setBenefitBalanceVarargs(value: ExplanationOfBenefitBenefitBalance*): Self = StObject.set(x, "benefitBalance", js.Array(value :_*))
    
    inline def setBillablePeriod(value: Period): Self = StObject.set(x, "billablePeriod", value.asInstanceOf[js.Any])
    
    inline def setBillablePeriodUndefined: Self = StObject.set(x, "billablePeriod", js.undefined)
    
    inline def setCareTeam(value: js.Array[ExplanationOfBenefitCareTeam]): Self = StObject.set(x, "careTeam", value.asInstanceOf[js.Any])
    
    inline def setCareTeamUndefined: Self = StObject.set(x, "careTeam", js.undefined)
    
    inline def setCareTeamVarargs(value: ExplanationOfBenefitCareTeam*): Self = StObject.set(x, "careTeam", js.Array(value :_*))
    
    inline def setClaim(value: Reference): Self = StObject.set(x, "claim", value.asInstanceOf[js.Any])
    
    inline def setClaimResponse(value: Reference): Self = StObject.set(x, "claimResponse", value.asInstanceOf[js.Any])
    
    inline def setClaimResponseUndefined: Self = StObject.set(x, "claimResponse", js.undefined)
    
    inline def setClaimUndefined: Self = StObject.set(x, "claim", js.undefined)
    
    inline def setCreated(value: dateTime): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
    
    inline def setDiagnosis(value: js.Array[ExplanationOfBenefitDiagnosis]): Self = StObject.set(x, "diagnosis", value.asInstanceOf[js.Any])
    
    inline def setDiagnosisUndefined: Self = StObject.set(x, "diagnosis", js.undefined)
    
    inline def setDiagnosisVarargs(value: ExplanationOfBenefitDiagnosis*): Self = StObject.set(x, "diagnosis", js.Array(value :_*))
    
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
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value :_*))
    
    inline def setInformation(value: js.Array[ExplanationOfBenefitInformation]): Self = StObject.set(x, "information", value.asInstanceOf[js.Any])
    
    inline def setInformationUndefined: Self = StObject.set(x, "information", js.undefined)
    
    inline def setInformationVarargs(value: ExplanationOfBenefitInformation*): Self = StObject.set(x, "information", js.Array(value :_*))
    
    inline def setInsurance(value: ExplanationOfBenefitInsurance): Self = StObject.set(x, "insurance", value.asInstanceOf[js.Any])
    
    inline def setInsuranceUndefined: Self = StObject.set(x, "insurance", js.undefined)
    
    inline def setInsurer(value: Reference): Self = StObject.set(x, "insurer", value.asInstanceOf[js.Any])
    
    inline def setInsurerUndefined: Self = StObject.set(x, "insurer", js.undefined)
    
    inline def setItem(value: js.Array[ExplanationOfBenefitItem]): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
    
    inline def setItemVarargs(value: ExplanationOfBenefitItem*): Self = StObject.set(x, "item", js.Array(value :_*))
    
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
    
    inline def setPrecedence(value: positiveInt): Self = StObject.set(x, "precedence", value.asInstanceOf[js.Any])
    
    inline def setPrecedenceUndefined: Self = StObject.set(x, "precedence", js.undefined)
    
    inline def setPrescription(value: Reference): Self = StObject.set(x, "prescription", value.asInstanceOf[js.Any])
    
    inline def setPrescriptionUndefined: Self = StObject.set(x, "prescription", js.undefined)
    
    inline def setProcedure(value: js.Array[ExplanationOfBenefitProcedure]): Self = StObject.set(x, "procedure", value.asInstanceOf[js.Any])
    
    inline def setProcedureUndefined: Self = StObject.set(x, "procedure", js.undefined)
    
    inline def setProcedureVarargs(value: ExplanationOfBenefitProcedure*): Self = StObject.set(x, "procedure", js.Array(value :_*))
    
    inline def setProcessNote(value: js.Array[ExplanationOfBenefitProcessNote]): Self = StObject.set(x, "processNote", value.asInstanceOf[js.Any])
    
    inline def setProcessNoteUndefined: Self = StObject.set(x, "processNote", js.undefined)
    
    inline def setProcessNoteVarargs(value: ExplanationOfBenefitProcessNote*): Self = StObject.set(x, "processNote", js.Array(value :_*))
    
    inline def setProvider(value: Reference): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    
    inline def setProviderUndefined: Self = StObject.set(x, "provider", js.undefined)
    
    inline def setReferral(value: Reference): Self = StObject.set(x, "referral", value.asInstanceOf[js.Any])
    
    inline def setReferralUndefined: Self = StObject.set(x, "referral", js.undefined)
    
    inline def setRelated(value: js.Array[ExplanationOfBenefitRelated]): Self = StObject.set(x, "related", value.asInstanceOf[js.Any])
    
    inline def setRelatedUndefined: Self = StObject.set(x, "related", js.undefined)
    
    inline def setRelatedVarargs(value: ExplanationOfBenefitRelated*): Self = StObject.set(x, "related", js.Array(value :_*))
    
    inline def setStatus(value: code): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setSubType(value: js.Array[CodeableConcept]): Self = StObject.set(x, "subType", value.asInstanceOf[js.Any])
    
    inline def setSubTypeUndefined: Self = StObject.set(x, "subType", js.undefined)
    
    inline def setSubTypeVarargs(value: CodeableConcept*): Self = StObject.set(x, "subType", js.Array(value :_*))
    
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
    
    inline def set_precedence(value: Element): Self = StObject.set(x, "_precedence", value.asInstanceOf[js.Any])
    
    inline def set_precedenceUndefined: Self = StObject.set(x, "_precedence", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
  }
}
