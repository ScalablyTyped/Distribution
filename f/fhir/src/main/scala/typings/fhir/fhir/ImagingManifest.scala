package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Key Object Selection
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ trait ImagingManifest extends DomainResource {
  /**
    * Contains extended information for property 'authoringTime'.
    */
  var _authoringTime: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.undefined
  /**
    * Author (human or machine)
    */
  var author: js.UndefOr[Reference] = js.undefined
  /**
    * Time when the selection of instances was made
    */
  var authoringTime: js.UndefOr[dateTime] = js.undefined
  /**
    * Description text
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * SOP Instance UID
    */
  var identifier: js.UndefOr[Identifier] = js.undefined
  /**
    * Patient of the selected objects
    */
  var patient: Reference
  /**
    * Study identity of the selected instances
    */
  var study: js.Array[ImagingManifestStudy]
}

object ImagingManifest {
  @scala.inline
  def apply(
    patient: Reference,
    study: js.Array[ImagingManifestStudy],
    _authoringTime: Element = null,
    _description: Element = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _resourceType: Element = null,
    author: Reference = null,
    authoringTime: dateTime = null,
    contained: js.Array[Resource] = null,
    description: String = null,
    extension: js.Array[Extension] = null,
    id: id = null,
    identifier: Identifier = null,
    implicitRules: uri = null,
    language: code = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    resourceType: code = null,
    text: Narrative = null
  ): ImagingManifest = {
    val __obj = js.Dynamic.literal(patient = patient, study = study)
    if (_authoringTime != null) __obj.updateDynamic("_authoringTime")(_authoringTime)
    if (_description != null) __obj.updateDynamic("_description")(_description)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules)
    if (_language != null) __obj.updateDynamic("_language")(_language)
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType)
    if (author != null) __obj.updateDynamic("author")(author)
    if (authoringTime != null) __obj.updateDynamic("authoringTime")(authoringTime)
    if (contained != null) __obj.updateDynamic("contained")(contained)
    if (description != null) __obj.updateDynamic("description")(description)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (id != null) __obj.updateDynamic("id")(id)
    if (identifier != null) __obj.updateDynamic("identifier")(identifier)
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules)
    if (language != null) __obj.updateDynamic("language")(language)
    if (meta != null) __obj.updateDynamic("meta")(meta)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[ImagingManifest]
  }
}

