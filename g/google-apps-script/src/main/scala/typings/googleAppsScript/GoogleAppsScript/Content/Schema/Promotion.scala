package typings.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Promotion extends js.Object {
  var promotionAmount: js.UndefOr[Amount] = js.undefined
  var promotionId: js.UndefOr[String] = js.undefined
}

object Promotion {
  @scala.inline
  def apply(promotionAmount: Amount = null, promotionId: String = null): Promotion = {
    val __obj = js.Dynamic.literal()
    if (promotionAmount != null) __obj.updateDynamic("promotionAmount")(promotionAmount.asInstanceOf[js.Any])
    if (promotionId != null) __obj.updateDynamic("promotionId")(promotionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Promotion]
  }
}

