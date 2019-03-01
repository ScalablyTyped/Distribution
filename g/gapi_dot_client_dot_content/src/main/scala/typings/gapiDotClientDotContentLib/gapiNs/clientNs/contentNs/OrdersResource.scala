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
    acknowledge: js.Function1[
      gapiDotClientDotContentLib.Anon_AltFieldsKey, 
      gapiDotClientLib.gapiNs.clientNs.Request[OrdersAcknowledgeResponse]
    ],
    advancetestorder: js.Function1[
      gapiDotClientDotContentLib.Anon_AltFieldsKey, 
      gapiDotClientLib.gapiNs.clientNs.Request[OrdersAdvanceTestOrderResponse]
    ],
    cancel: js.Function1[
      gapiDotClientDotContentLib.Anon_AltFieldsKey, 
      gapiDotClientLib.gapiNs.clientNs.Request[OrdersCancelResponse]
    ],
    cancellineitem: js.Function1[
      gapiDotClientDotContentLib.Anon_AltFieldsKey, 
      gapiDotClientLib.gapiNs.clientNs.Request[OrdersCancelLineItemResponse]
    ],
    createtestorder: js.Function1[
      gapiDotClientDotContentLib.Anon_AltFieldsKeyMerchantId, 
      gapiDotClientLib.gapiNs.clientNs.Request[OrdersCreateTestOrderResponse]
    ],
    custombatch: js.Function1[
      gapiDotClientDotContentLib.Anon_Alt, 
      gapiDotClientLib.gapiNs.clientNs.Request[OrdersCustomBatchResponse]
    ],
    get: js.Function1[
      gapiDotClientDotContentLib.Anon_AltFieldsKey, 
      gapiDotClientLib.gapiNs.clientNs.Request[Order]
    ],
    getbymerchantorderid: js.Function1[
      gapiDotClientDotContentLib.Anon_AltFieldsKeyMerchantIdMerchantOrderId, 
      gapiDotClientLib.gapiNs.clientNs.Request[OrdersGetByMerchantOrderIdResponse]
    ],
    gettestordertemplate: js.Function1[
      gapiDotClientDotContentLib.Anon_AltFieldsKeyMerchantIdOauthtoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[OrdersGetTestOrderTemplateResponse]
    ],
    list: js.Function1[
      gapiDotClientDotContentLib.Anon_Acknowledged, 
      gapiDotClientLib.gapiNs.clientNs.Request[OrdersListResponse]
    ],
    refund: js.Function1[
      gapiDotClientDotContentLib.Anon_AltFieldsKey, 
      gapiDotClientLib.gapiNs.clientNs.Request[OrdersRefundResponse]
    ],
    returnlineitem: js.Function1[
      gapiDotClientDotContentLib.Anon_AltFieldsKey, 
      gapiDotClientLib.gapiNs.clientNs.Request[OrdersReturnLineItemResponse]
    ],
    shiplineitems: js.Function1[
      gapiDotClientDotContentLib.Anon_AltFieldsKey, 
      gapiDotClientLib.gapiNs.clientNs.Request[OrdersShipLineItemsResponse]
    ],
    updatemerchantorderid: js.Function1[
      gapiDotClientDotContentLib.Anon_AltFieldsKey, 
      gapiDotClientLib.gapiNs.clientNs.Request[OrdersUpdateMerchantOrderIdResponse]
    ],
    updateshipment: js.Function1[
      gapiDotClientDotContentLib.Anon_AltFieldsKey, 
      gapiDotClientLib.gapiNs.clientNs.Request[OrdersUpdateShipmentResponse]
    ]
  ): OrdersResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acknowledge")(acknowledge)
    __obj.updateDynamic("advancetestorder")(advancetestorder)
    __obj.updateDynamic("cancel")(cancel)
    __obj.updateDynamic("cancellineitem")(cancellineitem)
    __obj.updateDynamic("createtestorder")(createtestorder)
    __obj.updateDynamic("custombatch")(custombatch)
    __obj.updateDynamic("get")(get)
    __obj.updateDynamic("getbymerchantorderid")(getbymerchantorderid)
    __obj.updateDynamic("gettestordertemplate")(gettestordertemplate)
    __obj.updateDynamic("list")(list)
    __obj.updateDynamic("refund")(refund)
    __obj.updateDynamic("returnlineitem")(returnlineitem)
    __obj.updateDynamic("shiplineitems")(shiplineitems)
    __obj.updateDynamic("updatemerchantorderid")(updatemerchantorderid)
    __obj.updateDynamic("updateshipment")(updateshipment)
    __obj.asInstanceOf[OrdersResource]
  }
}

