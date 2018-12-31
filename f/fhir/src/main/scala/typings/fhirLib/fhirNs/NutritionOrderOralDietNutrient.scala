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

