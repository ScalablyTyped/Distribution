package typings.googleDashAppsDashScript.GoogleAppsScript.Content.Collection

import typings.googleDashAppsDashScript.GoogleAppsScript.Content.Schema.Product
import typings.googleDashAppsDashScript.GoogleAppsScript.Content.Schema.ProductsCustomBatchRequest
import typings.googleDashAppsDashScript.GoogleAppsScript.Content.Schema.ProductsCustomBatchResponse
import typings.googleDashAppsDashScript.GoogleAppsScript.Content.Schema.ProductsListResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProductsCollection extends js.Object {
  // Retrieves, inserts, and deletes multiple products in a single request.
  def custombatch(resource: ProductsCustomBatchRequest): ProductsCustomBatchResponse = js.native
  // Retrieves, inserts, and deletes multiple products in a single request.
  def custombatch(resource: ProductsCustomBatchRequest, optionalArgs: js.Object): ProductsCustomBatchResponse = js.native
  // Retrieves a product from your Merchant Center account.
  def get(merchantId: String, productId: String): Product = js.native
  // Uploads a product to your Merchant Center account. If an item with the same channel, contentLanguage, offerId, and targetCountry already exists, this method updates that entry.
  def insert(resource: Product, merchantId: String): Product = js.native
  // Uploads a product to your Merchant Center account. If an item with the same channel, contentLanguage, offerId, and targetCountry already exists, this method updates that entry.
  def insert(resource: Product, merchantId: String, optionalArgs: js.Object): Product = js.native
  // Lists the products in your Merchant Center account.
  def list(merchantId: String): ProductsListResponse = js.native
  // Lists the products in your Merchant Center account.
  def list(merchantId: String, optionalArgs: js.Object): ProductsListResponse = js.native
  // Deletes a product from your Merchant Center account.
  def remove(merchantId: String, productId: String): Unit = js.native
  // Deletes a product from your Merchant Center account.
  def remove(merchantId: String, productId: String, optionalArgs: js.Object): Unit = js.native
}

