package typings.googleapis.buildSrcApisServiceconsumermanagementV1Mod.serviceconsumermanagement_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes the billing configuration for a new tenant project.
  */
@js.native
trait Schema$BillingConfig extends js.Object {
  /**
    * Name of the billing account. For example
    * `billingAccounts/012345-567890-ABCDEF`.
    */
  var billingAccount: js.UndefOr[String] = js.native
}

object Schema$BillingConfig {
  @scala.inline
  def apply(billingAccount: String = null): Schema$BillingConfig = {
    val __obj = js.Dynamic.literal()
    if (billingAccount != null) __obj.updateDynamic("billingAccount")(billingAccount.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$BillingConfig]
  }
}

