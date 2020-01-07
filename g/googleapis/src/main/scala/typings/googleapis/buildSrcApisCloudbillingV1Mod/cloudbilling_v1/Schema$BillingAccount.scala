package typings.googleapis.buildSrcApisCloudbillingV1Mod.cloudbilling_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A billing account in [GCP Console](https://console.cloud.google.com/). You
  * can assign a billing account to one or more projects.
  */
@js.native
trait Schema$BillingAccount extends js.Object {
  /**
    * The display name given to the billing account, such as `My Billing
    * Account`. This name is displayed in the GCP Console.
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    * If this account is a
    * [subaccount](https://cloud.google.com/billing/docs/concepts), then this
    * will be the resource name of the master billing account that it is being
    * resold through. Otherwise this will be empty.
    */
  var masterBillingAccount: js.UndefOr[String] = js.native
  /**
    * The resource name of the billing account. The resource name has the form
    * `billingAccounts/{billing_account_id}`. For example,
    * `billingAccounts/012345-567890-ABCDEF` would be the resource name for
    * billing account `012345-567890-ABCDEF`.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * True if the billing account is open, and will therefore be charged for
    * any usage on associated projects. False if the billing account is closed,
    * and therefore projects associated with it will be unable to use paid
    * services.
    */
  var open: js.UndefOr[Boolean] = js.native
}

object Schema$BillingAccount {
  @scala.inline
  def apply(
    displayName: String = null,
    masterBillingAccount: String = null,
    name: String = null,
    open: js.UndefOr[Boolean] = js.undefined
  ): Schema$BillingAccount = {
    val __obj = js.Dynamic.literal()
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (masterBillingAccount != null) __obj.updateDynamic("masterBillingAccount")(masterBillingAccount.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$BillingAccount]
  }
}

