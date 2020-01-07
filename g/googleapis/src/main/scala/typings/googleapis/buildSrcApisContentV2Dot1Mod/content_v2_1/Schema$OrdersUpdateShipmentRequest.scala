package typings.googleapis.buildSrcApisContentV2Dot1Mod.content_v2_1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$OrdersUpdateShipmentRequest extends js.Object {
  /**
    * The carrier handling the shipment. Not updated if missing. See
    * shipments[].carrier in the  Orders resource representation for a list of
    * acceptable values.
    */
  var carrier: js.UndefOr[String] = js.native
  /**
    * Date on which the shipment has been delivered, in ISO 8601 format.
    * Optional and can be provided only if status is delivered.
    */
  var deliveryDate: js.UndefOr[String] = js.native
  /**
    * The ID of the operation. Unique across all operations for a given order.
    */
  var operationId: js.UndefOr[String] = js.native
  /**
    * The ID of the shipment.
    */
  var shipmentId: js.UndefOr[String] = js.native
  /**
    * New status for the shipment. Not updated if missing.
    */
  var status: js.UndefOr[String] = js.native
  /**
    * The tracking ID for the shipment. Not updated if missing.
    */
  var trackingId: js.UndefOr[String] = js.native
}

object Schema$OrdersUpdateShipmentRequest {
  @scala.inline
  def apply(
    carrier: String = null,
    deliveryDate: String = null,
    operationId: String = null,
    shipmentId: String = null,
    status: String = null,
    trackingId: String = null
  ): Schema$OrdersUpdateShipmentRequest = {
    val __obj = js.Dynamic.literal()
    if (carrier != null) __obj.updateDynamic("carrier")(carrier.asInstanceOf[js.Any])
    if (deliveryDate != null) __obj.updateDynamic("deliveryDate")(deliveryDate.asInstanceOf[js.Any])
    if (operationId != null) __obj.updateDynamic("operationId")(operationId.asInstanceOf[js.Any])
    if (shipmentId != null) __obj.updateDynamic("shipmentId")(shipmentId.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (trackingId != null) __obj.updateDynamic("trackingId")(trackingId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$OrdersUpdateShipmentRequest]
  }
}

