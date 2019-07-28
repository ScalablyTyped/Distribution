package typings.fhir.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Any restrictions on medication substitution
  */
trait MedicationRequestSubstitution extends BackboneElement {
  /**
    * Contains extended information for property 'allowed'.
    */
  var _allowed: js.UndefOr[Element] = js.undefined
  /**
    * Whether substitution is allowed or not
    */
  var allowed: Boolean
  /**
    * Why should (not) substitution be made
    */
  var reason: js.UndefOr[CodeableConcept] = js.undefined
}

object MedicationRequestSubstitution {
  @scala.inline
  def apply(
    allowed: Boolean,
    _allowed: Element = null,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    modifierExtension: js.Array[Extension] = null,
    reason: CodeableConcept = null
  ): MedicationRequestSubstitution = {
    val __obj = js.Dynamic.literal(allowed = allowed)
    if (_allowed != null) __obj.updateDynamic("_allowed")(_allowed)
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (reason != null) __obj.updateDynamic("reason")(reason)
    __obj.asInstanceOf[MedicationRequestSubstitution]
  }
}

