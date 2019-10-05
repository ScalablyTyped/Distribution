package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Item to be linked
  */
trait LinkageItem extends BackboneElement {
  /**
    * Contains extended information for property 'type'.
    */
  var _type: js.UndefOr[Element] = js.undefined
  /**
    * Resource being linked
    */
  var resource: Reference
  /**
    * source | alternate | historical
    */
  var `type`: code
}

object LinkageItem {
  @scala.inline
  def apply(
    resource: Reference,
    `type`: code,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _type: Element = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    modifierExtension: js.Array[Extension] = null
  ): LinkageItem = {
    val __obj = js.Dynamic.literal(resource = resource)
    __obj.updateDynamic("type")(`type`)
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_type != null) __obj.updateDynamic("_type")(_type)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    __obj.asInstanceOf[LinkageItem]
  }
}

