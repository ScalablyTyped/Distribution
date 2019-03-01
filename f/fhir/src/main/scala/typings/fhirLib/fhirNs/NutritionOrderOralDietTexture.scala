package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Required  texture modifications
  */
trait NutritionOrderOralDietTexture extends BackboneElement {
  /**
    * Concepts that are used to identify an entity that is ingested for nutritional purposes
    */
  var foodType: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * Code to indicate how to alter the texture of the foods, e.g. pureed
    */
  var modifier: js.UndefOr[CodeableConcept] = js.undefined
}

object NutritionOrderOralDietTexture {
  @scala.inline
  def apply(
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[java.lang.String] = null,
    foodType: CodeableConcept = null,
    id: java.lang.String = null,
    modifier: CodeableConcept = null,
    modifierExtension: js.Array[Extension] = null
  ): NutritionOrderOralDietTexture = {
    val __obj = js.Dynamic.literal()
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (foodType != null) __obj.updateDynamic("foodType")(foodType)
    if (id != null) __obj.updateDynamic("id")(id)
    if (modifier != null) __obj.updateDynamic("modifier")(modifier)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    __obj.asInstanceOf[NutritionOrderOralDietTexture]
  }
}

