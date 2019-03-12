package typings
package gapiDotClientDotAdexchangebuyerLib.gapiNs.clientNs.adexchangebuyerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BudgetResource extends js.Object {
  /** Returns the budget information for the adgroup specified by the accountId and billingId. */
  def get(request: gapiDotClientDotAdexchangebuyerLib.Anon_AccountIdAlt): gapiDotClientLib.gapiNs.clientNs.Request[Budget]
  /**
    * Updates the budget amount for the budget of the adgroup specified by the accountId and billingId, with the budget amount in the request. This method
    * supports patch semantics.
    */
  def patch(request: gapiDotClientDotAdexchangebuyerLib.Anon_AccountIdAlt): gapiDotClientLib.gapiNs.clientNs.Request[Budget]
  /** Updates the budget amount for the budget of the adgroup specified by the accountId and billingId, with the budget amount in the request. */
  def update(request: gapiDotClientDotAdexchangebuyerLib.Anon_AccountIdAlt): gapiDotClientLib.gapiNs.clientNs.Request[Budget]
}

object BudgetResource {
  @scala.inline
  def apply(
    get: gapiDotClientDotAdexchangebuyerLib.Anon_AccountIdAlt => gapiDotClientLib.gapiNs.clientNs.Request[Budget],
    patch: gapiDotClientDotAdexchangebuyerLib.Anon_AccountIdAlt => gapiDotClientLib.gapiNs.clientNs.Request[Budget],
    update: gapiDotClientDotAdexchangebuyerLib.Anon_AccountIdAlt => gapiDotClientLib.gapiNs.clientNs.Request[Budget]
  ): BudgetResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[BudgetResource]
  }
}

