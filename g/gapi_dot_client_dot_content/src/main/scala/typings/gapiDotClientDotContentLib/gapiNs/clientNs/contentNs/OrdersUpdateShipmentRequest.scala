package typings
package gapiDotClientDotContentLib.gapiNs.clientNs.contentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrdersUpdateShipmentRequest extends js.Object {
  /**
    * The carrier handling the shipment. Not updated if missing. See shipments[].carrier in the  Orders resource representation for a list of acceptable
    * values.
    */
  var carrier: js.UndefOr[java.lang.String] = js.undefined
  /** The ID of the operation. Unique across all operations for a given order. */
  var operationId: js.UndefOr[java.lang.String] = js.undefined
  /** The ID of the shipment. */
  var shipmentId: js.UndefOr[java.lang.String] = js.undefined
  /** New status for the shipment. Not updated if missing. */
  var status: js.UndefOr[java.lang.String] = js.undefined
  /** The tracking id for the shipment. Not updated if missing. */
  var trackingId: js.UndefOr[java.lang.String] = js.undefined
}

object OrdersUpdateShipmentRequest {
  @scala.inline
  def apply(
    carrier: java.lang.String = null,
    operationId: java.lang.String = null,
    shipmentId: java.lang.String = null,
    status: java.lang.String = null,
    trackingId: java.lang.String = null
  ): OrdersUpdateShipmentRequest = {
    val __obj = js.Dynamic.literal()
    if (carrier != null) __obj.updateDynamic("carrier")(carrier)
    if (operationId != null) __obj.updateDynamic("operationId")(operationId)
    if (shipmentId != null) __obj.updateDynamic("shipmentId")(shipmentId)
    if (status != null) __obj.updateDynamic("status")(status)
    if (trackingId != null) __obj.updateDynamic("trackingId")(trackingId)
    __obj.asInstanceOf[OrdersUpdateShipmentRequest]
  }
}

