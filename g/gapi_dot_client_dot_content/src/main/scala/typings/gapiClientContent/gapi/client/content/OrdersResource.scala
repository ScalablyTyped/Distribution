package typings.gapiClientContent.gapi.client.content

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientContent.AnonAcknowledged
import typings.gapiClientContent.AnonAlt
import typings.gapiClientContent.AnonMerchantOrderId
import typings.gapiClientContent.AnonOrderId
import typings.gapiClientContent.AnonQuotaUser
import typings.gapiClientContent.AnonTemplateName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrdersResource extends js.Object {
  /** Marks an order as acknowledged. This method can only be called for non-multi-client accounts. */
  def acknowledge(request: AnonOrderId): Request_[OrdersAcknowledgeResponse]
  /** Sandbox only. Moves a test order from state "inProgress" to state "pendingShipment". This method can only be called for non-multi-client accounts. */
  def advancetestorder(request: AnonOrderId): Request_[OrdersAdvanceTestOrderResponse]
  /** Cancels all line items in an order, making a full refund. This method can only be called for non-multi-client accounts. */
  def cancel(request: AnonOrderId): Request_[OrdersCancelResponse]
  /** Cancels a line item, making a full refund. This method can only be called for non-multi-client accounts. */
  def cancellineitem(request: AnonOrderId): Request_[OrdersCancelLineItemResponse]
  /** Sandbox only. Creates a test order. This method can only be called for non-multi-client accounts. */
  def createtestorder(request: AnonQuotaUser): Request_[OrdersCreateTestOrderResponse]
  /** Retrieves or modifies multiple orders in a single request. This method can only be called for non-multi-client accounts. */
  def custombatch(request: AnonAlt): Request_[OrdersCustomBatchResponse]
  /** Retrieves an order from your Merchant Center account. This method can only be called for non-multi-client accounts. */
  def get(request: AnonOrderId): Request_[Order]
  /** Retrieves an order using merchant order id. This method can only be called for non-multi-client accounts. */
  def getbymerchantorderid(request: AnonMerchantOrderId): Request_[OrdersGetByMerchantOrderIdResponse]
  /**
    * Sandbox only. Retrieves an order template that can be used to quickly create a new order in sandbox. This method can only be called for
    * non-multi-client accounts.
    */
  def gettestordertemplate(request: AnonTemplateName): Request_[OrdersGetTestOrderTemplateResponse]
  /** Lists the orders in your Merchant Center account. This method can only be called for non-multi-client accounts. */
  def list(request: AnonAcknowledged): Request_[OrdersListResponse]
  /** Refund a portion of the order, up to the full amount paid. This method can only be called for non-multi-client accounts. */
  def refund(request: AnonOrderId): Request_[OrdersRefundResponse]
  /** Returns a line item. This method can only be called for non-multi-client accounts. */
  def returnlineitem(request: AnonOrderId): Request_[OrdersReturnLineItemResponse]
  /** Marks line item(s) as shipped. This method can only be called for non-multi-client accounts. */
  def shiplineitems(request: AnonOrderId): Request_[OrdersShipLineItemsResponse]
  /** Updates the merchant order ID for a given order. This method can only be called for non-multi-client accounts. */
  def updatemerchantorderid(request: AnonOrderId): Request_[OrdersUpdateMerchantOrderIdResponse]
  /** Updates a shipment's status, carrier, and/or tracking ID. This method can only be called for non-multi-client accounts. */
  def updateshipment(request: AnonOrderId): Request_[OrdersUpdateShipmentResponse]
}

object OrdersResource {
  @scala.inline
  def apply(
    acknowledge: AnonOrderId => Request_[OrdersAcknowledgeResponse],
    advancetestorder: AnonOrderId => Request_[OrdersAdvanceTestOrderResponse],
    cancel: AnonOrderId => Request_[OrdersCancelResponse],
    cancellineitem: AnonOrderId => Request_[OrdersCancelLineItemResponse],
    createtestorder: AnonQuotaUser => Request_[OrdersCreateTestOrderResponse],
    custombatch: AnonAlt => Request_[OrdersCustomBatchResponse],
    get: AnonOrderId => Request_[Order],
    getbymerchantorderid: AnonMerchantOrderId => Request_[OrdersGetByMerchantOrderIdResponse],
    gettestordertemplate: AnonTemplateName => Request_[OrdersGetTestOrderTemplateResponse],
    list: AnonAcknowledged => Request_[OrdersListResponse],
    refund: AnonOrderId => Request_[OrdersRefundResponse],
    returnlineitem: AnonOrderId => Request_[OrdersReturnLineItemResponse],
    shiplineitems: AnonOrderId => Request_[OrdersShipLineItemsResponse],
    updatemerchantorderid: AnonOrderId => Request_[OrdersUpdateMerchantOrderIdResponse],
    updateshipment: AnonOrderId => Request_[OrdersUpdateShipmentResponse]
  ): OrdersResource = {
    val __obj = js.Dynamic.literal(acknowledge = js.Any.fromFunction1(acknowledge), advancetestorder = js.Any.fromFunction1(advancetestorder), cancel = js.Any.fromFunction1(cancel), cancellineitem = js.Any.fromFunction1(cancellineitem), createtestorder = js.Any.fromFunction1(createtestorder), custombatch = js.Any.fromFunction1(custombatch), get = js.Any.fromFunction1(get), getbymerchantorderid = js.Any.fromFunction1(getbymerchantorderid), gettestordertemplate = js.Any.fromFunction1(gettestordertemplate), list = js.Any.fromFunction1(list), refund = js.Any.fromFunction1(refund), returnlineitem = js.Any.fromFunction1(returnlineitem), shiplineitems = js.Any.fromFunction1(shiplineitems), updatemerchantorderid = js.Any.fromFunction1(updatemerchantorderid), updateshipment = js.Any.fromFunction1(updateshipment))
  
    __obj.asInstanceOf[OrdersResource]
  }
}

