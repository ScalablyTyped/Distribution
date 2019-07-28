package typings.fhir.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Administration/non-administration reasons
  */
trait ImmunizationExplanation extends BackboneElement {
  /**
    * Why immunization occurred
    */
  var reason: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
    * Why immunization did not occur
    */
  var reasonNotGiven: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
}

object ImmunizationExplanation {
  @scala.inline
  def apply(
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    modifierExtension: js.Array[Extension] = null,
    reason: js.Array[CodeableConcept] = null,
    reasonNotGiven: js.Array[CodeableConcept] = null
  ): ImmunizationExplanation = {
    val __obj = js.Dynamic.literal()
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (reason != null) __obj.updateDynamic("reason")(reason)
    if (reasonNotGiven != null) __obj.updateDynamic("reasonNotGiven")(reasonNotGiven)
    __obj.asInstanceOf[ImmunizationExplanation]
  }
}

