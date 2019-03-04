package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Diet, formula or nutritional supplement request
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- fhirLib.fhirNs.Resource because Already inherited */ trait NutritionOrder extends DomainResource {
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

object NutritionOrder {
  @scala.inline
  def apply(
    dateTime: dateTime,
    patient: Reference,
    _dateTime: Element = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _resourceType: Element = null,
    _status: Element = null,
    allergyIntolerance: js.Array[Reference] = null,
    contained: js.Array[Resource] = null,
    encounter: Reference = null,
    enteralFormula: NutritionOrderEnteralFormula = null,
    excludeFoodModifier: js.Array[CodeableConcept] = null,
    extension: js.Array[Extension] = null,
    foodPreferenceModifier: js.Array[CodeableConcept] = null,
    id: id = null,
    identifier: js.Array[Identifier] = null,
    implicitRules: uri = null,
    language: code = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    oralDiet: NutritionOrderOralDiet = null,
    orderer: Reference = null,
    resourceType: code = null,
    status: code = null,
    supplement: js.Array[NutritionOrderSupplement] = null,
    text: Narrative = null
  ): NutritionOrder = {
    val __obj = js.Dynamic.literal(dateTime = dateTime, patient = patient)
    if (_dateTime != null) __obj.updateDynamic("_dateTime")(_dateTime)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules)
    if (_language != null) __obj.updateDynamic("_language")(_language)
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType)
    if (_status != null) __obj.updateDynamic("_status")(_status)
    if (allergyIntolerance != null) __obj.updateDynamic("allergyIntolerance")(allergyIntolerance)
    if (contained != null) __obj.updateDynamic("contained")(contained)
    if (encounter != null) __obj.updateDynamic("encounter")(encounter)
    if (enteralFormula != null) __obj.updateDynamic("enteralFormula")(enteralFormula)
    if (excludeFoodModifier != null) __obj.updateDynamic("excludeFoodModifier")(excludeFoodModifier)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (foodPreferenceModifier != null) __obj.updateDynamic("foodPreferenceModifier")(foodPreferenceModifier)
    if (id != null) __obj.updateDynamic("id")(id)
    if (identifier != null) __obj.updateDynamic("identifier")(identifier)
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules)
    if (language != null) __obj.updateDynamic("language")(language)
    if (meta != null) __obj.updateDynamic("meta")(meta)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (oralDiet != null) __obj.updateDynamic("oralDiet")(oralDiet)
    if (orderer != null) __obj.updateDynamic("orderer")(orderer)
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType)
    if (status != null) __obj.updateDynamic("status")(status)
    if (supplement != null) __obj.updateDynamic("supplement")(supplement)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[NutritionOrder]
  }
}

