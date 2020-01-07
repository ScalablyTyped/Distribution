package typings.googleapis.buildSrcApisContentV2Dot1Mod.content_v2_1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$ProductAmount extends js.Object {
  /**
    * The pre-tax or post-tax price depending on the location of the order.
    */
  var priceAmount: js.UndefOr[Schema$Price] = js.native
  /**
    * Remitted tax value.
    */
  var remittedTaxAmount: js.UndefOr[Schema$Price] = js.native
  /**
    * Tax value.
    */
  var taxAmount: js.UndefOr[Schema$Price] = js.native
}

object Schema$ProductAmount {
  @scala.inline
  def apply(
    priceAmount: Schema$Price = null,
    remittedTaxAmount: Schema$Price = null,
    taxAmount: Schema$Price = null
  ): Schema$ProductAmount = {
    val __obj = js.Dynamic.literal()
    if (priceAmount != null) __obj.updateDynamic("priceAmount")(priceAmount.asInstanceOf[js.Any])
    if (remittedTaxAmount != null) __obj.updateDynamic("remittedTaxAmount")(remittedTaxAmount.asInstanceOf[js.Any])
    if (taxAmount != null) __obj.updateDynamic("taxAmount")(taxAmount.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ProductAmount]
  }
}

