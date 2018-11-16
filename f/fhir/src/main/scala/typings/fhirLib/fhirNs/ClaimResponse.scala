package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Remittance resource
     */

trait ClaimResponse extends DomainResource {
  /**
           * Contains extended information for property 'created'.
           */
  var _created: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'disposition'.
           */
  var _disposition: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'status'.
           */
  var _status: js.UndefOr[Element] = js.undefined
  /**
           * Insurer added line items
           */
  var addItem: js.UndefOr[js.Array[ClaimResponseAddItem]] = js.undefined
  /**
           * Request for additional information
           */
  var communicationRequest: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
           * Creation date
           */
  var created: js.UndefOr[dateTime] = js.undefined
  /**
           * Disposition Message
           */
  var disposition: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Processing errors
           */
  var error: js.UndefOr[js.Array[ClaimResponseError]] = js.undefined
  /**
           * Printed Form Identifier
           */
  var form: js.UndefOr[CodeableConcept] = js.undefined
  /**
           * Response  number
           */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  /**
           * Insurance or medical plan
           */
  var insurance: js.UndefOr[js.Array[ClaimResponseInsurance]] = js.undefined
  /**
           * Insurance issuing organization
           */
  var insurer: js.UndefOr[Reference] = js.undefined
  /**
           * Line items
           */
  var item: js.UndefOr[js.Array[ClaimResponseItem]] = js.undefined
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
  var payeeType: js.UndefOr[CodeableConcept] = js.undefined
  /**
           * Payment details, if paid
           */
  var payment: js.UndefOr[ClaimResponsePayment] = js.undefined
  /**
           * Processing notes
           */
  var processNote: js.UndefOr[js.Array[ClaimResponseProcessNote]] = js.undefined
  /**
           * Id of resource triggering adjudication
           */
  var request: js.UndefOr[Reference] = js.undefined
  /**
           * Responsible organization
           */
  var requestOrganization: js.UndefOr[Reference] = js.undefined
  /**
           * Responsible practitioner
           */
  var requestProvider: js.UndefOr[Reference] = js.undefined
  /**
           * Funds reserved status
           */
  var reserved: js.UndefOr[Coding] = js.undefined
  /**
           * active | cancelled | draft | entered-in-error
           */
  var status: js.UndefOr[code] = js.undefined
  /**
           * Total benefit payable for the Claim
           */
  var totalBenefit: js.UndefOr[Money] = js.undefined
  /**
           * Total Cost of service from the Claim
           */
  var totalCost: js.UndefOr[Money] = js.undefined
  /**
           * Unallocated deductible
           */
  var unallocDeductable: js.UndefOr[Money] = js.undefined
}

