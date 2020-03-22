package typings.gapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientAdexchangebuyer.AnonBillingId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BudgetResource extends js.Object {
  /** Returns the budget information for the adgroup specified by the accountId and billingId. */
  def get(request: AnonBillingId): Request_[Budget]
  /**
    * Updates the budget amount for the budget of the adgroup specified by the accountId and billingId, with the budget amount in the request. This method
    * supports patch semantics.
    */
  def patch(request: AnonBillingId): Request_[Budget]
  /** Updates the budget amount for the budget of the adgroup specified by the accountId and billingId, with the budget amount in the request. */
  def update(request: AnonBillingId): Request_[Budget]
}

object BudgetResource {
  @scala.inline
  def apply(
    get: AnonBillingId => Request_[Budget],
    patch: AnonBillingId => Request_[Budget],
    update: AnonBillingId => Request_[Budget]
  ): BudgetResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[BudgetResource]
  }
}

