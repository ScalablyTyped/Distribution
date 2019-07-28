package typings.googleDashAppsDashScript.GoogleAppsScriptNs.ContentNs.SchemaNs

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
    daysToReturn: Int | Double = null,
    isReturnable: js.UndefOr[Boolean] = js.undefined,
    policyUrl: String = null
  ): OrderLineItemReturnInfo = {
    val __obj = js.Dynamic.literal()
    if (daysToReturn != null) __obj.updateDynamic("daysToReturn")(daysToReturn.asInstanceOf[js.Any])
    if (!js.isUndefined(isReturnable)) __obj.updateDynamic("isReturnable")(isReturnable)
    if (policyUrl != null) __obj.updateDynamic("policyUrl")(policyUrl)
    __obj.asInstanceOf[OrderLineItemReturnInfo]
  }
}

