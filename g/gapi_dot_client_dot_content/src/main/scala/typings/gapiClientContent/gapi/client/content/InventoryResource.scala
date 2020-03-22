package typings.gapiClientContent.gapi.client.content

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientContent.AnonDryRun
import typings.gapiClientContent.AnonProductId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InventoryResource extends js.Object {
  /**
    * Updates price and availability for multiple products or stores in a single request. This operation does not update the expiration date of the products.
    * This method can only be called for non-multi-client accounts.
    */
  def custombatch(request: AnonDryRun): Request_[InventoryCustomBatchResponse]
  /**
    * Updates price and availability of a product in your Merchant Center account. This operation does not update the expiration date of the product. This
    * method can only be called for non-multi-client accounts.
    */
  def set(request: AnonProductId): Request_[InventorySetResponse]
}

object InventoryResource {
  @scala.inline
  def apply(
    custombatch: AnonDryRun => Request_[InventoryCustomBatchResponse],
    set: AnonProductId => Request_[InventorySetResponse]
  ): InventoryResource = {
    val __obj = js.Dynamic.literal(custombatch = js.Any.fromFunction1(custombatch), set = js.Any.fromFunction1(set))
  
    __obj.asInstanceOf[InventoryResource]
  }
}

