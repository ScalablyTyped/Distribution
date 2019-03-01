package typings
package gapiDotClientDotContentLib.gapiNs.clientNs.contentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrdersCustomBatchRequestEntry extends js.Object {
  /** An entry ID, unique within the batch request. */
  var batchId: js.UndefOr[scala.Double] = js.undefined
  /** Required for cancel method. */
  var cancel: js.UndefOr[OrdersCustomBatchRequestEntryCancel] = js.undefined
  /** Required for cancelLineItem method. */
  var cancelLineItem: js.UndefOr[OrdersCustomBatchRequestEntryCancelLineItem] = js.undefined
  /** The ID of the managing account. */
  var merchantId: js.UndefOr[java.lang.String] = js.undefined
  /** The merchant order id. Required for updateMerchantOrderId and getByMerchantOrderId methods. */
  var merchantOrderId: js.UndefOr[java.lang.String] = js.undefined
  /** The method to apply. */
  var method: js.UndefOr[java.lang.String] = js.undefined
  /** The ID of the operation. Unique across all operations for a given order. Required for all methods beside get and getByMerchantOrderId. */
  var operationId: js.UndefOr[java.lang.String] = js.undefined
  /** The ID of the order. Required for all methods beside getByMerchantOrderId. */
  var orderId: js.UndefOr[java.lang.String] = js.undefined
  /** Required for refund method. */
  var refund: js.UndefOr[OrdersCustomBatchRequestEntryRefund] = js.undefined
  /** Required for returnLineItem method. */
  var returnLineItem: js.UndefOr[OrdersCustomBatchRequestEntryReturnLineItem] = js.undefined
  /** Required for shipLineItems method. */
  var shipLineItems: js.UndefOr[OrdersCustomBatchRequestEntryShipLineItems] = js.undefined
  /** Required for updateShipment method. */
  var updateShipment: js.UndefOr[OrdersCustomBatchRequestEntryUpdateShipment] = js.undefined
}

object OrdersCustomBatchRequestEntry {
  @scala.inline
  def apply(
    batchId: scala.Int | scala.Double = null,
    cancel: OrdersCustomBatchRequestEntryCancel = null,
    cancelLineItem: OrdersCustomBatchRequestEntryCancelLineItem = null,
    merchantId: java.lang.String = null,
    merchantOrderId: java.lang.String = null,
    method: java.lang.String = null,
    operationId: java.lang.String = null,
    orderId: java.lang.String = null,
    refund: OrdersCustomBatchRequestEntryRefund = null,
    returnLineItem: OrdersCustomBatchRequestEntryReturnLineItem = null,
    shipLineItems: OrdersCustomBatchRequestEntryShipLineItems = null,
    updateShipment: OrdersCustomBatchRequestEntryUpdateShipment = null
  ): OrdersCustomBatchRequestEntry = {
    val __obj = js.Dynamic.literal()
    if (batchId != null) __obj.updateDynamic("batchId")(batchId.asInstanceOf[js.Any])
    if (cancel != null) __obj.updateDynamic("cancel")(cancel)
    if (cancelLineItem != null) __obj.updateDynamic("cancelLineItem")(cancelLineItem)
    if (merchantId != null) __obj.updateDynamic("merchantId")(merchantId)
    if (merchantOrderId != null) __obj.updateDynamic("merchantOrderId")(merchantOrderId)
    if (method != null) __obj.updateDynamic("method")(method)
    if (operationId != null) __obj.updateDynamic("operationId")(operationId)
    if (orderId != null) __obj.updateDynamic("orderId")(orderId)
    if (refund != null) __obj.updateDynamic("refund")(refund)
    if (returnLineItem != null) __obj.updateDynamic("returnLineItem")(returnLineItem)
    if (shipLineItems != null) __obj.updateDynamic("shipLineItems")(shipLineItems)
    if (updateShipment != null) __obj.updateDynamic("updateShipment")(updateShipment)
    __obj.asInstanceOf[OrdersCustomBatchRequestEntry]
  }
}

