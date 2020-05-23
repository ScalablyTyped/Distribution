package typings.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrderLineItemReturnInfo extends js.Object {
  var daysToReturn: js.UndefOr[Double] = js.undefined
  var isReturnable: js.UndefOr[Boolean] = js.undefined
  var policyUrl: js.UndefOr[String] = js.undefined
}

object OrderLineItemReturnInfo {
  @scala.inline
  def apply(
    daysToReturn: js.UndefOr[Double] = js.undefined,
    isReturnable: js.UndefOr[Boolean] = js.undefined,
    policyUrl: String = null
  ): OrderLineItemReturnInfo = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(daysToReturn)) __obj.updateDynamic("daysToReturn")(daysToReturn.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isReturnable)) __obj.updateDynamic("isReturnable")(isReturnable.get.asInstanceOf[js.Any])
    if (policyUrl != null) __obj.updateDynamic("policyUrl")(policyUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrderLineItemReturnInfo]
  }
}

