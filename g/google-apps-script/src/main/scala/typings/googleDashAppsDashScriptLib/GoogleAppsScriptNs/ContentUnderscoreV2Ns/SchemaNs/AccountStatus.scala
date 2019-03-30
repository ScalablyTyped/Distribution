package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountStatus extends js.Object {
  var accountId: js.UndefOr[java.lang.String] = js.undefined
  var accountLevelIssues: js.UndefOr[js.Array[AccountStatusAccountLevelIssue]] = js.undefined
  var dataQualityIssues: js.UndefOr[js.Array[AccountStatusDataQualityIssue]] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var products: js.UndefOr[js.Array[AccountStatusProducts]] = js.undefined
  var websiteClaimed: js.UndefOr[scala.Boolean] = js.undefined
}

object AccountStatus {
  @scala.inline
  def apply(
    accountId: java.lang.String = null,
    accountLevelIssues: js.Array[AccountStatusAccountLevelIssue] = null,
    dataQualityIssues: js.Array[AccountStatusDataQualityIssue] = null,
    kind: java.lang.String = null,
    products: js.Array[AccountStatusProducts] = null,
    websiteClaimed: js.UndefOr[scala.Boolean] = js.undefined
  ): AccountStatus = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId)
    if (accountLevelIssues != null) __obj.updateDynamic("accountLevelIssues")(accountLevelIssues)
    if (dataQualityIssues != null) __obj.updateDynamic("dataQualityIssues")(dataQualityIssues)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (products != null) __obj.updateDynamic("products")(products)
    if (!js.isUndefined(websiteClaimed)) __obj.updateDynamic("websiteClaimed")(websiteClaimed)
    __obj.asInstanceOf[AccountStatus]
  }
}

