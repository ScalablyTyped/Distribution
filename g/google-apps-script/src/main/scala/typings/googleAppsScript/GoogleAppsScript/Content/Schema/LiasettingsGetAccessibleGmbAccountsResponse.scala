package typings.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiasettingsGetAccessibleGmbAccountsResponse extends js.Object {
  var accountId: js.UndefOr[String] = js.undefined
  var gmbAccounts: js.UndefOr[js.Array[GmbAccountsGmbAccount]] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
}

object LiasettingsGetAccessibleGmbAccountsResponse {
  @scala.inline
  def apply(accountId: String = null, gmbAccounts: js.Array[GmbAccountsGmbAccount] = null, kind: String = null): LiasettingsGetAccessibleGmbAccountsResponse = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (gmbAccounts != null) __obj.updateDynamic("gmbAccounts")(gmbAccounts.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[LiasettingsGetAccessibleGmbAccountsResponse]
  }
}

