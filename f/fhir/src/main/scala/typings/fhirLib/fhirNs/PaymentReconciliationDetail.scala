package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * List of settlements
  */
trait PaymentReconciliationDetail extends BackboneElement {
  /**
    * Contains extended information for property 'date'.
    */
  var _date: js.UndefOr[Element] = js.undefined
  /**
    * Amount being paid
    */
  var amount: js.UndefOr[Money] = js.undefined
  /**
    * Invoice date
    */
  var date: js.UndefOr[date] = js.undefined
  /**
    * Organization which is receiving the payment
    */
  var payee: js.UndefOr[Reference] = js.undefined
  /**
    * Claim
    */
  var request: js.UndefOr[Reference] = js.undefined
  /**
    * Claim Response
    */
  var response: js.UndefOr[Reference] = js.undefined
  /**
    * Organization which submitted the claim
    */
  var submitter: js.UndefOr[Reference] = js.undefined
  /**
    * Type code
    */
  var `type`: CodeableConcept
}

