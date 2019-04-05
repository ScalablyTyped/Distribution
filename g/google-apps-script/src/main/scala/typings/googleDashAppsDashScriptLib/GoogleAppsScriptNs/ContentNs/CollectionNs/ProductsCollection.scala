package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.CollectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProductsCollection extends js.Object {
  // Retrieves, inserts, and deletes multiple products in a single request.
  def custombatch(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs.ProductsCustomBatchRequest
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs.ProductsCustomBatchResponse = js.native
  // Retrieves, inserts, and deletes multiple products in a single request.
  def custombatch(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs.ProductsCustomBatchRequest,
    optionalArgs: js.Object
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs.ProductsCustomBatchResponse = js.native
  // Retrieves a product from your Merchant Center account.
  def get(merchantId: java.lang.String, productId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs.Product = js.native
  // Uploads a product to your Merchant Center account. If an item with the same channel, contentLanguage, offerId, and targetCountry already exists, this method updates that entry.
  def insert(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs.Product,
    merchantId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs.Product = js.native
  // Uploads a product to your Merchant Center account. If an item with the same channel, contentLanguage, offerId, and targetCountry already exists, this method updates that entry.
  def insert(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs.Product,
    merchantId: java.lang.String,
    optionalArgs: js.Object
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs.Product = js.native
  // Lists the products in your Merchant Center account.
  def list(merchantId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs.ProductsListResponse = js.native
  // Lists the products in your Merchant Center account.
  def list(merchantId: java.lang.String, optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs.ProductsListResponse = js.native
  // Deletes a product from your Merchant Center account.
  def remove(merchantId: java.lang.String, productId: java.lang.String): scala.Unit = js.native
  // Deletes a product from your Merchant Center account.
  def remove(merchantId: java.lang.String, productId: java.lang.String, optionalArgs: js.Object): scala.Unit = js.native
}

