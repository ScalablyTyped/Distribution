package typings
package fhirLib.fhirNs

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
  var isActive: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * The product contained
           */
  var itemCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  /**
           * The product contained
           */
  var itemReference: js.UndefOr[Reference] = js.undefined
}

