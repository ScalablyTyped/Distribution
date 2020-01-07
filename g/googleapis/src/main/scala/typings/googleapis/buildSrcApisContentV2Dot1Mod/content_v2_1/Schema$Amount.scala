package typings.googleapis.buildSrcApisContentV2Dot1Mod.content_v2_1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$Amount extends js.Object {
  /**
    * [required] The pre-tax or post-tax price depending on the location of the
    * order.
    */
  var priceAmount: js.UndefOr[Schema$Price] = js.native
  /**
    * [required] Tax value.
    */
  var taxAmount: js.UndefOr[Schema$Price] = js.native
}

object Schema$Amount {
  @scala.inline
  def apply(priceAmount: Schema$Price = null, taxAmount: Schema$Price = null): Schema$Amount = {
    val __obj = js.Dynamic.literal()
    if (priceAmount != null) __obj.updateDynamic("priceAmount")(priceAmount.asInstanceOf[js.Any])
    if (taxAmount != null) __obj.updateDynamic("taxAmount")(taxAmount.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Amount]
  }
}

