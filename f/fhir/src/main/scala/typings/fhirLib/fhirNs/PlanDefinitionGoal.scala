package typings
package fhirLib.fhirNs

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

