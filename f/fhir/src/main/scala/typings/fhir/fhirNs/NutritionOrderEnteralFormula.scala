package typings.fhir.fhirNs

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
  var additiveProductName: js.UndefOr[String] = js.undefined
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
  var administrationInstruction: js.UndefOr[String] = js.undefined
  /**
    * Product or brand name of the enteral or infant formula
    */
  var baseFormulaProductName: js.UndefOr[String] = js.undefined
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

object NutritionOrderEnteralFormula {
  @scala.inline
  def apply(
    _additiveProductName: Element = null,
    _administrationInstruction: Element = null,
    _baseFormulaProductName: Element = null,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    additiveProductName: String = null,
    additiveType: CodeableConcept = null,
    administration: js.Array[NutritionOrderEnteralFormulaAdministration] = null,
    administrationInstruction: String = null,
    baseFormulaProductName: String = null,
    baseFormulaType: CodeableConcept = null,
    caloricDensity: Quantity = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    maxVolumeToDeliver: Quantity = null,
    modifierExtension: js.Array[Extension] = null,
    routeofAdministration: CodeableConcept = null
  ): NutritionOrderEnteralFormula = {
    val __obj = js.Dynamic.literal()
    if (_additiveProductName != null) __obj.updateDynamic("_additiveProductName")(_additiveProductName)
    if (_administrationInstruction != null) __obj.updateDynamic("_administrationInstruction")(_administrationInstruction)
    if (_baseFormulaProductName != null) __obj.updateDynamic("_baseFormulaProductName")(_baseFormulaProductName)
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (additiveProductName != null) __obj.updateDynamic("additiveProductName")(additiveProductName)
    if (additiveType != null) __obj.updateDynamic("additiveType")(additiveType)
    if (administration != null) __obj.updateDynamic("administration")(administration)
    if (administrationInstruction != null) __obj.updateDynamic("administrationInstruction")(administrationInstruction)
    if (baseFormulaProductName != null) __obj.updateDynamic("baseFormulaProductName")(baseFormulaProductName)
    if (baseFormulaType != null) __obj.updateDynamic("baseFormulaType")(baseFormulaType)
    if (caloricDensity != null) __obj.updateDynamic("caloricDensity")(caloricDensity)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (maxVolumeToDeliver != null) __obj.updateDynamic("maxVolumeToDeliver")(maxVolumeToDeliver)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (routeofAdministration != null) __obj.updateDynamic("routeofAdministration")(routeofAdministration)
    __obj.asInstanceOf[NutritionOrderEnteralFormula]
  }
}

