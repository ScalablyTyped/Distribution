package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrdersCustomBatchRequestEntry extends js.Object {
  var batchId: js.UndefOr[scala.Double] = js.undefined
  var cancel: js.UndefOr[OrdersCustomBatchRequestEntryCancel] = js.undefined
  var cancelLineItem: js.UndefOr[OrdersCustomBatchRequestEntryCancelLineItem] = js.undefined
  var inStoreRefundLineItem: js.UndefOr[OrdersCustomBatchRequestEntryInStoreRefundLineItem] = js.undefined
  var merchantId: js.UndefOr[java.lang.String] = js.undefined
  var merchantOrderId: js.UndefOr[java.lang.String] = js.undefined
  var method: js.UndefOr[java.lang.String] = js.undefined
  var operationId: js.UndefOr[java.lang.String] = js.undefined
  var orderId: js.UndefOr[java.lang.String] = js.undefined
  var refund: js.UndefOr[OrdersCustomBatchRequestEntryRefund] = js.undefined
  var rejectReturnLineItem: js.UndefOr[OrdersCustomBatchRequestEntryRejectReturnLineItem] = js.undefined
  var returnLineItem: js.UndefOr[OrdersCustomBatchRequestEntryReturnLineItem] = js.undefined
  var returnRefundLineItem: js.UndefOr[OrdersCustomBatchRequestEntryReturnRefundLineItem] = js.undefined
  var setLineItemMetadata: js.UndefOr[OrdersCustomBatchRequestEntrySetLineItemMetadata] = js.undefined
  var shipLineItems: js.UndefOr[OrdersCustomBatchRequestEntryShipLineItems] = js.undefined
  var updateLineItemShippingDetails: js.UndefOr[OrdersCustomBatchRequestEntryUpdateLineItemShippingDetails] = js.undefined
  var updateShipment: js.UndefOr[OrdersCustomBatchRequestEntryUpdateShipment] = js.undefined
}

object OrdersCustomBatchRequestEntry {
  @scala.inline
  def apply(
    batchId: scala.Int | scala.Double = null,
    cancel: OrdersCustomBatchRequestEntryCancel = null,
    cancelLineItem: OrdersCustomBatchRequestEntryCancelLineItem = null,
    inStoreRefundLineItem: OrdersCustomBatchRequestEntryInStoreRefundLineItem = null,
    merchantId: java.lang.String = null,
    merchantOrderId: java.lang.String = null,
    method: java.lang.String = null,
    operationId: java.lang.String = null,
    orderId: java.lang.String = null,
    refund: OrdersCustomBatchRequestEntryRefund = null,
    rejectReturnLineItem: OrdersCustomBatchRequestEntryRejectReturnLineItem = null,
    returnLineItem: OrdersCustomBatchRequestEntryReturnLineItem = null,
    returnRefundLineItem: OrdersCustomBatchRequestEntryReturnRefundLineItem = null,
    setLineItemMetadata: OrdersCustomBatchRequestEntrySetLineItemMetadata = null,
    shipLineItems: OrdersCustomBatchRequestEntryShipLineItems = null,
    updateLineItemShippingDetails: OrdersCustomBatchRequestEntryUpdateLineItemShippingDetails = null,
    updateShipment: OrdersCustomBatchRequestEntryUpdateShipment = null
  ): OrdersCustomBatchRequestEntry = {
    val __obj = js.Dynamic.literal()
    if (batchId != null) __obj.updateDynamic("batchId")(batchId.asInstanceOf[js.Any])
    if (cancel != null) __obj.updateDynamic("cancel")(cancel)
    if (cancelLineItem != null) __obj.updateDynamic("cancelLineItem")(cancelLineItem)
    if (inStoreRefundLineItem != null) __obj.updateDynamic("inStoreRefundLineItem")(inStoreRefundLineItem)
    if (merchantId != null) __obj.updateDynamic("merchantId")(merchantId)
    if (merchantOrderId != null) __obj.updateDynamic("merchantOrderId")(merchantOrderId)
    if (method != null) __obj.updateDynamic("method")(method)
    if (operationId != null) __obj.updateDynamic("operationId")(operationId)
    if (orderId != null) __obj.updateDynamic("orderId")(orderId)
    if (refund != null) __obj.updateDynamic("refund")(refund)
    if (rejectReturnLineItem != null) __obj.updateDynamic("rejectReturnLineItem")(rejectReturnLineItem)
    if (returnLineItem != null) __obj.updateDynamic("returnLineItem")(returnLineItem)
    if (returnRefundLineItem != null) __obj.updateDynamic("returnRefundLineItem")(returnRefundLineItem)
    if (setLineItemMetadata != null) __obj.updateDynamic("setLineItemMetadata")(setLineItemMetadata)
    if (shipLineItems != null) __obj.updateDynamic("shipLineItems")(shipLineItems)
    if (updateLineItemShippingDetails != null) __obj.updateDynamic("updateLineItemShippingDetails")(updateLineItemShippingDetails)
    if (updateShipment != null) __obj.updateDynamic("updateShipment")(updateShipment)
    __obj.asInstanceOf[OrdersCustomBatchRequestEntry]
  }
}

