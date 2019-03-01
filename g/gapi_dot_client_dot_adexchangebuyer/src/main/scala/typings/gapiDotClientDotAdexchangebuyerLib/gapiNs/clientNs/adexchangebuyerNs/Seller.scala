package typings
package gapiDotClientDotAdexchangebuyerLib.gapiNs.clientNs.adexchangebuyerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Seller extends js.Object {
  /** The unique id for the seller. The seller fills in this field. The seller account id is then available to buyer in the product. */
  var accountId: js.UndefOr[java.lang.String] = js.undefined
  /** Optional sub-account id for the seller. */
  var subAccountId: js.UndefOr[java.lang.String] = js.undefined
}

object Seller {
  @scala.inline
  def apply(accountId: java.lang.String = null, subAccountId: java.lang.String = null): Seller = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId)
    if (subAccountId != null) __obj.updateDynamic("subAccountId")(subAccountId)
    __obj.asInstanceOf[Seller]
  }
}

