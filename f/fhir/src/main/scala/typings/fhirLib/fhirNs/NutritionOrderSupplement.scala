package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Supplement components
     */

trait NutritionOrderSupplement extends BackboneElement {
  /**
           * Contains extended information for property 'instruction'.
           */
  var _instruction: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'productName'.
           */
  var _productName: js.UndefOr[Element] = js.undefined
  /**
           * Instructions or additional information about the oral supplement
           */
  var instruction: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Product or brand name of the nutritional supplement
           */
  var productName: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Amount of the nutritional supplement
           */
  var quantity: js.UndefOr[Quantity] = js.undefined
  /**
           * Scheduled frequency of supplement
           */
  var schedule: js.UndefOr[js.Array[Timing]] = js.undefined
  /**
           * Type of supplement product requested
           */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
}

