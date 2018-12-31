package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Payment details, if paid
  */
trait ClaimResponsePayment extends BackboneElement {
  /**
    * Contains extended information for property 'date'.
    */
  var _date: js.UndefOr[Element] = js.undefined
  /**
    * Payment adjustment for non-Claim issues
    */
  var adjustment: js.UndefOr[Money] = js.undefined
  /**
    * Explanation for the non-claim adjustment
    */
  var adjustmentReason: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * Payable amount after adjustment
    */
  var amount: js.UndefOr[Money] = js.undefined
  /**
    * Expected data of Payment
    */
  var date: js.UndefOr[date] = js.undefined
  /**
    * Identifier of the payment instrument
    */
  var identifier: js.UndefOr[Identifier] = js.undefined
  /**
    * Partial or Complete
    */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
}

