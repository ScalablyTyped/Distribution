package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * A task to be performed
     */

trait Task extends DomainResource {
  /**
           * Contains extended information for property 'authoredOn'.
           */
  var _authoredOn: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'definitionUri'.
           */
  var _definitionUri: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'description'.
           */
  var _description: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'intent'.
           */
  var _intent: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'lastModified'.
           */
  var _lastModified: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'priority'.
           */
  var _priority: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'status'.
           */
  var _status: js.UndefOr[Element] = js.undefined
  /**
           * Task Creation Date
           */
  var authoredOn: js.UndefOr[dateTime] = js.undefined
  /**
           * Request fulfilled by this task
           */
  var basedOn: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
           * E.g. "Specimen collected", "IV prepped"
           */
  var businessStatus: js.UndefOr[CodeableConcept] = js.undefined
  /**
           * Task Type
           */
  var code: js.UndefOr[CodeableConcept] = js.undefined
  /**
           * Healthcare event during which this task originated
           */
  var context: js.UndefOr[Reference] = js.undefined
  /**
           * Formal definition of task
           */
  var definitionReference: js.UndefOr[Reference] = js.undefined
  /**
           * Formal definition of task
           */
  var definitionUri: js.UndefOr[uri] = js.undefined
  /**
           * Human-readable explanation of task
           */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Start and end time of execution
           */
  var executionPeriod: js.UndefOr[Period] = js.undefined
  /**
           * What task is acting on
           */
  var focus: js.UndefOr[Reference] = js.undefined
  /**
           * Beneficiary of the Task
           */
  var `for`: js.UndefOr[Reference] = js.undefined
  /**
           * Requisition or grouper id
           */
  var groupIdentifier: js.UndefOr[Identifier] = js.undefined
  /**
           * Task Instance Identifier
           */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  /**
           * Information used to perform task
           */
  var input: js.UndefOr[js.Array[TaskInput]] = js.undefined
  /**
           * proposal | plan | order +
           */
  var intent: code
  /**
           * Task Last Modified Date
           */
  var lastModified: js.UndefOr[dateTime] = js.undefined
  /**
           * Comments made about the task
           */
  var note: js.UndefOr[js.Array[Annotation]] = js.undefined
  /**
           * Information produced as part of task
           */
  var output: js.UndefOr[js.Array[TaskOutput]] = js.undefined
  /**
           * Responsible individual
           */
  var owner: js.UndefOr[Reference] = js.undefined
  /**
           * Composite task
           */
  var partOf: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
           * requester | dispatcher | scheduler | performer | monitor | manager | acquirer | reviewer
           */
  var performerType: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
           * normal | urgent | asap | stat
           */
  var priority: js.UndefOr[code] = js.undefined
  /**
           * Why task is needed
           */
  var reason: js.UndefOr[CodeableConcept] = js.undefined
  /**
           * Key events in history of the Task
           */
  var relevantHistory: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
           * Who is asking for task to be done
           */
  var requester: js.UndefOr[TaskRequester] = js.undefined
  /**
           * Constraints on fulfillment tasks
           */
  var restriction: js.UndefOr[TaskRestriction] = js.undefined
  /**
           * draft | requested | received | accepted | +
           */
  var status: code
  /**
           * Reason for current status
           */
  var statusReason: js.UndefOr[CodeableConcept] = js.undefined
}

