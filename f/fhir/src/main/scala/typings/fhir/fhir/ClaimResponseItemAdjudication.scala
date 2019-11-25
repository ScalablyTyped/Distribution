package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Adjudication details
  */
trait ClaimResponseItemAdjudication extends BackboneElement {
  /**
    * Contains extended information for property 'value'.
    */
  var _value: js.UndefOr[Element] = js.undefined
  /**
    * Monetary amount
    */
  var amount: js.UndefOr[Money] = js.undefined
  /**
    * Adjudication category such as co-pay, eligible, benefit, etc.
    */
  var category: CodeableConcept
  /**
    * Explanation of Adjudication outcome
    */
  var reason: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * Non-monetary value
    */
  var value: js.UndefOr[decimal] = js.undefined
}

object ClaimResponseItemAdjudication {
  @scala.inline
  def apply(
    category: CodeableConcept,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _value: Element = null,
    amount: Money = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    modifierExtension: js.Array[Extension] = null,
    reason: CodeableConcept = null,
    value: Int | Double = null
  ): ClaimResponseItemAdjudication = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any])
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_value != null) __obj.updateDynamic("_value")(_value.asInstanceOf[js.Any])
    if (amount != null) __obj.updateDynamic("amount")(amount.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (reason != null) __obj.updateDynamic("reason")(reason.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClaimResponseItemAdjudication]
  }
}

