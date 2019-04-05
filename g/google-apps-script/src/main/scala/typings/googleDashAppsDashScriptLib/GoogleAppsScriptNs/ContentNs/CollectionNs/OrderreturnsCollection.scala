package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.CollectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrderreturnsCollection extends js.Object {
  // Retrieves an order return from your Merchant Center account.
  def get(merchantId: java.lang.String, returnId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs.MerchantOrderReturn = js.native
  // Lists order returns in your Merchant Center account.
  def list(merchantId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs.OrderreturnsListResponse = js.native
  // Lists order returns in your Merchant Center account.
  def list(merchantId: java.lang.String, optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs.OrderreturnsListResponse = js.native
}

