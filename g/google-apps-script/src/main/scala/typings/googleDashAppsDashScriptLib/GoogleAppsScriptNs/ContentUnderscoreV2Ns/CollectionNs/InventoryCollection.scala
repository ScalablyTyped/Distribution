package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.CollectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InventoryCollection extends js.Object {
  // Updates price and availability for multiple products or stores in a single request. This operation does not update the expiration date of the products.
  def custombatch(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs.InventoryCustomBatchRequest
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs.InventoryCustomBatchResponse = js.native
  // Updates price and availability for multiple products or stores in a single request. This operation does not update the expiration date of the products.
  def custombatch(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs.InventoryCustomBatchRequest,
    optionalArgs: js.Object
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs.InventoryCustomBatchResponse = js.native
  // Updates price and availability of a product in your Merchant Center account.
  def set(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs.InventorySetRequest,
    merchantId: java.lang.String,
    storeCode: java.lang.String,
    productId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs.InventorySetResponse = js.native
  // Updates price and availability of a product in your Merchant Center account.
  def set(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs.InventorySetRequest,
    merchantId: java.lang.String,
    storeCode: java.lang.String,
    productId: java.lang.String,
    optionalArgs: js.Object
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs.InventorySetResponse = js.native
}

