package typings.fhir.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Active or inactive ingredient
  */
trait MedicationIngredient extends BackboneElement {
  /**
    * Contains extended information for property 'isActive'.
    */
  var _isActive: js.UndefOr[Element] = js.undefined
  /**
    * Quantity of ingredient present
    */
  var amount: js.UndefOr[Ratio] = js.undefined
  /**
    * Active ingredient indicator
    */
  var isActive: js.UndefOr[Boolean] = js.undefined
  /**
    * The product contained
    */
  var itemCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * The product contained
    */
  var itemReference: js.UndefOr[Reference] = js.undefined
}

object MedicationIngredient {
  @scala.inline
  def apply(
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _isActive: Element = null,
    amount: Ratio = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    isActive: js.UndefOr[Boolean] = js.undefined,
    itemCodeableConcept: CodeableConcept = null,
    itemReference: Reference = null,
    modifierExtension: js.Array[Extension] = null
  ): MedicationIngredient = {
    val __obj = js.Dynamic.literal()
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_isActive != null) __obj.updateDynamic("_isActive")(_isActive)
    if (amount != null) __obj.updateDynamic("amount")(amount)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(isActive)) __obj.updateDynamic("isActive")(isActive)
    if (itemCodeableConcept != null) __obj.updateDynamic("itemCodeableConcept")(itemCodeableConcept)
    if (itemReference != null) __obj.updateDynamic("itemReference")(itemReference)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    __obj.asInstanceOf[MedicationIngredient]
  }
}

