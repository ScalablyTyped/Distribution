package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrdersShipLineItemsRequest extends js.Object {
  var carrier: js.UndefOr[java.lang.String] = js.undefined
  var lineItems: js.UndefOr[js.Array[OrderShipmentLineItemShipment]] = js.undefined
  var operationId: js.UndefOr[java.lang.String] = js.undefined
  var shipmentGroupId: js.UndefOr[java.lang.String] = js.undefined
  var shipmentId: js.UndefOr[java.lang.String] = js.undefined
  var shipmentInfos: js.UndefOr[js.Array[OrdersCustomBatchRequestEntryShipLineItemsShipmentInfo]] = js.undefined
  var trackingId: js.UndefOr[java.lang.String] = js.undefined
}

object OrdersShipLineItemsRequest {
  @scala.inline
  def apply(
    carrier: java.lang.String = null,
    lineItems: js.Array[OrderShipmentLineItemShipment] = null,
    operationId: java.lang.String = null,
    shipmentGroupId: java.lang.String = null,
    shipmentId: java.lang.String = null,
    shipmentInfos: js.Array[OrdersCustomBatchRequestEntryShipLineItemsShipmentInfo] = null,
    trackingId: java.lang.String = null
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

