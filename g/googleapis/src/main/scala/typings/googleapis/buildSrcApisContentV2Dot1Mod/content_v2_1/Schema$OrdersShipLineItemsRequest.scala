package typings.googleapis.buildSrcApisContentV2Dot1Mod.content_v2_1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$OrdersShipLineItemsRequest extends js.Object {
  /**
    * Line items to ship.
    */
  var lineItems: js.UndefOr[js.Array[Schema$OrderShipmentLineItemShipment]] = js.native
  /**
    * The ID of the operation. Unique across all operations for a given order.
    */
  var operationId: js.UndefOr[String] = js.native
  /**
    * ID of the shipment group. Required for orders that use the orderinvoices
    * service.
    */
  var shipmentGroupId: js.UndefOr[String] = js.native
  /**
    * Shipment information. This field is repeated because a single line item
    * can be shipped in several packages (and have several tracking IDs).
    */
  var shipmentInfos: js.UndefOr[js.Array[Schema$OrdersCustomBatchRequestEntryShipLineItemsShipmentInfo]] = js.native
}

object Schema$OrdersShipLineItemsRequest {
  @scala.inline
  def apply(
    lineItems: js.Array[Schema$OrderShipmentLineItemShipment] = null,
    operationId: String = null,
    shipmentGroupId: String = null,
    shipmentInfos: js.Array[Schema$OrdersCustomBatchRequestEntryShipLineItemsShipmentInfo] = null
  ): Schema$OrdersShipLineItemsRequest = {
    val __obj = js.Dynamic.literal()
    if (lineItems != null) __obj.updateDynamic("lineItems")(lineItems.asInstanceOf[js.Any])
    if (operationId != null) __obj.updateDynamic("operationId")(operationId.asInstanceOf[js.Any])
    if (shipmentGroupId != null) __obj.updateDynamic("shipmentGroupId")(shipmentGroupId.asInstanceOf[js.Any])
    if (shipmentInfos != null) __obj.updateDynamic("shipmentInfos")(shipmentInfos.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$OrdersShipLineItemsRequest]
  }
}

