package typings.gapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrdersCustomBatchRequestEntryUpdateShipment extends js.Object {
  /**
    * The carrier handling the shipment. Not updated if missing. See shipments[].carrier in the  Orders resource representation for a list of acceptable
    * values.
    */
  var carrier: js.UndefOr[String] = js.undefined
  /** The ID of the shipment. */
  var shipmentId: js.UndefOr[String] = js.undefined
  /** New status for the shipment. Not updated if missing. */
  var status: js.UndefOr[String] = js.undefined
  /** The tracking id for the shipment. Not updated if missing. */
  var trackingId: js.UndefOr[String] = js.undefined
}

object OrdersCustomBatchRequestEntryUpdateShipment {
  @scala.inline
  def apply(
    carrier: String = null,
    shipmentId: String = null,
    status: String = null,
    trackingId: String = null
  ): OrdersCustomBatchRequestEntryUpdateShipment = {
    val __obj = js.Dynamic.literal()
    if (carrier != null) __obj.updateDynamic("carrier")(carrier.asInstanceOf[js.Any])
    if (shipmentId != null) __obj.updateDynamic("shipmentId")(shipmentId.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (trackingId != null) __obj.updateDynamic("trackingId")(trackingId.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrdersCustomBatchRequestEntryUpdateShipment]
  }
}

