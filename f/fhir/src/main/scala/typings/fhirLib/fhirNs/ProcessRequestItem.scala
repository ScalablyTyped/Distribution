package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Items to re-adjudicate
  */
trait ProcessRequestItem extends BackboneElement {
  /**
    * Contains extended information for property 'sequenceLinkId'.
    */
  var _sequenceLinkId: js.UndefOr[Element] = js.undefined
  /**
    * Service instance
    */
  var sequenceLinkId: integer
}

object ProcessRequestItem {
  @scala.inline
  def apply(
    sequenceLinkId: integer,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _sequenceLinkId: Element = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[java.lang.String] = null,
    id: java.lang.String = null,
    modifierExtension: js.Array[Extension] = null
  ): ProcessRequestItem = {
    val __obj = js.Dynamic.literal(sequenceLinkId = sequenceLinkId)
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_sequenceLinkId != null) __obj.updateDynamic("_sequenceLinkId")(_sequenceLinkId)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    __obj.asInstanceOf[ProcessRequestItem]
  }
}

