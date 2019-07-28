package typings.googleDashAppsDashScript.GoogleAppsScriptNs.ContentNs.CollectionNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.ContentNs.SchemaNs.PosCustomBatchRequest
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.ContentNs.SchemaNs.PosCustomBatchResponse
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.ContentNs.SchemaNs.PosInventoryRequest
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.ContentNs.SchemaNs.PosInventoryResponse
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.ContentNs.SchemaNs.PosListResponse
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.ContentNs.SchemaNs.PosSaleRequest
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.ContentNs.SchemaNs.PosSaleResponse
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.ContentNs.SchemaNs.PosStore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PosCollection extends js.Object {
  // Batches multiple POS-related calls in a single request.
  def custombatch(resource: PosCustomBatchRequest): PosCustomBatchResponse = js.native
  // Batches multiple POS-related calls in a single request.
  def custombatch(resource: PosCustomBatchRequest, optionalArgs: js.Object): PosCustomBatchResponse = js.native
  // Retrieves information about the given store.
  def get(merchantId: String, targetMerchantId: String, storeCode: String): PosStore = js.native
  // Creates a store for the given merchant.
  def insert(resource: PosStore, merchantId: String, targetMerchantId: String): PosStore = js.native
  // Creates a store for the given merchant.
  def insert(resource: PosStore, merchantId: String, targetMerchantId: String, optionalArgs: js.Object): PosStore = js.native
  // Submit inventory for the given merchant.
  def inventory(resource: PosInventoryRequest, merchantId: String, targetMerchantId: String): PosInventoryResponse = js.native
  // Submit inventory for the given merchant.
  def inventory(
    resource: PosInventoryRequest,
    merchantId: String,
    targetMerchantId: String,
    optionalArgs: js.Object
  ): PosInventoryResponse = js.native
  // Lists the stores of the target merchant.
  def list(merchantId: String, targetMerchantId: String): PosListResponse = js.native
  // Deletes a store for the given merchant.
  def remove(merchantId: String, targetMerchantId: String, storeCode: String): Unit = js.native
  // Deletes a store for the given merchant.
  def remove(merchantId: String, targetMerchantId: String, storeCode: String, optionalArgs: js.Object): Unit = js.native
  // Submit a sale event for the given merchant.
  def sale(resource: PosSaleRequest, merchantId: String, targetMerchantId: String): PosSaleResponse = js.native
  // Submit a sale event for the given merchant.
  def sale(resource: PosSaleRequest, merchantId: String, targetMerchantId: String, optionalArgs: js.Object): PosSaleResponse = js.native
}

