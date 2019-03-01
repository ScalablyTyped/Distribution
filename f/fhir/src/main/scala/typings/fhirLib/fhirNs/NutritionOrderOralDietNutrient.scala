package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Required  nutrient modifications
  */
trait NutritionOrderOralDietNutrient extends BackboneElement {
  /**
    * Quantity of the specified nutrient
    */
  var amount: js.UndefOr[Quantity] = js.undefined
  /**
    * Type of nutrient that is being modified
    */
  var modifier: js.UndefOr[CodeableConcept] = js.undefined
}

object NutritionOrderOralDietNutrient {
  @scala.inline
  def apply(
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    amount: Quantity = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[java.lang.String] = null,
    id: java.lang.String = null,
    modifier: CodeableConcept = null,
    modifierExtension: js.Array[Extension] = null
  ): NutritionOrderOralDietNutrient = {
    val __obj = js.Dynamic.literal()
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (amount != null) __obj.updateDynamic("amount")(amount)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (modifier != null) __obj.updateDynamic("modifier")(modifier)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    __obj.asInstanceOf[NutritionOrderOralDietNutrient]
  }
}

