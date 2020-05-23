package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The list of diagnosis relevant to this encounter
  */
trait EncounterDiagnosis extends BackboneElement {
  /**
    * Contains extended information for property 'rank'.
    */
  var _rank: js.UndefOr[Element] = js.undefined
  /**
    * Reason the encounter takes place (resource)
    */
  var condition: Reference
  /**
    * Ranking of the diagnosis (for each role type)
    */
  var rank: js.UndefOr[positiveInt] = js.undefined
  /**
    * Role that this diagnosis has within the encounter (e.g. admission, billing, discharge …)
    */
  var role: js.UndefOr[CodeableConcept] = js.undefined
}

object EncounterDiagnosis {
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
    rank: js.UndefOr[positiveInt] = js.undefined,
    role: CodeableConcept = null
  ): EncounterDiagnosis = {
    val __obj = js.Dynamic.literal(condition = condition.asInstanceOf[js.Any])
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_rank != null) __obj.updateDynamic("_rank")(_rank.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (!js.isUndefined(rank)) __obj.updateDynamic("rank")(rank.get.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncounterDiagnosis]
  }
}

