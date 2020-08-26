package typings.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrdersCustomBatchRequestEntry extends js.Object {
  var batchId: js.UndefOr[Double] = js.native
  var cancel: js.UndefOr[OrdersCustomBatchRequestEntryCancel] = js.native
  var cancelLineItem: js.UndefOr[OrdersCustomBatchRequestEntryCancelLineItem] = js.native
  var inStoreRefundLineItem: js.UndefOr[OrdersCustomBatchRequestEntryInStoreRefundLineItem] = js.native
  var merchantId: js.UndefOr[String] = js.native
  var merchantOrderId: js.UndefOr[String] = js.native
  var method: js.UndefOr[String] = js.native
  var operationId: js.UndefOr[String] = js.native
  var orderId: js.UndefOr[String] = js.native
  var refund: js.UndefOr[OrdersCustomBatchRequestEntryRefund] = js.native
  var rejectReturnLineItem: js.UndefOr[OrdersCustomBatchRequestEntryRejectReturnLineItem] = js.native
  var returnLineItem: js.UndefOr[OrdersCustomBatchRequestEntryReturnLineItem] = js.native
  var returnRefundLineItem: js.UndefOr[OrdersCustomBatchRequestEntryReturnRefundLineItem] = js.native
  var setLineItemMetadata: js.UndefOr[OrdersCustomBatchRequestEntrySetLineItemMetadata] = js.native
  var shipLineItems: js.UndefOr[OrdersCustomBatchRequestEntryShipLineItems] = js.native
  var updateLineItemShippingDetails: js.UndefOr[OrdersCustomBatchRequestEntryUpdateLineItemShippingDetails] = js.native
  var updateShipment: js.UndefOr[OrdersCustomBatchRequestEntryUpdateShipment] = js.native
}

object OrdersCustomBatchRequestEntry {
  @scala.inline
  def apply(): OrdersCustomBatchRequestEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrdersCustomBatchRequestEntry]
  }
  @scala.inline
  implicit class OrdersCustomBatchRequestEntryOps[Self <: OrdersCustomBatchRequestEntry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBatchId(value: Double): Self = this.set("batchId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBatchId: Self = this.set("batchId", js.undefined)
    @scala.inline
    def setCancel(value: OrdersCustomBatchRequestEntryCancel): Self = this.set("cancel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCancel: Self = this.set("cancel", js.undefined)
    @scala.inline
    def setCancelLineItem(value: OrdersCustomBatchRequestEntryCancelLineItem): Self = this.set("cancelLineItem", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCancelLineItem: Self = this.set("cancelLineItem", js.undefined)
    @scala.inline
    def setInStoreRefundLineItem(value: OrdersCustomBatchRequestEntryInStoreRefundLineItem): Self = this.set("inStoreRefundLineItem", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInStoreRefundLineItem: Self = this.set("inStoreRefundLineItem", js.undefined)
    @scala.inline
    def setMerchantId(value: String): Self = this.set("merchantId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMerchantId: Self = this.set("merchantId", js.undefined)
    @scala.inline
    def setMerchantOrderId(value: String): Self = this.set("merchantOrderId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMerchantOrderId: Self = this.set("merchantOrderId", js.undefined)
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    @scala.inline
    def setOperationId(value: String): Self = this.set("operationId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperationId: Self = this.set("operationId", js.undefined)
    @scala.inline
    def setOrderId(value: String): Self = this.set("orderId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrderId: Self = this.set("orderId", js.undefined)
    @scala.inline
    def setRefund(value: OrdersCustomBatchRequestEntryRefund): Self = this.set("refund", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRefund: Self = this.set("refund", js.undefined)
    @scala.inline
    def setRejectReturnLineItem(value: OrdersCustomBatchRequestEntryRejectReturnLineItem): Self = this.set("rejectReturnLineItem", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRejectReturnLineItem: Self = this.set("rejectReturnLineItem", js.undefined)
    @scala.inline
    def setReturnLineItem(value: OrdersCustomBatchRequestEntryReturnLineItem): Self = this.set("returnLineItem", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReturnLineItem: Self = this.set("returnLineItem", js.undefined)
    @scala.inline
    def setReturnRefundLineItem(value: OrdersCustomBatchRequestEntryReturnRefundLineItem): Self = this.set("returnRefundLineItem", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReturnRefundLineItem: Self = this.set("returnRefundLineItem", js.undefined)
    @scala.inline
    def setSetLineItemMetadata(value: OrdersCustomBatchRequestEntrySetLineItemMetadata): Self = this.set("setLineItemMetadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSetLineItemMetadata: Self = this.set("setLineItemMetadata", js.undefined)
    @scala.inline
    def setShipLineItems(value: OrdersCustomBatchRequestEntryShipLineItems): Self = this.set("shipLineItems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShipLineItems: Self = this.set("shipLineItems", js.undefined)
    @scala.inline
    def setUpdateLineItemShippingDetails(value: OrdersCustomBatchRequestEntryUpdateLineItemShippingDetails): Self = this.set("updateLineItemShippingDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdateLineItemShippingDetails: Self = this.set("updateLineItemShippingDetails", js.undefined)
    @scala.inline
    def setUpdateShipment(value: OrdersCustomBatchRequestEntryUpdateShipment): Self = this.set("updateShipment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdateShipment: Self = this.set("updateShipment", js.undefined)
  }
  
}

