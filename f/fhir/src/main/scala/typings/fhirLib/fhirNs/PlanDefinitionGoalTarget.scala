package typings
package fhirLib.fhirNs

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

