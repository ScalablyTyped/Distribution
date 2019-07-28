package typings.googleDashAppsDashScript.GoogleAppsScriptNs.ContentNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrdersShipLineItemsRequest extends js.Object {
  var carrier: js.UndefOr[String] = js.undefined
  var lineItems: js.UndefOr[js.Array[OrderShipmentLineItemShipment]] = js.undefined
  var operationId: js.UndefOr[String] = js.undefined
  var shipmentGroupId: js.UndefOr[String] = js.undefined
  var shipmentId: js.UndefOr[String] = js.undefined
  var shipmentInfos: js.UndefOr[js.Array[OrdersCustomBatchRequestEntryShipLineItemsShipmentInfo]] = js.undefined
  var trackingId: js.UndefOr[String] = js.undefined
}

object OrdersShipLineItemsRequest {
  @scala.inline
  def apply(
    carrier: String = null,
    lineItems: js.Array[OrderShipmentLineItemShipment] = null,
    operationId: String = null,
    shipmentGroupId: String = null,
    shipmentId: String = null,
    shipmentInfos: js.Array[OrdersCustomBatchRequestEntryShipLineItemsShipmentInfo] = null,
    trackingId: String = null
  ): OrdersShipLineItemsRequest = {
    val __obj = js.Dynamic.literal()
    if (carrier != null) __obj.updateDynamic("carrier")(carrier)
    if (lineItems != null) __obj.updateDynamic("lineItems")(lineItems)
    if (operationId != null) __obj.updateDynamic("operationId")(operationId)
    if (shipmentGroupId != null) __obj.updateDynamic("shipmentGroupId")(shipmentGroupId)
    if (shipmentId != null) __obj.updateDynamic("shipmentId")(shipmentId)
    if (shipmentInfos != null) __obj.updateDynamic("shipmentInfos")(shipmentInfos)
    if (trackingId != null) __obj.updateDynamic("trackingId")(trackingId)
    __obj.asInstanceOf[OrdersShipLineItemsRequest]
  }
}

