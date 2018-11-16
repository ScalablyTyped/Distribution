package typings
package gapiDotClientDotContentLib.gapiNs.clientNs.contentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait OrdersShipLineItemsRequest extends js.Object {
  /**
               * Deprecated. Please use shipmentInfo instead. The carrier handling the shipment. See shipments[].carrier in the  Orders resource representation for a
               * list of acceptable values.
               */
  var carrier: js.UndefOr[java.lang.String] = js.undefined
  /** Line items to ship. */
  var lineItems: js.UndefOr[js.Array[OrderShipmentLineItemShipment]] = js.undefined
  /** The ID of the operation. Unique across all operations for a given order. */
  var operationId: js.UndefOr[java.lang.String] = js.undefined
  /** Deprecated. Please use shipmentInfo instead. The ID of the shipment. */
  var shipmentId: js.UndefOr[java.lang.String] = js.undefined
  /** Shipment information. This field is repeated because a single line item can be shipped in several packages (and have several tracking IDs). */
  var shipmentInfos: js.UndefOr[js.Array[OrdersCustomBatchRequestEntryShipLineItemsShipmentInfo]] = js.undefined
  /** Deprecated. Please use shipmentInfo instead. The tracking id for the shipment. */
  var trackingId: js.UndefOr[java.lang.String] = js.undefined
}

