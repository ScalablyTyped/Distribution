package typings.gapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrdersCustomBatchRequestEntry extends js.Object {
  /** An entry ID, unique within the batch request. */
  var batchId: js.UndefOr[Double] = js.undefined
  /** Required for cancel method. */
  var cancel: js.UndefOr[OrdersCustomBatchRequestEntryCancel] = js.undefined
  /** Required for cancelLineItem method. */
  var cancelLineItem: js.UndefOr[OrdersCustomBatchRequestEntryCancelLineItem] = js.undefined
  /** The ID of the managing account. */
  var merchantId: js.UndefOr[String] = js.undefined
  /** The merchant order id. Required for updateMerchantOrderId and getByMerchantOrderId methods. */
  var merchantOrderId: js.UndefOr[String] = js.undefined
  /** The method to apply. */
  var method: js.UndefOr[String] = js.undefined
  /** The ID of the operation. Unique across all operations for a given order. Required for all methods beside get and getByMerchantOrderId. */
  var operationId: js.UndefOr[String] = js.undefined
  /** The ID of the order. Required for all methods beside getByMerchantOrderId. */
  var orderId: js.UndefOr[String] = js.undefined
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
    batchId: js.UndefOr[Double] = js.undefined,
    cancel: OrdersCustomBatchRequestEntryCancel = null,
    cancelLineItem: OrdersCustomBatchRequestEntryCancelLineItem = null,
    merchantId: String = null,
    merchantOrderId: String = null,
    method: String = null,
    operationId: String = null,
    orderId: String = null,
    refund: OrdersCustomBatchRequestEntryRefund = null,
    returnLineItem: OrdersCustomBatchRequestEntryReturnLineItem = null,
    shipLineItems: OrdersCustomBatchRequestEntryShipLineItems = null,
    updateShipment: OrdersCustomBatchRequestEntryUpdateShipment = null
  ): OrdersCustomBatchRequestEntry = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(batchId)) __obj.updateDynamic("batchId")(batchId.get.asInstanceOf[js.Any])
    if (cancel != null) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    if (cancelLineItem != null) __obj.updateDynamic("cancelLineItem")(cancelLineItem.asInstanceOf[js.Any])
    if (merchantId != null) __obj.updateDynamic("merchantId")(merchantId.asInstanceOf[js.Any])
    if (merchantOrderId != null) __obj.updateDynamic("merchantOrderId")(merchantOrderId.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (operationId != null) __obj.updateDynamic("operationId")(operationId.asInstanceOf[js.Any])
    if (orderId != null) __obj.updateDynamic("orderId")(orderId.asInstanceOf[js.Any])
    if (refund != null) __obj.updateDynamic("refund")(refund.asInstanceOf[js.Any])
    if (returnLineItem != null) __obj.updateDynamic("returnLineItem")(returnLineItem.asInstanceOf[js.Any])
    if (shipLineItems != null) __obj.updateDynamic("shipLineItems")(shipLineItems.asInstanceOf[js.Any])
    if (updateShipment != null) __obj.updateDynamic("updateShipment")(updateShipment.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrdersCustomBatchRequestEntry]
  }
}

