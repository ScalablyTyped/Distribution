package typings.googleapis.buildSrcApisContentV2Mod.content_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$Promotion extends js.Object {
  /**
    * [required] Amount of the promotion. The values here are the promotion
    * applied to the unit price pretax and to the total of the tax amounts.
    */
  var promotionAmount: js.UndefOr[Schema$Amount] = js.native
  /**
    * [required] ID of the promotion.
    */
  var promotionId: js.UndefOr[String] = js.native
}

object Schema$Promotion {
  @scala.inline
  def apply(promotionAmount: Schema$Amount = null, promotionId: String = null): Schema$Promotion = {
    val __obj = js.Dynamic.literal()
    if (promotionAmount != null) __obj.updateDynamic("promotionAmount")(promotionAmount.asInstanceOf[js.Any])
    if (promotionId != null) __obj.updateDynamic("promotionId")(promotionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Promotion]
  }
}

