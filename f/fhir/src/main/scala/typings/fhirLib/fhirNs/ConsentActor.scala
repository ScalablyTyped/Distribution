package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Who|what controlled by this consent (or group, by role)
  */
trait ConsentActor extends BackboneElement {
  /**
    * Resource for the actor (or group, by role)
    */
  var reference: Reference
  /**
    * How the actor is involved
    */
  var role: CodeableConcept
}

object ConsentActor {
  @scala.inline
  def apply(
    reference: Reference,
    role: CodeableConcept,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[java.lang.String] = null,
    id: java.lang.String = null,
    modifierExtension: js.Array[Extension] = null
  ): ConsentActor = {
    val __obj = js.Dynamic.literal(reference = reference, role = role)
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    __obj.asInstanceOf[ConsentActor]
  }
}

