package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Device changed in procedure
  */
trait ProcedureFocalDevice extends BackboneElement {
  /**
    * Kind of change to device
    */
  var action: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * Device that was changed
    */
  var manipulated: Reference
}

object ProcedureFocalDevice {
  @scala.inline
  def apply(
    manipulated: Reference,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    action: CodeableConcept = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[java.lang.String] = null,
    id: java.lang.String = null,
    modifierExtension: js.Array[Extension] = null
  ): ProcedureFocalDevice = {
    val __obj = js.Dynamic.literal(manipulated = manipulated)
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (action != null) __obj.updateDynamic("action")(action)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    __obj.asInstanceOf[ProcedureFocalDevice]
  }
}

