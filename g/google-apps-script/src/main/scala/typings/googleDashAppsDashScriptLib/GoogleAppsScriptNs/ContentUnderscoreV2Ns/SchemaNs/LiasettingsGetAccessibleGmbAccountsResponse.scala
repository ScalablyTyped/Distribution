package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiasettingsGetAccessibleGmbAccountsResponse extends js.Object {
  var accountId: js.UndefOr[java.lang.String] = js.undefined
  var gmbAccounts: js.UndefOr[js.Array[GmbAccountsGmbAccount]] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
}

object LiasettingsGetAccessibleGmbAccountsResponse {
  @scala.inline
  def apply(
    accountId: java.lang.String = null,
    gmbAccounts: js.Array[GmbAccountsGmbAccount] = null,
    kind: java.lang.String = null
  ): LiasettingsGetAccessibleGmbAccountsResponse = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId)
    if (gmbAccounts != null) __obj.updateDynamic("gmbAccounts")(gmbAccounts)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[LiasettingsGetAccessibleGmbAccountsResponse]
  }
}

