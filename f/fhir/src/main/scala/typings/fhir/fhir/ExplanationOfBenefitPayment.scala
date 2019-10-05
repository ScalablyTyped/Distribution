package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Payment (if paid)
  */
trait ExplanationOfBenefitPayment extends BackboneElement {
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
    * Expected date of Payment
    */
  var date: js.UndefOr[typings.fhir.fhir.date] = js.undefined
  /**
    * Identifier of the payment instrument
    */
  var identifier: js.UndefOr[Identifier] = js.undefined
  /**
    * Partial or Complete
    */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
}

object ExplanationOfBenefitPayment {
  @scala.inline
  def apply(
    _date: Element = null,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    adjustment: Money = null,
    adjustmentReason: CodeableConcept = null,
    amount: Money = null,
    date: date = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    identifier: Identifier = null,
    modifierExtension: js.Array[Extension] = null,
    `type`: CodeableConcept = null
  ): ExplanationOfBenefitPayment = {
    val __obj = js.Dynamic.literal()
    if (_date != null) __obj.updateDynamic("_date")(_date)
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (adjustment != null) __obj.updateDynamic("adjustment")(adjustment)
    if (adjustmentReason != null) __obj.updateDynamic("adjustmentReason")(adjustmentReason)
    if (amount != null) __obj.updateDynamic("amount")(amount)
    if (date != null) __obj.updateDynamic("date")(date)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (identifier != null) __obj.updateDynamic("identifier")(identifier)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ExplanationOfBenefitPayment]
  }
}

