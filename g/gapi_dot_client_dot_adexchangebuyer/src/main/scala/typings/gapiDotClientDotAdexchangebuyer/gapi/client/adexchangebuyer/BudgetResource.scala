package typings.gapiDotClientDotAdexchangebuyer.gapi.client.adexchangebuyer

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotAdexchangebuyer.Anon_AccountIdAlt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BudgetResource extends js.Object {
  /** Returns the budget information for the adgroup specified by the accountId and billingId. */
  def get(request: Anon_AccountIdAlt): Request[Budget]
  /**
    * Updates the budget amount for the budget of the adgroup specified by the accountId and billingId, with the budget amount in the request. This method
    * supports patch semantics.
    */
  def patch(request: Anon_AccountIdAlt): Request[Budget]
  /** Updates the budget amount for the budget of the adgroup specified by the accountId and billingId, with the budget amount in the request. */
  def update(request: Anon_AccountIdAlt): Request[Budget]
}

object BudgetResource {
  @scala.inline
  def apply(
    get: Anon_AccountIdAlt => Request[Budget],
    patch: Anon_AccountIdAlt => Request[Budget],
    update: Anon_AccountIdAlt => Request[Budget]
  ): BudgetResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[BudgetResource]
  }
}

