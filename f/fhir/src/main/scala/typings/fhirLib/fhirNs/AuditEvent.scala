package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Event record kept for security purposes
  */
trait AuditEvent extends DomainResource {
  /**
    * Contains extended information for property 'action'.
    */
  var _action: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'outcome'.
    */
  var _outcome: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'outcomeDesc'.
    */
  var _outcomeDesc: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'recorded'.
    */
  var _recorded: js.UndefOr[Element] = js.undefined
  /**
    * Type of action performed during the event
    */
  var action: js.UndefOr[code] = js.undefined
  /**
    * Actor involved in the event
    */
  var agent: js.Array[AuditEventAgent]
  /**
    * Data or objects used
    */
  var entity: js.UndefOr[js.Array[AuditEventEntity]] = js.undefined
  /**
    * Whether the event succeeded or failed
    */
  var outcome: js.UndefOr[code] = js.undefined
  /**
    * Description of the event outcome
    */
  var outcomeDesc: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The purposeOfUse of the event
    */
  var purposeOfEvent: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
    * Time when the event occurred on source
    */
  var recorded: instant
  /**
    * Audit Event Reporter
    */
  var source: AuditEventSource
  /**
    * More specific type/id for the event
    */
  var subtype: js.UndefOr[js.Array[Coding]] = js.undefined
  /**
    * Type/identifier of event
    */
  var `type`: Coding
}

