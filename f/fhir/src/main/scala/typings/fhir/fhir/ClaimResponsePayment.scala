package typings.fhir.fhir

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

object ClaimResponsePayment {
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
  ): ClaimResponsePayment = {
    val __obj = js.Dynamic.literal()
    if (_date != null) __obj.updateDynamic("_date")(_date.asInstanceOf[js.Any])
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (adjustment != null) __obj.updateDynamic("adjustment")(adjustment.asInstanceOf[js.Any])
    if (adjustmentReason != null) __obj.updateDynamic("adjustmentReason")(adjustmentReason.asInstanceOf[js.Any])
    if (amount != null) __obj.updateDynamic("amount")(amount.asInstanceOf[js.Any])
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClaimResponsePayment]
  }
}

