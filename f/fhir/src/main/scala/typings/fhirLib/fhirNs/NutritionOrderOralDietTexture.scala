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

