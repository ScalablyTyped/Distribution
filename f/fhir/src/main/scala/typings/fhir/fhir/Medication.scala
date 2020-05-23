package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Definition of a Medication
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ trait Medication extends DomainResource {
  /**
    * Contains extended information for property 'isBrand'.
    */
  var _isBrand: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'isOverTheCounter'.
    */
  var _isOverTheCounter: js.UndefOr[Element] = js.undefined
  /**
    * Details about packaged medications
    */
  @JSName("package")
  var _package: js.UndefOr[MedicationPackage] = js.undefined
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.undefined
  /**
    * Codes that identify this medication
    */
  var code: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * powder | tablets | capsule +
    */
  var form: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * Picture of the medication
    */
  var image: js.UndefOr[js.Array[Attachment]] = js.undefined
  /**
    * Active or inactive ingredient
    */
  var ingredient: js.UndefOr[js.Array[MedicationIngredient]] = js.undefined
  /**
    * True if a brand
    */
  var isBrand: js.UndefOr[Boolean] = js.undefined
  /**
    * True if medication does not require a prescription
    */
  var isOverTheCounter: js.UndefOr[Boolean] = js.undefined
  /**
    * Manufacturer of the item
    */
  var manufacturer: js.UndefOr[Reference] = js.undefined
  /**
    * active | inactive | entered-in-error
    */
  var status: js.UndefOr[code] = js.undefined
}

object Medication {
  @scala.inline
  def apply(
    _id: Element = null,
    _implicitRules: Element = null,
    _isBrand: Element = null,
    _isOverTheCounter: Element = null,
    _language: Element = null,
    _package: MedicationPackage = null,
    _resourceType: Element = null,
    _status: Element = null,
    code: CodeableConcept = null,
    contained: js.Array[Resource] = null,
    extension: js.Array[Extension] = null,
    form: CodeableConcept = null,
    id: id = null,
    image: js.Array[Attachment] = null,
    implicitRules: uri = null,
    ingredient: js.Array[MedicationIngredient] = null,
    isBrand: js.UndefOr[Boolean] = js.undefined,
    isOverTheCounter: js.UndefOr[Boolean] = js.undefined,
    language: code = null,
    manufacturer: Reference = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    resourceType: code = null,
    status: code = null,
    text: Narrative = null
  ): Medication = {
    val __obj = js.Dynamic.literal()
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules.asInstanceOf[js.Any])
    if (_isBrand != null) __obj.updateDynamic("_isBrand")(_isBrand.asInstanceOf[js.Any])
    if (_isOverTheCounter != null) __obj.updateDynamic("_isOverTheCounter")(_isOverTheCounter.asInstanceOf[js.Any])
    if (_language != null) __obj.updateDynamic("_language")(_language.asInstanceOf[js.Any])
    if (_package != null) __obj.updateDynamic("package")(_package.asInstanceOf[js.Any])
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType.asInstanceOf[js.Any])
    if (_status != null) __obj.updateDynamic("_status")(_status.asInstanceOf[js.Any])
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (contained != null) __obj.updateDynamic("contained")(contained.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (form != null) __obj.updateDynamic("form")(form.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules.asInstanceOf[js.Any])
    if (ingredient != null) __obj.updateDynamic("ingredient")(ingredient.asInstanceOf[js.Any])
    if (!js.isUndefined(isBrand)) __obj.updateDynamic("isBrand")(isBrand.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isOverTheCounter)) __obj.updateDynamic("isOverTheCounter")(isOverTheCounter.get.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (manufacturer != null) __obj.updateDynamic("manufacturer")(manufacturer.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Medication]
  }
}

