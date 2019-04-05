package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.CollectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InventoryCollection extends js.Object {
  // Updates price and availability for multiple products or stores in a single request. This operation does not update the expiration date of the products.
  def custombatch(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs.InventoryCustomBatchRequest
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs.InventoryCustomBatchResponse = js.native
  // Updates price and availability for multiple products or stores in a single request. This operation does not update the expiration date of the products.
  def custombatch(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs.InventoryCustomBatchRequest,
    optionalArgs: js.Object
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs.InventoryCustomBatchResponse = js.native
  // Updates price and availability of a product in your Merchant Center account.
  def set(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs.InventorySetRequest,
    merchantId: java.lang.String,
    storeCode: java.lang.String,
    productId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs.InventorySetResponse = js.native
  // Updates price and availability of a product in your Merchant Center account.
  def set(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs.InventorySetRequest,
    merchantId: java.lang.String,
    storeCode: java.lang.String,
    productId: java.lang.String,
    optionalArgs: js.Object
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs.InventorySetResponse = js.native
}

