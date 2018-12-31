package typings
package gapiDotClientDotAdexchangebuyerLib.gapiNs.clientNs.adexchangebuyerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Budget extends js.Object {
  /** The id of the account. This is required for get and update requests. */
  var accountId: js.UndefOr[java.lang.String] = js.undefined
  /** The billing id to determine which adgroup to provide budget information for. This is required for get and update requests. */
  var billingId: js.UndefOr[java.lang.String] = js.undefined
  /** The daily budget amount in unit amount of the account currency to apply for the billingId provided. This is required for update requests. */
  var budgetAmount: js.UndefOr[java.lang.String] = js.undefined
  /** The currency code for the buyer. This cannot be altered here. */
  var currencyCode: js.UndefOr[java.lang.String] = js.undefined
  /** The unique id that describes this item. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** The kind of the resource, i.e. "adexchangebuyer#budget". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
}

