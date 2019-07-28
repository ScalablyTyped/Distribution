package typings.googleDashAppsDashScript.GoogleAppsScriptNs.ContentNs.CollectionNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.ContentNs.SchemaNs.Order
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.ContentNs.SchemaNs.OrdersAcknowledgeRequest
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.ContentNs.SchemaNs.OrdersAcknowledgeResponse
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.ContentNs.SchemaNs.OrdersAdvanceTestOrderResponse
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.ContentNs.SchemaNs.OrdersCancelLineItemRequest
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.ContentNs.SchemaNs.OrdersCancelLineItemResponse
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.ContentNs.SchemaNs.OrdersCancelRequest
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.ContentNs.SchemaNs.OrdersCancelResponse
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.ContentNs.SchemaNs.OrdersCancelTestOrderByCustomerRequest
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.ContentNs.SchemaNs.OrdersCancelTestOrderByCustomerResponse
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.ContentNs.SchemaNs.OrdersCreateTestOrderRequest
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.ContentNs.SchemaNs.OrdersCreateTestOrderResponse
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.ContentNs.SchemaNs.OrdersCreateTestReturnRequest
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.ContentNs.SchemaNs.OrdersCreateTestReturnResponse
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.ContentNs.SchemaNs.OrdersCustomBatchRequest
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.ContentNs.SchemaNs.OrdersCustomBatchResponse
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.ContentNs.SchemaNs.OrdersGetByMerchantOrderIdResponse
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.ContentNs.SchemaNs.OrdersGetTestOrderTemplateResponse
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.ContentNs.SchemaNs.OrdersInStoreRefundLineItemRequest
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.ContentNs.SchemaNs.OrdersInStoreRefundLineItemResponse
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.ContentNs.SchemaNs.OrdersListResponse
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.ContentNs.SchemaNs.OrdersRefundRequest
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.ContentNs.SchemaNs.OrdersRefundResponse
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.ContentNs.SchemaNs.OrdersRejectReturnLineItemRequest
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.ContentNs.SchemaNs.OrdersRejectReturnLineItemResponse
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.ContentNs.SchemaNs.OrdersReturnLineItemRequest
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.ContentNs.SchemaNs.OrdersReturnLineItemResponse
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.ContentNs.SchemaNs.OrdersReturnRefundLineItemRequest
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.ContentNs.SchemaNs.OrdersReturnRefundLineItemResponse
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.ContentNs.SchemaNs.OrdersSetLineItemMetadataRequest
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.ContentNs.SchemaNs.OrdersSetLineItemMetadataResponse
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.ContentNs.SchemaNs.OrdersShipLineItemsRequest
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.ContentNs.SchemaNs.OrdersShipLineItemsResponse
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.ContentNs.SchemaNs.OrdersUpdateLineItemShippingDetailsRequest
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.ContentNs.SchemaNs.OrdersUpdateLineItemShippingDetailsResponse
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.ContentNs.SchemaNs.OrdersUpdateMerchantOrderIdRequest
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.ContentNs.SchemaNs.OrdersUpdateMerchantOrderIdResponse
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.ContentNs.SchemaNs.OrdersUpdateShipmentRequest
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.ContentNs.SchemaNs.OrdersUpdateShipmentResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrdersCollection extends js.Object {
  // Marks an order as acknowledged.
  def acknowledge(resource: OrdersAcknowledgeRequest, merchantId: String, orderId: String): OrdersAcknowledgeResponse = js.native
  // Sandbox only. Moves a test order from state "inProgress" to state "pendingShipment".
  def advancetestorder(merchantId: String, orderId: String): OrdersAdvanceTestOrderResponse = js.native
  // Cancels all line items in an order, making a full refund.
  def cancel(resource: OrdersCancelRequest, merchantId: String, orderId: String): OrdersCancelResponse = js.native
  // Cancels a line item, making a full refund.
  def cancellineitem(resource: OrdersCancelLineItemRequest, merchantId: String, orderId: String): OrdersCancelLineItemResponse = js.native
  // Sandbox only. Cancels a test order for customer-initiated cancellation.
  def canceltestorderbycustomer(resource: OrdersCancelTestOrderByCustomerRequest, merchantId: String, orderId: String): OrdersCancelTestOrderByCustomerResponse = js.native
  // Sandbox only. Creates a test order.
  def createtestorder(resource: OrdersCreateTestOrderRequest, merchantId: String): OrdersCreateTestOrderResponse = js.native
  // Sandbox only. Creates a test return.
  def createtestreturn(resource: OrdersCreateTestReturnRequest, merchantId: String, orderId: String): OrdersCreateTestReturnResponse = js.native
  // Retrieves or modifies multiple orders in a single request.
  def custombatch(resource: OrdersCustomBatchRequest): OrdersCustomBatchResponse = js.native
  // Retrieves an order from your Merchant Center account.
  def get(merchantId: String, orderId: String): Order = js.native
  // Retrieves an order using merchant order ID.
  def getbymerchantorderid(merchantId: String, merchantOrderId: String): OrdersGetByMerchantOrderIdResponse = js.native
  // Sandbox only. Retrieves an order template that can be used to quickly create a new order in sandbox.
  def gettestordertemplate(merchantId: String, templateName: String): OrdersGetTestOrderTemplateResponse = js.native
  // Sandbox only. Retrieves an order template that can be used to quickly create a new order in sandbox.
  def gettestordertemplate(merchantId: String, templateName: String, optionalArgs: js.Object): OrdersGetTestOrderTemplateResponse = js.native
  // Notifies that item return and refund was handled directly by merchant outside of Google payments processing (e.g. cash refund done in store).
  // Note: We recommend calling the returnrefundlineitem method to refund in-store returns. We will issue the refund directly to the customer. This helps to prevent possible differences arising between merchant and Google transaction records. We also recommend having the point of sale system communicate with Google to ensure that customers do not receive a double refund by first refunding via Google then via an in-store return.
  def instorerefundlineitem(resource: OrdersInStoreRefundLineItemRequest, merchantId: String, orderId: String): OrdersInStoreRefundLineItemResponse = js.native
  // Lists the orders in your Merchant Center account.
  def list(merchantId: String): OrdersListResponse = js.native
  // Lists the orders in your Merchant Center account.
  def list(merchantId: String, optionalArgs: js.Object): OrdersListResponse = js.native
  // Deprecated, please use returnRefundLineItem instead.
  def refund(resource: OrdersRefundRequest, merchantId: String, orderId: String): OrdersRefundResponse = js.native
  // Rejects return on an line item.
  def rejectreturnlineitem(resource: OrdersRejectReturnLineItemRequest, merchantId: String, orderId: String): OrdersRejectReturnLineItemResponse = js.native
  // Returns a line item.
  def returnlineitem(resource: OrdersReturnLineItemRequest, merchantId: String, orderId: String): OrdersReturnLineItemResponse = js.native
  // Returns and refunds a line item. Note that this method can only be called on fully shipped orders.
  def returnrefundlineitem(resource: OrdersReturnRefundLineItemRequest, merchantId: String, orderId: String): OrdersReturnRefundLineItemResponse = js.native
  // Sets (or overrides if it already exists) merchant provided annotations in the form of key-value pairs. A common use case would be to supply us with additional structured information about a line item that cannot be provided via other methods. Submitted key-value pairs can be retrieved as part of the orders resource.
  def setlineitemmetadata(resource: OrdersSetLineItemMetadataRequest, merchantId: String, orderId: String): OrdersSetLineItemMetadataResponse = js.native
  // Marks line item(s) as shipped.
  def shiplineitems(resource: OrdersShipLineItemsRequest, merchantId: String, orderId: String): OrdersShipLineItemsResponse = js.native
  // Updates ship by and delivery by dates for a line item.
  def updatelineitemshippingdetails(resource: OrdersUpdateLineItemShippingDetailsRequest, merchantId: String, orderId: String): OrdersUpdateLineItemShippingDetailsResponse = js.native
  // Updates the merchant order ID for a given order.
  def updatemerchantorderid(resource: OrdersUpdateMerchantOrderIdRequest, merchantId: String, orderId: String): OrdersUpdateMerchantOrderIdResponse = js.native
  // Updates a shipment's status, carrier, and/or tracking ID.
  def updateshipment(resource: OrdersUpdateShipmentRequest, merchantId: String, orderId: String): OrdersUpdateShipmentResponse = js.native
}

