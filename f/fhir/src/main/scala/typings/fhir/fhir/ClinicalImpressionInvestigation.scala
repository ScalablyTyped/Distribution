package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * One or more sets of investigations (signs, symptions, etc.)
  */
trait ClinicalImpressionInvestigation extends BackboneElement {
  /**
    * A name/code for the set
    */
  var code: CodeableConcept
  /**
    * Record of a specific investigation
    */
  var item: js.UndefOr[js.Array[Reference]] = js.undefined
}

object ClinicalImpressionInvestigation {
  @scala.inline
  def apply(
    code: CodeableConcept,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    item: js.Array[Reference] = null,
    modifierExtension: js.Array[Extension] = null
  ): ClinicalImpressionInvestigation = {
    val __obj = js.Dynamic.literal(code = code)
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (item != null) __obj.updateDynamic("item")(item)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    __obj.asInstanceOf[ClinicalImpressionInvestigation]
  }
}

