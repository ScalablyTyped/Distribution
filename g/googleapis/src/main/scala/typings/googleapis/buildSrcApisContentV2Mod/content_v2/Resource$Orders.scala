package typings.googleapis.buildSrcApisContentV2Mod.content_v2

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/content/v2", "content_v2.Resource$Orders")
@js.native
class Resource$Orders protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * content.orders.acknowledge
    * @desc Marks an order as acknowledged.
    * @alias content.orders.acknowledge
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.merchantId The ID of the account that manages the order. This cannot be a multi-client account.
    * @param {string} params.orderId The ID of the order.
    * @param {().OrdersAcknowledgeRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def acknowledge(): GaxiosPromise[Schema$OrdersAcknowledgeResponse] = js.native
  def acknowledge(callback: BodyResponseCallback[Schema$OrdersAcknowledgeResponse]): Unit = js.native
  def acknowledge(params: ParamsDollarResourceDollarOrdersDollarAcknowledge): GaxiosPromise[Schema$OrdersAcknowledgeResponse] = js.native
  def acknowledge(
    params: ParamsDollarResourceDollarOrdersDollarAcknowledge,
    callback: BodyResponseCallback[Schema$OrdersAcknowledgeResponse]
  ): Unit = js.native
  def acknowledge(
    params: ParamsDollarResourceDollarOrdersDollarAcknowledge,
    options: BodyResponseCallback[Schema$OrdersAcknowledgeResponse],
    callback: BodyResponseCallback[Schema$OrdersAcknowledgeResponse]
  ): Unit = js.native
  def acknowledge(params: ParamsDollarResourceDollarOrdersDollarAcknowledge, options: MethodOptions): GaxiosPromise[Schema$OrdersAcknowledgeResponse] = js.native
  def acknowledge(
    params: ParamsDollarResourceDollarOrdersDollarAcknowledge,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$OrdersAcknowledgeResponse]
  ): Unit = js.native
  /**
    * content.orders.advancetestorder
    * @desc Sandbox only. Moves a test order from state "inProgress" to state
    * "pendingShipment".
    * @alias content.orders.advancetestorder
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.merchantId The ID of the account that manages the order. This cannot be a multi-client account.
    * @param {string} params.orderId The ID of the test order to modify.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def advancetestorder(): GaxiosPromise[Schema$OrdersAdvanceTestOrderResponse] = js.native
  def advancetestorder(callback: BodyResponseCallback[Schema$OrdersAdvanceTestOrderResponse]): Unit = js.native
  def advancetestorder(params: ParamsDollarResourceDollarOrdersDollarAdvancetestorder): GaxiosPromise[Schema$OrdersAdvanceTestOrderResponse] = js.native
  def advancetestorder(
    params: ParamsDollarResourceDollarOrdersDollarAdvancetestorder,
    callback: BodyResponseCallback[Schema$OrdersAdvanceTestOrderResponse]
  ): Unit = js.native
  def advancetestorder(
    params: ParamsDollarResourceDollarOrdersDollarAdvancetestorder,
    options: BodyResponseCallback[Schema$OrdersAdvanceTestOrderResponse],
    callback: BodyResponseCallback[Schema$OrdersAdvanceTestOrderResponse]
  ): Unit = js.native
  def advancetestorder(params: ParamsDollarResourceDollarOrdersDollarAdvancetestorder, options: MethodOptions): GaxiosPromise[Schema$OrdersAdvanceTestOrderResponse] = js.native
  def advancetestorder(
    params: ParamsDollarResourceDollarOrdersDollarAdvancetestorder,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$OrdersAdvanceTestOrderResponse]
  ): Unit = js.native
  /**
    * content.orders.cancel
    * @desc Cancels all line items in an order, making a full refund.
    * @alias content.orders.cancel
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.merchantId The ID of the account that manages the order. This cannot be a multi-client account.
    * @param {string} params.orderId The ID of the order to cancel.
    * @param {().OrdersCancelRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def cancel(): GaxiosPromise[Schema$OrdersCancelResponse] = js.native
  def cancel(callback: BodyResponseCallback[Schema$OrdersCancelResponse]): Unit = js.native
  def cancel(params: ParamsDollarResourceDollarOrdersDollarCancel): GaxiosPromise[Schema$OrdersCancelResponse] = js.native
  def cancel(
    params: ParamsDollarResourceDollarOrdersDollarCancel,
    callback: BodyResponseCallback[Schema$OrdersCancelResponse]
  ): Unit = js.native
  def cancel(
    params: ParamsDollarResourceDollarOrdersDollarCancel,
    options: BodyResponseCallback[Schema$OrdersCancelResponse],
    callback: BodyResponseCallback[Schema$OrdersCancelResponse]
  ): Unit = js.native
  def cancel(params: ParamsDollarResourceDollarOrdersDollarCancel, options: MethodOptions): GaxiosPromise[Schema$OrdersCancelResponse] = js.native
  def cancel(
    params: ParamsDollarResourceDollarOrdersDollarCancel,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$OrdersCancelResponse]
  ): Unit = js.native
  /**
    * content.orders.cancellineitem
    * @desc Cancels a line item, making a full refund.
    * @alias content.orders.cancellineitem
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.merchantId The ID of the account that manages the order. This cannot be a multi-client account.
    * @param {string} params.orderId The ID of the order.
    * @param {().OrdersCancelLineItemRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def cancellineitem(): GaxiosPromise[Schema$OrdersCancelLineItemResponse] = js.native
  def cancellineitem(callback: BodyResponseCallback[Schema$OrdersCancelLineItemResponse]): Unit = js.native
  def cancellineitem(params: ParamsDollarResourceDollarOrdersDollarCancellineitem): GaxiosPromise[Schema$OrdersCancelLineItemResponse] = js.native
  def cancellineitem(
    params: ParamsDollarResourceDollarOrdersDollarCancellineitem,
    callback: BodyResponseCallback[Schema$OrdersCancelLineItemResponse]
  ): Unit = js.native
  def cancellineitem(
    params: ParamsDollarResourceDollarOrdersDollarCancellineitem,
    options: BodyResponseCallback[Schema$OrdersCancelLineItemResponse],
    callback: BodyResponseCallback[Schema$OrdersCancelLineItemResponse]
  ): Unit = js.native
  def cancellineitem(params: ParamsDollarResourceDollarOrdersDollarCancellineitem, options: MethodOptions): GaxiosPromise[Schema$OrdersCancelLineItemResponse] = js.native
  def cancellineitem(
    params: ParamsDollarResourceDollarOrdersDollarCancellineitem,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$OrdersCancelLineItemResponse]
  ): Unit = js.native
  /**
    * content.orders.canceltestorderbycustomer
    * @desc Sandbox only. Cancels a test order for customer-initiated
    * cancellation.
    * @alias content.orders.canceltestorderbycustomer
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.merchantId The ID of the account that manages the order. This cannot be a multi-client account.
    * @param {string} params.orderId The ID of the test order to cancel.
    * @param {().OrdersCancelTestOrderByCustomerRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def canceltestorderbycustomer(): GaxiosPromise[Schema$OrdersCancelTestOrderByCustomerResponse] = js.native
  def canceltestorderbycustomer(callback: BodyResponseCallback[Schema$OrdersCancelTestOrderByCustomerResponse]): Unit = js.native
  def canceltestorderbycustomer(params: ParamsDollarResourceDollarOrdersDollarCanceltestorderbycustomer): GaxiosPromise[Schema$OrdersCancelTestOrderByCustomerResponse] = js.native
  def canceltestorderbycustomer(
    params: ParamsDollarResourceDollarOrdersDollarCanceltestorderbycustomer,
    callback: BodyResponseCallback[Schema$OrdersCancelTestOrderByCustomerResponse]
  ): Unit = js.native
  def canceltestorderbycustomer(
    params: ParamsDollarResourceDollarOrdersDollarCanceltestorderbycustomer,
    options: BodyResponseCallback[Schema$OrdersCancelTestOrderByCustomerResponse],
    callback: BodyResponseCallback[Schema$OrdersCancelTestOrderByCustomerResponse]
  ): Unit = js.native
  def canceltestorderbycustomer(params: ParamsDollarResourceDollarOrdersDollarCanceltestorderbycustomer, options: MethodOptions): GaxiosPromise[Schema$OrdersCancelTestOrderByCustomerResponse] = js.native
  def canceltestorderbycustomer(
    params: ParamsDollarResourceDollarOrdersDollarCanceltestorderbycustomer,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$OrdersCancelTestOrderByCustomerResponse]
  ): Unit = js.native
  /**
    * content.orders.createtestorder
    * @desc Sandbox only. Creates a test order.
    * @alias content.orders.createtestorder
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.merchantId The ID of the account that should manage the order. This cannot be a multi-client account.
    * @param {().OrdersCreateTestOrderRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def createtestorder(): GaxiosPromise[Schema$OrdersCreateTestOrderResponse] = js.native
  def createtestorder(callback: BodyResponseCallback[Schema$OrdersCreateTestOrderResponse]): Unit = js.native
  def createtestorder(params: ParamsDollarResourceDollarOrdersDollarCreatetestorder): GaxiosPromise[Schema$OrdersCreateTestOrderResponse] = js.native
  def createtestorder(
    params: ParamsDollarResourceDollarOrdersDollarCreatetestorder,
    callback: BodyResponseCallback[Schema$OrdersCreateTestOrderResponse]
  ): Unit = js.native
  def createtestorder(
    params: ParamsDollarResourceDollarOrdersDollarCreatetestorder,
    options: BodyResponseCallback[Schema$OrdersCreateTestOrderResponse],
    callback: BodyResponseCallback[Schema$OrdersCreateTestOrderResponse]
  ): Unit = js.native
  def createtestorder(params: ParamsDollarResourceDollarOrdersDollarCreatetestorder, options: MethodOptions): GaxiosPromise[Schema$OrdersCreateTestOrderResponse] = js.native
  def createtestorder(
    params: ParamsDollarResourceDollarOrdersDollarCreatetestorder,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$OrdersCreateTestOrderResponse]
  ): Unit = js.native
  /**
    * content.orders.createtestreturn
    * @desc Sandbox only. Creates a test return.
    * @alias content.orders.createtestreturn
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.merchantId The ID of the account that manages the order. This cannot be a multi-client account.
    * @param {string} params.orderId The ID of the order.
    * @param {().OrdersCreateTestReturnRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def createtestreturn(): GaxiosPromise[Schema$OrdersCreateTestReturnResponse] = js.native
  def createtestreturn(callback: BodyResponseCallback[Schema$OrdersCreateTestReturnResponse]): Unit = js.native
  def createtestreturn(params: ParamsDollarResourceDollarOrdersDollarCreatetestreturn): GaxiosPromise[Schema$OrdersCreateTestReturnResponse] = js.native
  def createtestreturn(
    params: ParamsDollarResourceDollarOrdersDollarCreatetestreturn,
    callback: BodyResponseCallback[Schema$OrdersCreateTestReturnResponse]
  ): Unit = js.native
  def createtestreturn(
    params: ParamsDollarResourceDollarOrdersDollarCreatetestreturn,
    options: BodyResponseCallback[Schema$OrdersCreateTestReturnResponse],
    callback: BodyResponseCallback[Schema$OrdersCreateTestReturnResponse]
  ): Unit = js.native
  def createtestreturn(params: ParamsDollarResourceDollarOrdersDollarCreatetestreturn, options: MethodOptions): GaxiosPromise[Schema$OrdersCreateTestReturnResponse] = js.native
  def createtestreturn(
    params: ParamsDollarResourceDollarOrdersDollarCreatetestreturn,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$OrdersCreateTestReturnResponse]
  ): Unit = js.native
  /**
    * content.orders.custombatch
    * @desc Retrieves or modifies multiple orders in a single request.
    * @alias content.orders.custombatch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().OrdersCustomBatchRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def custombatch(): GaxiosPromise[Schema$OrdersCustomBatchResponse] = js.native
  def custombatch(callback: BodyResponseCallback[Schema$OrdersCustomBatchResponse]): Unit = js.native
  def custombatch(params: ParamsDollarResourceDollarOrdersDollarCustombatch): GaxiosPromise[Schema$OrdersCustomBatchResponse] = js.native
  def custombatch(
    params: ParamsDollarResourceDollarOrdersDollarCustombatch,
    callback: BodyResponseCallback[Schema$OrdersCustomBatchResponse]
  ): Unit = js.native
  def custombatch(
    params: ParamsDollarResourceDollarOrdersDollarCustombatch,
    options: BodyResponseCallback[Schema$OrdersCustomBatchResponse],
    callback: BodyResponseCallback[Schema$OrdersCustomBatchResponse]
  ): Unit = js.native
  def custombatch(params: ParamsDollarResourceDollarOrdersDollarCustombatch, options: MethodOptions): GaxiosPromise[Schema$OrdersCustomBatchResponse] = js.native
  def custombatch(
    params: ParamsDollarResourceDollarOrdersDollarCustombatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$OrdersCustomBatchResponse]
  ): Unit = js.native
  /**
    * content.orders.get
    * @desc Retrieves an order from your Merchant Center account.
    * @alias content.orders.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.merchantId The ID of the account that manages the order. This cannot be a multi-client account.
    * @param {string} params.orderId The ID of the order.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Order] = js.native
  def get(callback: BodyResponseCallback[Schema$Order]): Unit = js.native
  def get(params: ParamsDollarResourceDollarOrdersDollarGet): GaxiosPromise[Schema$Order] = js.native
  def get(params: ParamsDollarResourceDollarOrdersDollarGet, callback: BodyResponseCallback[Schema$Order]): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarOrdersDollarGet,
    options: BodyResponseCallback[Schema$Order],
    callback: BodyResponseCallback[Schema$Order]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarOrdersDollarGet, options: MethodOptions): GaxiosPromise[Schema$Order] = js.native
  def get(
    params: ParamsDollarResourceDollarOrdersDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Order]
  ): Unit = js.native
  /**
    * content.orders.getbymerchantorderid
    * @desc Retrieves an order using merchant order ID.
    * @alias content.orders.getbymerchantorderid
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.merchantId The ID of the account that manages the order. This cannot be a multi-client account.
    * @param {string} params.merchantOrderId The merchant order ID to be looked for.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getbymerchantorderid(): GaxiosPromise[Schema$OrdersGetByMerchantOrderIdResponse] = js.native
  def getbymerchantorderid(callback: BodyResponseCallback[Schema$OrdersGetByMerchantOrderIdResponse]): Unit = js.native
  def getbymerchantorderid(params: ParamsDollarResourceDollarOrdersDollarGetbymerchantorderid): GaxiosPromise[Schema$OrdersGetByMerchantOrderIdResponse] = js.native
  def getbymerchantorderid(
    params: ParamsDollarResourceDollarOrdersDollarGetbymerchantorderid,
    callback: BodyResponseCallback[Schema$OrdersGetByMerchantOrderIdResponse]
  ): Unit = js.native
  def getbymerchantorderid(
    params: ParamsDollarResourceDollarOrdersDollarGetbymerchantorderid,
    options: BodyResponseCallback[Schema$OrdersGetByMerchantOrderIdResponse],
    callback: BodyResponseCallback[Schema$OrdersGetByMerchantOrderIdResponse]
  ): Unit = js.native
  def getbymerchantorderid(params: ParamsDollarResourceDollarOrdersDollarGetbymerchantorderid, options: MethodOptions): GaxiosPromise[Schema$OrdersGetByMerchantOrderIdResponse] = js.native
  def getbymerchantorderid(
    params: ParamsDollarResourceDollarOrdersDollarGetbymerchantorderid,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$OrdersGetByMerchantOrderIdResponse]
  ): Unit = js.native
  /**
    * content.orders.gettestordertemplate
    * @desc Sandbox only. Retrieves an order template that can be used to
    * quickly create a new order in sandbox.
    * @alias content.orders.gettestordertemplate
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.country The country of the template to retrieve. Defaults to US.
    * @param {string} params.merchantId The ID of the account that should manage the order. This cannot be a multi-client account.
    * @param {string} params.templateName The name of the template to retrieve.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def gettestordertemplate(): GaxiosPromise[Schema$OrdersGetTestOrderTemplateResponse] = js.native
  def gettestordertemplate(callback: BodyResponseCallback[Schema$OrdersGetTestOrderTemplateResponse]): Unit = js.native
  def gettestordertemplate(params: ParamsDollarResourceDollarOrdersDollarGettestordertemplate): GaxiosPromise[Schema$OrdersGetTestOrderTemplateResponse] = js.native
  def gettestordertemplate(
    params: ParamsDollarResourceDollarOrdersDollarGettestordertemplate,
    callback: BodyResponseCallback[Schema$OrdersGetTestOrderTemplateResponse]
  ): Unit = js.native
  def gettestordertemplate(
    params: ParamsDollarResourceDollarOrdersDollarGettestordertemplate,
    options: BodyResponseCallback[Schema$OrdersGetTestOrderTemplateResponse],
    callback: BodyResponseCallback[Schema$OrdersGetTestOrderTemplateResponse]
  ): Unit = js.native
  def gettestordertemplate(params: ParamsDollarResourceDollarOrdersDollarGettestordertemplate, options: MethodOptions): GaxiosPromise[Schema$OrdersGetTestOrderTemplateResponse] = js.native
  def gettestordertemplate(
    params: ParamsDollarResourceDollarOrdersDollarGettestordertemplate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$OrdersGetTestOrderTemplateResponse]
  ): Unit = js.native
  /**
    * content.orders.instorerefundlineitem
    * @desc Notifies that item return and refund was handled directly by
    * merchant outside of Google payments processing (e.g. cash refund done in
    * store). Note: We recommend calling the returnrefundlineitem method to
    * refund in-store returns. We will issue the refund directly to the
    * customer. This helps to prevent possible differences arising between
    * merchant and Google transaction records. We also recommend having the
    * point of sale system communicate with Google to ensure that customers do
    * not receive a double refund by first refunding via Google then via an
    * in-store return.
    * @alias content.orders.instorerefundlineitem
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.merchantId The ID of the account that manages the order. This cannot be a multi-client account.
    * @param {string} params.orderId The ID of the order.
    * @param {().OrdersInStoreRefundLineItemRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def instorerefundlineitem(): GaxiosPromise[Schema$OrdersInStoreRefundLineItemResponse] = js.native
  def instorerefundlineitem(callback: BodyResponseCallback[Schema$OrdersInStoreRefundLineItemResponse]): Unit = js.native
  def instorerefundlineitem(params: ParamsDollarResourceDollarOrdersDollarInstorerefundlineitem): GaxiosPromise[Schema$OrdersInStoreRefundLineItemResponse] = js.native
  def instorerefundlineitem(
    params: ParamsDollarResourceDollarOrdersDollarInstorerefundlineitem,
    callback: BodyResponseCallback[Schema$OrdersInStoreRefundLineItemResponse]
  ): Unit = js.native
  def instorerefundlineitem(
    params: ParamsDollarResourceDollarOrdersDollarInstorerefundlineitem,
    options: BodyResponseCallback[Schema$OrdersInStoreRefundLineItemResponse],
    callback: BodyResponseCallback[Schema$OrdersInStoreRefundLineItemResponse]
  ): Unit = js.native
  def instorerefundlineitem(params: ParamsDollarResourceDollarOrdersDollarInstorerefundlineitem, options: MethodOptions): GaxiosPromise[Schema$OrdersInStoreRefundLineItemResponse] = js.native
  def instorerefundlineitem(
    params: ParamsDollarResourceDollarOrdersDollarInstorerefundlineitem,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$OrdersInStoreRefundLineItemResponse]
  ): Unit = js.native
  /**
    * content.orders.list
    * @desc Lists the orders in your Merchant Center account.
    * @alias content.orders.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {boolean=} params.acknowledged Obtains orders that match the acknowledgement status. When set to true, obtains orders that have been acknowledged. When false, obtains orders that have not been acknowledged. We recommend using this filter set to false, in conjunction with the acknowledge call, such that only un-acknowledged orders are returned.
    * @param {integer=} params.maxResults The maximum number of orders to return in the response, used for paging. The default value is 25 orders per page, and the maximum allowed value is 250 orders per page. Known issue: All List calls will return all Orders without limit regardless of the value of this field.
    * @param {string} params.merchantId The ID of the account that manages the order. This cannot be a multi-client account.
    * @param {string=} params.orderBy The ordering of the returned list. The only supported value are placedDate desc and placedDate asc for now, which returns orders sorted by placement date. "placedDate desc" stands for listing orders by placement date, from oldest to most recent. "placedDate asc" stands for listing orders by placement date, from most recent to oldest. In future releases we'll support other sorting criteria.
    * @param {string=} params.pageToken The token returned by the previous request.
    * @param {string=} params.placedDateEnd Obtains orders placed before this date (exclusively), in ISO 8601 format.
    * @param {string=} params.placedDateStart Obtains orders placed after this date (inclusively), in ISO 8601 format.
    * @param {string=} params.statuses Obtains orders that match any of the specified statuses. Multiple values can be specified with comma separation. Additionally, please note that active is a shortcut for pendingShipment and partiallyShipped, and completed is a shortcut for shipped , partiallyDelivered, delivered, partiallyReturned, returned, and canceled.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$OrdersListResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$OrdersListResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarOrdersDollarList): GaxiosPromise[Schema$OrdersListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarOrdersDollarList,
    callback: BodyResponseCallback[Schema$OrdersListResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarOrdersDollarList,
    options: BodyResponseCallback[Schema$OrdersListResponse],
    callback: BodyResponseCallback[Schema$OrdersListResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarOrdersDollarList, options: MethodOptions): GaxiosPromise[Schema$OrdersListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarOrdersDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$OrdersListResponse]
  ): Unit = js.native
  /**
    * content.orders.refund
    * @desc Deprecated, please use returnRefundLineItem instead.
    * @alias content.orders.refund
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.merchantId The ID of the account that manages the order. This cannot be a multi-client account.
    * @param {string} params.orderId The ID of the order to refund.
    * @param {().OrdersRefundRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def refund(): GaxiosPromise[Schema$OrdersRefundResponse] = js.native
  def refund(callback: BodyResponseCallback[Schema$OrdersRefundResponse]): Unit = js.native
  def refund(params: ParamsDollarResourceDollarOrdersDollarRefund): GaxiosPromise[Schema$OrdersRefundResponse] = js.native
  def refund(
    params: ParamsDollarResourceDollarOrdersDollarRefund,
    callback: BodyResponseCallback[Schema$OrdersRefundResponse]
  ): Unit = js.native
  def refund(
    params: ParamsDollarResourceDollarOrdersDollarRefund,
    options: BodyResponseCallback[Schema$OrdersRefundResponse],
    callback: BodyResponseCallback[Schema$OrdersRefundResponse]
  ): Unit = js.native
  def refund(params: ParamsDollarResourceDollarOrdersDollarRefund, options: MethodOptions): GaxiosPromise[Schema$OrdersRefundResponse] = js.native
  def refund(
    params: ParamsDollarResourceDollarOrdersDollarRefund,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$OrdersRefundResponse]
  ): Unit = js.native
  /**
    * content.orders.rejectreturnlineitem
    * @desc Rejects return on an line item.
    * @alias content.orders.rejectreturnlineitem
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.merchantId The ID of the account that manages the order. This cannot be a multi-client account.
    * @param {string} params.orderId The ID of the order.
    * @param {().OrdersRejectReturnLineItemRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def rejectreturnlineitem(): GaxiosPromise[Schema$OrdersRejectReturnLineItemResponse] = js.native
  def rejectreturnlineitem(callback: BodyResponseCallback[Schema$OrdersRejectReturnLineItemResponse]): Unit = js.native
  def rejectreturnlineitem(params: ParamsDollarResourceDollarOrdersDollarRejectreturnlineitem): GaxiosPromise[Schema$OrdersRejectReturnLineItemResponse] = js.native
  def rejectreturnlineitem(
    params: ParamsDollarResourceDollarOrdersDollarRejectreturnlineitem,
    callback: BodyResponseCallback[Schema$OrdersRejectReturnLineItemResponse]
  ): Unit = js.native
  def rejectreturnlineitem(
    params: ParamsDollarResourceDollarOrdersDollarRejectreturnlineitem,
    options: BodyResponseCallback[Schema$OrdersRejectReturnLineItemResponse],
    callback: BodyResponseCallback[Schema$OrdersRejectReturnLineItemResponse]
  ): Unit = js.native
  def rejectreturnlineitem(params: ParamsDollarResourceDollarOrdersDollarRejectreturnlineitem, options: MethodOptions): GaxiosPromise[Schema$OrdersRejectReturnLineItemResponse] = js.native
  def rejectreturnlineitem(
    params: ParamsDollarResourceDollarOrdersDollarRejectreturnlineitem,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$OrdersRejectReturnLineItemResponse]
  ): Unit = js.native
  /**
    * content.orders.returnlineitem
    * @desc Returns a line item.
    * @alias content.orders.returnlineitem
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.merchantId The ID of the account that manages the order. This cannot be a multi-client account.
    * @param {string} params.orderId The ID of the order.
    * @param {().OrdersReturnLineItemRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def returnlineitem(): GaxiosPromise[Schema$OrdersReturnLineItemResponse] = js.native
  def returnlineitem(callback: BodyResponseCallback[Schema$OrdersReturnLineItemResponse]): Unit = js.native
  def returnlineitem(params: ParamsDollarResourceDollarOrdersDollarReturnlineitem): GaxiosPromise[Schema$OrdersReturnLineItemResponse] = js.native
  def returnlineitem(
    params: ParamsDollarResourceDollarOrdersDollarReturnlineitem,
    callback: BodyResponseCallback[Schema$OrdersReturnLineItemResponse]
  ): Unit = js.native
  def returnlineitem(
    params: ParamsDollarResourceDollarOrdersDollarReturnlineitem,
    options: BodyResponseCallback[Schema$OrdersReturnLineItemResponse],
    callback: BodyResponseCallback[Schema$OrdersReturnLineItemResponse]
  ): Unit = js.native
  def returnlineitem(params: ParamsDollarResourceDollarOrdersDollarReturnlineitem, options: MethodOptions): GaxiosPromise[Schema$OrdersReturnLineItemResponse] = js.native
  def returnlineitem(
    params: ParamsDollarResourceDollarOrdersDollarReturnlineitem,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$OrdersReturnLineItemResponse]
  ): Unit = js.native
  /**
    * content.orders.returnrefundlineitem
    * @desc Returns and refunds a line item. Note that this method can only be
    * called on fully shipped orders.
    * @alias content.orders.returnrefundlineitem
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.merchantId The ID of the account that manages the order. This cannot be a multi-client account.
    * @param {string} params.orderId The ID of the order.
    * @param {().OrdersReturnRefundLineItemRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def returnrefundlineitem(): GaxiosPromise[Schema$OrdersReturnRefundLineItemResponse] = js.native
  def returnrefundlineitem(callback: BodyResponseCallback[Schema$OrdersReturnRefundLineItemResponse]): Unit = js.native
  def returnrefundlineitem(params: ParamsDollarResourceDollarOrdersDollarReturnrefundlineitem): GaxiosPromise[Schema$OrdersReturnRefundLineItemResponse] = js.native
  def returnrefundlineitem(
    params: ParamsDollarResourceDollarOrdersDollarReturnrefundlineitem,
    callback: BodyResponseCallback[Schema$OrdersReturnRefundLineItemResponse]
  ): Unit = js.native
  def returnrefundlineitem(
    params: ParamsDollarResourceDollarOrdersDollarReturnrefundlineitem,
    options: BodyResponseCallback[Schema$OrdersReturnRefundLineItemResponse],
    callback: BodyResponseCallback[Schema$OrdersReturnRefundLineItemResponse]
  ): Unit = js.native
  def returnrefundlineitem(params: ParamsDollarResourceDollarOrdersDollarReturnrefundlineitem, options: MethodOptions): GaxiosPromise[Schema$OrdersReturnRefundLineItemResponse] = js.native
  def returnrefundlineitem(
    params: ParamsDollarResourceDollarOrdersDollarReturnrefundlineitem,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$OrdersReturnRefundLineItemResponse]
  ): Unit = js.native
  /**
    * content.orders.setlineitemmetadata
    * @desc Sets (or overrides if it already exists) merchant provided
    * annotations in the form of key-value pairs. A common use case would be to
    * supply us with additional structured information about a line item that
    * cannot be provided via other methods. Submitted key-value pairs can be
    * retrieved as part of the orders resource.
    * @alias content.orders.setlineitemmetadata
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.merchantId The ID of the account that manages the order. This cannot be a multi-client account.
    * @param {string} params.orderId The ID of the order.
    * @param {().OrdersSetLineItemMetadataRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def setlineitemmetadata(): GaxiosPromise[Schema$OrdersSetLineItemMetadataResponse] = js.native
  def setlineitemmetadata(callback: BodyResponseCallback[Schema$OrdersSetLineItemMetadataResponse]): Unit = js.native
  def setlineitemmetadata(params: ParamsDollarResourceDollarOrdersDollarSetlineitemmetadata): GaxiosPromise[Schema$OrdersSetLineItemMetadataResponse] = js.native
  def setlineitemmetadata(
    params: ParamsDollarResourceDollarOrdersDollarSetlineitemmetadata,
    callback: BodyResponseCallback[Schema$OrdersSetLineItemMetadataResponse]
  ): Unit = js.native
  def setlineitemmetadata(
    params: ParamsDollarResourceDollarOrdersDollarSetlineitemmetadata,
    options: BodyResponseCallback[Schema$OrdersSetLineItemMetadataResponse],
    callback: BodyResponseCallback[Schema$OrdersSetLineItemMetadataResponse]
  ): Unit = js.native
  def setlineitemmetadata(params: ParamsDollarResourceDollarOrdersDollarSetlineitemmetadata, options: MethodOptions): GaxiosPromise[Schema$OrdersSetLineItemMetadataResponse] = js.native
  def setlineitemmetadata(
    params: ParamsDollarResourceDollarOrdersDollarSetlineitemmetadata,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$OrdersSetLineItemMetadataResponse]
  ): Unit = js.native
  /**
    * content.orders.shiplineitems
    * @desc Marks line item(s) as shipped.
    * @alias content.orders.shiplineitems
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.merchantId The ID of the account that manages the order. This cannot be a multi-client account.
    * @param {string} params.orderId The ID of the order.
    * @param {().OrdersShipLineItemsRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def shiplineitems(): GaxiosPromise[Schema$OrdersShipLineItemsResponse] = js.native
  def shiplineitems(callback: BodyResponseCallback[Schema$OrdersShipLineItemsResponse]): Unit = js.native
  def shiplineitems(params: ParamsDollarResourceDollarOrdersDollarShiplineitems): GaxiosPromise[Schema$OrdersShipLineItemsResponse] = js.native
  def shiplineitems(
    params: ParamsDollarResourceDollarOrdersDollarShiplineitems,
    callback: BodyResponseCallback[Schema$OrdersShipLineItemsResponse]
  ): Unit = js.native
  def shiplineitems(
    params: ParamsDollarResourceDollarOrdersDollarShiplineitems,
    options: BodyResponseCallback[Schema$OrdersShipLineItemsResponse],
    callback: BodyResponseCallback[Schema$OrdersShipLineItemsResponse]
  ): Unit = js.native
  def shiplineitems(params: ParamsDollarResourceDollarOrdersDollarShiplineitems, options: MethodOptions): GaxiosPromise[Schema$OrdersShipLineItemsResponse] = js.native
  def shiplineitems(
    params: ParamsDollarResourceDollarOrdersDollarShiplineitems,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$OrdersShipLineItemsResponse]
  ): Unit = js.native
  /**
    * content.orders.updatelineitemshippingdetails
    * @desc Updates ship by and delivery by dates for a line item.
    * @alias content.orders.updatelineitemshippingdetails
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.merchantId The ID of the account that manages the order. This cannot be a multi-client account.
    * @param {string} params.orderId The ID of the order.
    * @param {().OrdersUpdateLineItemShippingDetailsRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def updatelineitemshippingdetails(): GaxiosPromise[Schema$OrdersUpdateLineItemShippingDetailsResponse] = js.native
  def updatelineitemshippingdetails(callback: BodyResponseCallback[Schema$OrdersUpdateLineItemShippingDetailsResponse]): Unit = js.native
  def updatelineitemshippingdetails(params: ParamsDollarResourceDollarOrdersDollarUpdatelineitemshippingdetails): GaxiosPromise[Schema$OrdersUpdateLineItemShippingDetailsResponse] = js.native
  def updatelineitemshippingdetails(
    params: ParamsDollarResourceDollarOrdersDollarUpdatelineitemshippingdetails,
    callback: BodyResponseCallback[Schema$OrdersUpdateLineItemShippingDetailsResponse]
  ): Unit = js.native
  def updatelineitemshippingdetails(
    params: ParamsDollarResourceDollarOrdersDollarUpdatelineitemshippingdetails,
    options: BodyResponseCallback[Schema$OrdersUpdateLineItemShippingDetailsResponse],
    callback: BodyResponseCallback[Schema$OrdersUpdateLineItemShippingDetailsResponse]
  ): Unit = js.native
  def updatelineitemshippingdetails(
    params: ParamsDollarResourceDollarOrdersDollarUpdatelineitemshippingdetails,
    options: MethodOptions
  ): GaxiosPromise[Schema$OrdersUpdateLineItemShippingDetailsResponse] = js.native
  def updatelineitemshippingdetails(
    params: ParamsDollarResourceDollarOrdersDollarUpdatelineitemshippingdetails,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$OrdersUpdateLineItemShippingDetailsResponse]
  ): Unit = js.native
  /**
    * content.orders.updatemerchantorderid
    * @desc Updates the merchant order ID for a given order.
    * @alias content.orders.updatemerchantorderid
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.merchantId The ID of the account that manages the order. This cannot be a multi-client account.
    * @param {string} params.orderId The ID of the order.
    * @param {().OrdersUpdateMerchantOrderIdRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def updatemerchantorderid(): GaxiosPromise[Schema$OrdersUpdateMerchantOrderIdResponse] = js.native
  def updatemerchantorderid(callback: BodyResponseCallback[Schema$OrdersUpdateMerchantOrderIdResponse]): Unit = js.native
  def updatemerchantorderid(params: ParamsDollarResourceDollarOrdersDollarUpdatemerchantorderid): GaxiosPromise[Schema$OrdersUpdateMerchantOrderIdResponse] = js.native
  def updatemerchantorderid(
    params: ParamsDollarResourceDollarOrdersDollarUpdatemerchantorderid,
    callback: BodyResponseCallback[Schema$OrdersUpdateMerchantOrderIdResponse]
  ): Unit = js.native
  def updatemerchantorderid(
    params: ParamsDollarResourceDollarOrdersDollarUpdatemerchantorderid,
    options: BodyResponseCallback[Schema$OrdersUpdateMerchantOrderIdResponse],
    callback: BodyResponseCallback[Schema$OrdersUpdateMerchantOrderIdResponse]
  ): Unit = js.native
  def updatemerchantorderid(params: ParamsDollarResourceDollarOrdersDollarUpdatemerchantorderid, options: MethodOptions): GaxiosPromise[Schema$OrdersUpdateMerchantOrderIdResponse] = js.native
  def updatemerchantorderid(
    params: ParamsDollarResourceDollarOrdersDollarUpdatemerchantorderid,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$OrdersUpdateMerchantOrderIdResponse]
  ): Unit = js.native
  /**
    * content.orders.updateshipment
    * @desc Updates a shipment's status, carrier, and/or tracking ID.
    * @alias content.orders.updateshipment
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.merchantId The ID of the account that manages the order. This cannot be a multi-client account.
    * @param {string} params.orderId The ID of the order.
    * @param {().OrdersUpdateShipmentRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def updateshipment(): GaxiosPromise[Schema$OrdersUpdateShipmentResponse] = js.native
  def updateshipment(callback: BodyResponseCallback[Schema$OrdersUpdateShipmentResponse]): Unit = js.native
  def updateshipment(params: ParamsDollarResourceDollarOrdersDollarUpdateshipment): GaxiosPromise[Schema$OrdersUpdateShipmentResponse] = js.native
  def updateshipment(
    params: ParamsDollarResourceDollarOrdersDollarUpdateshipment,
    callback: BodyResponseCallback[Schema$OrdersUpdateShipmentResponse]
  ): Unit = js.native
  def updateshipment(
    params: ParamsDollarResourceDollarOrdersDollarUpdateshipment,
    options: BodyResponseCallback[Schema$OrdersUpdateShipmentResponse],
    callback: BodyResponseCallback[Schema$OrdersUpdateShipmentResponse]
  ): Unit = js.native
  def updateshipment(params: ParamsDollarResourceDollarOrdersDollarUpdateshipment, options: MethodOptions): GaxiosPromise[Schema$OrdersUpdateShipmentResponse] = js.native
  def updateshipment(
    params: ParamsDollarResourceDollarOrdersDollarUpdateshipment,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$OrdersUpdateShipmentResponse]
  ): Unit = js.native
}

