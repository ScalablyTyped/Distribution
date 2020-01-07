package typings.googleapis.buildSrcApisContentV2Dot1Mod.content_v2_1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$Installment extends js.Object {
  /**
    * The amount the buyer has to pay per month.
    */
  var amount: js.UndefOr[Schema$Price] = js.native
  /**
    * The number of installments the buyer has to pay.
    */
  var months: js.UndefOr[String] = js.native
}

object Schema$Installment {
  @scala.inline
  def apply(amount: Schema$Price = null, months: String = null): Schema$Installment = {
    val __obj = js.Dynamic.literal()
    if (amount != null) __obj.updateDynamic("amount")(amount.asInstanceOf[js.Any])
    if (months != null) __obj.updateDynamic("months")(months.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Installment]
  }
}

