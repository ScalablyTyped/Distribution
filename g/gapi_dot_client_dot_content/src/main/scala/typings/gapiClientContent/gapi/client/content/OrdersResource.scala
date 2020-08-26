package typings.gapiClientContent.gapi.client.content

import typings.gapiClient.gapi.client.Request
import typings.gapiClientContent.anon.Acknowledged
import typings.gapiClientContent.anon.Alt
import typings.gapiClientContent.anon.MerchantOrderId
import typings.gapiClientContent.anon.OrderId
import typings.gapiClientContent.anon.QuotaUser
import typings.gapiClientContent.anon.TemplateName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrdersResource extends js.Object {
  /** Marks an order as acknowledged. This method can only be called for non-multi-client accounts. */
  def acknowledge(request: OrderId): Request[OrdersAcknowledgeResponse] = js.native
  /** Sandbox only. Moves a test order from state "inProgress" to state "pendingShipment". This method can only be called for non-multi-client accounts. */
  def advancetestorder(request: OrderId): Request[OrdersAdvanceTestOrderResponse] = js.native
  /** Cancels all line items in an order, making a full refund. This method can only be called for non-multi-client accounts. */
  def cancel(request: OrderId): Request[OrdersCancelResponse] = js.native
  /** Cancels a line item, making a full refund. This method can only be called for non-multi-client accounts. */
  def cancellineitem(request: OrderId): Request[OrdersCancelLineItemResponse] = js.native
  /** Sandbox only. Creates a test order. This method can only be called for non-multi-client accounts. */
  def createtestorder(request: QuotaUser): Request[OrdersCreateTestOrderResponse] = js.native
  /** Retrieves or modifies multiple orders in a single request. This method can only be called for non-multi-client accounts. */
  def custombatch(request: Alt): Request[OrdersCustomBatchResponse] = js.native
  /** Retrieves an order from your Merchant Center account. This method can only be called for non-multi-client accounts. */
  def get(request: OrderId): Request[Order] = js.native
  /** Retrieves an order using merchant order id. This method can only be called for non-multi-client accounts. */
  def getbymerchantorderid(request: MerchantOrderId): Request[OrdersGetByMerchantOrderIdResponse] = js.native
  /**
    * Sandbox only. Retrieves an order template that can be used to quickly create a new order in sandbox. This method can only be called for
    * non-multi-client accounts.
    */
  def gettestordertemplate(request: TemplateName): Request[OrdersGetTestOrderTemplateResponse] = js.native
  /** Lists the orders in your Merchant Center account. This method can only be called for non-multi-client accounts. */
  def list(request: Acknowledged): Request[OrdersListResponse] = js.native
  /** Refund a portion of the order, up to the full amount paid. This method can only be called for non-multi-client accounts. */
  def refund(request: OrderId): Request[OrdersRefundResponse] = js.native
  /** Returns a line item. This method can only be called for non-multi-client accounts. */
  def returnlineitem(request: OrderId): Request[OrdersReturnLineItemResponse] = js.native
  /** Marks line item(s) as shipped. This method can only be called for non-multi-client accounts. */
  def shiplineitems(request: OrderId): Request[OrdersShipLineItemsResponse] = js.native
  /** Updates the merchant order ID for a given order. This method can only be called for non-multi-client accounts. */
  def updatemerchantorderid(request: OrderId): Request[OrdersUpdateMerchantOrderIdResponse] = js.native
  /** Updates a shipment's status, carrier, and/or tracking ID. This method can only be called for non-multi-client accounts. */
  def updateshipment(request: OrderId): Request[OrdersUpdateShipmentResponse] = js.native
}

object OrdersResource {
  @scala.inline
  def apply(
    acknowledge: OrderId => Request[OrdersAcknowledgeResponse],
    advancetestorder: OrderId => Request[OrdersAdvanceTestOrderResponse],
    cancel: OrderId => Request[OrdersCancelResponse],
    cancellineitem: OrderId => Request[OrdersCancelLineItemResponse],
    createtestorder: QuotaUser => Request[OrdersCreateTestOrderResponse],
    custombatch: Alt => Request[OrdersCustomBatchResponse],
    get: OrderId => Request[Order],
    getbymerchantorderid: MerchantOrderId => Request[OrdersGetByMerchantOrderIdResponse],
    gettestordertemplate: TemplateName => Request[OrdersGetTestOrderTemplateResponse],
    list: Acknowledged => Request[OrdersListResponse],
    refund: OrderId => Request[OrdersRefundResponse],
    returnlineitem: OrderId => Request[OrdersReturnLineItemResponse],
    shiplineitems: OrderId => Request[OrdersShipLineItemsResponse],
    updatemerchantorderid: OrderId => Request[OrdersUpdateMerchantOrderIdResponse],
    updateshipment: OrderId => Request[OrdersUpdateShipmentResponse]
  ): OrdersResource = {
    val __obj = js.Dynamic.literal(acknowledge = js.Any.fromFunction1(acknowledge), advancetestorder = js.Any.fromFunction1(advancetestorder), cancel = js.Any.fromFunction1(cancel), cancellineitem = js.Any.fromFunction1(cancellineitem), createtestorder = js.Any.fromFunction1(createtestorder), custombatch = js.Any.fromFunction1(custombatch), get = js.Any.fromFunction1(get), getbymerchantorderid = js.Any.fromFunction1(getbymerchantorderid), gettestordertemplate = js.Any.fromFunction1(gettestordertemplate), list = js.Any.fromFunction1(list), refund = js.Any.fromFunction1(refund), returnlineitem = js.Any.fromFunction1(returnlineitem), shiplineitems = js.Any.fromFunction1(shiplineitems), updatemerchantorderid = js.Any.fromFunction1(updatemerchantorderid), updateshipment = js.Any.fromFunction1(updateshipment))
    __obj.asInstanceOf[OrdersResource]
  }
  @scala.inline
  implicit class OrdersResourceOps[Self <: OrdersResource] (val x: Self) extends AnyVal {
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
    def setAcknowledge(value: OrderId => Request[OrdersAcknowledgeResponse]): Self = this.set("acknowledge", js.Any.fromFunction1(value))
    @scala.inline
    def setAdvancetestorder(value: OrderId => Request[OrdersAdvanceTestOrderResponse]): Self = this.set("advancetestorder", js.Any.fromFunction1(value))
    @scala.inline
    def setCancel(value: OrderId => Request[OrdersCancelResponse]): Self = this.set("cancel", js.Any.fromFunction1(value))
    @scala.inline
    def setCancellineitem(value: OrderId => Request[OrdersCancelLineItemResponse]): Self = this.set("cancellineitem", js.Any.fromFunction1(value))
    @scala.inline
    def setCreatetestorder(value: QuotaUser => Request[OrdersCreateTestOrderResponse]): Self = this.set("createtestorder", js.Any.fromFunction1(value))
    @scala.inline
    def setCustombatch(value: Alt => Request[OrdersCustomBatchResponse]): Self = this.set("custombatch", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: OrderId => Request[Order]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setGetbymerchantorderid(value: MerchantOrderId => Request[OrdersGetByMerchantOrderIdResponse]): Self = this.set("getbymerchantorderid", js.Any.fromFunction1(value))
    @scala.inline
    def setGettestordertemplate(value: TemplateName => Request[OrdersGetTestOrderTemplateResponse]): Self = this.set("gettestordertemplate", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: Acknowledged => Request[OrdersListResponse]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setRefund(value: OrderId => Request[OrdersRefundResponse]): Self = this.set("refund", js.Any.fromFunction1(value))
    @scala.inline
    def setReturnlineitem(value: OrderId => Request[OrdersReturnLineItemResponse]): Self = this.set("returnlineitem", js.Any.fromFunction1(value))
    @scala.inline
    def setShiplineitems(value: OrderId => Request[OrdersShipLineItemsResponse]): Self = this.set("shiplineitems", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdatemerchantorderid(value: OrderId => Request[OrdersUpdateMerchantOrderIdResponse]): Self = this.set("updatemerchantorderid", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdateshipment(value: OrderId => Request[OrdersUpdateShipmentResponse]): Self = this.set("updateshipment", js.Any.fromFunction1(value))
  }
  
}

