package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Explanation of Benefit resource
     */

trait ExplanationOfBenefit extends DomainResource {
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
  var disposition: js.UndefOr[java.lang.String] = js.undefined
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

