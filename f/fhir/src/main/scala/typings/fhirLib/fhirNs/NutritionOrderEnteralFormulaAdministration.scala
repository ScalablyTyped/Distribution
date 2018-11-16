package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Formula feeding instruction as structured data
     */

trait NutritionOrderEnteralFormulaAdministration extends BackboneElement {
  /**
           * The volume of formula to provide
           */
  var quantity: js.UndefOr[Quantity] = js.undefined
  /**
           * Speed with which the formula is provided per period of time
           */
  var rateQuantity: js.UndefOr[Quantity] = js.undefined
  /**
           * Speed with which the formula is provided per period of time
           */
  var rateRatio: js.UndefOr[Ratio] = js.undefined
  /**
           * Scheduled frequency of enteral feeding
           */
  var schedule: js.UndefOr[Timing] = js.undefined
}

