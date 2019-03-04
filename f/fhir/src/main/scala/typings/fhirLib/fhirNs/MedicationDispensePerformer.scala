package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Who performed event
  */
trait MedicationDispensePerformer extends BackboneElement {
  /**
    * Individual who was performing
    */
  var actor: Reference
  /**
    * Organization organization was acting for
    */
  var onBehalfOf: js.UndefOr[Reference] = js.undefined
}

object MedicationDispensePerformer {
  @scala.inline
  def apply(
    actor: Reference,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[java.lang.String] = null,
    id: java.lang.String = null,
    modifierExtension: js.Array[Extension] = null,
    onBehalfOf: Reference = null
  ): MedicationDispensePerformer = {
    val __obj = js.Dynamic.literal(actor = actor)
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (onBehalfOf != null) __obj.updateDynamic("onBehalfOf")(onBehalfOf)
    __obj.asInstanceOf[MedicationDispensePerformer]
  }
}

