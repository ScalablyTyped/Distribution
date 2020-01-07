package typings.googleapis.buildSrcApisContentV2Mod.content_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$OrderpaymentsNotifyAuthApprovedRequest extends js.Object {
  /**
    * Authorized amount for pre-tax charge on user&#39;s credit card.
    */
  var authAmountPretax: js.UndefOr[Schema$Price] = js.native
  /**
    * Authorized amount for tax charge on user&#39;s credit card.
    */
  var authAmountTax: js.UndefOr[Schema$Price] = js.native
}

object Schema$OrderpaymentsNotifyAuthApprovedRequest {
  @scala.inline
  def apply(authAmountPretax: Schema$Price = null, authAmountTax: Schema$Price = null): Schema$OrderpaymentsNotifyAuthApprovedRequest = {
    val __obj = js.Dynamic.literal()
    if (authAmountPretax != null) __obj.updateDynamic("authAmountPretax")(authAmountPretax.asInstanceOf[js.Any])
    if (authAmountTax != null) __obj.updateDynamic("authAmountTax")(authAmountTax.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$OrderpaymentsNotifyAuthApprovedRequest]
  }
}

