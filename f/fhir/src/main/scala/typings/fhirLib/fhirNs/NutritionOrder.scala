package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Diet, formula or nutritional supplement request
  */
trait NutritionOrder extends DomainResource {
  /**
    * Contains extended information for property 'dateTime'.
    */
  var _dateTime: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.undefined
  /**
    * List of the patient's food and nutrition-related allergies and intolerances
    */
  var allergyIntolerance: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
    * Date and time the nutrition order was requested
    */
  var dateTime: dateTime
  /**
    * The encounter associated with this nutrition order
    */
  var encounter: js.UndefOr[Reference] = js.undefined
  /**
    * Enteral formula components
    */
  var enteralFormula: js.UndefOr[NutritionOrderEnteralFormula] = js.undefined
  /**
    * Order-specific modifier about the type of food that should not be given
    */
  var excludeFoodModifier: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
    * Order-specific modifier about the type of food that should be given
    */
  var foodPreferenceModifier: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
    * Identifiers assigned to this order
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  /**
    * Oral diet components
    */
  var oralDiet: js.UndefOr[NutritionOrderOralDiet] = js.undefined
  /**
    * Who ordered the diet, formula or nutritional supplement
    */
  var orderer: js.UndefOr[Reference] = js.undefined
  /**
    * The person who requires the diet, formula or nutritional supplement
    */
  var patient: Reference
  /**
    * proposed | draft | planned | requested | active | on-hold | completed | cancelled | entered-in-error
    */
  var status: js.UndefOr[code] = js.undefined
  /**
    * Supplement components
    */
  var supplement: js.UndefOr[js.Array[NutritionOrderSupplement]] = js.undefined
}

