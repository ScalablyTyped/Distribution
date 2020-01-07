package typings.googleapis.buildSrcApisContentV2Mod.content_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$OrdersCustomBatchRequestEntryShipLineItems extends js.Object {
  /**
    * Deprecated. Please use shipmentInfo instead. The carrier handling the
    * shipment. See shipments[].carrier in the  Orders resource representation
    * for a list of acceptable values.
    */
  var carrier: js.UndefOr[String] = js.native
  /**
    * Line items to ship.
    */
  var lineItems: js.UndefOr[js.Array[Schema$OrderShipmentLineItemShipment]] = js.native
  /**
    * ID of the shipment group. Required for orders that use the orderinvoices
    * service.
    */
  var shipmentGroupId: js.UndefOr[String] = js.native
  /**
    * Deprecated. Please use shipmentInfo instead. The ID of the shipment.
    */
  var shipmentId: js.UndefOr[String] = js.native
  /**
    * Shipment information. This field is repeated because a single line item
    * can be shipped in several packages (and have several tracking IDs).
    */
  var shipmentInfos: js.UndefOr[js.Array[Schema$OrdersCustomBatchRequestEntryShipLineItemsShipmentInfo]] = js.native
  /**
    * Deprecated. Please use shipmentInfo instead. The tracking ID for the
    * shipment.
    */
  var trackingId: js.UndefOr[String] = js.native
}

object Schema$OrdersCustomBatchRequestEntryShipLineItems {
  @scala.inline
  def apply(
    carrier: String = null,
    lineItems: js.Array[Schema$OrderShipmentLineItemShipment] = null,
    shipmentGroupId: String = null,
    shipmentId: String = null,
    shipmentInfos: js.Array[Schema$OrdersCustomBatchRequestEntryShipLineItemsShipmentInfo] = null,
    trackingId: String = null
  ): Schema$OrdersCustomBatchRequestEntryShipLineItems = {
    val __obj = js.Dynamic.literal()
    if (carrier != null) __obj.updateDynamic("carrier")(carrier.asInstanceOf[js.Any])
    if (lineItems != null) __obj.updateDynamic("lineItems")(lineItems.asInstanceOf[js.Any])
    if (shipmentGroupId != null) __obj.updateDynamic("shipmentGroupId")(shipmentGroupId.asInstanceOf[js.Any])
    if (shipmentId != null) __obj.updateDynamic("shipmentId")(shipmentId.asInstanceOf[js.Any])
    if (shipmentInfos != null) __obj.updateDynamic("shipmentInfos")(shipmentInfos.asInstanceOf[js.Any])
    if (trackingId != null) __obj.updateDynamic("trackingId")(trackingId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$OrdersCustomBatchRequestEntryShipLineItems]
  }
}

