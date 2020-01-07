package typings.googleapis.buildSrcApisContentV2Dot1Mod.content_v2_1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$OrderLineItemReturnInfo extends js.Object {
  /**
    * How many days later the item can be returned.
    */
  var daysToReturn: js.UndefOr[Double] = js.native
  /**
    * Whether the item is returnable.
    */
  var isReturnable: js.UndefOr[Boolean] = js.native
  /**
    * URL of the item return policy.
    */
  var policyUrl: js.UndefOr[String] = js.native
}

object Schema$OrderLineItemReturnInfo {
  @scala.inline
  def apply(
    daysToReturn: Int | Double = null,
    isReturnable: js.UndefOr[Boolean] = js.undefined,
    policyUrl: String = null
  ): Schema$OrderLineItemReturnInfo = {
    val __obj = js.Dynamic.literal()
    if (daysToReturn != null) __obj.updateDynamic("daysToReturn")(daysToReturn.asInstanceOf[js.Any])
    if (!js.isUndefined(isReturnable)) __obj.updateDynamic("isReturnable")(isReturnable.asInstanceOf[js.Any])
    if (policyUrl != null) __obj.updateDynamic("policyUrl")(policyUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$OrderLineItemReturnInfo]
  }
}

