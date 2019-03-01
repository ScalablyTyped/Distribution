package typings
package gapiDotClientDotContentLib.gapiNs.clientNs.contentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrdersCustomBatchRequestEntryShipLineItems extends js.Object {
  /**
    * Deprecated. Please use shipmentInfo instead. The carrier handling the shipment. See shipments[].carrier in the  Orders resource representation for a
    * list of acceptable values.
    */
  var carrier: js.UndefOr[java.lang.String] = js.undefined
  /** Line items to ship. */
  var lineItems: js.UndefOr[js.Array[OrderShipmentLineItemShipment]] = js.undefined
  /** Deprecated. Please use shipmentInfo instead. The ID of the shipment. */
  var shipmentId: js.UndefOr[java.lang.String] = js.undefined
  /** Shipment information. This field is repeated because a single line item can be shipped in several packages (and have several tracking IDs). */
  var shipmentInfos: js.UndefOr[js.Array[OrdersCustomBatchRequestEntryShipLineItemsShipmentInfo]] = js.undefined
  /** Deprecated. Please use shipmentInfo instead. The tracking id for the shipment. */
  var trackingId: js.UndefOr[java.lang.String] = js.undefined
}

object OrdersCustomBatchRequestEntryShipLineItems {
  @scala.inline
  def apply(
    carrier: java.lang.String = null,
    lineItems: js.Array[OrderShipmentLineItemShipment] = null,
    shipmentId: java.lang.String = null,
    shipmentInfos: js.Array[OrdersCustomBatchRequestEntryShipLineItemsShipmentInfo] = null,
    trackingId: java.lang.String = null
  ): OrdersCustomBatchRequestEntryShipLineItems = {
    val __obj = js.Dynamic.literal()
    if (carrier != null) __obj.updateDynamic("carrier")(carrier)
    if (lineItems != null) __obj.updateDynamic("lineItems")(lineItems)
    if (shipmentId != null) __obj.updateDynamic("shipmentId")(shipmentId)
    if (shipmentInfos != null) __obj.updateDynamic("shipmentInfos")(shipmentInfos)
    if (trackingId != null) __obj.updateDynamic("trackingId")(trackingId)
    __obj.asInstanceOf[OrdersCustomBatchRequestEntryShipLineItems]
  }
}

