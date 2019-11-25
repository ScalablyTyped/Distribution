package typings.googleDashAppsDashScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountUser extends js.Object {
  var admin: js.UndefOr[Boolean] = js.undefined
  var emailAddress: js.UndefOr[String] = js.undefined
  var orderManager: js.UndefOr[Boolean] = js.undefined
  var paymentsAnalyst: js.UndefOr[Boolean] = js.undefined
  var paymentsManager: js.UndefOr[Boolean] = js.undefined
}

object AccountUser {
  @scala.inline
  def apply(
    admin: js.UndefOr[Boolean] = js.undefined,
    emailAddress: String = null,
    orderManager: js.UndefOr[Boolean] = js.undefined,
    paymentsAnalyst: js.UndefOr[Boolean] = js.undefined,
    paymentsManager: js.UndefOr[Boolean] = js.undefined
  ): AccountUser = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(admin)) __obj.updateDynamic("admin")(admin.asInstanceOf[js.Any])
    if (emailAddress != null) __obj.updateDynamic("emailAddress")(emailAddress.asInstanceOf[js.Any])
    if (!js.isUndefined(orderManager)) __obj.updateDynamic("orderManager")(orderManager.asInstanceOf[js.Any])
    if (!js.isUndefined(paymentsAnalyst)) __obj.updateDynamic("paymentsAnalyst")(paymentsAnalyst.asInstanceOf[js.Any])
    if (!js.isUndefined(paymentsManager)) __obj.updateDynamic("paymentsManager")(paymentsManager.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountUser]
  }
}

