package typings.gapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import typings.gapiClient.gapi.client.Request
import typings.gapiClientAdexchangebuyer.anon.BillingId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BudgetResource extends js.Object {
  /** Returns the budget information for the adgroup specified by the accountId and billingId. */
  def get(request: BillingId): Request[Budget] = js.native
  /**
    * Updates the budget amount for the budget of the adgroup specified by the accountId and billingId, with the budget amount in the request. This method
    * supports patch semantics.
    */
  def patch(request: BillingId): Request[Budget] = js.native
  /** Updates the budget amount for the budget of the adgroup specified by the accountId and billingId, with the budget amount in the request. */
  def update(request: BillingId): Request[Budget] = js.native
}

object BudgetResource {
  @scala.inline
  def apply(
    get: BillingId => Request[Budget],
    patch: BillingId => Request[Budget],
    update: BillingId => Request[Budget]
  ): BudgetResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[BudgetResource]
  }
  @scala.inline
  implicit class BudgetResourceOps[Self <: BudgetResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGet(value: BillingId => Request[Budget]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setPatch(value: BillingId => Request[Budget]): Self = this.set("patch", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdate(value: BillingId => Request[Budget]): Self = this.set("update", js.Any.fromFunction1(value))
  }
  
}

