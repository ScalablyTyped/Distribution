package typings.googleapis.buildSrcApisContentV2Mod.content_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$OrdersCustomBatchRequestEntryShipLineItemsShipmentInfo extends js.Object {
  /**
    * The carrier handling the shipment. See shipments[].carrier in the  Orders
    * resource representation for a list of acceptable values.
    */
  var carrier: js.UndefOr[String] = js.native
  /**
    * The ID of the shipment. This is assigned by the merchant and is unique to
    * each shipment.
    */
  var shipmentId: js.UndefOr[String] = js.native
  /**
    * The tracking ID for the shipment.
    */
  var trackingId: js.UndefOr[String] = js.native
}

object Schema$OrdersCustomBatchRequestEntryShipLineItemsShipmentInfo {
  @scala.inline
  def apply(carrier: String = null, shipmentId: String = null, trackingId: String = null): Schema$OrdersCustomBatchRequestEntryShipLineItemsShipmentInfo = {
    val __obj = js.Dynamic.literal()
    if (carrier != null) __obj.updateDynamic("carrier")(carrier.asInstanceOf[js.Any])
    if (shipmentId != null) __obj.updateDynamic("shipmentId")(shipmentId.asInstanceOf[js.Any])
    if (trackingId != null) __obj.updateDynamic("trackingId")(trackingId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$OrdersCustomBatchRequestEntryShipLineItemsShipmentInfo]
  }
}

