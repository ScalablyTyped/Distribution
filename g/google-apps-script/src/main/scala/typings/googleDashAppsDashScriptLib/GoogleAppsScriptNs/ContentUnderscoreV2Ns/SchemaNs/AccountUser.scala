package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountUser extends js.Object {
  var admin: js.UndefOr[scala.Boolean] = js.undefined
  var emailAddress: js.UndefOr[java.lang.String] = js.undefined
  var orderManager: js.UndefOr[scala.Boolean] = js.undefined
  var paymentsAnalyst: js.UndefOr[scala.Boolean] = js.undefined
  var paymentsManager: js.UndefOr[scala.Boolean] = js.undefined
}

object AccountUser {
  @scala.inline
  def apply(
    admin: js.UndefOr[scala.Boolean] = js.undefined,
    emailAddress: java.lang.String = null,
    orderManager: js.UndefOr[scala.Boolean] = js.undefined,
    paymentsAnalyst: js.UndefOr[scala.Boolean] = js.undefined,
    paymentsManager: js.UndefOr[scala.Boolean] = js.undefined
  ): AccountUser = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(admin)) __obj.updateDynamic("admin")(admin)
    if (emailAddress != null) __obj.updateDynamic("emailAddress")(emailAddress)
    if (!js.isUndefined(orderManager)) __obj.updateDynamic("orderManager")(orderManager)
    if (!js.isUndefined(paymentsAnalyst)) __obj.updateDynamic("paymentsAnalyst")(paymentsAnalyst)
    if (!js.isUndefined(paymentsManager)) __obj.updateDynamic("paymentsManager")(paymentsManager)
    __obj.asInstanceOf[AccountUser]
  }
}

