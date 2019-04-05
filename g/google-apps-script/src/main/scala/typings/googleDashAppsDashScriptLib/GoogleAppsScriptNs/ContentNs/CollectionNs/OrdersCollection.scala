package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.CollectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrdersCollection extends js.Object {
  // Marks an order as acknowledged.
  def acknowledge(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs.OrdersAcknowledgeRequest,
    merchantId: java.lang.String,
    orderId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs.OrdersAcknowledgeResponse = js.native
  // Sandbox only. Moves a test order from state "inProgress" to state "pendingShipment".
  def advancetestorder(merchantId: java.lang.String, orderId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs.OrdersAdvanceTestOrderResponse = js.native
  // Cancels all line items in an order, making a full refund.
  def cancel(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs.OrdersCancelRequest,
    merchantId: java.lang.String,
    orderId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs.OrdersCancelResponse = js.native
  // Cancels a line item, making a full refund.
  def cancellineitem(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs.OrdersCancelLineItemRequest,
    merchantId: java.lang.String,
    orderId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs.OrdersCancelLineItemResponse = js.native
  // Sandbox only. Cancels a test order for customer-initiated cancellation.
  def canceltestorderbycustomer(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs.OrdersCancelTestOrderByCustomerRequest,
    merchantId: java.lang.String,
    orderId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs.OrdersCancelTestOrderByCustomerResponse = js.native
  // Sandbox only. Creates a test order.
  def createtestorder(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs.OrdersCreateTestOrderRequest,
    merchantId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs.OrdersCreateTestOrderResponse = js.native
  // Sandbox only. Creates a test return.
  def createtestreturn(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs.OrdersCreateTestReturnRequest,
    merchantId: java.lang.String,
    orderId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs.OrdersCreateTestReturnResponse = js.native
  // Retrieves or modifies multiple orders in a single request.
  def custombatch(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs.OrdersCustomBatchRequest
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs.OrdersCustomBatchResponse = js.native
  // Retrieves an order from your Merchant Center account.
  def get(merchantId: java.lang.String, orderId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs.Order = js.native
  // Retrieves an order using merchant order ID.
  def getbymerchantorderid(merchantId: java.lang.String, merchantOrderId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs.OrdersGetByMerchantOrderIdResponse = js.native
  // Sandbox only. Retrieves an order template that can be used to quickly create a new order in sandbox.
  def gettestordertemplate(merchantId: java.lang.String, templateName: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs.OrdersGetTestOrderTemplateResponse = js.native
  // Sandbox only. Retrieves an order template that can be used to quickly create a new order in sandbox.
  def gettestordertemplate(merchantId: java.lang.String, templateName: java.lang.String, optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs.OrdersGetTestOrderTemplateResponse = js.native
  // Notifies that item return and refund was handled directly by merchant outside of Google payments processing (e.g. cash refund done in store).
  // Note: We recommend calling the returnrefundlineitem method to refund in-store returns. We will issue the refund directly to the customer. This helps to prevent possible differences arising between merchant and Google transaction records. We also recommend having the point of sale system communicate with Google to ensure that customers do not receive a double refund by first refunding via Google then via an in-store return.
  def instorerefundlineitem(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs.OrdersInStoreRefundLineItemRequest,
    merchantId: java.lang.String,
    orderId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs.OrdersInStoreRefundLineItemResponse = js.native
  // Lists the orders in your Merchant Center account.
  def list(merchantId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs.OrdersListResponse = js.native
  // Lists the orders in your Merchant Center account.
  def list(merchantId: java.lang.String, optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs.OrdersListResponse = js.native
  // Deprecated, please use returnRefundLineItem instead.
  def refund(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs.OrdersRefundRequest,
    merchantId: java.lang.String,
    orderId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs.OrdersRefundResponse = js.native
  // Rejects return on an line item.
  def rejectreturnlineitem(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs.OrdersRejectReturnLineItemRequest,
    merchantId: java.lang.String,
    orderId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs.OrdersRejectReturnLineItemResponse = js.native
  // Returns a line item.
  def returnlineitem(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs.OrdersReturnLineItemRequest,
    merchantId: java.lang.String,
    orderId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs.OrdersReturnLineItemResponse = js.native
  // Returns and refunds a line item. Note that this method can only be called on fully shipped orders.
  def returnrefundlineitem(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs.OrdersReturnRefundLineItemRequest,
    merchantId: java.lang.String,
    orderId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs.OrdersReturnRefundLineItemResponse = js.native
  // Sets (or overrides if it already exists) merchant provided annotations in the form of key-value pairs. A common use case would be to supply us with additional structured information about a line item that cannot be provided via other methods. Submitted key-value pairs can be retrieved as part of the orders resource.
  def setlineitemmetadata(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs.OrdersSetLineItemMetadataRequest,
    merchantId: java.lang.String,
    orderId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs.OrdersSetLineItemMetadataResponse = js.native
  // Marks line item(s) as shipped.
  def shiplineitems(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs.OrdersShipLineItemsRequest,
    merchantId: java.lang.String,
    orderId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs.OrdersShipLineItemsResponse = js.native
  // Updates ship by and delivery by dates for a line item.
  def updatelineitemshippingdetails(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs.OrdersUpdateLineItemShippingDetailsRequest,
    merchantId: java.lang.String,
    orderId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs.OrdersUpdateLineItemShippingDetailsResponse = js.native
  // Updates the merchant order ID for a given order.
  def updatemerchantorderid(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs.OrdersUpdateMerchantOrderIdRequest,
    merchantId: java.lang.String,
    orderId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs.OrdersUpdateMerchantOrderIdResponse = js.native
  // Updates a shipment's status, carrier, and/or tracking ID.
  def updateshipment(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs.OrdersUpdateShipmentRequest,
    merchantId: java.lang.String,
    orderId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs.OrdersUpdateShipmentResponse = js.native
}

