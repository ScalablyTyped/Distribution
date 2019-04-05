package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountsListResponse extends js.Object {
  var accounts: js.UndefOr[js.Array[Account]] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
}

object AccountsListResponse {
  @scala.inline
  def apply(
    accounts: js.Array[Account] = null,
    kind: java.lang.String = null,
    nextPageToken: java.lang.String = null
  ): AccountsListResponse = {
    val __obj = js.Dynamic.literal()
    if (accounts != null) __obj.updateDynamic("accounts")(accounts)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[AccountsListResponse]
  }
}

