package typings.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountStatus extends js.Object {
  var accountId: js.UndefOr[String] = js.undefined
  var accountLevelIssues: js.UndefOr[js.Array[AccountStatusAccountLevelIssue]] = js.undefined
  var dataQualityIssues: js.UndefOr[js.Array[AccountStatusDataQualityIssue]] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var products: js.UndefOr[js.Array[AccountStatusProducts]] = js.undefined
  var websiteClaimed: js.UndefOr[Boolean] = js.undefined
}

object AccountStatus {
  @scala.inline
  def apply(
    accountId: String = null,
    accountLevelIssues: js.Array[AccountStatusAccountLevelIssue] = null,
    dataQualityIssues: js.Array[AccountStatusDataQualityIssue] = null,
    kind: String = null,
    products: js.Array[AccountStatusProducts] = null,
    websiteClaimed: js.UndefOr[Boolean] = js.undefined
  ): AccountStatus = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (accountLevelIssues != null) __obj.updateDynamic("accountLevelIssues")(accountLevelIssues.asInstanceOf[js.Any])
    if (dataQualityIssues != null) __obj.updateDynamic("dataQualityIssues")(dataQualityIssues.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (products != null) __obj.updateDynamic("products")(products.asInstanceOf[js.Any])
    if (!js.isUndefined(websiteClaimed)) __obj.updateDynamic("websiteClaimed")(websiteClaimed.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountStatus]
  }
}

