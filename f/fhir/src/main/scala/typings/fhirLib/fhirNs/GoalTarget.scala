package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Target outcome for the goal
  */
trait GoalTarget extends BackboneElement {
  /**
    * Contains extended information for property 'dueDate'.
    */
  var _dueDate: js.UndefOr[Element] = js.undefined
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
    * Reach goal on or before
    */
  var dueDate: js.UndefOr[date] = js.undefined
  /**
    * Reach goal on or before
    */
  var dueDuration: js.UndefOr[Duration] = js.undefined
  /**
    * The parameter whose value is being tracked
    */
  var measure: js.UndefOr[CodeableConcept] = js.undefined
}

object GoalTarget {
  @scala.inline
  def apply(
    _dueDate: Element = null,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    detailCodeableConcept: CodeableConcept = null,
    detailQuantity: Quantity = null,
    detailRange: Range = null,
    dueDate: date = null,
    dueDuration: Duration = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[java.lang.String] = null,
    id: java.lang.String = null,
    measure: CodeableConcept = null,
    modifierExtension: js.Array[Extension] = null
  ): GoalTarget = {
    val __obj = js.Dynamic.literal()
    if (_dueDate != null) __obj.updateDynamic("_dueDate")(_dueDate)
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (detailCodeableConcept != null) __obj.updateDynamic("detailCodeableConcept")(detailCodeableConcept)
    if (detailQuantity != null) __obj.updateDynamic("detailQuantity")(detailQuantity)
    if (detailRange != null) __obj.updateDynamic("detailRange")(detailRange)
    if (dueDate != null) __obj.updateDynamic("dueDate")(dueDate)
    if (dueDuration != null) __obj.updateDynamic("dueDuration")(dueDuration)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (measure != null) __obj.updateDynamic("measure")(measure)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    __obj.asInstanceOf[GoalTarget]
  }
}

