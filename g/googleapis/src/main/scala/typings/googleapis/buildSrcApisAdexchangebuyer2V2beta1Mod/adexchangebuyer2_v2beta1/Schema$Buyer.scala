package typings.googleapis.buildSrcApisAdexchangebuyer2V2beta1Mod.adexchangebuyer2_v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a buyer of inventory. Each buyer is identified by a unique
  * Authorized Buyers account ID.
  */
@js.native
trait Schema$Buyer extends js.Object {
  /**
    * Authorized Buyers account ID of the buyer.
    */
  var accountId: js.UndefOr[String] = js.native
}

object Schema$Buyer {
  @scala.inline
  def apply(accountId: String = null): Schema$Buyer = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Buyer]
  }
}

