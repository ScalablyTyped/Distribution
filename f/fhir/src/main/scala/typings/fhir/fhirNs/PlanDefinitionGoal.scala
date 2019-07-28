package typings.fhir.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * What the plan is trying to accomplish
  */
trait PlanDefinitionGoal extends BackboneElement {
  /**
    * What does the goal address
    */
  var addresses: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
    * E.g. Treatment, dietary, behavioral, etc
    */
  var category: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * Code or text describing the goal
    */
  var description: CodeableConcept
  /**
    * Supporting documentation for the goal
    */
  var documentation: js.UndefOr[js.Array[RelatedArtifact]] = js.undefined
  /**
    * high-priority | medium-priority | low-priority
    */
  var priority: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * When goal pursuit begins
    */
  var start: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * Target outcome for the goal
    */
  var target: js.UndefOr[js.Array[PlanDefinitionGoalTarget]] = js.undefined
}

object PlanDefinitionGoal {
  @scala.inline
  def apply(
    description: CodeableConcept,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    addresses: js.Array[CodeableConcept] = null,
    category: CodeableConcept = null,
    documentation: js.Array[RelatedArtifact] = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    modifierExtension: js.Array[Extension] = null,
    priority: CodeableConcept = null,
    start: CodeableConcept = null,
    target: js.Array[PlanDefinitionGoalTarget] = null
  ): PlanDefinitionGoal = {
    val __obj = js.Dynamic.literal(description = description)
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (addresses != null) __obj.updateDynamic("addresses")(addresses)
    if (category != null) __obj.updateDynamic("category")(category)
    if (documentation != null) __obj.updateDynamic("documentation")(documentation)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (priority != null) __obj.updateDynamic("priority")(priority)
    if (start != null) __obj.updateDynamic("start")(start)
    if (target != null) __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[PlanDefinitionGoal]
  }
}

