package typings
package gapiDotClientDotContentLib.gapiNs.clientNs.contentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProductstatusesResource extends js.Object {
  /** Gets the statuses of multiple products in a single request. This method can only be called for non-multi-client accounts. */
  def custombatch(request: gapiDotClientDotContentLib.Anon_AltFieldsIncludeAttributes): gapiDotClientLib.gapiNs.clientNs.Request[ProductstatusesCustomBatchResponse]
  /** Gets the status of a product from your Merchant Center account. This method can only be called for non-multi-client accounts. */
  def get(request: gapiDotClientDotContentLib.Anon_AltFieldsIncludeAttributesKey): gapiDotClientLib.gapiNs.clientNs.Request[ProductStatus]
  /** Lists the statuses of the products in your Merchant Center account. This method can only be called for non-multi-client accounts. */
  def list(request: gapiDotClientDotContentLib.Anon_AltFieldsIncludeAttributesIncludeInvalidInsertedItems): gapiDotClientLib.gapiNs.clientNs.Request[ProductstatusesListResponse]
}

