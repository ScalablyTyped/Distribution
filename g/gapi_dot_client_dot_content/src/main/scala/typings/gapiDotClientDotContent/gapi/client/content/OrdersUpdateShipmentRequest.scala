package typings.gapiDotClientDotContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrdersUpdateShipmentRequest extends js.Object {
  /**
    * The carrier handling the shipment. Not updated if missing. See shipments[].carrier in the  Orders resource representation for a list of acceptable
    * values.
    */
  var carrier: js.UndefOr[String] = js.undefined
  /** The ID of the operation. Unique across all operations for a given order. */
  var operationId: js.UndefOr[String] = js.undefined
  /** The ID of the shipment. */
  var shipmentId: js.UndefOr[String] = js.undefined
  /** New status for the shipment. Not updated if missing. */
  var status: js.UndefOr[String] = js.undefined
  /** The tracking id for the shipment. Not updated if missing. */
  var trackingId: js.UndefOr[String] = js.undefined
}

object OrdersUpdateShipmentRequest {
  @scala.inline
  def apply(
    carrier: String = null,
    operationId: String = null,
    shipmentId: String = null,
    status: String = null,
    trackingId: String = null
  ): OrdersUpdateShipmentRequest = {
    val __obj = js.Dynamic.literal()
    if (carrier != null) __obj.updateDynamic("carrier")(carrier.asInstanceOf[js.Any])
    if (operationId != null) __obj.updateDynamic("operationId")(operationId.asInstanceOf[js.Any])
    if (shipmentId != null) __obj.updateDynamic("shipmentId")(shipmentId.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (trackingId != null) __obj.updateDynamic("trackingId")(trackingId.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrdersUpdateShipmentRequest]
  }
}

