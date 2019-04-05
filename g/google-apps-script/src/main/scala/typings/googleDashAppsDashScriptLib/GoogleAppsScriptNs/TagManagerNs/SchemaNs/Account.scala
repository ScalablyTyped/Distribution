package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagManagerNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Account extends js.Object {
  var accountId: js.UndefOr[java.lang.String] = js.undefined
  var fingerprint: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var path: js.UndefOr[java.lang.String] = js.undefined
  var shareData: js.UndefOr[scala.Boolean] = js.undefined
  var tagManagerUrl: js.UndefOr[java.lang.String] = js.undefined
}

object Account {
  @scala.inline
  def apply(
    accountId: java.lang.String = null,
    fingerprint: java.lang.String = null,
    name: java.lang.String = null,
    path: java.lang.String = null,
    shareData: js.UndefOr[scala.Boolean] = js.undefined,
    tagManagerUrl: java.lang.String = null
  ): Account = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId)
    if (fingerprint != null) __obj.updateDynamic("fingerprint")(fingerprint)
    if (name != null) __obj.updateDynamic("name")(name)
    if (path != null) __obj.updateDynamic("path")(path)
    if (!js.isUndefined(shareData)) __obj.updateDynamic("shareData")(shareData)
    if (tagManagerUrl != null) __obj.updateDynamic("tagManagerUrl")(tagManagerUrl)
    __obj.asInstanceOf[Account]
  }
}

