package typings.googleapis.buildSrcApisContentV2Mod.content_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$OrdersCustomBatchRequestEntry extends js.Object {
  /**
    * An entry ID, unique within the batch request.
    */
  var batchId: js.UndefOr[Double] = js.native
  /**
    * Required for cancel method.
    */
  var cancel: js.UndefOr[Schema$OrdersCustomBatchRequestEntryCancel] = js.native
  /**
    * Required for cancelLineItem method.
    */
  var cancelLineItem: js.UndefOr[Schema$OrdersCustomBatchRequestEntryCancelLineItem] = js.native
  /**
    * Required for inStoreReturnLineItem method.
    */
  var inStoreRefundLineItem: js.UndefOr[Schema$OrdersCustomBatchRequestEntryInStoreRefundLineItem] = js.native
  /**
    * The ID of the managing account.
    */
  var merchantId: js.UndefOr[String] = js.native
  /**
    * The merchant order ID. Required for updateMerchantOrderId and
    * getByMerchantOrderId methods.
    */
  var merchantOrderId: js.UndefOr[String] = js.native
  /**
    * The method to apply.
    */
  var method: js.UndefOr[String] = js.native
  /**
    * The ID of the operation. Unique across all operations for a given order.
    * Required for all methods beside get and getByMerchantOrderId.
    */
  var operationId: js.UndefOr[String] = js.native
  /**
    * The ID of the order. Required for all methods beside
    * getByMerchantOrderId.
    */
  var orderId: js.UndefOr[String] = js.native
  /**
    * Required for refund method.
    */
  var refund: js.UndefOr[Schema$OrdersCustomBatchRequestEntryRefund] = js.native
  /**
    * Required for rejectReturnLineItem method.
    */
  var rejectReturnLineItem: js.UndefOr[Schema$OrdersCustomBatchRequestEntryRejectReturnLineItem] = js.native
  /**
    * Required for returnLineItem method.
    */
  var returnLineItem: js.UndefOr[Schema$OrdersCustomBatchRequestEntryReturnLineItem] = js.native
  /**
    * Required for returnRefundLineItem method.
    */
  var returnRefundLineItem: js.UndefOr[Schema$OrdersCustomBatchRequestEntryReturnRefundLineItem] = js.native
  /**
    * Required for setLineItemMetadata method.
    */
  var setLineItemMetadata: js.UndefOr[Schema$OrdersCustomBatchRequestEntrySetLineItemMetadata] = js.native
  /**
    * Required for shipLineItems method.
    */
  var shipLineItems: js.UndefOr[Schema$OrdersCustomBatchRequestEntryShipLineItems] = js.native
  /**
    * Required for updateLineItemShippingDate method.
    */
  var updateLineItemShippingDetails: js.UndefOr[Schema$OrdersCustomBatchRequestEntryUpdateLineItemShippingDetails] = js.native
  /**
    * Required for updateShipment method.
    */
  var updateShipment: js.UndefOr[Schema$OrdersCustomBatchRequestEntryUpdateShipment] = js.native
}

object Schema$OrdersCustomBatchRequestEntry {
  @scala.inline
  def apply(
    batchId: Int | Double = null,
    cancel: Schema$OrdersCustomBatchRequestEntryCancel = null,
    cancelLineItem: Schema$OrdersCustomBatchRequestEntryCancelLineItem = null,
    inStoreRefundLineItem: Schema$OrdersCustomBatchRequestEntryInStoreRefundLineItem = null,
    merchantId: String = null,
    merchantOrderId: String = null,
    method: String = null,
    operationId: String = null,
    orderId: String = null,
    refund: Schema$OrdersCustomBatchRequestEntryRefund = null,
    rejectReturnLineItem: Schema$OrdersCustomBatchRequestEntryRejectReturnLineItem = null,
    returnLineItem: Schema$OrdersCustomBatchRequestEntryReturnLineItem = null,
    returnRefundLineItem: Schema$OrdersCustomBatchRequestEntryReturnRefundLineItem = null,
    setLineItemMetadata: Schema$OrdersCustomBatchRequestEntrySetLineItemMetadata = null,
    shipLineItems: Schema$OrdersCustomBatchRequestEntryShipLineItems = null,
    updateLineItemShippingDetails: Schema$OrdersCustomBatchRequestEntryUpdateLineItemShippingDetails = null,
    updateShipment: Schema$OrdersCustomBatchRequestEntryUpdateShipment = null
  ): Schema$OrdersCustomBatchRequestEntry = {
    val __obj = js.Dynamic.literal()
    if (batchId != null) __obj.updateDynamic("batchId")(batchId.asInstanceOf[js.Any])
    if (cancel != null) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    if (cancelLineItem != null) __obj.updateDynamic("cancelLineItem")(cancelLineItem.asInstanceOf[js.Any])
    if (inStoreRefundLineItem != null) __obj.updateDynamic("inStoreRefundLineItem")(inStoreRefundLineItem.asInstanceOf[js.Any])
    if (merchantId != null) __obj.updateDynamic("merchantId")(merchantId.asInstanceOf[js.Any])
    if (merchantOrderId != null) __obj.updateDynamic("merchantOrderId")(merchantOrderId.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (operationId != null) __obj.updateDynamic("operationId")(operationId.asInstanceOf[js.Any])
    if (orderId != null) __obj.updateDynamic("orderId")(orderId.asInstanceOf[js.Any])
    if (refund != null) __obj.updateDynamic("refund")(refund.asInstanceOf[js.Any])
    if (rejectReturnLineItem != null) __obj.updateDynamic("rejectReturnLineItem")(rejectReturnLineItem.asInstanceOf[js.Any])
    if (returnLineItem != null) __obj.updateDynamic("returnLineItem")(returnLineItem.asInstanceOf[js.Any])
    if (returnRefundLineItem != null) __obj.updateDynamic("returnRefundLineItem")(returnRefundLineItem.asInstanceOf[js.Any])
    if (setLineItemMetadata != null) __obj.updateDynamic("setLineItemMetadata")(setLineItemMetadata.asInstanceOf[js.Any])
    if (shipLineItems != null) __obj.updateDynamic("shipLineItems")(shipLineItems.asInstanceOf[js.Any])
    if (updateLineItemShippingDetails != null) __obj.updateDynamic("updateLineItemShippingDetails")(updateLineItemShippingDetails.asInstanceOf[js.Any])
    if (updateShipment != null) __obj.updateDynamic("updateShipment")(updateShipment.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$OrdersCustomBatchRequestEntry]
  }
}

