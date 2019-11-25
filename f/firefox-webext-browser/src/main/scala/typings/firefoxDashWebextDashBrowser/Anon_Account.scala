package typings.firefoxDashWebextDashBrowser

import typings.firefoxDashWebextDashBrowser.browser.identity.AccountInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Account extends js.Object {
  var account: js.UndefOr[AccountInfo] = js.undefined
  var interactive: js.UndefOr[Boolean] = js.undefined
  var scopes: js.UndefOr[js.Array[String]] = js.undefined
}

object Anon_Account {
  @scala.inline
  def apply(
    account: AccountInfo = null,
    interactive: js.UndefOr[Boolean] = js.undefined,
    scopes: js.Array[String] = null
  ): Anon_Account = {
    val __obj = js.Dynamic.literal()
    if (account != null) __obj.updateDynamic("account")(account.asInstanceOf[js.Any])
    if (!js.isUndefined(interactive)) __obj.updateDynamic("interactive")(interactive.asInstanceOf[js.Any])
    if (scopes != null) __obj.updateDynamic("scopes")(scopes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Account]
  }
}

