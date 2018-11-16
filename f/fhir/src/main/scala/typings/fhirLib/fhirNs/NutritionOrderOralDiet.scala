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

