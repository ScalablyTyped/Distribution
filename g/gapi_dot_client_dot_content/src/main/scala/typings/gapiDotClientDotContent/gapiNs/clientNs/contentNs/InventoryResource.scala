package typings.gapiDotClientDotContent.gapiNs.clientNs.contentNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotContent.Anon_AltDryRun
import typings.gapiDotClientDotContent.Anon_AltDryRunFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InventoryResource extends js.Object {
  /**
    * Updates price and availability for multiple products or stores in a single request. This operation does not update the expiration date of the products.
    * This method can only be called for non-multi-client accounts.
    */
  def custombatch(request: Anon_AltDryRun): Request[InventoryCustomBatchResponse]
  /**
    * Updates price and availability of a product in your Merchant Center account. This operation does not update the expiration date of the product. This
    * method can only be called for non-multi-client accounts.
    */
  def set(request: Anon_AltDryRunFieldsKey): Request[InventorySetResponse]
}

object InventoryResource {
  @scala.inline
  def apply(
    custombatch: Anon_AltDryRun => Request[InventoryCustomBatchResponse],
    set: Anon_AltDryRunFieldsKey => Request[InventorySetResponse]
  ): InventoryResource = {
    val __obj = js.Dynamic.literal(custombatch = js.Any.fromFunction1(custombatch), set = js.Any.fromFunction1(set))
  
    __obj.asInstanceOf[InventoryResource]
  }
}

