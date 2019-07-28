package typings.fhir.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Stage/grade, usually assessed formally
  */
trait ConditionStage extends BackboneElement {
  /**
    * Formal record of assessment
    */
  var assessment: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
    * Simple summary (disease specific)
    */
  var summary: js.UndefOr[CodeableConcept] = js.undefined
}

object ConditionStage {
  @scala.inline
  def apply(
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    assessment: js.Array[Reference] = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    modifierExtension: js.Array[Extension] = null,
    summary: CodeableConcept = null
  ): ConditionStage = {
    val __obj = js.Dynamic.literal()
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (assessment != null) __obj.updateDynamic("assessment")(assessment)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (summary != null) __obj.updateDynamic("summary")(summary)
    __obj.asInstanceOf[ConditionStage]
  }
}

