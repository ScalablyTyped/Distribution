package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Target outcome for the goal
  */
trait PlanDefinitionGoalTarget extends BackboneElement {
  /**
    * The target value to be achieved
    */
  var detailCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * The target value to be achieved
    */
  var detailQuantity: js.UndefOr[Quantity] = js.undefined
  /**
    * The target value to be achieved
    */
  var detailRange: js.UndefOr[Range] = js.undefined
  /**
    * Reach goal within
    */
  var due: js.UndefOr[Duration] = js.undefined
  /**
    * The parameter whose value is to be tracked
    */
  var measure: js.UndefOr[CodeableConcept] = js.undefined
}

object PlanDefinitionGoalTarget {
  @scala.inline
  def apply(
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    detailCodeableConcept: CodeableConcept = null,
    detailQuantity: Quantity = null,
    detailRange: Range = null,
    due: Duration = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    measure: CodeableConcept = null,
    modifierExtension: js.Array[Extension] = null
  ): PlanDefinitionGoalTarget = {
    val __obj = js.Dynamic.literal()
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (detailCodeableConcept != null) __obj.updateDynamic("detailCodeableConcept")(detailCodeableConcept.asInstanceOf[js.Any])
    if (detailQuantity != null) __obj.updateDynamic("detailQuantity")(detailQuantity.asInstanceOf[js.Any])
    if (detailRange != null) __obj.updateDynamic("detailRange")(detailRange.asInstanceOf[js.Any])
    if (due != null) __obj.updateDynamic("due")(due.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (measure != null) __obj.updateDynamic("measure")(measure.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlanDefinitionGoalTarget]
  }
}

