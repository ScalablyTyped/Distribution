package typings.fhir.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Supporting evidence
  */
trait ConditionEvidence extends BackboneElement {
  /**
    * Manifestation/symptom
    */
  var code: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
    * Supporting information found elsewhere
    */
  var detail: js.UndefOr[js.Array[Reference]] = js.undefined
}

object ConditionEvidence {
  @scala.inline
  def apply(
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    code: js.Array[CodeableConcept] = null,
    detail: js.Array[Reference] = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    modifierExtension: js.Array[Extension] = null
  ): ConditionEvidence = {
    val __obj = js.Dynamic.literal()
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (code != null) __obj.updateDynamic("code")(code)
    if (detail != null) __obj.updateDynamic("detail")(detail)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    __obj.asInstanceOf[ConditionEvidence]
  }
}

