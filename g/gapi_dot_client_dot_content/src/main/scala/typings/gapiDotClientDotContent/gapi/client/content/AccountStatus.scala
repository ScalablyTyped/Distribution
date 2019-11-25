package typings.gapiDotClientDotContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountStatus extends js.Object {
  /** The ID of the account for which the status is reported. */
  var accountId: js.UndefOr[String] = js.undefined
  /** A list of account level issues. */
  var accountLevelIssues: js.UndefOr[js.Array[AccountStatusAccountLevelIssue]] = js.undefined
  /** A list of data quality issues. */
  var dataQualityIssues: js.UndefOr[js.Array[AccountStatusDataQualityIssue]] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "content#accountStatus". */
  var kind: js.UndefOr[String] = js.undefined
  /** Whether the account's website is claimed or not. */
  var websiteClaimed: js.UndefOr[Boolean] = js.undefined
}

object AccountStatus {
  @scala.inline
  def apply(
    accountId: String = null,
    accountLevelIssues: js.Array[AccountStatusAccountLevelIssue] = null,
    dataQualityIssues: js.Array[AccountStatusDataQualityIssue] = null,
    kind: String = null,
    websiteClaimed: js.UndefOr[Boolean] = js.undefined
  ): AccountStatus = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (accountLevelIssues != null) __obj.updateDynamic("accountLevelIssues")(accountLevelIssues.asInstanceOf[js.Any])
    if (dataQualityIssues != null) __obj.updateDynamic("dataQualityIssues")(dataQualityIssues.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (!js.isUndefined(websiteClaimed)) __obj.updateDynamic("websiteClaimed")(websiteClaimed.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountStatus]
  }
}

