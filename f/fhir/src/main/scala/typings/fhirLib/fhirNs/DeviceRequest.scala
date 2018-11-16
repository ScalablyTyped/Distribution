package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Medical device request
     */

trait DeviceRequest extends DomainResource {
  /**
           * Contains extended information for property 'authoredOn'.
           */
  var _authoredOn: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'occurrenceDateTime'.
           */
  var _occurrenceDateTime: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'priority'.
           */
  var _priority: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'status'.
           */
  var _status: js.UndefOr[Element] = js.undefined
  /**
           * When recorded
           */
  var authoredOn: js.UndefOr[dateTime] = js.undefined
  /**
           * What request fulfills
           */
  var basedOn: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
           * Device requested
           */
  var codeCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  /**
           * Device requested
           */
  var codeReference: js.UndefOr[Reference] = js.undefined
  /**
           * Encounter or Episode motivating request
           */
  var context: js.UndefOr[Reference] = js.undefined
  /**
           * Protocol or definition
           */
  var definition: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
           * Identifier of composite request
           */
  var groupIdentifier: js.UndefOr[Identifier] = js.undefined
  /**
           * External Request identifier
           */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  /**
           * proposal | plan | original-order | encoded | reflex-order
           */
  var intent: CodeableConcept
  /**
           * Notes or comments
           */
  var note: js.UndefOr[js.Array[Annotation]] = js.undefined
  /**
           * Desired time or schedule for use
           */
  var occurrenceDateTime: js.UndefOr[dateTime] = js.undefined
  /**
           * Desired time or schedule for use
           */
  var occurrencePeriod: js.UndefOr[Period] = js.undefined
  /**
           * Desired time or schedule for use
           */
  var occurrenceTiming: js.UndefOr[Timing] = js.undefined
  /**
           * Requested Filler
           */
  var performer: js.UndefOr[Reference] = js.undefined
  /**
           * Fille role
           */
  var performerType: js.UndefOr[CodeableConcept] = js.undefined
  /**
           * What request replaces
           */
  var priorRequest: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
           * Indicates how quickly the {{title}} should be addressed with respect to other requests
           */
  var priority: js.UndefOr[code] = js.undefined
  /**
           * Coded Reason for request
           */
  var reasonCode: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
           * Linked Reason for request
           */
  var reasonReference: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
           * Request provenance
           */
  var relevantHistory: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
           * Who/what is requesting diagnostics
           */
  var requester: js.UndefOr[DeviceRequestRequester] = js.undefined
  /**
           * draft | active | suspended | completed | entered-in-error | cancelled
           */
  var status: js.UndefOr[code] = js.undefined
  /**
           * Focus of request
           */
  var subject: Reference
  /**
           * Additional clinical information
           */
  var supportingInfo: js.UndefOr[js.Array[Reference]] = js.undefined
}

