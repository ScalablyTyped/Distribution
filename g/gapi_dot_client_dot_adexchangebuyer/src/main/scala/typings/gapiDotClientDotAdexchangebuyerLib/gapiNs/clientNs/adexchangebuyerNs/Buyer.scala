package typings
package gapiDotClientDotAdexchangebuyerLib.gapiNs.clientNs.adexchangebuyerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Buyer extends js.Object {
  /** Adx account id of the buyer. */
  var accountId: js.UndefOr[java.lang.String] = js.undefined
}

object Buyer {
  @scala.inline
  def apply(accountId: java.lang.String = null): Buyer = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId)
    __obj.asInstanceOf[Buyer]
  }
}

