package typings.gapiClientCloudbilling.gapi.client.cloudbilling

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BillingAccount extends js.Object {
  /**
    * The display name given to the billing account, such as `My Billing
    * Account`. This name is displayed in the Google Cloud Console.
    */
  var displayName: js.UndefOr[String] = js.undefined
  /**
    * The resource name of the billing account. The resource name has the form
    * `billingAccounts/{billing_account_id}`. For example,
    * `billingAccounts/012345-567890-ABCDEF` would be the resource name for
    * billing account `012345-567890-ABCDEF`.
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * True if the billing account is open, and will therefore be charged for any
    * usage on associated projects. False if the billing account is closed, and
    * therefore projects associated with it will be unable to use paid services.
    */
  var open: js.UndefOr[Boolean] = js.undefined
}

object BillingAccount {
  @scala.inline
  def apply(displayName: String = null, name: String = null, open: js.UndefOr[Boolean] = js.undefined): BillingAccount = {
    val __obj = js.Dynamic.literal()
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open.asInstanceOf[js.Any])
    __obj.asInstanceOf[BillingAccount]
  }
}

