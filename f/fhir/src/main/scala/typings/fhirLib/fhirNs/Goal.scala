package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Describes the intended objective(s) for a patient, group or organization
     */

trait Goal extends DomainResource {
  /**
           * Contains extended information for property 'startDate'.
           */
  var _startDate: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'status'.
           */
  var _status: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'statusDate'.
           */
  var _statusDate: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'statusReason'.
           */
  var _statusReason: js.UndefOr[Element] = js.undefined
  /**
           * Issues addressed by this goal
           */
  var addresses: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
           * E.g. Treatment, dietary, behavioral, etc.
           */
  var category: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
           * Code or text describing goal
           */
  var description: CodeableConcept
  /**
           * Who's responsible for creating Goal?
           */
  var expressedBy: js.UndefOr[Reference] = js.undefined
  /**
           * External Ids for this goal
           */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  /**
           * Comments about the goal
           */
  var note: js.UndefOr[js.Array[Annotation]] = js.undefined
  /**
           * What result was achieved regarding the goal?
           */
  var outcomeCode: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
           * Observation that resulted from goal
           */
  var outcomeReference: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
           * high-priority | medium-priority | low-priority
           */
  var priority: js.UndefOr[CodeableConcept] = js.undefined
  /**
           * When goal pursuit begins
           */
  var startCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  /**
           * When goal pursuit begins
           */
  var startDate: js.UndefOr[date] = js.undefined
  /**
           * proposed | accepted | planned | in-progress | on-target | ahead-of-target | behind-target | sustaining | achieved | on-hold | cancelled | entered-in-error | rejected
           */
  var status: code
  /**
           * When goal status took effect
           */
  var statusDate: js.UndefOr[date] = js.undefined
  /**
           * Reason for current status
           */
  var statusReason: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Who this goal is intended for
           */
  var subject: js.UndefOr[Reference] = js.undefined
  /**
           * Target outcome for the goal
           */
  var target: js.UndefOr[GoalTarget] = js.undefined
}

