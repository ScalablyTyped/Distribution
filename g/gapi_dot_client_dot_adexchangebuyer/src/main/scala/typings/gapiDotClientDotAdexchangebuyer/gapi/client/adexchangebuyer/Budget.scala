package typings.gapiDotClientDotAdexchangebuyer.gapi.client.adexchangebuyer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Budget extends js.Object {
  /** The id of the account. This is required for get and update requests. */
  var accountId: js.UndefOr[String] = js.undefined
  /** The billing id to determine which adgroup to provide budget information for. This is required for get and update requests. */
  var billingId: js.UndefOr[String] = js.undefined
  /** The daily budget amount in unit amount of the account currency to apply for the billingId provided. This is required for update requests. */
  var budgetAmount: js.UndefOr[String] = js.undefined
  /** The currency code for the buyer. This cannot be altered here. */
  var currencyCode: js.UndefOr[String] = js.undefined
  /** The unique id that describes this item. */
  var id: js.UndefOr[String] = js.undefined
  /** The kind of the resource, i.e. "adexchangebuyer#budget". */
  var kind: js.UndefOr[String] = js.undefined
}

object Budget {
  @scala.inline
  def apply(
    accountId: String = null,
    billingId: String = null,
    budgetAmount: String = null,
    currencyCode: String = null,
    id: String = null,
    kind: String = null
  ): Budget = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId)
    if (billingId != null) __obj.updateDynamic("billingId")(billingId)
    if (budgetAmount != null) __obj.updateDynamic("budgetAmount")(budgetAmount)
    if (currencyCode != null) __obj.updateDynamic("currencyCode")(currencyCode)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[Budget]
  }
}

