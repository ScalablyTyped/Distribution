package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Oral diet components
  */
trait NutritionOrderOralDiet extends BackboneElement {
  /**
    * Contains extended information for property 'instruction'.
    */
  var _instruction: js.UndefOr[Element] = js.undefined
  /**
    * The required consistency of fluids and liquids provided to the patient
    */
  var fluidConsistencyType: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
    * Instructions or additional information about the oral diet
    */
  var instruction: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Required  nutrient modifications
    */
  var nutrient: js.UndefOr[js.Array[NutritionOrderOralDietNutrient]] = js.undefined
  /**
    * Scheduled frequency of diet
    */
  var schedule: js.UndefOr[js.Array[Timing]] = js.undefined
  /**
    * Required  texture modifications
    */
  var texture: js.UndefOr[js.Array[NutritionOrderOralDietTexture]] = js.undefined
  /**
    * Type of oral diet or diet restrictions that describe what can be consumed orally
    */
  var `type`: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
}

object NutritionOrderOralDiet {
  @scala.inline
  def apply(
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _instruction: Element = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[java.lang.String] = null,
    fluidConsistencyType: js.Array[CodeableConcept] = null,
    id: java.lang.String = null,
    instruction: java.lang.String = null,
    modifierExtension: js.Array[Extension] = null,
    nutrient: js.Array[NutritionOrderOralDietNutrient] = null,
    schedule: js.Array[Timing] = null,
    texture: js.Array[NutritionOrderOralDietTexture] = null,
    `type`: js.Array[CodeableConcept] = null
  ): NutritionOrderOralDiet = {
    val __obj = js.Dynamic.literal()
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_instruction != null) __obj.updateDynamic("_instruction")(_instruction)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (fluidConsistencyType != null) __obj.updateDynamic("fluidConsistencyType")(fluidConsistencyType)
    if (id != null) __obj.updateDynamic("id")(id)
    if (instruction != null) __obj.updateDynamic("instruction")(instruction)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (nutrient != null) __obj.updateDynamic("nutrient")(nutrient)
    if (schedule != null) __obj.updateDynamic("schedule")(schedule)
    if (texture != null) __obj.updateDynamic("texture")(texture)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[NutritionOrderOralDiet]
  }
}

