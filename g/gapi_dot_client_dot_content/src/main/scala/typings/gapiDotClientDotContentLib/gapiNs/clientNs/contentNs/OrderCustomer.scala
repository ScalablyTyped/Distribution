package typings
package gapiDotClientDotContentLib.gapiNs.clientNs.contentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrderCustomer extends js.Object {
  /** Email address of the customer. */
  var email: js.UndefOr[java.lang.String] = js.undefined
  /**
    * If set, this indicates the user explicitly chose to opt in or out of providing marketing rights to the merchant. If unset, this indicates the user has
    * already made this choice in a previous purchase, and was thus not shown the marketing right opt in/out checkbox during the checkout flow.
    */
  var explicitMarketingPreference: js.UndefOr[scala.Boolean] = js.undefined
  /** Full name of the customer. */
  var fullName: js.UndefOr[java.lang.String] = js.undefined
}

object OrderCustomer {
  @scala.inline
  def apply(
    email: java.lang.String = null,
    explicitMarketingPreference: js.UndefOr[scala.Boolean] = js.undefined,
    fullName: java.lang.String = null
  ): OrderCustomer = {
    val __obj = js.Dynamic.literal()
    if (email != null) __obj.updateDynamic("email")(email)
    if (!js.isUndefined(explicitMarketingPreference)) __obj.updateDynamic("explicitMarketingPreference")(explicitMarketingPreference)
    if (fullName != null) __obj.updateDynamic("fullName")(fullName)
    __obj.asInstanceOf[OrderCustomer]
  }
}

