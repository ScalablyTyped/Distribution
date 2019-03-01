package typings
package gapiDotClientDotContentLib.gapiNs.clientNs.contentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrderLineItemReturnInfo extends js.Object {
  /** How many days later the item can be returned. */
  var daysToReturn: js.UndefOr[scala.Double] = js.undefined
  /** Whether the item is returnable. */
  var isReturnable: js.UndefOr[scala.Boolean] = js.undefined
  /** URL of the item return policy. */
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

