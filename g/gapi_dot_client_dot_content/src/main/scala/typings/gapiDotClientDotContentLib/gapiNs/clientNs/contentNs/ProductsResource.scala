package typings
package gapiDotClientDotContentLib.gapiNs.clientNs.contentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProductsResource extends js.Object {
  /** Retrieves, inserts, and deletes multiple products in a single request. This method can only be called for non-multi-client accounts. */
  def custombatch(request: gapiDotClientDotContentLib.Anon_PrettyPrintQuotaUser): gapiDotClientLib.gapiNs.clientNs.Request[ProductsCustomBatchResponse]
  /** Deletes a product from your Merchant Center account. This method can only be called for non-multi-client accounts. */
  def delete(request: gapiDotClientDotContentLib.Anon_PrettyPrintQuotaUserKeyUserIpOauthtokenMerchantIdAlt): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Retrieves a product from your Merchant Center account. This method can only be called for non-multi-client accounts. */
  def get(
    request: gapiDotClientDotContentLib.Anon_PrettyPrintQuotaUserKeyUserIpOauthtokenMerchantIdAltFields
  ): gapiDotClientLib.gapiNs.clientNs.Request[Product]
  /**
    * Uploads a product to your Merchant Center account. If an item with the same channel, contentLanguage, offerId, and targetCountry already exists, this
    * method updates that entry. This method can only be called for non-multi-client accounts.
    */
  def insert(request: gapiDotClientDotContentLib.Anon_PrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[Product]
  /** Lists the products in your Merchant Center account. This method can only be called for non-multi-client accounts. */
  def list(request: gapiDotClientDotContentLib.Anon_MaxResultsPrettyPrintPageTokenQuotaUser): gapiDotClientLib.gapiNs.clientNs.Request[ProductsListResponse]
}

