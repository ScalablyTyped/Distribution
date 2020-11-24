package typings.fhir.fhir

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
  implicit class ExplanationOfBenefitOps[Self <: ExplanationOfBenefit] (val x: Self) extends AnyVal {
    
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
    def set_created(value: Element): Self = this.set("_created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_created: Self = this.set("_created", js.undefined)
    
    @scala.inline
    def set_disposition(value: Element): Self = this.set("_disposition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_disposition: Self = this.set("_disposition", js.undefined)
    
    @scala.inline
    def set_precedence(value: Element): Self = this.set("_precedence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_precedence: Self = this.set("_precedence", js.undefined)
    
    @scala.inline
    def set_status(value: Element): Self = this.set("_status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_status: Self = this.set("_status", js.undefined)
    
    @scala.inline
    def setAccident(value: ExplanationOfBenefitAccident): Self = this.set("accident", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccident: Self = this.set("accident", js.undefined)
    
    @scala.inline
    def setAddItemVarargs(value: ExplanationOfBenefitAddItem*): Self = this.set("addItem", js.Array(value :_*))
    
    @scala.inline
    def setAddItem(value: js.Array[ExplanationOfBenefitAddItem]): Self = this.set("addItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddItem: Self = this.set("addItem", js.undefined)
    
    @scala.inline
    def setBenefitBalanceVarargs(value: ExplanationOfBenefitBenefitBalance*): Self = this.set("benefitBalance", js.Array(value :_*))
    
    @scala.inline
    def setBenefitBalance(value: js.Array[ExplanationOfBenefitBenefitBalance]): Self = this.set("benefitBalance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBenefitBalance: Self = this.set("benefitBalance", js.undefined)
    
    @scala.inline
    def setBillablePeriod(value: Period): Self = this.set("billablePeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBillablePeriod: Self = this.set("billablePeriod", js.undefined)
    
    @scala.inline
    def setCareTeamVarargs(value: ExplanationOfBenefitCareTeam*): Self = this.set("careTeam", js.Array(value :_*))
    
    @scala.inline
    def setCareTeam(value: js.Array[ExplanationOfBenefitCareTeam]): Self = this.set("careTeam", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCareTeam: Self = this.set("careTeam", js.undefined)
    
    @scala.inline
    def setClaim(value: Reference): Self = this.set("claim", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClaim: Self = this.set("claim", js.undefined)
    
    @scala.inline
    def setClaimResponse(value: Reference): Self = this.set("claimResponse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClaimResponse: Self = this.set("claimResponse", js.undefined)
    
    @scala.inline
    def setCreated(value: dateTime): Self = this.set("created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreated: Self = this.set("created", js.undefined)
    
    @scala.inline
    def setDiagnosisVarargs(value: ExplanationOfBenefitDiagnosis*): Self = this.set("diagnosis", js.Array(value :_*))
    
    @scala.inline
    def setDiagnosis(value: js.Array[ExplanationOfBenefitDiagnosis]): Self = this.set("diagnosis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDiagnosis: Self = this.set("diagnosis", js.undefined)
    
    @scala.inline
    def setDisposition(value: String): Self = this.set("disposition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisposition: Self = this.set("disposition", js.undefined)
    
    @scala.inline
    def setEmploymentImpacted(value: Period): Self = this.set("employmentImpacted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmploymentImpacted: Self = this.set("employmentImpacted", js.undefined)
    
    @scala.inline
    def setEnterer(value: Reference): Self = this.set("enterer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnterer: Self = this.set("enterer", js.undefined)
    
    @scala.inline
    def setFacility(value: Reference): Self = this.set("facility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFacility: Self = this.set("facility", js.undefined)
    
    @scala.inline
    def setForm(value: CodeableConcept): Self = this.set("form", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForm: Self = this.set("form", js.undefined)
    
    @scala.inline
    def setHospitalization(value: Period): Self = this.set("hospitalization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHospitalization: Self = this.set("hospitalization", js.undefined)
    
    @scala.inline
    def setIdentifierVarargs(value: Identifier*): Self = this.set("identifier", js.Array(value :_*))
    
    @scala.inline
    def setIdentifier(value: js.Array[Identifier]): Self = this.set("identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdentifier: Self = this.set("identifier", js.undefined)
    
    @scala.inline
    def setInformationVarargs(value: ExplanationOfBenefitInformation*): Self = this.set("information", js.Array(value :_*))
    
    @scala.inline
    def setInformation(value: js.Array[ExplanationOfBenefitInformation]): Self = this.set("information", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInformation: Self = this.set("information", js.undefined)
    
    @scala.inline
    def setInsurance(value: ExplanationOfBenefitInsurance): Self = this.set("insurance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInsurance: Self = this.set("insurance", js.undefined)
    
    @scala.inline
    def setInsurer(value: Reference): Self = this.set("insurer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInsurer: Self = this.set("insurer", js.undefined)
    
    @scala.inline
    def setItemVarargs(value: ExplanationOfBenefitItem*): Self = this.set("item", js.Array(value :_*))
    
    @scala.inline
    def setItem(value: js.Array[ExplanationOfBenefitItem]): Self = this.set("item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItem: Self = this.set("item", js.undefined)
    
    @scala.inline
    def setOrganization(value: Reference): Self = this.set("organization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrganization: Self = this.set("organization", js.undefined)
    
    @scala.inline
    def setOriginalPrescription(value: Reference): Self = this.set("originalPrescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOriginalPrescription: Self = this.set("originalPrescription", js.undefined)
    
    @scala.inline
    def setOutcome(value: CodeableConcept): Self = this.set("outcome", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutcome: Self = this.set("outcome", js.undefined)
    
    @scala.inline
    def setPatient(value: Reference): Self = this.set("patient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePatient: Self = this.set("patient", js.undefined)
    
    @scala.inline
    def setPayee(value: ExplanationOfBenefitPayee): Self = this.set("payee", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePayee: Self = this.set("payee", js.undefined)
    
    @scala.inline
    def setPayment(value: ExplanationOfBenefitPayment): Self = this.set("payment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePayment: Self = this.set("payment", js.undefined)
    
    @scala.inline
    def setPrecedence(value: positiveInt): Self = this.set("precedence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrecedence: Self = this.set("precedence", js.undefined)
    
    @scala.inline
    def setPrescription(value: Reference): Self = this.set("prescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrescription: Self = this.set("prescription", js.undefined)
    
    @scala.inline
    def setProcedureVarargs(value: ExplanationOfBenefitProcedure*): Self = this.set("procedure", js.Array(value :_*))
    
    @scala.inline
    def setProcedure(value: js.Array[ExplanationOfBenefitProcedure]): Self = this.set("procedure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProcedure: Self = this.set("procedure", js.undefined)
    
    @scala.inline
    def setProcessNoteVarargs(value: ExplanationOfBenefitProcessNote*): Self = this.set("processNote", js.Array(value :_*))
    
    @scala.inline
    def setProcessNote(value: js.Array[ExplanationOfBenefitProcessNote]): Self = this.set("processNote", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProcessNote: Self = this.set("processNote", js.undefined)
    
    @scala.inline
    def setProvider(value: Reference): Self = this.set("provider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProvider: Self = this.set("provider", js.undefined)
    
    @scala.inline
    def setReferral(value: Reference): Self = this.set("referral", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReferral: Self = this.set("referral", js.undefined)
    
    @scala.inline
    def setRelatedVarargs(value: ExplanationOfBenefitRelated*): Self = this.set("related", js.Array(value :_*))
    
    @scala.inline
    def setRelated(value: js.Array[ExplanationOfBenefitRelated]): Self = this.set("related", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRelated: Self = this.set("related", js.undefined)
    
    @scala.inline
    def setStatus(value: code): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setSubTypeVarargs(value: CodeableConcept*): Self = this.set("subType", js.Array(value :_*))
    
    @scala.inline
    def setSubType(value: js.Array[CodeableConcept]): Self = this.set("subType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubType: Self = this.set("subType", js.undefined)
    
    @scala.inline
    def setTotalBenefit(value: Money): Self = this.set("totalBenefit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalBenefit: Self = this.set("totalBenefit", js.undefined)
    
    @scala.inline
    def setTotalCost(value: Money): Self = this.set("totalCost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalCost: Self = this.set("totalCost", js.undefined)
    
    @scala.inline
    def setType(value: CodeableConcept): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setUnallocDeductable(value: Money): Self = this.set("unallocDeductable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnallocDeductable: Self = this.set("unallocDeductable", js.undefined)
  }
}
