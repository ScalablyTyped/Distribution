package typings.googleDashAppsDashScript.GoogleAppsScript.Content.Collection

import typings.googleDashAppsDashScript.GoogleAppsScript.Content.Schema.OrderpaymentsNotifyAuthApprovedRequest
import typings.googleDashAppsDashScript.GoogleAppsScript.Content.Schema.OrderpaymentsNotifyAuthApprovedResponse
import typings.googleDashAppsDashScript.GoogleAppsScript.Content.Schema.OrderpaymentsNotifyAuthDeclinedRequest
import typings.googleDashAppsDashScript.GoogleAppsScript.Content.Schema.OrderpaymentsNotifyAuthDeclinedResponse
import typings.googleDashAppsDashScript.GoogleAppsScript.Content.Schema.OrderpaymentsNotifyChargeRequest
import typings.googleDashAppsDashScript.GoogleAppsScript.Content.Schema.OrderpaymentsNotifyChargeResponse
import typings.googleDashAppsDashScript.GoogleAppsScript.Content.Schema.OrderpaymentsNotifyRefundRequest
import typings.googleDashAppsDashScript.GoogleAppsScript.Content.Schema.OrderpaymentsNotifyRefundResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrderpaymentsCollection extends js.Object {
  // Notify about successfully authorizing user's payment method for a given amount.
  def notifyauthapproved(resource: OrderpaymentsNotifyAuthApprovedRequest, merchantId: String, orderId: String): OrderpaymentsNotifyAuthApprovedResponse
  // Notify about failure to authorize user's payment method.
  def notifyauthdeclined(resource: OrderpaymentsNotifyAuthDeclinedRequest, merchantId: String, orderId: String): OrderpaymentsNotifyAuthDeclinedResponse
  // Notify about charge on user's selected payments method.
  def notifycharge(resource: OrderpaymentsNotifyChargeRequest, merchantId: String, orderId: String): OrderpaymentsNotifyChargeResponse
  // Notify about refund on user's selected payments method.
  def notifyrefund(resource: OrderpaymentsNotifyRefundRequest, merchantId: String, orderId: String): OrderpaymentsNotifyRefundResponse
}

object OrderpaymentsCollection {
  @scala.inline
  def apply(
    notifyauthapproved: (OrderpaymentsNotifyAuthApprovedRequest, String, String) => OrderpaymentsNotifyAuthApprovedResponse,
    notifyauthdeclined: (OrderpaymentsNotifyAuthDeclinedRequest, String, String) => OrderpaymentsNotifyAuthDeclinedResponse,
    notifycharge: (OrderpaymentsNotifyChargeRequest, String, String) => OrderpaymentsNotifyChargeResponse,
    notifyrefund: (OrderpaymentsNotifyRefundRequest, String, String) => OrderpaymentsNotifyRefundResponse
  ): OrderpaymentsCollection = {
    val __obj = js.Dynamic.literal(notifyauthapproved = js.Any.fromFunction3(notifyauthapproved), notifyauthdeclined = js.Any.fromFunction3(notifyauthdeclined), notifycharge = js.Any.fromFunction3(notifycharge), notifyrefund = js.Any.fromFunction3(notifyrefund))
  
    __obj.asInstanceOf[OrderpaymentsCollection]
  }
}

