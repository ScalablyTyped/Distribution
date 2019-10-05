package typings.googleDashAppsDashScript.GoogleAppsScript.Content.Collection

import typings.googleDashAppsDashScript.GoogleAppsScript.Content.Schema.MerchantOrderReturn
import typings.googleDashAppsDashScript.GoogleAppsScript.Content.Schema.OrderreturnsListResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrderreturnsCollection extends js.Object {
  // Retrieves an order return from your Merchant Center account.
  def get(merchantId: String, returnId: String): MerchantOrderReturn = js.native
  // Lists order returns in your Merchant Center account.
  def list(merchantId: String): OrderreturnsListResponse = js.native
  // Lists order returns in your Merchant Center account.
  def list(merchantId: String, optionalArgs: js.Object): OrderreturnsListResponse = js.native
}

