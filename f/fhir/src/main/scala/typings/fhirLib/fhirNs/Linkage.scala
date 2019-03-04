package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Links records for 'same' item
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- fhirLib.fhirNs.Resource because Already inherited */ trait Linkage extends DomainResource {
  /**
    * Contains extended information for property 'active'.
    */
  var _active: js.UndefOr[Element] = js.undefined
  /**
    * Whether this linkage assertion is active or not
    */
  var active: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Who is responsible for linkages
    */
  var author: js.UndefOr[Reference] = js.undefined
  /**
    * Item to be linked
    */
  var item: js.Array[LinkageItem]
}

object Linkage {
  @scala.inline
  def apply(
    item: js.Array[LinkageItem],
    _active: Element = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _resourceType: Element = null,
    active: js.UndefOr[scala.Boolean] = js.undefined,
    author: Reference = null,
    contained: js.Array[Resource] = null,
    extension: js.Array[Extension] = null,
    id: id = null,
    implicitRules: uri = null,
    language: code = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    resourceType: code = null,
    text: Narrative = null
  ): Linkage = {
    val __obj = js.Dynamic.literal(item = item)
    if (_active != null) __obj.updateDynamic("_active")(_active)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules)
    if (_language != null) __obj.updateDynamic("_language")(_language)
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType)
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (author != null) __obj.updateDynamic("author")(author)
    if (contained != null) __obj.updateDynamic("contained")(contained)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (id != null) __obj.updateDynamic("id")(id)
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules)
    if (language != null) __obj.updateDynamic("language")(language)
    if (meta != null) __obj.updateDynamic("meta")(meta)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[Linkage]
  }
}

