package typings.googleapis.buildSrcApisAdexchangebuyerV1Dot4Mod.adexchangebuyer_v1_4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$Buyer extends js.Object {
  /**
    * Adx account id of the buyer.
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

