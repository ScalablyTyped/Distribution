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

object PaymentReconciliationDetail {
  @scala.inline
  def apply(
    `type`: CodeableConcept,
    _date: Element = null,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    amount: Money = null,
    date: date = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[java.lang.String] = null,
    id: java.lang.String = null,
    modifierExtension: js.Array[Extension] = null,
    payee: Reference = null,
    request: Reference = null,
    response: Reference = null,
    submitter: Reference = null
  ): PaymentReconciliationDetail = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (_date != null) __obj.updateDynamic("_date")(_date)
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (amount != null) __obj.updateDynamic("amount")(amount)
    if (date != null) __obj.updateDynamic("date")(date)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (payee != null) __obj.updateDynamic("payee")(payee)
    if (request != null) __obj.updateDynamic("request")(request)
    if (response != null) __obj.updateDynamic("response")(response)
    if (submitter != null) __obj.updateDynamic("submitter")(submitter)
    __obj.asInstanceOf[PaymentReconciliationDetail]
  }
}

