package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A homogeneous material with a definite composition
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ trait Substance extends DomainResource {
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.undefined
  /**
    * What class/type of substance this is
    */
  var category: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
    * What substance this is
    */
  var code: CodeableConcept
  /**
    * Textual description of the substance, comments
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * Unique identifier
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  /**
    * Composition information about the substance
    */
  var ingredient: js.UndefOr[js.Array[SubstanceIngredient]] = js.undefined
  /**
    * If this describes a specific package/container of the substance
    */
  var instance: js.UndefOr[js.Array[SubstanceInstance]] = js.undefined
  /**
    * active | inactive | entered-in-error
    */
  var status: js.UndefOr[code] = js.undefined
}

object Substance {
  @scala.inline
  def apply(
    code: CodeableConcept,
    _description: Element = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _resourceType: Element = null,
    _status: Element = null,
    category: js.Array[CodeableConcept] = null,
    contained: js.Array[Resource] = null,
    description: String = null,
    extension: js.Array[Extension] = null,
    id: id = null,
    identifier: js.Array[Identifier] = null,
    implicitRules: uri = null,
    ingredient: js.Array[SubstanceIngredient] = null,
    instance: js.Array[SubstanceInstance] = null,
    language: code = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    resourceType: code = null,
    status: code = null,
    text: Narrative = null
  ): Substance = {
    val __obj = js.Dynamic.literal(code = code)
    if (_description != null) __obj.updateDynamic("_description")(_description)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules)
    if (_language != null) __obj.updateDynamic("_language")(_language)
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType)
    if (_status != null) __obj.updateDynamic("_status")(_status)
    if (category != null) __obj.updateDynamic("category")(category)
    if (contained != null) __obj.updateDynamic("contained")(contained)
    if (description != null) __obj.updateDynamic("description")(description)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (id != null) __obj.updateDynamic("id")(id)
    if (identifier != null) __obj.updateDynamic("identifier")(identifier)
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules)
    if (ingredient != null) __obj.updateDynamic("ingredient")(ingredient)
    if (instance != null) __obj.updateDynamic("instance")(instance)
    if (language != null) __obj.updateDynamic("language")(language)
    if (meta != null) __obj.updateDynamic("meta")(meta)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType)
    if (status != null) __obj.updateDynamic("status")(status)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[Substance]
  }
}

