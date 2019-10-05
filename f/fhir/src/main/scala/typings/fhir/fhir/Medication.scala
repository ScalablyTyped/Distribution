package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Definition of a Medication
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
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
    * Details about packaged medications
    */
  var `package`: js.UndefOr[MedicationPackage] = js.undefined
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
    `package`: MedicationPackage = null,
    resourceType: code = null,
    status: code = null,
    text: Narrative = null
  ): Medication = {
    val __obj = js.Dynamic.literal()
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules)
    if (_isBrand != null) __obj.updateDynamic("_isBrand")(_isBrand)
    if (_isOverTheCounter != null) __obj.updateDynamic("_isOverTheCounter")(_isOverTheCounter)
    if (_language != null) __obj.updateDynamic("_language")(_language)
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType)
    if (_status != null) __obj.updateDynamic("_status")(_status)
    if (code != null) __obj.updateDynamic("code")(code)
    if (contained != null) __obj.updateDynamic("contained")(contained)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (form != null) __obj.updateDynamic("form")(form)
    if (id != null) __obj.updateDynamic("id")(id)
    if (image != null) __obj.updateDynamic("image")(image)
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules)
    if (ingredient != null) __obj.updateDynamic("ingredient")(ingredient)
    if (!js.isUndefined(isBrand)) __obj.updateDynamic("isBrand")(isBrand)
    if (!js.isUndefined(isOverTheCounter)) __obj.updateDynamic("isOverTheCounter")(isOverTheCounter)
    if (language != null) __obj.updateDynamic("language")(language)
    if (manufacturer != null) __obj.updateDynamic("manufacturer")(manufacturer)
    if (meta != null) __obj.updateDynamic("meta")(meta)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (`package` != null) __obj.updateDynamic("package")(`package`)
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType)
    if (status != null) __obj.updateDynamic("status")(status)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[Medication]
  }
}

