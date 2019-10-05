package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Specific and identified anatomical location
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ trait BodySite extends DomainResource {
  /**
    * Contains extended information for property 'active'.
    */
  var _active: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.undefined
  /**
    * Whether this body site record is in active use
    */
  var active: js.UndefOr[Boolean] = js.undefined
  /**
    * Named anatomical location
    */
  var code: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * Anatomical location description
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * Bodysite identifier
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  /**
    * Attached images
    */
  var image: js.UndefOr[js.Array[Attachment]] = js.undefined
  /**
    * Who this is about
    */
  var patient: Reference
  /**
    * Modification to location code
    */
  var qualifier: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
}

object BodySite {
  @scala.inline
  def apply(
    patient: Reference,
    _active: Element = null,
    _description: Element = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _resourceType: Element = null,
    active: js.UndefOr[Boolean] = js.undefined,
    code: CodeableConcept = null,
    contained: js.Array[Resource] = null,
    description: String = null,
    extension: js.Array[Extension] = null,
    id: id = null,
    identifier: js.Array[Identifier] = null,
    image: js.Array[Attachment] = null,
    implicitRules: uri = null,
    language: code = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    qualifier: js.Array[CodeableConcept] = null,
    resourceType: code = null,
    text: Narrative = null
  ): BodySite = {
    val __obj = js.Dynamic.literal(patient = patient)
    if (_active != null) __obj.updateDynamic("_active")(_active)
    if (_description != null) __obj.updateDynamic("_description")(_description)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules)
    if (_language != null) __obj.updateDynamic("_language")(_language)
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType)
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (code != null) __obj.updateDynamic("code")(code)
    if (contained != null) __obj.updateDynamic("contained")(contained)
    if (description != null) __obj.updateDynamic("description")(description)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (id != null) __obj.updateDynamic("id")(id)
    if (identifier != null) __obj.updateDynamic("identifier")(identifier)
    if (image != null) __obj.updateDynamic("image")(image)
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules)
    if (language != null) __obj.updateDynamic("language")(language)
    if (meta != null) __obj.updateDynamic("meta")(meta)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (qualifier != null) __obj.updateDynamic("qualifier")(qualifier)
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[BodySite]
  }
}

