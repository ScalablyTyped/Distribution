package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Request for a medication, substance or device
     */

trait SupplyRequest extends DomainResource {
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
           * When the request was made
           */
  var authoredOn: js.UndefOr[dateTime] = js.undefined
  /**
           * The kind of supply (central, non-stock, etc.)
           */
  var category: js.UndefOr[CodeableConcept] = js.undefined
  /**
           * The origin of the supply
           */
  var deliverFrom: js.UndefOr[Reference] = js.undefined
  /**
           * The destination of the supply
           */
  var deliverTo: js.UndefOr[Reference] = js.undefined
  /**
           * Unique identifier
           */
  var identifier: js.UndefOr[Identifier] = js.undefined
  /**
           * When the request should be fulfilled
           */
  var occurrenceDateTime: js.UndefOr[dateTime] = js.undefined
  /**
           * When the request should be fulfilled
           */
  var occurrencePeriod: js.UndefOr[Period] = js.undefined
  /**
           * When the request should be fulfilled
           */
  var occurrenceTiming: js.UndefOr[Timing] = js.undefined
  /**
           * The item being requested
           */
  var orderedItem: js.UndefOr[SupplyRequestOrderedItem] = js.undefined
  /**
           * routine | urgent | asap | stat
           */
  var priority: js.UndefOr[code] = js.undefined
  /**
           * Why the supply item was requested
           */
  var reasonCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  /**
           * Why the supply item was requested
           */
  var reasonReference: js.UndefOr[Reference] = js.undefined
  /**
           * Who/what is requesting service
           */
  var requester: js.UndefOr[SupplyRequestRequester] = js.undefined
  /**
           * draft | active | suspended +
           */
  var status: js.UndefOr[code] = js.undefined
  /**
           * Who is intended to fulfill the request
           */
  var supplier: js.UndefOr[js.Array[Reference]] = js.undefined
}

