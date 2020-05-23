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

trait OrdersResource extends js.Object {
  /** Marks an order as acknowledged. This method can only be called for non-multi-client accounts. */
  def acknowledge(request: OrderId): Request[OrdersAcknowledgeResponse]
  /** Sandbox only. Moves a test order from state "inProgress" to state "pendingShipment". This method can only be called for non-multi-client accounts. */
  def advancetestorder(request: OrderId): Request[OrdersAdvanceTestOrderResponse]
  /** Cancels all line items in an order, making a full refund. This method can only be called for non-multi-client accounts. */
  def cancel(request: OrderId): Request[OrdersCancelResponse]
  /** Cancels a line item, making a full refund. This method can only be called for non-multi-client accounts. */
  def cancellineitem(request: OrderId): Request[OrdersCancelLineItemResponse]
  /** Sandbox only. Creates a test order. This method can only be called for non-multi-client accounts. */
  def createtestorder(request: QuotaUser): Request[OrdersCreateTestOrderResponse]
  /** Retrieves or modifies multiple orders in a single request. This method can only be called for non-multi-client accounts. */
  def custombatch(request: Alt): Request[OrdersCustomBatchResponse]
  /** Retrieves an order from your Merchant Center account. This method can only be called for non-multi-client accounts. */
  def get(request: OrderId): Request[Order]
  /** Retrieves an order using merchant order id. This method can only be called for non-multi-client accounts. */
  def getbymerchantorderid(request: MerchantOrderId): Request[OrdersGetByMerchantOrderIdResponse]
  /**
    * Sandbox only. Retrieves an order template that can be used to quickly create a new order in sandbox. This method can only be called for
    * non-multi-client accounts.
    */
  def gettestordertemplate(request: TemplateName): Request[OrdersGetTestOrderTemplateResponse]
  /** Lists the orders in your Merchant Center account. This method can only be called for non-multi-client accounts. */
  def list(request: Acknowledged): Request[OrdersListResponse]
  /** Refund a portion of the order, up to the full amount paid. This method can only be called for non-multi-client accounts. */
  def refund(request: OrderId): Request[OrdersRefundResponse]
  /** Returns a line item. This method can only be called for non-multi-client accounts. */
  def returnlineitem(request: OrderId): Request[OrdersReturnLineItemResponse]
  /** Marks line item(s) as shipped. This method can only be called for non-multi-client accounts. */
  def shiplineitems(request: OrderId): Request[OrdersShipLineItemsResponse]
  /** Updates the merchant order ID for a given order. This method can only be called for non-multi-client accounts. */
  def updatemerchantorderid(request: OrderId): Request[OrdersUpdateMerchantOrderIdResponse]
  /** Updates a shipment's status, carrier, and/or tracking ID. This method can only be called for non-multi-client accounts. */
  def updateshipment(request: OrderId): Request[OrdersUpdateShipmentResponse]
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
}

