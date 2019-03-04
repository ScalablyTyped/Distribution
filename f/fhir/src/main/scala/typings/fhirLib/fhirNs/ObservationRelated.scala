package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Resource related to this observation
  */
trait ObservationRelated extends BackboneElement {
  /**
    * Contains extended information for property 'type'.
    */
  var _type: js.UndefOr[Element] = js.undefined
  /**
    * Resource that is related to this one
    */
  var target: Reference
  /**
    * has-member | derived-from | sequel-to | replaces | qualified-by | interfered-by
    */
  var `type`: js.UndefOr[code] = js.undefined
}

object ObservationRelated {
  @scala.inline
  def apply(
    target: Reference,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _type: Element = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[java.lang.String] = null,
    id: java.lang.String = null,
    modifierExtension: js.Array[Extension] = null,
    `type`: code = null
  ): ObservationRelated = {
    val __obj = js.Dynamic.literal(target = target)
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_type != null) __obj.updateDynamic("_type")(_type)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ObservationRelated]
  }
}

