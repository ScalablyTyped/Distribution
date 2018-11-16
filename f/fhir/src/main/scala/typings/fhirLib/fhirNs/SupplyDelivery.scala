package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Delivery of bulk Supplies
     */

trait SupplyDelivery extends DomainResource {
  /**
           * Contains extended information for property 'occurrenceDateTime'.
           */
  var _occurrenceDateTime: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'status'.
           */
  var _status: js.UndefOr[Element] = js.undefined
  /**
           * Fulfills plan, proposal or order
           */
  var basedOn: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
           * Where the Supply was sent
           */
  var destination: js.UndefOr[Reference] = js.undefined
  /**
           * External identifier
           */
  var identifier: js.UndefOr[Identifier] = js.undefined
  /**
           * When event occurred
           */
  var occurrenceDateTime: js.UndefOr[dateTime] = js.undefined
  /**
           * When event occurred
           */
  var occurrencePeriod: js.UndefOr[Period] = js.undefined
  /**
           * When event occurred
           */
  var occurrenceTiming: js.UndefOr[Timing] = js.undefined
  /**
           * Part of referenced event
           */
  var partOf: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
           * Patient for whom the item is supplied
           */
  var patient: js.UndefOr[Reference] = js.undefined
  /**
           * Who collected the Supply
           */
  var receiver: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
           * in-progress | completed | abandoned | entered-in-error
           */
  var status: js.UndefOr[code] = js.undefined
  /**
           * The item that is delivered or supplied
           */
  var suppliedItem: js.UndefOr[SupplyDeliverySuppliedItem] = js.undefined
  /**
           * Dispenser
           */
  var supplier: js.UndefOr[Reference] = js.undefined
  /**
           * Category of dispense event
           */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
}

