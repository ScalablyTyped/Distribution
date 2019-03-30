package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.CollectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrderpaymentsCollection extends js.Object {
  // Notify about successfully authorizing user's payment method for a given amount.
  def notifyauthapproved(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs.OrderpaymentsNotifyAuthApprovedRequest,
    merchantId: java.lang.String,
    orderId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs.OrderpaymentsNotifyAuthApprovedResponse
  // Notify about failure to authorize user's payment method.
  def notifyauthdeclined(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs.OrderpaymentsNotifyAuthDeclinedRequest,
    merchantId: java.lang.String,
    orderId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs.OrderpaymentsNotifyAuthDeclinedResponse
  // Notify about charge on user's selected payments method.
  def notifycharge(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs.OrderpaymentsNotifyChargeRequest,
    merchantId: java.lang.String,
    orderId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs.OrderpaymentsNotifyChargeResponse
  // Notify about refund on user's selected payments method.
  def notifyrefund(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs.OrderpaymentsNotifyRefundRequest,
    merchantId: java.lang.String,
    orderId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs.OrderpaymentsNotifyRefundResponse
}

object OrderpaymentsCollection {
  @scala.inline
  def apply(
    notifyauthapproved: (googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs.OrderpaymentsNotifyAuthApprovedRequest, java.lang.String, java.lang.String) => googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs.OrderpaymentsNotifyAuthApprovedResponse,
    notifyauthdeclined: (googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs.OrderpaymentsNotifyAuthDeclinedRequest, java.lang.String, java.lang.String) => googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs.OrderpaymentsNotifyAuthDeclinedResponse,
    notifycharge: (googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs.OrderpaymentsNotifyChargeRequest, java.lang.String, java.lang.String) => googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs.OrderpaymentsNotifyChargeResponse,
    notifyrefund: (googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs.OrderpaymentsNotifyRefundRequest, java.lang.String, java.lang.String) => googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs.OrderpaymentsNotifyRefundResponse
  ): OrderpaymentsCollection = {
    val __obj = js.Dynamic.literal(notifyauthapproved = js.Any.fromFunction3(notifyauthapproved), notifyauthdeclined = js.Any.fromFunction3(notifyauthdeclined), notifycharge = js.Any.fromFunction3(notifycharge), notifyrefund = js.Any.fromFunction3(notifyrefund))
  
    __obj.asInstanceOf[OrderpaymentsCollection]
  }
}

