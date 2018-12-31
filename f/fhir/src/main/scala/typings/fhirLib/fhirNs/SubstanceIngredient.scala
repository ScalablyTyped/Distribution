package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Composition information about the substance
  */
trait SubstanceIngredient extends BackboneElement {
  /**
    * Optional amount (concentration)
    */
  var quantity: js.UndefOr[Ratio] = js.undefined
  /**
    * A component of the substance
    */
  var substanceCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * A component of the substance
    */
  var substanceReference: js.UndefOr[Reference] = js.undefined
}

