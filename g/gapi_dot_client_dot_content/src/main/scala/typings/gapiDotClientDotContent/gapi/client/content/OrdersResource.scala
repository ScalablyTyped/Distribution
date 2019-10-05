package typings.gapiDotClientDotContent.gapi.client.content

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotContent.Anon_Acknowledged
import typings.gapiDotClientDotContent.Anon_Alt
import typings.gapiDotClientDotContent.Anon_AltFieldsKey
import typings.gapiDotClientDotContent.Anon_AltFieldsKeyMerchantId
import typings.gapiDotClientDotContent.Anon_AltFieldsKeyMerchantIdMerchantOrderId
import typings.gapiDotClientDotContent.Anon_AltFieldsKeyMerchantIdOauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrdersResource extends js.Object {
  /** Marks an order as acknowledged. This method can only be called for non-multi-client accounts. */
  def acknowledge(request: Anon_AltFieldsKey): Request[OrdersAcknowledgeResponse]
  /** Sandbox only. Moves a test order from state "inProgress" to state "pendingShipment". This method can only be called for non-multi-client accounts. */
  def advancetestorder(request: Anon_AltFieldsKey): Request[OrdersAdvanceTestOrderResponse]
  /** Cancels all line items in an order, making a full refund. This method can only be called for non-multi-client accounts. */
  def cancel(request: Anon_AltFieldsKey): Request[OrdersCancelResponse]
  /** Cancels a line item, making a full refund. This method can only be called for non-multi-client accounts. */
  def cancellineitem(request: Anon_AltFieldsKey): Request[OrdersCancelLineItemResponse]
  /** Sandbox only. Creates a test order. This method can only be called for non-multi-client accounts. */
  def createtestorder(request: Anon_AltFieldsKeyMerchantId): Request[OrdersCreateTestOrderResponse]
  /** Retrieves or modifies multiple orders in a single request. This method can only be called for non-multi-client accounts. */
  def custombatch(request: Anon_Alt): Request[OrdersCustomBatchResponse]
  /** Retrieves an order from your Merchant Center account. This method can only be called for non-multi-client accounts. */
  def get(request: Anon_AltFieldsKey): Request[Order]
  /** Retrieves an order using merchant order id. This method can only be called for non-multi-client accounts. */
  def getbymerchantorderid(request: Anon_AltFieldsKeyMerchantIdMerchantOrderId): Request[OrdersGetByMerchantOrderIdResponse]
  /**
    * Sandbox only. Retrieves an order template that can be used to quickly create a new order in sandbox. This method can only be called for
    * non-multi-client accounts.
    */
  def gettestordertemplate(request: Anon_AltFieldsKeyMerchantIdOauthtoken): Request[OrdersGetTestOrderTemplateResponse]
  /** Lists the orders in your Merchant Center account. This method can only be called for non-multi-client accounts. */
  def list(request: Anon_Acknowledged): Request[OrdersListResponse]
  /** Refund a portion of the order, up to the full amount paid. This method can only be called for non-multi-client accounts. */
  def refund(request: Anon_AltFieldsKey): Request[OrdersRefundResponse]
  /** Returns a line item. This method can only be called for non-multi-client accounts. */
  def returnlineitem(request: Anon_AltFieldsKey): Request[OrdersReturnLineItemResponse]
  /** Marks line item(s) as shipped. This method can only be called for non-multi-client accounts. */
  def shiplineitems(request: Anon_AltFieldsKey): Request[OrdersShipLineItemsResponse]
  /** Updates the merchant order ID for a given order. This method can only be called for non-multi-client accounts. */
  def updatemerchantorderid(request: Anon_AltFieldsKey): Request[OrdersUpdateMerchantOrderIdResponse]
  /** Updates a shipment's status, carrier, and/or tracking ID. This method can only be called for non-multi-client accounts. */
  def updateshipment(request: Anon_AltFieldsKey): Request[OrdersUpdateShipmentResponse]
}

object OrdersResource {
  @scala.inline
  def apply(
    acknowledge: Anon_AltFieldsKey => Request[OrdersAcknowledgeResponse],
    advancetestorder: Anon_AltFieldsKey => Request[OrdersAdvanceTestOrderResponse],
    cancel: Anon_AltFieldsKey => Request[OrdersCancelResponse],
    cancellineitem: Anon_AltFieldsKey => Request[OrdersCancelLineItemResponse],
    createtestorder: Anon_AltFieldsKeyMerchantId => Request[OrdersCreateTestOrderResponse],
    custombatch: Anon_Alt => Request[OrdersCustomBatchResponse],
    get: Anon_AltFieldsKey => Request[Order],
    getbymerchantorderid: Anon_AltFieldsKeyMerchantIdMerchantOrderId => Request[OrdersGetByMerchantOrderIdResponse],
    gettestordertemplate: Anon_AltFieldsKeyMerchantIdOauthtoken => Request[OrdersGetTestOrderTemplateResponse],
    list: Anon_Acknowledged => Request[OrdersListResponse],
    refund: Anon_AltFieldsKey => Request[OrdersRefundResponse],
    returnlineitem: Anon_AltFieldsKey => Request[OrdersReturnLineItemResponse],
    shiplineitems: Anon_AltFieldsKey => Request[OrdersShipLineItemsResponse],
    updatemerchantorderid: Anon_AltFieldsKey => Request[OrdersUpdateMerchantOrderIdResponse],
    updateshipment: Anon_AltFieldsKey => Request[OrdersUpdateShipmentResponse]
  ): OrdersResource = {
    val __obj = js.Dynamic.literal(acknowledge = js.Any.fromFunction1(acknowledge), advancetestorder = js.Any.fromFunction1(advancetestorder), cancel = js.Any.fromFunction1(cancel), cancellineitem = js.Any.fromFunction1(cancellineitem), createtestorder = js.Any.fromFunction1(createtestorder), custombatch = js.Any.fromFunction1(custombatch), get = js.Any.fromFunction1(get), getbymerchantorderid = js.Any.fromFunction1(getbymerchantorderid), gettestordertemplate = js.Any.fromFunction1(gettestordertemplate), list = js.Any.fromFunction1(list), refund = js.Any.fromFunction1(refund), returnlineitem = js.Any.fromFunction1(returnlineitem), shiplineitems = js.Any.fromFunction1(shiplineitems), updatemerchantorderid = js.Any.fromFunction1(updatemerchantorderid), updateshipment = js.Any.fromFunction1(updateshipment))
  
    __obj.asInstanceOf[OrdersResource]
  }
}

