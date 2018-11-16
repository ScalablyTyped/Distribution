package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Enteral formula components
     */

trait NutritionOrderEnteralFormula extends BackboneElement {
  /**
           * Contains extended information for property 'additiveProductName'.
           */
  var _additiveProductName: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'administrationInstruction'.
           */
  var _administrationInstruction: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'baseFormulaProductName'.
           */
  var _baseFormulaProductName: js.UndefOr[Element] = js.undefined
  /**
           * Product or brand name of the modular additive
           */
  var additiveProductName: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Type of modular component to add to the feeding
           */
  var additiveType: js.UndefOr[CodeableConcept] = js.undefined
  /**
           * Formula feeding instruction as structured data
           */
  var administration: js.UndefOr[js.Array[NutritionOrderEnteralFormulaAdministration]] = js.undefined
  /**
           * Formula feeding instructions expressed as text
           */
  var administrationInstruction: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Product or brand name of the enteral or infant formula
           */
  var baseFormulaProductName: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Type of enteral or infant formula
           */
  var baseFormulaType: js.UndefOr[CodeableConcept] = js.undefined
  /**
           * Amount of energy per specified volume that is required
           */
  var caloricDensity: js.UndefOr[Quantity] = js.undefined
  /**
           * Upper limit on formula volume per unit of time
           */
  var maxVolumeToDeliver: js.UndefOr[Quantity] = js.undefined
  /**
           * How the formula should enter the patient's gastrointestinal tract
           */
  var routeofAdministration: js.UndefOr[CodeableConcept] = js.undefined
}

