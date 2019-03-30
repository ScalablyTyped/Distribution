package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrderLineItemReturnInfo extends js.Object {
  var daysToReturn: js.UndefOr[scala.Double] = js.undefined
  var isReturnable: js.UndefOr[scala.Boolean] = js.undefined
  var policyUrl: js.UndefOr[java.lang.String] = js.undefined
}

object OrderLineItemReturnInfo {
  @scala.inline
  def apply(
    daysToReturn: scala.Int | scala.Double = null,
    isReturnable: js.UndefOr[scala.Boolean] = js.undefined,
    policyUrl: java.lang.String = null
  ): OrderLineItemReturnInfo = {
    val __obj = js.Dynamic.literal()
    if (daysToReturn != null) __obj.updateDynamic("daysToReturn")(daysToReturn.asInstanceOf[js.Any])
    if (!js.isUndefined(isReturnable)) __obj.updateDynamic("isReturnable")(isReturnable)
    if (policyUrl != null) __obj.updateDynamic("policyUrl")(policyUrl)
    __obj.asInstanceOf[OrderLineItemReturnInfo]
  }
}

