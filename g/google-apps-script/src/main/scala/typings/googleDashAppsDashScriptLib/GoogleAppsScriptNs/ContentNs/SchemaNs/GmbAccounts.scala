package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GmbAccounts extends js.Object {
  var accountId: js.UndefOr[java.lang.String] = js.undefined
  var gmbAccounts: js.UndefOr[js.Array[GmbAccountsGmbAccount]] = js.undefined
}

object GmbAccounts {
  @scala.inline
  def apply(accountId: java.lang.String = null, gmbAccounts: js.Array[GmbAccountsGmbAccount] = null): GmbAccounts = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId)
    if (gmbAccounts != null) __obj.updateDynamic("gmbAccounts")(gmbAccounts)
    __obj.asInstanceOf[GmbAccounts]
  }
}

