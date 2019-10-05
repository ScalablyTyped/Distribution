package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The list of diagnosis relevant to this episode of care
  */
trait EpisodeOfCareDiagnosis extends BackboneElement {
  /**
    * Contains extended information for property 'rank'.
    */
  var _rank: js.UndefOr[Element] = js.undefined
  /**
    * Conditions/problems/diagnoses this episode of care is for
    */
  var condition: Reference
  /**
    * Ranking of the diagnosis (for each role type)
    */
  var rank: js.UndefOr[positiveInt] = js.undefined
  /**
    * Role that this diagnosis has within the episode of care (e.g. admission, billing, discharge …)
    */
  var role: js.UndefOr[CodeableConcept] = js.undefined
}

object EpisodeOfCareDiagnosis {
  @scala.inline
  def apply(
    condition: Reference,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _rank: Element = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    modifierExtension: js.Array[Extension] = null,
    rank: Int | Double = null,
    role: CodeableConcept = null
  ): EpisodeOfCareDiagnosis = {
    val __obj = js.Dynamic.literal(condition = condition)
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_rank != null) __obj.updateDynamic("_rank")(_rank)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (rank != null) __obj.updateDynamic("rank")(rank.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role)
    __obj.asInstanceOf[EpisodeOfCareDiagnosis]
  }
}

