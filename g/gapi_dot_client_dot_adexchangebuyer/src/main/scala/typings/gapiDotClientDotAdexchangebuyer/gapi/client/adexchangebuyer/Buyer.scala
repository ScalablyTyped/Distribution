package typings.gapiDotClientDotAdexchangebuyer.gapi.client.adexchangebuyer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Buyer extends js.Object {
  /** Adx account id of the buyer. */
  var accountId: js.UndefOr[String] = js.undefined
}

object Buyer {
  @scala.inline
  def apply(accountId: String = null): Buyer = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId)
    __obj.asInstanceOf[Buyer]
  }
}

