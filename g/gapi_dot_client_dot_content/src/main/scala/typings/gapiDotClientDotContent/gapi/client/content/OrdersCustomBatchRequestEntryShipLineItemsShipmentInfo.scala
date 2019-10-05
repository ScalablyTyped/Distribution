package typings.gapiDotClientDotContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrdersCustomBatchRequestEntryShipLineItemsShipmentInfo extends js.Object {
  /** The carrier handling the shipment. See shipments[].carrier in the  Orders resource representation for a list of acceptable values. */
  var carrier: js.UndefOr[String] = js.undefined
  /** The ID of the shipment. */
  var shipmentId: js.UndefOr[String] = js.undefined
  /** The tracking id for the shipment. */
  var trackingId: js.UndefOr[String] = js.undefined
}

object OrdersCustomBatchRequestEntryShipLineItemsShipmentInfo {
  @scala.inline
  def apply(carrier: String = null, shipmentId: String = null, trackingId: String = null): OrdersCustomBatchRequestEntryShipLineItemsShipmentInfo = {
    val __obj = js.Dynamic.literal()
    if (carrier != null) __obj.updateDynamic("carrier")(carrier)
    if (shipmentId != null) __obj.updateDynamic("shipmentId")(shipmentId)
    if (trackingId != null) __obj.updateDynamic("trackingId")(trackingId)
    __obj.asInstanceOf[OrdersCustomBatchRequestEntryShipLineItemsShipmentInfo]
  }
}

