package typings.googleAppsScript.GoogleAppsScript.Content.Collection

import typings.googleAppsScript.GoogleAppsScript.Content.Schema.OrderpaymentsNotifyAuthApprovedRequest
import typings.googleAppsScript.GoogleAppsScript.Content.Schema.OrderpaymentsNotifyAuthApprovedResponse
import typings.googleAppsScript.GoogleAppsScript.Content.Schema.OrderpaymentsNotifyAuthDeclinedRequest
import typings.googleAppsScript.GoogleAppsScript.Content.Schema.OrderpaymentsNotifyAuthDeclinedResponse
import typings.googleAppsScript.GoogleAppsScript.Content.Schema.OrderpaymentsNotifyChargeRequest
import typings.googleAppsScript.GoogleAppsScript.Content.Schema.OrderpaymentsNotifyChargeResponse
import typings.googleAppsScript.GoogleAppsScript.Content.Schema.OrderpaymentsNotifyRefundRequest
import typings.googleAppsScript.GoogleAppsScript.Content.Schema.OrderpaymentsNotifyRefundResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrderpaymentsCollection extends js.Object {
  
  // Notify about successfully authorizing user's payment method for a given amount.
  def notifyauthapproved(resource: OrderpaymentsNotifyAuthApprovedRequest, merchantId: String, orderId: String): OrderpaymentsNotifyAuthApprovedResponse = js.native
  
  // Notify about failure to authorize user's payment method.
  def notifyauthdeclined(resource: OrderpaymentsNotifyAuthDeclinedRequest, merchantId: String, orderId: String): OrderpaymentsNotifyAuthDeclinedResponse = js.native
  
  // Notify about charge on user's selected payments method.
  def notifycharge(resource: OrderpaymentsNotifyChargeRequest, merchantId: String, orderId: String): OrderpaymentsNotifyChargeResponse = js.native
  
  // Notify about refund on user's selected payments method.
  def notifyrefund(resource: OrderpaymentsNotifyRefundRequest, merchantId: String, orderId: String): OrderpaymentsNotifyRefundResponse = js.native
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
  
  @scala.inline
  implicit class OrderpaymentsCollectionOps[Self <: OrderpaymentsCollection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setNotifyauthapproved(
      value: (OrderpaymentsNotifyAuthApprovedRequest, String, String) => OrderpaymentsNotifyAuthApprovedResponse
    ): Self = this.set("notifyauthapproved", js.Any.fromFunction3(value))
    
    @scala.inline
    def setNotifyauthdeclined(
      value: (OrderpaymentsNotifyAuthDeclinedRequest, String, String) => OrderpaymentsNotifyAuthDeclinedResponse
    ): Self = this.set("notifyauthdeclined", js.Any.fromFunction3(value))
    
    @scala.inline
    def setNotifycharge(value: (OrderpaymentsNotifyChargeRequest, String, String) => OrderpaymentsNotifyChargeResponse): Self = this.set("notifycharge", js.Any.fromFunction3(value))
    
    @scala.inline
    def setNotifyrefund(value: (OrderpaymentsNotifyRefundRequest, String, String) => OrderpaymentsNotifyRefundResponse): Self = this.set("notifyrefund", js.Any.fromFunction3(value))
  }
}
