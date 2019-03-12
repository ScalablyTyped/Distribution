package typings
package gapiDotClientDotContentLib.gapiNs.clientNs.contentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrdersResource extends js.Object {
  /** Marks an order as acknowledged. This method can only be called for non-multi-client accounts. */
  def acknowledge(request: gapiDotClientDotContentLib.Anon_AltFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[OrdersAcknowledgeResponse]
  /** Sandbox only. Moves a test order from state "inProgress" to state "pendingShipment". This method can only be called for non-multi-client accounts. */
  def advancetestorder(request: gapiDotClientDotContentLib.Anon_AltFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[OrdersAdvanceTestOrderResponse]
  /** Cancels all line items in an order, making a full refund. This method can only be called for non-multi-client accounts. */
  def cancel(request: gapiDotClientDotContentLib.Anon_AltFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[OrdersCancelResponse]
  /** Cancels a line item, making a full refund. This method can only be called for non-multi-client accounts. */
  def cancellineitem(request: gapiDotClientDotContentLib.Anon_AltFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[OrdersCancelLineItemResponse]
  /** Sandbox only. Creates a test order. This method can only be called for non-multi-client accounts. */
  def createtestorder(request: gapiDotClientDotContentLib.Anon_AltFieldsKeyMerchantId): gapiDotClientLib.gapiNs.clientNs.Request[OrdersCreateTestOrderResponse]
  /** Retrieves or modifies multiple orders in a single request. This method can only be called for non-multi-client accounts. */
  def custombatch(request: gapiDotClientDotContentLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[OrdersCustomBatchResponse]
  /** Retrieves an order from your Merchant Center account. This method can only be called for non-multi-client accounts. */
  def get(request: gapiDotClientDotContentLib.Anon_AltFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[Order]
  /** Retrieves an order using merchant order id. This method can only be called for non-multi-client accounts. */
  def getbymerchantorderid(request: gapiDotClientDotContentLib.Anon_AltFieldsKeyMerchantIdMerchantOrderId): gapiDotClientLib.gapiNs.clientNs.Request[OrdersGetByMerchantOrderIdResponse]
  /**
    * Sandbox only. Retrieves an order template that can be used to quickly create a new order in sandbox. This method can only be called for
    * non-multi-client accounts.
    */
  def gettestordertemplate(request: gapiDotClientDotContentLib.Anon_AltFieldsKeyMerchantIdOauthtoken): gapiDotClientLib.gapiNs.clientNs.Request[OrdersGetTestOrderTemplateResponse]
  /** Lists the orders in your Merchant Center account. This method can only be called for non-multi-client accounts. */
  def list(request: gapiDotClientDotContentLib.Anon_Acknowledged): gapiDotClientLib.gapiNs.clientNs.Request[OrdersListResponse]
  /** Refund a portion of the order, up to the full amount paid. This method can only be called for non-multi-client accounts. */
  def refund(request: gapiDotClientDotContentLib.Anon_AltFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[OrdersRefundResponse]
  /** Returns a line item. This method can only be called for non-multi-client accounts. */
  def returnlineitem(request: gapiDotClientDotContentLib.Anon_AltFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[OrdersReturnLineItemResponse]
  /** Marks line item(s) as shipped. This method can only be called for non-multi-client accounts. */
  def shiplineitems(request: gapiDotClientDotContentLib.Anon_AltFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[OrdersShipLineItemsResponse]
  /** Updates the merchant order ID for a given order. This method can only be called for non-multi-client accounts. */
  def updatemerchantorderid(request: gapiDotClientDotContentLib.Anon_AltFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[OrdersUpdateMerchantOrderIdResponse]
  /** Updates a shipment's status, carrier, and/or tracking ID. This method can only be called for non-multi-client accounts. */
  def updateshipment(request: gapiDotClientDotContentLib.Anon_AltFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[OrdersUpdateShipmentResponse]
}

object OrdersResource {
  @scala.inline
  def apply(
    acknowledge: gapiDotClientDotContentLib.Anon_AltFieldsKey => gapiDotClientLib.gapiNs.clientNs.Request[OrdersAcknowledgeResponse],
    advancetestorder: gapiDotClientDotContentLib.Anon_AltFieldsKey => gapiDotClientLib.gapiNs.clientNs.Request[OrdersAdvanceTestOrderResponse],
    cancel: gapiDotClientDotContentLib.Anon_AltFieldsKey => gapiDotClientLib.gapiNs.clientNs.Request[OrdersCancelResponse],
    cancellineitem: gapiDotClientDotContentLib.Anon_AltFieldsKey => gapiDotClientLib.gapiNs.clientNs.Request[OrdersCancelLineItemResponse],
    createtestorder: gapiDotClientDotContentLib.Anon_AltFieldsKeyMerchantId => gapiDotClientLib.gapiNs.clientNs.Request[OrdersCreateTestOrderResponse],
    custombatch: gapiDotClientDotContentLib.Anon_Alt => gapiDotClientLib.gapiNs.clientNs.Request[OrdersCustomBatchResponse],
    get: gapiDotClientDotContentLib.Anon_AltFieldsKey => gapiDotClientLib.gapiNs.clientNs.Request[Order],
    getbymerchantorderid: gapiDotClientDotContentLib.Anon_AltFieldsKeyMerchantIdMerchantOrderId => gapiDotClientLib.gapiNs.clientNs.Request[OrdersGetByMerchantOrderIdResponse],
    gettestordertemplate: gapiDotClientDotContentLib.Anon_AltFieldsKeyMerchantIdOauthtoken => gapiDotClientLib.gapiNs.clientNs.Request[OrdersGetTestOrderTemplateResponse],
    list: gapiDotClientDotContentLib.Anon_Acknowledged => gapiDotClientLib.gapiNs.clientNs.Request[OrdersListResponse],
    refund: gapiDotClientDotContentLib.Anon_AltFieldsKey => gapiDotClientLib.gapiNs.clientNs.Request[OrdersRefundResponse],
    returnlineitem: gapiDotClientDotContentLib.Anon_AltFieldsKey => gapiDotClientLib.gapiNs.clientNs.Request[OrdersReturnLineItemResponse],
    shiplineitems: gapiDotClientDotContentLib.Anon_AltFieldsKey => gapiDotClientLib.gapiNs.clientNs.Request[OrdersShipLineItemsResponse],
    updatemerchantorderid: gapiDotClientDotContentLib.Anon_AltFieldsKey => gapiDotClientLib.gapiNs.clientNs.Request[OrdersUpdateMerchantOrderIdResponse],
    updateshipment: gapiDotClientDotContentLib.Anon_AltFieldsKey => gapiDotClientLib.gapiNs.clientNs.Request[OrdersUpdateShipmentResponse]
  ): OrdersResource = {
    val __obj = js.Dynamic.literal(acknowledge = js.Any.fromFunction1(acknowledge), advancetestorder = js.Any.fromFunction1(advancetestorder), cancel = js.Any.fromFunction1(cancel), cancellineitem = js.Any.fromFunction1(cancellineitem), createtestorder = js.Any.fromFunction1(createtestorder), custombatch = js.Any.fromFunction1(custombatch), get = js.Any.fromFunction1(get), getbymerchantorderid = js.Any.fromFunction1(getbymerchantorderid), gettestordertemplate = js.Any.fromFunction1(gettestordertemplate), list = js.Any.fromFunction1(list), refund = js.Any.fromFunction1(refund), returnlineitem = js.Any.fromFunction1(returnlineitem), shiplineitems = js.Any.fromFunction1(shiplineitems), updatemerchantorderid = js.Any.fromFunction1(updatemerchantorderid), updateshipment = js.Any.fromFunction1(updateshipment))
  
    __obj.asInstanceOf[OrdersResource]
  }
}

