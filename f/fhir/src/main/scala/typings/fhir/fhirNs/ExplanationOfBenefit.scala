package typings.fhir.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Explanation of Benefit resource
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.fhir.fhirNs.Resource because Already inherited */ trait ExplanationOfBenefit extends DomainResource {
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
  @scala.inline
  def apply(
    _created: Element = null,
    _disposition: Element = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _precedence: Element = null,
    _resourceType: Element = null,
    _status: Element = null,
    accident: ExplanationOfBenefitAccident = null,
    addItem: js.Array[ExplanationOfBenefitAddItem] = null,
    benefitBalance: js.Array[ExplanationOfBenefitBenefitBalance] = null,
    billablePeriod: Period = null,
    careTeam: js.Array[ExplanationOfBenefitCareTeam] = null,
    claim: Reference = null,
    claimResponse: Reference = null,
    contained: js.Array[Resource] = null,
    created: dateTime = null,
    diagnosis: js.Array[ExplanationOfBenefitDiagnosis] = null,
    disposition: String = null,
    employmentImpacted: Period = null,
    enterer: Reference = null,
    extension: js.Array[Extension] = null,
    facility: Reference = null,
    form: CodeableConcept = null,
    hospitalization: Period = null,
    id: id = null,
    identifier: js.Array[Identifier] = null,
    implicitRules: uri = null,
    information: js.Array[ExplanationOfBenefitInformation] = null,
    insurance: ExplanationOfBenefitInsurance = null,
    insurer: Reference = null,
    item: js.Array[ExplanationOfBenefitItem] = null,
    language: code = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    organization: Reference = null,
    originalPrescription: Reference = null,
    outcome: CodeableConcept = null,
    patient: Reference = null,
    payee: ExplanationOfBenefitPayee = null,
    payment: ExplanationOfBenefitPayment = null,
    precedence: js.UndefOr[positiveInt] = js.undefined,
    prescription: Reference = null,
    procedure: js.Array[ExplanationOfBenefitProcedure] = null,
    processNote: js.Array[ExplanationOfBenefitProcessNote] = null,
    provider: Reference = null,
    referral: Reference = null,
    related: js.Array[ExplanationOfBenefitRelated] = null,
    resourceType: code = null,
    status: code = null,
    subType: js.Array[CodeableConcept] = null,
    text: Narrative = null,
    totalBenefit: Money = null,
    totalCost: Money = null,
    `type`: CodeableConcept = null,
    unallocDeductable: Money = null
  ): ExplanationOfBenefit = {
    val __obj = js.Dynamic.literal()
    if (_created != null) __obj.updateDynamic("_created")(_created)
    if (_disposition != null) __obj.updateDynamic("_disposition")(_disposition)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules)
    if (_language != null) __obj.updateDynamic("_language")(_language)
    if (_precedence != null) __obj.updateDynamic("_precedence")(_precedence)
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType)
    if (_status != null) __obj.updateDynamic("_status")(_status)
    if (accident != null) __obj.updateDynamic("accident")(accident)
    if (addItem != null) __obj.updateDynamic("addItem")(addItem)
    if (benefitBalance != null) __obj.updateDynamic("benefitBalance")(benefitBalance)
    if (billablePeriod != null) __obj.updateDynamic("billablePeriod")(billablePeriod)
    if (careTeam != null) __obj.updateDynamic("careTeam")(careTeam)
    if (claim != null) __obj.updateDynamic("claim")(claim)
    if (claimResponse != null) __obj.updateDynamic("claimResponse")(claimResponse)
    if (contained != null) __obj.updateDynamic("contained")(contained)
    if (created != null) __obj.updateDynamic("created")(created)
    if (diagnosis != null) __obj.updateDynamic("diagnosis")(diagnosis)
    if (disposition != null) __obj.updateDynamic("disposition")(disposition)
    if (employmentImpacted != null) __obj.updateDynamic("employmentImpacted")(employmentImpacted)
    if (enterer != null) __obj.updateDynamic("enterer")(enterer)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (facility != null) __obj.updateDynamic("facility")(facility)
    if (form != null) __obj.updateDynamic("form")(form)
    if (hospitalization != null) __obj.updateDynamic("hospitalization")(hospitalization)
    if (id != null) __obj.updateDynamic("id")(id)
    if (identifier != null) __obj.updateDynamic("identifier")(identifier)
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules)
    if (information != null) __obj.updateDynamic("information")(information)
    if (insurance != null) __obj.updateDynamic("insurance")(insurance)
    if (insurer != null) __obj.updateDynamic("insurer")(insurer)
    if (item != null) __obj.updateDynamic("item")(item)
    if (language != null) __obj.updateDynamic("language")(language)
    if (meta != null) __obj.updateDynamic("meta")(meta)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (organization != null) __obj.updateDynamic("organization")(organization)
    if (originalPrescription != null) __obj.updateDynamic("originalPrescription")(originalPrescription)
    if (outcome != null) __obj.updateDynamic("outcome")(outcome)
    if (patient != null) __obj.updateDynamic("patient")(patient)
    if (payee != null) __obj.updateDynamic("payee")(payee)
    if (payment != null) __obj.updateDynamic("payment")(payment)
    if (!js.isUndefined(precedence)) __obj.updateDynamic("precedence")(precedence)
    if (prescription != null) __obj.updateDynamic("prescription")(prescription)
    if (procedure != null) __obj.updateDynamic("procedure")(procedure)
    if (processNote != null) __obj.updateDynamic("processNote")(processNote)
    if (provider != null) __obj.updateDynamic("provider")(provider)
    if (referral != null) __obj.updateDynamic("referral")(referral)
    if (related != null) __obj.updateDynamic("related")(related)
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType)
    if (status != null) __obj.updateDynamic("status")(status)
    if (subType != null) __obj.updateDynamic("subType")(subType)
    if (text != null) __obj.updateDynamic("text")(text)
    if (totalBenefit != null) __obj.updateDynamic("totalBenefit")(totalBenefit)
    if (totalCost != null) __obj.updateDynamic("totalCost")(totalCost)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (unallocDeductable != null) __obj.updateDynamic("unallocDeductable")(unallocDeductable)
    __obj.asInstanceOf[ExplanationOfBenefit]
  }
}

