package typings.googleDashAppsDashScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GmbAccounts extends js.Object {
  var accountId: js.UndefOr[String] = js.undefined
  var gmbAccounts: js.UndefOr[js.Array[GmbAccountsGmbAccount]] = js.undefined
}

object GmbAccounts {
  @scala.inline
  def apply(accountId: String = null, gmbAccounts: js.Array[GmbAccountsGmbAccount] = null): GmbAccounts = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId)
    if (gmbAccounts != null) __obj.updateDynamic("gmbAccounts")(gmbAccounts)
    __obj.asInstanceOf[GmbAccounts]
  }
}

