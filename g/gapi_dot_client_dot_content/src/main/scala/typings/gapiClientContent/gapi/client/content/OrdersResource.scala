package typings.gapiClientContent.gapi.client.content

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientContent.AnonAcknowledged
import typings.gapiClientContent.AnonAlt
import typings.gapiClientContent.AnonAltFieldsKey
import typings.gapiClientContent.AnonAltFieldsKeyMerchantId
import typings.gapiClientContent.AnonAltFieldsKeyMerchantIdMerchantOrderId
import typings.gapiClientContent.AnonAltFieldsKeyMerchantIdOauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrdersResource extends js.Object {
  /** Marks an order as acknowledged. This method can only be called for non-multi-client accounts. */
  def acknowledge(request: AnonAltFieldsKey): Request_[OrdersAcknowledgeResponse]
  /** Sandbox only. Moves a test order from state "inProgress" to state "pendingShipment". This method can only be called for non-multi-client accounts. */
  def advancetestorder(request: AnonAltFieldsKey): Request_[OrdersAdvanceTestOrderResponse]
  /** Cancels all line items in an order, making a full refund. This method can only be called for non-multi-client accounts. */
  def cancel(request: AnonAltFieldsKey): Request_[OrdersCancelResponse]
  /** Cancels a line item, making a full refund. This method can only be called for non-multi-client accounts. */
  def cancellineitem(request: AnonAltFieldsKey): Request_[OrdersCancelLineItemResponse]
  /** Sandbox only. Creates a test order. This method can only be called for non-multi-client accounts. */
  def createtestorder(request: AnonAltFieldsKeyMerchantId): Request_[OrdersCreateTestOrderResponse]
  /** Retrieves or modifies multiple orders in a single request. This method can only be called for non-multi-client accounts. */
  def custombatch(request: AnonAlt): Request_[OrdersCustomBatchResponse]
  /** Retrieves an order from your Merchant Center account. This method can only be called for non-multi-client accounts. */
  def get(request: AnonAltFieldsKey): Request_[Order]
  /** Retrieves an order using merchant order id. This method can only be called for non-multi-client accounts. */
  def getbymerchantorderid(request: AnonAltFieldsKeyMerchantIdMerchantOrderId): Request_[OrdersGetByMerchantOrderIdResponse]
  /**
    * Sandbox only. Retrieves an order template that can be used to quickly create a new order in sandbox. This method can only be called for
    * non-multi-client accounts.
    */
  def gettestordertemplate(request: AnonAltFieldsKeyMerchantIdOauthtoken): Request_[OrdersGetTestOrderTemplateResponse]
  /** Lists the orders in your Merchant Center account. This method can only be called for non-multi-client accounts. */
  def list(request: AnonAcknowledged): Request_[OrdersListResponse]
  /** Refund a portion of the order, up to the full amount paid. This method can only be called for non-multi-client accounts. */
  def refund(request: AnonAltFieldsKey): Request_[OrdersRefundResponse]
  /** Returns a line item. This method can only be called for non-multi-client accounts. */
  def returnlineitem(request: AnonAltFieldsKey): Request_[OrdersReturnLineItemResponse]
  /** Marks line item(s) as shipped. This method can only be called for non-multi-client accounts. */
  def shiplineitems(request: AnonAltFieldsKey): Request_[OrdersShipLineItemsResponse]
  /** Updates the merchant order ID for a given order. This method can only be called for non-multi-client accounts. */
  def updatemerchantorderid(request: AnonAltFieldsKey): Request_[OrdersUpdateMerchantOrderIdResponse]
  /** Updates a shipment's status, carrier, and/or tracking ID. This method can only be called for non-multi-client accounts. */
  def updateshipment(request: AnonAltFieldsKey): Request_[OrdersUpdateShipmentResponse]
}

object OrdersResource {
  @scala.inline
  def apply(
    acknowledge: AnonAltFieldsKey => Request_[OrdersAcknowledgeResponse],
    advancetestorder: AnonAltFieldsKey => Request_[OrdersAdvanceTestOrderResponse],
    cancel: AnonAltFieldsKey => Request_[OrdersCancelResponse],
    cancellineitem: AnonAltFieldsKey => Request_[OrdersCancelLineItemResponse],
    createtestorder: AnonAltFieldsKeyMerchantId => Request_[OrdersCreateTestOrderResponse],
    custombatch: AnonAlt => Request_[OrdersCustomBatchResponse],
    get: AnonAltFieldsKey => Request_[Order],
    getbymerchantorderid: AnonAltFieldsKeyMerchantIdMerchantOrderId => Request_[OrdersGetByMerchantOrderIdResponse],
    gettestordertemplate: AnonAltFieldsKeyMerchantIdOauthtoken => Request_[OrdersGetTestOrderTemplateResponse],
    list: AnonAcknowledged => Request_[OrdersListResponse],
    refund: AnonAltFieldsKey => Request_[OrdersRefundResponse],
    returnlineitem: AnonAltFieldsKey => Request_[OrdersReturnLineItemResponse],
    shiplineitems: AnonAltFieldsKey => Request_[OrdersShipLineItemsResponse],
    updatemerchantorderid: AnonAltFieldsKey => Request_[OrdersUpdateMerchantOrderIdResponse],
    updateshipment: AnonAltFieldsKey => Request_[OrdersUpdateShipmentResponse]
  ): OrdersResource = {
    val __obj = js.Dynamic.literal(acknowledge = js.Any.fromFunction1(acknowledge), advancetestorder = js.Any.fromFunction1(advancetestorder), cancel = js.Any.fromFunction1(cancel), cancellineitem = js.Any.fromFunction1(cancellineitem), createtestorder = js.Any.fromFunction1(createtestorder), custombatch = js.Any.fromFunction1(custombatch), get = js.Any.fromFunction1(get), getbymerchantorderid = js.Any.fromFunction1(getbymerchantorderid), gettestordertemplate = js.Any.fromFunction1(gettestordertemplate), list = js.Any.fromFunction1(list), refund = js.Any.fromFunction1(refund), returnlineitem = js.Any.fromFunction1(returnlineitem), shiplineitems = js.Any.fromFunction1(shiplineitems), updatemerchantorderid = js.Any.fromFunction1(updatemerchantorderid), updateshipment = js.Any.fromFunction1(updateshipment))
  
    __obj.asInstanceOf[OrdersResource]
  }
}

