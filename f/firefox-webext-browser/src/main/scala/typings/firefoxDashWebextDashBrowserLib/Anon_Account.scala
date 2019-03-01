package typings
package firefoxDashWebextDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Account extends js.Object {
  var account: js.UndefOr[firefoxDashWebextDashBrowserLib.browserNs.identityNs.AccountInfo] = js.undefined
  var interactive: js.UndefOr[scala.Boolean] = js.undefined
  var scopes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object Anon_Account {
  @scala.inline
  def apply(
    account: firefoxDashWebextDashBrowserLib.browserNs.identityNs.AccountInfo = null,
    interactive: js.UndefOr[scala.Boolean] = js.undefined,
    scopes: js.Array[java.lang.String] = null
  ): Anon_Account = {
    val __obj = js.Dynamic.literal()
    if (account != null) __obj.updateDynamic("account")(account)
    if (!js.isUndefined(interactive)) __obj.updateDynamic("interactive")(interactive)
    if (scopes != null) __obj.updateDynamic("scopes")(scopes)
    __obj.asInstanceOf[Anon_Account]
  }
}

