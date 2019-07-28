package typings.fhir.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A resource with narrative, extensions, and contained resources
  */
trait DomainResource
  extends ResourceBase
     with Resource {
  /**
    * Contained, inline Resources
    */
  var contained: js.UndefOr[js.Array[Resource]] = js.undefined
  /**
    * Additional Content defined by implementations
    */
  var extension: js.UndefOr[js.Array[Extension]] = js.undefined
  /**
    * Extensions that cannot be ignored
    */
  var modifierExtension: js.UndefOr[js.Array[Extension]] = js.undefined
  /**
    * Text summary of the resource, for human interpretation
    */
  var text: js.UndefOr[Narrative] = js.undefined
}

object DomainResource {
  @scala.inline
  def apply(
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _resourceType: Element = null,
    contained: js.Array[Resource] = null,
    extension: js.Array[Extension] = null,
    id: id = null,
    implicitRules: uri = null,
    language: code = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    resourceType: code = null,
    text: Narrative = null
  ): DomainResource = {
    val __obj = js.Dynamic.literal()
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules)
    if (_language != null) __obj.updateDynamic("_language")(_language)
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType)
    if (contained != null) __obj.updateDynamic("contained")(contained)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (id != null) __obj.updateDynamic("id")(id)
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules)
    if (language != null) __obj.updateDynamic("language")(language)
    if (meta != null) __obj.updateDynamic("meta")(meta)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[DomainResource]
  }
}

